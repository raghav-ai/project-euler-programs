import java.util.Scanner;
class q6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum=0;;int summ=0;
        for (int i=1;i<=100;i++)
        {
            sum= sum+i;
            summ = summ +(int)Math.pow(i,2);
        }
        sum=(int) Math.pow(sum,2);
        int diff = summ - sum;
        System.out.println(sum+" "+summ+" "+diff);
    }
}