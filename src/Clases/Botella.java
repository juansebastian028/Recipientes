package Clases;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Botella extends Recipiente {

    public Botella() {
        super();
    }

    @Override
    public void vaciar(JLabel recipiente, JLabel nivelActual) {

        if (super.contRecipiente > 0) {

            super.diminuirNivel();

            ImageIcon botellaVacia = new ImageIcon(getClass().getResource("/Imagenes/BotellaVacia.png"));
            recipiente.setIcon(botellaVacia);
            nivelActual.setText(Integer.toString(super.contRecipiente));

        } else {

            JOptionPane.showMessageDialog(null, "La botella ya está vacía");
            super.contRecipiente = 0;
            nivelActual.setText(Integer.toString(super.contRecipiente));
        }
    }

    @Override
    public void llenar(JLabel recipiente, JLabel nivelActual) {

        super.aumentarNivel();

        nivelActual.setText(Integer.toString(super.contRecipiente));

        if (super.contRecipiente == 1) {

            ImageIcon botellaLlena = new ImageIcon(getClass().getResource("/Imagenes/BotellaLlena.png"));
            recipiente.setIcon(botellaLlena);

        } else {
            super.contRecipiente = 1;
            nivelActual.setText(Integer.toString(super.contRecipiente));
            JOptionPane.showMessageDialog(null, "La botella ya está llena");
        }
    }

}
