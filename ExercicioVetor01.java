public class ExercicioVetor01{
    public static void main(String[] args){
        int[] idades = new int[16];
        idades[1] = 20;
        idades[0] = 10;
        idades[2] = 25;
        idades[3] = 30;
        idades[4] = 35;
        idades[5] = 40;
        idades[6] = 45;
        idades[7] = 50;
        idades[8] = 55;
        idades[9] = 60;
        idades[10] = 65;
        idades[11] = 70;
        idades[12] = 18;
        idades[13] = 22;
        idades[14] = 25;
        idades[15] = 13;
        
        int soma = idades[0] + idades[1] + idades[2] + idades [3] + idades[4]+
                   idades[5] + idades[6] + idades[7] + idades[8] + idades[9]+
                   idades[10] + idades[11] + idades[12] + idades[13] + idades [14]+
                   idades[15]; 
        System.out.println("Soma do vetores: " + soma);


        
    }
}