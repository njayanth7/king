import java.util.*;
class B
{
void fib(int n)
{
int sum=0;
int f=0;
int s=1;

System.out.println("the fibonacci series till "+n+"th number is");
System.out.println(f+" "+s);
for(int i=0;i<n;i++)
{
sum=f+s;

System.out.println(" "+sum);
f=s;
s=sum;

}
}


void fibn(int n)
{
int sum=0;
int f=0;
int s=1;

System.out.println("the "+n+"th number in fibonacci series starting from 0 is");

for(int i=0;i<n;i++)
{
sum=f+s;

f=s;
s=sum;

}
System.out.println(" "+sum);
}


public static void main(String args[])
{
B ba=new B();
Scanner s=new Scanner(System.in);
int n;
System.out.println("enter the limit of fibonacci series starting from 0");
n=s.nextInt();
ba.fib(n);
ba.fibn(n);

}
}