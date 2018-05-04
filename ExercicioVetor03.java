public class ExercicioVetor03{
    public static void main(String[] args){
    String nome[]= new String[7];
    double[] precos = new double[7];
    nome[0] = "Doce de leite";
    precos[0]= 12.65;

    nome[1] = "Brigadeiro";
    precos[1] = 25.68;

    nome[2] = "Mousse de Chocolate";
    precos[2] = 12.98;

    nome[3] = "Mousse de Maracujá";
    precos[3] = 12.98;
    
    nome[4] = "Bananinha";
    precos[4] = 7.99;

    nome[5] = "Tortoleta de Limão";
    precos[5] = 5.99;

    System.out.println("Produtos:            " + "  Precos R$: " +"\n" + nome[0] + "         " +precos[0] +
                       "\n" + nome[1] + "            " + precos[1] +
                       "\n" + nome[2] + "   " + precos[2]
                       );
       
    }
}