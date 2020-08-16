package Controller;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Olla extends Recipiente {
    
    
   public Olla(){
       super();
   }

   @Override
    public void vaciar(JLabel recipiente, JLabel nivelActual) {
        
        ImageIcon VaciarOlla;
        
        if (super.contRecipiente > 0) {
            super.diminuirNivel();

            switch (super.contRecipiente) {

                case 1:
                    VaciarOlla = new ImageIcon(getClass().getResource("/ImgOllas/1.png"));
                    recipiente.setIcon(VaciarOlla);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 2:
                    VaciarOlla = new ImageIcon(getClass().getResource("/ImgOllas/2.png"));
                    recipiente.setIcon(VaciarOlla);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 3:
                    VaciarOlla = new ImageIcon(getClass().getResource("/ImgOllas/3.png"));
                    recipiente.setIcon(VaciarOlla);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 4:
                    VaciarOlla = new ImageIcon(getClass().getResource("/ImgOllas/4.png"));
                    recipiente.setIcon(VaciarOlla);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 5:
                    VaciarOlla = new ImageIcon(getClass().getResource("/ImgOllas/5.png"));
                    recipiente.setIcon(VaciarOlla);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 6:
                    VaciarOlla = new ImageIcon(getClass().getResource("/ImgOllas/6.png"));
                    recipiente.setIcon(VaciarOlla);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 7:
                    VaciarOlla = new ImageIcon(getClass().getResource("/ImgOllas/7.png"));
                    recipiente.setIcon(VaciarOlla);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 8:
                    VaciarOlla = new ImageIcon(getClass().getResource("/ImgOllas/8.png"));
                    recipiente.setIcon(VaciarOlla);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 9:
                    VaciarOlla = new ImageIcon(getClass().getResource("/ImgOllas/9.png"));
                    recipiente.setIcon(VaciarOlla);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                case 10:
                    VaciarOlla = new ImageIcon(getClass().getResource("/ImgOllas/10.png"));
                    recipiente.setIcon(VaciarOlla);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;

                default:
                    VaciarOlla = new ImageIcon(getClass().getResource("/ImgOllas/OllaVacia.png"));
                    recipiente.setIcon(VaciarOlla);
                    nivelActual.setText(Integer.toString(super.contRecipiente));
                    break;
            }
        } else {
            super.contRecipiente = 0;
            nivelActual.setText(Integer.toString(super.contRecipiente));
            JOptionPane.showMessageDialog(null, "La olla de cocina ya está vacía");

        }
    }

   @Override
    public void llenar(JLabel recipiente, JLabel nivelActual) {

        super.aumentarNivel();
        ImageIcon LlenarOlla;

        switch (super.contRecipiente) {
            case 1:
                LlenarOlla = new ImageIcon(getClass().getResource("/ImgOllas/1.png"));
                recipiente.setIcon(LlenarOlla);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 2:
                LlenarOlla = new ImageIcon(getClass().getResource("/ImgOllas/2.png"));
                recipiente.setIcon(LlenarOlla);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 3:
                LlenarOlla = new ImageIcon(getClass().getResource("/ImgOllas/3.png"));
                recipiente.setIcon(LlenarOlla);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 4:
                LlenarOlla = new ImageIcon(getClass().getResource("/ImgOllas/4.png"));
                recipiente.setIcon(LlenarOlla);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 5:
                LlenarOlla = new ImageIcon(getClass().getResource("/ImgOllas/5.png"));
                recipiente.setIcon(LlenarOlla);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 6:
                LlenarOlla = new ImageIcon(getClass().getResource("/ImgOllas/6.png"));
                recipiente.setIcon(LlenarOlla);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 7:
                LlenarOlla = new ImageIcon(getClass().getResource("/ImgOllas/7.png"));
                recipiente.setIcon(LlenarOlla);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 8:
                LlenarOlla = new ImageIcon(getClass().getResource("/ImgOllas/8.png"));
                recipiente.setIcon(LlenarOlla);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 9:
                LlenarOlla = new ImageIcon(getClass().getResource("/ImgOllas/9.png"));
                recipiente.setIcon(LlenarOlla);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            case 10:
                LlenarOlla = new ImageIcon(getClass().getResource("/ImgOllas/10.png"));
                recipiente.setIcon(LlenarOlla);
                nivelActual.setText(Integer.toString(super.contRecipiente));
                break;
            default:
                super.contRecipiente = 10;
                nivelActual.setText(Integer.toString(super.contRecipiente));
                JOptionPane.showMessageDialog(null, "La olla de cocina ya está llena");
                break;
        }
    }

}
