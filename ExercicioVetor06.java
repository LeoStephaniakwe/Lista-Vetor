import javax.swing.JOptionPane;
public class ExercicioVetor06{
    public static void main(String[] args){
        int idade[] = new int[9];
        idade[0] = Integer.parseInt(JOptionPane.showInputDialog(null, 
        "Informe a primeira idade:"));
        idade[1] = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe a segunda idade:"));
        idade[2] = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe a terceira idade:"));
        idade[3] = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe a quarta idade:"));
        idade[4] = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe a quinta idade:"));
        idade[5] = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe a sexta idade:"));
        idade[6] = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe a sétima idade:"));
        idade[7] = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe a penultima idade:"));
        idade[8] = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe a ultima idade:"));

        int media = (idade[0] + idade[1] + idade[2] + idade[3] + idade[4]+
                    idade[5] + idade[6] + idade[7] + idade[8]) / 4;
                    JOptionPane.showMessageDialog(null, "Média Faixa Etária: " + media);

        
    }
}