package swen;

public class Log{
    private String letter;
    private String date;
    private String serving;
    private String count;
    
    public Log(String date, String letter, String serving){
       this.date = date;
       this.letter = letter;
       this.serving = serving;
    }
    
    public Log(String date, String letter, String serving, String count){
       this.date = date;
       this.letter = letter;
       this.serving = serving;
       this.count = count;
    }

    //getter and setter for the letter
    public String getDate(){
        return date;
     }
     public void setDate(String date){
         this.date = date;
     }
    //getter and setter for the letter
    public String getServing(){
       return serving;
    }
    public void setServing(String serving){
        this.serving = serving;
    }
    //getter and setter for the letter
    public String getCount(){
       return count;
    }
    public void setCount(String count){
        this.count = count;
    }
    
    public String getLogDetails(){
       return date + "," + letter + "," + serving + "," + count;
    }
 }