import javax.swing.JOptionPane;
public class ExercicioVetor04{
    public static void main(String[] args){
        String disciplina = JOptionPane.showInputDialog(null, 
        "Informe a Disciplina:");
        
        double notas[] = new double[4];
        
        notas[0] = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Informe a primeira nota:"));
        notas[1] = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Informe a segunda nota:"));
        notas[2] = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Informe a terceira nota:"));
        notas[3] = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Informe a quarta e ultima nota:"));

        double media = (notas[0] + notas[2] + notas[3]) / 4;
            JOptionPane.showMessageDialog(null, "Disciplina: " + disciplina + "\n"+"Sua média foi: " + media);
        
        
        
        
    }
}