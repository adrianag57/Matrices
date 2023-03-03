package matrices;

public class Start {

	public static void main(String[] args) {

		int filas = 7;
		int columnas = 7;

		int[][] matriz = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {

				if (j == 0 || j == columnas - 1 || i == j || i == filas / 2 ) {

					matriz[i][j] = 7;
				}
			}
		}

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
