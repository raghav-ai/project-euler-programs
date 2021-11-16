import java.util.Scanner;
class fib1000
{
    public static void main(String args[])
    {
        int c=12;
        int j=89;
        int k=144;
        int l=0;
        String s="";
        while (true)
        {
            l=j+k;
            j=k;
            k=l;
            c++;
            s=Integer.toString(l);
            
            if(s.length()==1000){
                System.out.println(c);
                System.exit(0);
            }
        }
    }
}