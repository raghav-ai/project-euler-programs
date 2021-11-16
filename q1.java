import java.util.Scanner;
class q1
{
    public static void main(String args[])
    {
        long sum =0;
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n= sc.nextInt();
            for (int i=3;i<=n;i++)
            {
                if (i%3==0 ||i%5==0)
                    sum = sum+i;
            }
            System.out.println(sum);
            sum=0;
        }
    }
}