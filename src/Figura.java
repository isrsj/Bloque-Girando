import java.awt.geom.Rectangle2D;

public class Figura {
    private Rectangle2D bloque;

    public Figura (){
        bloque = new Rectangle2D.Double();
    }

    public Rectangle2D getBloque (){
        return bloque = new Rectangle2D.Double(200,220,100,30);
    }
}
