import javax.swing.*;

/**
 * @author Israel Reyes
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Examen Caro");
        Panel panel = new Panel ();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(panel);
    }
}