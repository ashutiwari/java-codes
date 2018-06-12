import java.util.Scanner;

class Decimal
{
    public static void main(String s[])
    {   int a,j,c=1,i=0;
        int num[]=new int[20];

        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter a no. to get the Decimal");
        a=sc.nextInt();
        c=a;
        while(c!=0)
        {
            
            num[i]=c%2;
            c=c/2;
            i++;

        }
        System.out.println("Binary no of decimal no is");

        for(j=i-1;j>=0;j--)
        {
            System.out.print(num[j]);

        }
        System.out.println();

    }


}