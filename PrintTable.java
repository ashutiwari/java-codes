import java.util.Scanner;

class PrintTable
{
    public static void main(String s[])
    {   int a;

        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter a no. to get the table");
        a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a*i);

        }


    }


}