
public class Dimensional3 {
	public static void main(String[] args) {

		int a[][][] = new int[3][3][3];

		a[0][0][0] = 10;
		a[0][0][1] = 20;
		a[0][0][2] = 30;

		a[0][1][0] = 40;
		a[0][1][1] = 50;
		a[0][1][2] = 60;

		a[0][2][0] = 70;
		a[0][2][1] = 80;
		a[0][2][2] = 90;

		a[1][0][0] = 100;
		a[1][0][1] = 110;
		a[1][0][2] = 120;

		a[1][1][0] = 130;
		a[1][1][1] = 140;
		a[1][1][2] = 150;

		a[1][2][0] = 160;
		a[1][2][1] = 170;
		a[1][2][2] = 180;

		a[2][0][0] = 190;
		a[2][0][1] = 200;
		a[2][0][2] = 210;

		a[2][1][0] = 220;
		a[2][1][1] = 230;
		a[2][1][2] = 240;

		a[2][2][0] = 250;
		a[2][2][1] = 260;
		a[2][2][2] = 270;

		System.out.println(a[1][1][0]);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int j3 = 0; j3 < a.length; j3++) {

					System.out.println(a[i][j][j3]);

				}
			}

		}
		System.out.println("**********");

		for (int[][] M : a) {
			for (int[] v : M) {
				for (int S : v) {

					System.out.println(S);

				}

			}

		}
	}

}
