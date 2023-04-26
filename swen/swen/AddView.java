package swen;
import javax.swing.JFrame;

public class AddView{

   public AddView(){
      run();
   }
   
   public void run() {
      JFrame frame = new JFrame("Admin Display");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(400, 300);
      frame.setVisible(true);
  }
   
   public void handle(){
      //handles any button press on UI
   }
}