import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество строк матрицы");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int m = in.nextInt();
        int i;
        int j;
        int[][] matr;
        matr = new int[n][m];
        System.out.println("Введите матрицу");
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.println("Введите элемент матрицы:");
                matr[i][j]=in.nextInt();
            }
        }
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.print(matr[i][j]+" ");
            }
            System.out.println();
        }
        int b = matr[0][0];
        int c = 0;
        int c1 = 0;
        int p = 0;
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                if(b<=matr[i][j]){
                    c = c +1;
                    b = matr[i][j];
                }
                else{
                    b = matr[i][j];
                    if (p==0){
                        c1 = c;
                    }
                    else{
                        if (c>c1){
                            c1 = c;
                        }
                        c = 1;
                    }
                }
            }
        }
        System.out.println("Количество элементов подряд:");
        System.out.println(c1);
    }
}