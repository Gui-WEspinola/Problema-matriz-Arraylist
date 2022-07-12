package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program { // Problema 2 de matrizes
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre a quantidade de linhas: ");
        int linha = scanner.nextInt();
        System.out.print("Entre a quantidade de colunas: ");
        int coluna = scanner.nextInt();

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(linha);

        for (int i = 0; i < linha; i++) {
            matrix.add(new ArrayList<>(coluna));
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print("Digite o valor do " + (j+1) + "o elemento da " + (i+1) + "a linha: ");
                int input = scanner.nextInt();
                matrix.get(i).add(j, input);
            }
        }

        int findX = scanner.nextInt();

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                if (matrix.get(i).get(j) == findX){
                    System.out.printf("Position %d,%d:%n", i, j);
                    if (j > 0)
                        System.out.println("Left: " + matrix.get(i).get(j-1));
                    if (j + 1 < matrix.get(i).size())
                        System.out.println("Right: " + matrix.get(i).get(j+1));
                    if (i > 0)
                        System.out.println("Up :" + matrix.get(i-1).get(j));
                    if (i + 1 < matrix.size())
                        System.out.println("Down: " + matrix.get(i+1).get(j));
                }
            }
        }
        scanner.close();
    }

}
