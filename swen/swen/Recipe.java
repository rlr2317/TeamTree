package swen;

import java.util.*;
public class Recipe implements Food {

    private String letter;
    private String name;
    private int calories;
    private List<SimpleFood> ingredients = new ArrayList<SimpleFood>();
      
    public Recipe(String name, List<SimpleFood> ingredients)
    {
        this.letter = "r";
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName(){
        return name;
    }
    public List<SimpleFood> getIngredients(){
        return ingredients;
    }
      
    public String showDetails() 
    {
        String s = letter;
        for(int i=0;i<ingredients.size();i++){
            s = s + "," + ingredients.get(i).getName() + "," + Double.toString(ingredients.get(i).getCalories());
        }
        return s;
    }

    public void addIngredient(SimpleFood ingredient){
        for(int i=0;i<ingredients.size();i++){
            if(ingredient.getName() == ingredients.get(i).getName()){
                System.out.print("Error:No duplicate ingredients!");
                break;
            }
        }
        ingredients.add(ingredient);
    }
}