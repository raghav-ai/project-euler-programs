import java.util.Scanner;
class q21
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int sumall=0;
        int sum1=0;
        for(int i=1;i<10000;i++)
        {
            for(int j=1;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    sum=sum+j+(i/j);
                }
            }
            sum=sum-i;
            
            if(i!=sum)
            {
                for(int k=1;k<=Math.sqrt(sum);k++)
                {
                    if(sum%k==0)
                    {
                        sum1=sum1+k+(sum/k);
                    }
                }
                sum1-=sum;
                
                if(i==sum1){
                    sumall=sumall+sum;
                    System.out.println(sumall);
                }
            }
            sum=0;
            sum1=0;
        }
    }
}