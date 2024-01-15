import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;

public class Panel extends JPanel {
    Figura figura = new Figura ();
    Teclado teclado = new Teclado ();

    private Timer timer;
    private AffineTransform affine;
    private double degree;
    public Panel (){
        this.setLayout(null);
        this.setBackground(Color.BLACK);
        this.addKeyListener(teclado);
        this.setFocusable(true);
        affine = new AffineTransform();
        degree = 0;
        animacion();
    }

    public void animacion (){
        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (teclado.getDerecha()){
                    degree ++;
                }
                if (teclado.getIzquierda()){
                    degree --;
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    public void paintComponent (Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        affine = graphics2D.getTransform();
        rotarBloque(graphics2D);
        dibujarBloque(graphics2D);
        graphics2D.setTransform(affine);
    }
    public void rotarBloque (Graphics2D graphics2D){
        graphics2D.rotate(toRadians(degree), puntoApoyoEnX(),puntoApotoEnY());
    }

    public double toRadians (double degree){
        return Math.toRadians(degree);
    }
    public double puntoApoyoEnX (){
        if (teclado.getIzquierda() && !teclado.getDerecha()){
            return figura.getBloque().getCenterX()-figura.getBloque().getWidth()/2;
        }
        else {
            return figura.getBloque().getCenterX()+figura.getBloque().getWidth()/2;
        }
    }
    public double puntoApotoEnY (){
        return figura.getBloque().getCenterY();
    }
    public void dibujarBloque (Graphics2D graphics2D){
        graphics2D.setColor(Color.RED);
        graphics2D.fill(figura.getBloque());
    }
}
