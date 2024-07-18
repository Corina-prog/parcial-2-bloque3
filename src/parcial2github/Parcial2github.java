
package parcial2github;

public class Parcial2github {

    public static void main(String[] args) {
        int matriz [][]= {{5, 7, 9}, {4, 2, 1}, {1, 1, 1}};
        int arr [][]= new int [3][3];
        int fil=2;
        int col=2;
        for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[0].length; j++) {
           arr[fil][col] = matriz[i][j];
          col--;
    }
         fil--;
         col=2;
            }
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(arr [i][j] + "|");
            }
             System.out.println("");
        }
        }
}
     

