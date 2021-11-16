class q2
{
    public static void main(String args[])
    {
        long a,b,c;
        a=0;
        b=1;
        c=0;
        long sum=0;
        for(int i=0;;i++)
        {
            c= a+b;
            a=b;b=c;
            if(c>4000000)
            break;
            if(c%2==0)
            sum =sum+c;
            
        }
        System.out.println(sum);
    }
}