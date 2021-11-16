import java .util.Scanner;
class q5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=2520;
        int counter=0;
        int i=1;
        while(true)
        {

            if(n%i==0){
                i++;    
                counter++;
            }
            else{
                counter=0;
                n++;
                i=1;
            }
            if(counter==20){
                System.out.println(n);
                break;
            }
        }
    }
}