
import java.util.Scanner;
class Array
{
    public static void main(String [] args)
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your rollno");
        int rollno=sc.nextInt();
        System.out.println(rollno);

        int a[][]=new int[3][];
        a[0]=new int[2];
        a[1]=new int[1];
        a[2]=new int[3];

        for(i=0;i<a.length;i++)
        {
           for(j=0;j<a[i].length;j++)
           {    
               System.out.println("enter value in array");
               a[i][j]=sc.nextInt();

           }

        }

            System.out.println("Entered values are");

         for(i=0;i<a.length;i++)
        {
           for(j=0;j<a[i].length;j++)
           {    
               
               System.out.println(a[i][j]);
               

           }

        }






    }




}