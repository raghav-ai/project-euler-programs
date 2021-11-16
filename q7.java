import java.util.Scanner;
class q7 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=1;
        int t=0;
        int counter=0;
        int sum=0;
        while (true)
        {
            
            if(t==100000)
            {
                System.out.println(n);
                System.exit(0);
            }
            counter=0;
            n++;
            for(int i=1;i<n;i++)
            {
               if (n%i ==0)
                  counter++;
                }
            if(counter==1){
             t++;
             
            }
        }
    }
}
              