package abc;

public class Arr2D {

    public static void main(String[] args) {
        int arr[][] = new int[5][3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = 10;
            }

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        // average of each column
        int total;
        int average;
        for (int j = 0; j < 3; j++) {
            total = 0;
            for (int i = 0; i < 5; i++) {
                total = total + arr[i][j];
            }
            average = total / 5;
            System.out.println(average);

        }
    }


}
