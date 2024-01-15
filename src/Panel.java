import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    Figura figura = new Figura ();
    Teclado teclado = new Teclado ();

    private Timer timer;
    public Panel (){
        this.setLayout(null);
        this.setBackground(Color.BLACK);
        this.addKeyListener(teclado);
        this.setFocusable(true);
        animacion();
    }

    public void animacion (){
        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
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
