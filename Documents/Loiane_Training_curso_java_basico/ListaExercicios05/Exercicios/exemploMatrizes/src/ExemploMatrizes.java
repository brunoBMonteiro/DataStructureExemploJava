import java.util.Random;

public class ExemploMatrizes {
    public static void main(String[] args){

        int[][] numerosAleatorios = new int[10][10];

        Random numerosRandom = new Random();

        for(int i = 0; i < numerosAleatorios.length; i++){
            for (int j = 0; j<numerosAleatorios[i].length; j++){
                numerosAleatorios[i][j] = numerosRandom.nextInt(100);
            }
        }

        int  maior = 0;
        int linha = 0;
        int coluna = 0;

        for(int i =0; i < numerosAleatorios.length; i++){
            for(int j = 0; j < numerosAleatorios[i].length; j++){
                if(numerosAleatorios[i][j] > maior){
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Maior valor = " + linha);
        System.out.println("Maior valor = " + coluna);

    }
}
