import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Figura figura = new Figura ();
    public Panel (){
        this.setLayout(null);
        this.setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent (Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        dibujarBloque(graphics2D);
    }

    public void dibujarBloque (Graphics2D graphics2D){
        graphics2D.setColor(Color.RED);
        graphics2D.fill(figura.getBloque());
    }
}
