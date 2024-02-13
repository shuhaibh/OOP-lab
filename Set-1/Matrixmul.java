//Program to carry out Matrix Multiplication
import java.util.Scanner;
public class Matrixmul{
        public static void main(String[] args){

                Matrixmul M=new Matrixmul();
                int m,n,p,q;
                Scanner sc = new Scanner(System.in);
                //inputting the number of rows and columns
                System.out.println("Enter the size of Matrix A:-");
                m = sc.nextInt();
                sc.nextLine();
                n = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the size of Matrix B:-");
                p = sc.nextInt();
                sc.nextLine();
                q = sc.nextInt();
                sc.nextLine();

                int A[][] = new int[m][n];
                int B[][] = new int[p][q];
                int C[][] = new int[m][q];

                //checking condition for multiplication
                if(n!=p)
                        System.out.print("Matrix multiplication is not possible");
                else
                {
                        //inserting elements of Matrix A
                        System.out.println("Enter the elements of Matrix A");
                        for(int i=0;i<m;i++){
                                for(int j=0;j<n;j++)
                                {
                                        A[i][j]=sc.nextInt();
                                        sc.nextLine();
                                }
                        }
                        //inserting elements of Matrix B
                        System.out.println("Enter the elements of Matrix B");
                        for(int i=0;i<p;i++){
                                for(int j=0;j<q;j++)
                                {
                                         B[i][j]=sc.nextInt();
                                        sc.nextLine();
                                }
                        }
                        //calculating multiplied matrix
                        for(int i=0;i<m;i++){
                                for(int j=0;j<q;j++)
                                {
                                        C[i][j]=0;
                                        for(int k=0;k<n;k++){
                                                C[i][j]=C[i][j]+A[i][k]*B[k][j];
                                        }
                                }
                        }
                        //Displaying the matrices
                        System.out.println("Matrix A:-");
                        for(int i=0;i<m;i++){
                                for(int j=0;j<n;j++){
                                        System.out.print(A[i][j]+"\t");
                                }
                                System.out.println();
                        }
                        System.out.println("Matrix B:-");
                        for(int i=0;i<p;i++){
                                for(int j=0;j<q;j++){
                                        System.out.print(B[i][j]+"\t");
                                }
                                System.out.println();
                        }
                        System.out.println("Matrix C:-");
                        for(int i=0;i<m;i++){
                                for(int j=0;j<q;j++){
                                        System.out.print(C[i][j]+"\t");
                                }
                                System.out.println();
                        }
                }
        }
}
