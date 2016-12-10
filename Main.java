import java.util.Arrays;
import java.util.Scanner;
public class Main
{
public static void main(String []args)
{
Scanner input = new Scanner(System.in);

System.out.println("Enter the length of Array: ");
int length = input.nextInt();

int []A = new int[length];
int n=length-2;
System.out.println("Enter The array element: ");
for(int i=0;i<n;i++)
{
A[i] = input.nextInt();
}



 //System.out.println(Arrays.toString(A));

System.out.print("Enter the inserting index : ");
int k = input.nextInt();

System.out.print("Enter inserting item: ");
int item = input.nextInt();
int j=n;
while(j>=k)
{
A[j+1]=A[j];
j=j-1;
}
A[k]=item;
n=n+1;

System.out.println("After inserting array: is "+Arrays.toString(A));
//System.out.print("The number of element is : "+A.length);
System.out.println();
}
}
