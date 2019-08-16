import java.util.*;
class Bo
{
void as()
{int r;
int c;
int i;
int j;

Scanner s=new Scanner(System.in);
System.out.println("enter matrix row and column");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];

int b[][]=new int[r][c];

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
b[i][j]=s.nextInt();
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println("the sum is");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
 System.out.println(a[i][j]+b[i][j]);
}}
System.out.println("the difference is");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
 System.out.println(a[i][j]-b[i][j]);
}}

}
public static void main(String args[])
{
Bo g=new Bo();
g.as();
}
}