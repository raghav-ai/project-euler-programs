import java.util.Scanner;
class q17
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        q17 obj = new q17();
        int counter=0;
        for(int i=1;i<1000;i++)
        {
            if (i<=10)
                counter+=obj.l1(i);
            else if(i<=19)
            {
                counter+=obj.m2(i);
            }
            else if(i<100)
                counter+=obj.m1(i);
            else
               counter+=obj.h1(i); 
        }
        counter+=11;
        System.out.println(counter);
    }

    int l1(int i)//3 3 5 4 4 3 5 5 4 3
    {
        int counter=0;
        if(i==2||i==1||i==6||i==10)
            counter+=3;
        else if(i==3||i==8||i==7)
            counter+=5;
        else
            counter+=4;
        return counter;
    }

    int m2(int p)// 6 6 8 8 7 7 9 8  8
    {
        int counter=0;
        int i=p%10;
        if(i<3)
            counter+=6;
        else if(i==5||i==6)
            counter+=7;
        else if(i==7)
            counter+=9;
        else 
        {
            counter+=8;
        }

        return counter;
    }

    int m1(int p)// 6 6 5 5 5 7 6 6
    {   int counter=0;
        int i=p%10;
        if(i==2||i==1||i==6)
            counter+=3;
        else if(i==3||i==8||i==7)
            counter+=5;
        else if(i==0)
        counter+=0;
        else
            counter+=4;
        i=(p/10)%10;

        if(i==2||i==3||i==8||i==9)
            counter+=6;
        else if(i==5||i==4||i==6)
            counter+=5;
        else
            counter+=7;
        return counter;
    }

    int h1(int p)
    {
        int counter=0;
        int i=(p/10)%10;
        int k=0;
        if(i==2||i==3||i==8||i==9)
            counter+=6;
        else if(i==5||i==4||i==6)
            counter+=5;
        else if(i==0)
        {k++;}
        else if(i==1)
        {}
        else
            counter+=7;
            
        if(i==1)
        {
            i=p%10;
            if(i==1||i==2)
                counter+=6;
            else if(i==5||i==6)
                counter+=7;
            else if(i==7)
                counter+=9;
            else if(i==0)
                counter+=3;
            else 
            {
                counter+=8;
            }
        }
        else{
            i=p%10;
            if(i==2||i==1||i==6)
                counter+=3;
            else if(i==3||i==8||i==7)
                counter+=5;
            else if(i==0)
            {k++;}
            else
                counter+=4;
        }

        i=(p/100)%10;
        counter+=7;
        if(i==2||i==1||i==6)
            counter+=3;
        else if(i==3||i==8||i==7)
            counter+=5;
        
        else
            counter+=4;
        if(k<2)
        counter+=3;
        return counter;
    }
}

