import java.util.*;
class Bom
{
void lar()
{
int r;
int c;
int l=0;
int i;
int j;
Scanner s=new Scanner(System.in);
System.out.println("enter matrix row and column");
r=s.nextInt();
c=s.nextInt();
  
    int nums[][] = new int[r][c];

    for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
nums[i][j]=s.nextInt();
}
}
    for (int x[] : nums) {
      for (int y : x) {
        System.out.println("Value is: " + y);
        if(y>l)
        l=y;
      }
    }
    System.out.println("large: " + l);
  
}
public static void main(String args[])
{
Bom g=new Bom();
g.lar();
}
}