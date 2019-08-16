import java.util.*;

class Abc
{

 
void s(int a[],int n)
{  int i;
int j;
int c=0;

for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
c=a[i];
a[i]=a[j];
a[j]=c;
}
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);

}
}

public static void main(String args[])
{
int i;
Abc ab=new Abc();
Scanner s=new Scanner(System.in);
int n;
n=s.nextInt();
int a[]=new int[n];

for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}

ab.s(a,n);
}}