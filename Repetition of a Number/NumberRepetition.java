import java.util.Scanner;
public class NumberRepetition{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z,w,c;
        System.out.println("Enter the number");
        x=sc.nextInt();
        System.out.println("Enter the Key digit");
        y=sc.nextInt();
        z=x;
        c=0;
        while(z>0){
            w=z%10;
            if(w==y)
            c++;
            z=z/10;
            
        }
        System.out.println(y+" appears "+c+" times in "+x);
    }
}