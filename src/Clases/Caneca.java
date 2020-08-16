package Clases;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Caneca extends Recipiente {

    public Caneca() {
        super();
    }

    @Override
    public void vaciar(JLabel recipiente, JLabel nivelActual) {

        ImageIcon VaciarCaneca;
       
        if (super.contRecipiente > 0) {
            super.contRecipiente--;

            switch (super.contRecipiente) {

                case 1:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/1.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 2:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/2.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 3:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/3.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 4:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/4.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 5:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/5.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 6:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/6.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 7:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/7.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 8:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/8.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 9:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/9.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 10:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/10.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 11:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/11.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;
                case 12:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/12.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;
                case 13:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/13.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;
                case 14:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/14.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;
                case 15:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/15.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;
                case 16:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/16.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;
                case 17:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/17.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 18:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/18.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;
                case 19:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/19.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;
                case 20:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/20.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                default:
                    VaciarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/BaldeVacio.png"));
                    recipiente.setIcon(VaciarCaneca);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;
            }
        } else {
            super.contRecipiente = 0;
            nivelActual.setText(Integer.toString(super.contRecipiente));
            JOptionPane.showMessageDialog(null, "La caneca ya está vacía");

        }
    }

    @Override
    public void llenar(JLabel recipiente, JLabel nivelActual) {
        super.aumentarNivel();
        ImageIcon LlenarCaneca;

        switch (super.contRecipiente) {

            case 1:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/1.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 2:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/2.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 3:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/3.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 4:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/4.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 5:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/5.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 6:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/6.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 7:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/7.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 8:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/8.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 9:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/9.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 10:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/10.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 11:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/11.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 12:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/12.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 13:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/13.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 14:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/14.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 15:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/15.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 16:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/16.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 17:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/17.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 18:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/18.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 19:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/19.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 20:
                LlenarCaneca = new ImageIcon(getClass().getResource("/ImgCanecas/20.png"));
                recipiente.setIcon(LlenarCaneca);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            default:
                super.contRecipiente = 20;
                nivelActual.setText(Integer.toString(super.contRecipiente));
                JOptionPane.showMessageDialog(null, "La caneca ya está llena");
                break;
        }
    }

}
