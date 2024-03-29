import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Teclado implements KeyListener {
    private Boolean derecha, izquierda;
    private Boolean inicio;
    public Teclado (){
        derecha = false;
        izquierda = false;
        inicio = true;
    }

    public Boolean getDerecha() {
        return derecha;
    }

    public void setDerecha(Boolean derecha) {
        this.derecha = derecha;
    }

    public Boolean getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Boolean izquierda) {
        this.izquierda = izquierda;
    }

    public Boolean getInicio() {
        return inicio;
    }

    public void setInicio(Boolean inicio) {
        this.inicio = inicio;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            derecha = true;
            izquierda = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            izquierda = true;
            derecha = false;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
