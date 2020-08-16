package Clases;

import javax.swing.JLabel;

public abstract class Recipiente {

    protected int contRecipiente;

    public Recipiente() {
        contRecipiente = 0;
    }

    public abstract void vaciar(JLabel recipiente, JLabel nivelActual);

    public abstract void llenar(JLabel recipiente, JLabel nivelActual);

    protected void aumentarNivel() {
        contRecipiente++;
    }

    protected void diminuirNivel() {
        contRecipiente--;
    }

}
