package swen;

import javax.swing.JFrame;

public class UI {

    public UI() {
        //run();
    }

    public void handle() {
        // handles any button press on UI
    }

    public void run() {
        JFrame frame = new JFrame("Admin Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

}
