// java program to multiply two given matrix
import java.util.Scanner;
class Main{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the order m1 means row of the matrix");
 int m1=sc.nextInt();
 System.out.println("Enter the order of n1 means column of the matrix");
 int n1=sc.nextInt();
 System.out.println("Enter the order of m2 of second matrix");
 int m2=sc.nextInt();
 System.out.println("Enter the order of n2 of second matrix");
 int n2=sc.nextInt();
 if(n1!=m2){
  System.out.println("Matrix multiplication is not possible n1 not equal to m2");
  return;
  }
 int A[][]=new int[m1][n1];
 int B[][]=new int[m2][n2];
 int C[][]=new int[m1][n2];
 System.out.println("Enter the first matrix");
 for(int i=0;i<m1;i++){
  for(int j=0;j<n1;j++){
   System.out.println("A["+i+"]["+j+"]=");
   A[i][j]=sc.nextInt();
   }
  }
 System.out.println("Enter the second matrix");
 for(int i=0;i<m2;i++){
  for(int j=0;j<n2;j++){
   System.out.println("B["+i+"]["+j+"]=");
   B[i][j]=sc.nextInt();
   }
  }
  
 for(int i=0;i<m1;i++){
  for(int j=0;j<n2;j++){
   C[i][j]=0;
   for(int k=0;k<n1;k++){
    C[i][j]+=A[i][k]*B[k][j];
    }
   }
  }
 System.out.println("first matrix ");
 for(int i=0;i<m1;i++){
  for(int j=0;j<n1;j++){
   System.out.print(A[i][j]+"\t");
   }
   System.out.println();
  }
 System.out.println("second matrix ");
 for(int i=0;i<m2;i++){
  for(int j=0;j<n2;j++){
   System.out.print(B[i][j]+"\t");
   }
   System.out.println();
  } 
 System.out.println("multiplied matrix ");
 for(int i=0;i<m1;i++){
  for(int j=0;j<n2;j++){
   System.out.print(C[i][j]+"\t");
   }
   System.out.println();
  }
 }
}

  
 
