import javax.swing.JOptionPane;
public class ExercicioVetor05{
    public static void main(String[] args){
        double pesos[] = new double[5];
            pesos[0] = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Informe o primeiro peso: ","Balança",JOptionPane.PLAIN_MESSAGE));
            pesos[1] = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Informe o segundo peso: ", "Balança",JOptionPane.PLAIN_MESSAGE));
            pesos[2] = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Informe o terceiro peso: ","Balança",JOptionPane.PLAIN_MESSAGE));
            pesos[3] = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Informe o quarto e ultimo peso: ","Balança",JOptionPane.PLAIN_MESSAGE));
            
        double mediaDePeso = (pesos[0] + pesos[2] + pesos[3]) / 4;
                JOptionPane.showMessageDialog(null, "Média dos pesos informados: " + "\n" + mediaDePeso);
 
    }
}