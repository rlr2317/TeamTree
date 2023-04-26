package swen;
public class Admin 
{
    public Admin(){
        UI ui = new UI();
        ui.run();
    }

    public static void main (String[] args) 
    {
        new Admin();
    }
}