package swen;
import java.util.*;
import java.io.*;
//import com.opencsv.*;

public class ModelActions {

   String foodCSV = "foods.csv";
   String logCSV = "log.csv";
   String exerciseCSV = "exercise.csv";

   //all getters for the elements

   public ArrayList<Food> getFood() throws Exception {

      File f = new File(foodCSV);
      ArrayList<Food> list = new ArrayList<Food>();
      ArrayList<SimpleFood> detailsList = new ArrayList<SimpleFood>();

      Scanner scan = new Scanner(f);
      
      while (scan.hasNextLine()) {
         String[] details = scan.nextLine().split(",");
         if (details[0] == "b") {
            String name = details[1];
            int calories = Integer.parseInt(details[2]);
            double fat = Double.parseDouble(details[3]);
            double carbs = Double.parseDouble(details[4]);
            double protein = Double.parseDouble(details[5]);
            list.add(new SimpleFood(name, calories, fat, carbs, protein));
         }
         if (details[0] == "r") {
            for (int i = 2; i < list.size() - 1; i += 2) {
               if ((i % 2) == 0) {
                  SimpleFood food = new SimpleFood(" ", i);
                  food.setName(details[i]);
                  for (int y = 0; y < Double.parseDouble(details[i + 1]); y++) {
                     detailsList.add(food);
                  }
               }
            }
            Recipe recipe = new Recipe("", detailsList);
            list.add(recipe);
         }
      }
      return list;
   }

   public ArrayList<SimpleFood> getSimpleFoods() throws Exception {

      File f = new File(foodCSV);
      ArrayList<SimpleFood> list = new ArrayList<SimpleFood>();
      
      Scanner scanner = new Scanner(f);
      
      while (scanner.hasNextLine()) {
         String[] details = scanner.nextLine().split(",");
         if (details[0] == "b") {
            String name = details[1];
            int calories = Integer.parseInt(details[2]);
            double fat = Double.parseDouble(details[3]);
            double carbs = Double.parseDouble(details[4]);
            double protein = Double.parseDouble(details[5]);
            list.add(new SimpleFood(name, calories, fat, carbs, protein));
         }

      }
      return list; 
   }

   public ArrayList<Recipe> getRecipes() throws Exception {

      File f = new File(foodCSV);
      ArrayList<Recipe> list = new ArrayList<Recipe>();
      ArrayList<SimpleFood> detailsList = new ArrayList<SimpleFood>();

      Scanner scan = new Scanner(f);
      
      while (scan.hasNextLine()) {
         String[] details = scan.nextLine().split(",");
         if (details[0] == "r") {
            for (int i = 2; i < list.size() - 1; i += 2) {
               if ((i % 2) == 0) {
                  SimpleFood food = new SimpleFood("", i);
                  food.setName(details[i]);
                  for (int y = 0; y < Double.parseDouble(details[i + 1]); y++) {
                     detailsList.add(food);
                  }
               }
            }
            Recipe recipe = new Recipe("", detailsList);
            list.add(recipe);
         }
      }

      return list;
   }

   public ArrayList<Log> getLogs() throws Exception{

      File file = new File(logCSV);
      ArrayList<Log> list = new ArrayList<Log>();

      Scanner scan = new Scanner(file);
      
      while (scan.hasNextLine()) {
         String[] details = scan.nextLine().split(",");
         if (details.length == 3) {
            list.add(new Log(details[0], details[1], details[2]));
         } else {
            list.add(new Log(details[0], details[1], details[2]));
         }
      }
      return list;
   }

   public String[] getLogsByDate(String date) {
      return null;
   }

   public List<String[]> getExercises() {
      CSVReader reader = new CSVReader(new FileReader(exerciseCSV));
      List<String[]> allExercises = reader.readAll();
      return allExercises;
   }

   //all methods for adding elements

   public void addSimpleFood(SimpleFood simpleFood) throws Exception{
      String foodString = simpleFood.toString() + "\n";
      File f = new File(foodCSV);
      FileWriter writer = new FileWriter(f);
      writer.append(foodString);
   }

   public void addRecipe(Recipe recipe) throws Exception{
      String recipeString = recipe.toString() + "\n";
      File file = new File(foodCSV);
      FileWriter writer = new FileWriter(file);
      writer.append(recipeString);
   }

   public void addLog(Log log) throws Exception{
      String logString = log.toString() + "\n"; 
      File f = new File(logCSV);
      FileWriter writer = new FileWriter(f);
      writer.append(logString);
   }

   public void addExercise(Exercise exercise) throws Exception{
      String exerciseString = exercise.toString() + "\n";
      File f = new File(exerciseCSV);
      FileWriter writer = new FileWriter(f);
      writer.append(exerciseString);
   }

   //All methods for deleting elements

   public void deleteFood(int foodKey) {
      CSVReader reader = new CSVReader(new FileReader(foodCSV));
      List<String[]> allFood = reader.readAll();
      allFood.remove(foodKey);
      FileWriter fWriter = new FileWriter(foodCSV);
      CSVWriter writer = new CSVWriter(fWriter);
      writer.writeAll(allFood);
   }

   public void deleteLog(int logKey) {

      CSVReader reader = new CSVReader(new FileReader(logCSV));

      List<String[]> allLogs = reader.readAll();
      allLogs.remove(logKey);
      FileWriter fwriter = new FileWriter(logCSV);
      CSVWriter writer = new CSVWriter(fwriter);

      writer.writeAll(allLogs);
   }

   public void deleteExercise(int exerciseKey) {
      CSVReader reader = new CSVReader(new FileReader(exerciseCSV));
      List<String[]> allExercises = reader.readAll();
      allExercises.remove(exerciseKey);
      FileWriter fwriter = new FileWriter(exerciseCSV);
      CSVWriter writer = new CSVWriter(fwriter);
      writer.writeAll(allExercises);
   }

}