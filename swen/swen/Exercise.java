package swen;

public class Exercise {

    public String letter;
    public String name;
    public int calories;

    public Exercise(String name, int calories) {
        this.letter = "e";
        this.name = name;
        this.calories = calories;
    }

    // getter and setter for the letter
    public String getLetter() {
        return letter;
    }
    public void setLetter(String letter) {
        this.letter = letter;
    }
    //getter and setter for the name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //getter and setter for the calories
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getExerciseDetails() {
        return letter + "," + name + "," + calories;
    }
}