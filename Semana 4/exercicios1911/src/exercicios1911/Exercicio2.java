package exercicios1911;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		Random x = new Random();
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				N1[linha][coluna] = x.nextInt(10);
			}
		}
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				N2[linha][coluna] = x.nextInt(10);
			}
		}
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
			}
		}
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
			}
		}
		System.out.println("Soma: ");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.printf("[" + M1[linha][coluna] + "]");
			}
			System.out.println();
		}

		System.out.println("\nSubtração: ");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.printf("[" + M2[linha][coluna] + "]");
			}
			System.out.println();
		}
	}

}
