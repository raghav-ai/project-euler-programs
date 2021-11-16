import java .util.Scanner;
class q4
{
    int max;
    int i,j;
    q4()
    {
        max=0;
        i=999;j=999;
    }

    int checkpal()
    {
        int pa=0;
        int v=0;
        int p=0;
        for(i=999;i>99;i--)
        {
            for(j=999;j>99;j--)
            {
                pa= i*j;
                v=0;
                p=pa;
                int c=0;
                int counter=0;
                while (p>0)
                {
                    p=p/10;
                    counter++;
                }
                p=pa;
                for (int k=counter-1;k>=0;k--)
                {
                    c=pa%10;
                    v = v+c*(int )Math.pow(10,k);
                    pa=pa/10;
                }
                if(p==v){
                    if(p>max)
                    max=p;
                    
                }
            }
        }
        return max;
    }

    public static void main(String args[])
    {

        q4 obj = new q4();
        int a=obj.checkpal();
        System.out.println(a);
    }
}

