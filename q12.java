import java.util.Scanner;
class q12
{
    
    public static void main(String args[])
    {
        long nnum=862+863;
        long sum =371953;
        q12 obj = new q12();
        while(true)
        {
            sum=sum+nnum;
            obj.cfactor(sum,nnum);
            nnum++;
        }
    }

    void cfactor(long m,long n)
    {   int i=1;
        int counter=0;
        while(i<=m)
        {
            if(m%i==0)
                counter++;
            i++;
        }
        if(counter==200){
            System.out.print(i+" "+n);
            System.exit(0);
        }
    }
}