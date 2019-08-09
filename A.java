import java.util.*;
import java.lang.Math;

public class A
{
void quad(int a,int b,int c)
{
int d;
double a1;
double a2;
d=(b^2)-(4*a*c);
if(d>0)
{
System.out.println("roots are distinct and real");
a1=(-b+Math.sqrt(d))/(2*a*c);
a2=(-b-Math.sqrt(d))/(2*a*c);
System.out.println("roots are"+a1+"&"+a2);
}
if(d==0)
{
System.out.println("roots are equal and real");
a1=(-b+Math.sqrt(d))/(2*a*c);
a2=a1;
System.out.println("roots are"+a1+"&"+a2);
}

if(d<0)
{
System.out.println("roots are imaginary");

}

}
public static void main(String args[])
{
int a;
int b;
int c;
A ab=new A();
Scanner s=new Scanner(System.in);
System.out.println("enter the coefficients of the quadratic equation");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
ab.quad(a,b,c);
}
}
