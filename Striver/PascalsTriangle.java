package Striver;

public class PascalsTriangle {
    public static void main(String[] args) {
        int N = 5;
        int r = 5;
        int c = 3;
        int triangle[][] = new int[N][];
        for (int i = 0; i < N; i++) {
            triangle[i] = new int[i+1];
            for (int j = 0; j <= i; j++) {
                if(j==0||j==i){
                    triangle[i][j]=1;
                } else {
                    triangle[i][j] = triangle[i-1][j]+triangle[i-1][j-1];
                }
            }
        }
        System.out.println(triangle[r-1][c-1]);
        for (int i = 0; i < triangle[N-1].length; i++) {
            System.out.print(triangle[N-1][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]+" ");                
            }
            System.out.println();
        }
    }
}
