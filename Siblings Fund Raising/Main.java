import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int h,j,l,s;
        System.out.println("Enter the number of boxes sold by Sara");
        s=sc.nextInt();
        System.out.println("Enter the number of boxes sold by Harry");
        h=sc.nextInt();
        System.out.println("Enter the number of boxes sold by Leo");
        l=sc.nextInt();
        System.out.println("Enter the number of boxes sold by James");
        j=sc.nextInt();
        if (h==j && j==l && l==s)
        {System.out.println("All get the same gifts");return;}
        if(h>j && h>l && h>s)
        {System.out.println("Harry receives the gifts ");return;}
        if(j>h && j>l && j>s)
        {System.out.println("James receives the gifts");return;}
        if(l>h && l>j && l>s)
        {System.out.println("Leo receives the gifts");return;}
        if(s>h && s>j && s>l)
        {System.out.println("Sara receives the gifts");return;}
        if(h==l && h>j && h>s)
        {System.out.println("Harry and Leo receive the gifts");return;}
        if(s==h && s>j && s>l)
        System.out.println("Sara and Harry receive the gifts");
        if(s==j && s>h && s>l)
        System.out.println("Sara and James receive the gifts");
        if (s==l && s>h && s>j)
        System.out.println("Sara and Leo receive the gifts");
        if(h==l && h>s && h>j)
        System.out.println("Harry and James receive the gifts");
        if(l==j && l>h && l>s)
        System.out.println("Leo and James receive the gifts");
        if(s==h && s==l && s>j)
        System.out.println("Sara, Harry and Leo receive the gifts");
        if(s==h && s==j && s>l)
        System.out.println("Sara, Harry and James receive the gifts");
        if(s==l && s==j && s>h)
        System.out.println("Sara, Leo and James receive the gifts");
        if(h==l && h==j && h>s)
        System.out.println("Harry, Leo and James receive the gifts");

    }
}