import java.util.Scanner;
class q9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        for(int a=1;a<1000;a++)
        {
            for(int b=1;b<1000;b++)
            {
                for(int c=1;c<1000;c++)
                {
                    if(a+b+c==1000)
                    {
                        if(a<b){
                            int sum= a*a+b*b;
                            if(sum==c*c)
                                System.out.println(a+" "+b+" "+c+" "+a*b*c);
                        }
                    }
                }
            }
        }
    }
}