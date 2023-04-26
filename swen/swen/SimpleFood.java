package swen;
public class SimpleFood implements Food{

    private String letter;
    private String name;
    private double calories;
    private double fat;
    private double carbs;
    private double proteins;
    

    public SimpleFood(String name, double calories){
        this.letter = "b";
        this.name = name;
        this.calories = calories;
        this.fat = 0;
        this.carbs = 0;
        this.proteins = 0;
    }
    
    public SimpleFood(String name, double calories, double fat, double carbs, double proteins){
        this.letter = "b";
        this.name = name;
        this.calories = calories;
        this.fat = fat;
        this.carbs = carbs;
        this.proteins = proteins;
    }
    //setter and getter for name
    public String getName(){
       return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //setter and getter for calories
    public double getCalories(){
       return calories;
    }
    public void setCalories(double calories){
        this.calories = calories;
    }
    //setter and getter for fat
    public double getFat(){
       return fat;
    }
    public void setFat(double fat){
        this.fat = fat;
    }
    //setter and getter for carbs
    public double getCarbs(){
       return carbs;
    }
    public void setCarbs(double carbs){
        this.carbs = carbs;
    }
    //setter and getter for proteins
    public double getProteins(){
       return proteins;
    }
    public void setProteins(double proteins){
        this.proteins = proteins;
    }
    
    public String showDetails() 
    {
        String s = letter + "," + name + "," + calories + "," + fat + "," + carbs + "," + proteins;
        return s;
    }
 }