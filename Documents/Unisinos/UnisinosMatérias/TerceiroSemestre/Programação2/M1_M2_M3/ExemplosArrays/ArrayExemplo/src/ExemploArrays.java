import motoristaarray.MotoristaApp;

import java.util.Scanner;

public class ExemploArrays {

    public int procuraNome(String[] nomes, String nome){
        for (int i = 0; i < nomes.length; i++)
            if (nomes[i].equalsIgnoreCase(nome))
                return i;
        return -1;
    }

    public double calculaMedia(double[] valores){
        double soma = 0;
        for (int i = 0; i < valores.length; i++)
            //soma = soma + valores[i];
            soma += valores[i];
        return soma / valores.length;
    }

    public void imprimeAvaliacoesMotorista(MotoristaApp[] motoristas, String nome){
        System.out.println("Avaliações do motorista" + nome + ":");
        for (int i = 0; i < motoristas.length ; i++) {
            if (motoristas[i] != null){
                if(motoristas[i].getNome().equalsIgnoreCase(nome));
                    motoristas[i].imprimeAvaliacoes();
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        /*
        String[] nomes = {"João","Ana","Maria","Pedro"};
        String nome = "Ana";
         */

        /*
        ExemploArrays e = new ExemploArrays();
        int posicao = e.procuraNome(nomes, nome);
        System.out.println("Posição encontrada: " + posicao);

        double[] valores = {5.6, 95.4, 62.9, 10.2};
        double media = e.calculaMedia(valores);
        System.out.println("Média dos valores: " + media);
         */

        MotoristaApp[] motoristas = new MotoristaApp[10];
        for (int i = 0; i <motoristas.length ; i++)
            motoristas[i] = new MotoristaApp("Jorge" + i, 100);

        if (motoristas[5].insereAvaliacao(4.7))
            System.out.println("Avaliação inserida com sucesso!");
        else
            System.out.println("Erro ao inserir avaliacao :(");

        ExemploArrays e = new ExemploArrays();
        e.imprimeAvaliacoesMotorista(motoristas, input.next("Digite o nome do motorista:"));

        /*
        // declarando e instanciando
        double[] listaDouble = new double[10];
        // declarando
        double[] array;

        // array int
        int[] arrayIntDeclaradoEInstanciado = new int[10];
        int[] arrayApenasDelcaro;

        String[] arrayStringDeclaroEIntanciado = new String[10];
        String arrayApenasDeclarado;

        char[] arrayCaraterDeclaradoEInstanciado = new char[10];
        char[] arrayDeCaracterApenasDeclarado;
        */
    }
}
