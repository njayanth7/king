import java.util.*;
class Rectangle
{
int length;
int width;
int area;
void input()
{
Scanner s=new Scanner(System.in);
System.out.println("enter length and width");
length=s.nextInt();
width=s.nextInt();
}
void output()
{
System.out.println("the area is"+area);
}
void compute()
{
area=length*width;
}
}

class Boo
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.input();
r.compute();
r.output();
}}
