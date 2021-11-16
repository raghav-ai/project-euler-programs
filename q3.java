import java.util.Scanner;
public class q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l=sc.nextLong();
        sc.close();
        long n=l/2;
        long p=0;
        q3 obj= new q3();
        int k=0;
        for(int i=3;i<=n;i+=2)
        {
            if(l%i==0)
            {
                p=l/i;
                k= obj.pal(p);
            }
            if(k==1) {
                System.out.println(p);
                break;
            }
        }

    }
    public int pal(long p)
    {
        int c=0;
        for(long i=2;i<p;i++)
        {
            if(p%i==0) {
                c++;
                break;
            }
        }
        if(c==0)
            return 1;
        else
            return 0;

    }
}