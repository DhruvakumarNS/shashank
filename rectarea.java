class rectangle
{
int length,width;
void getData(int x,int y)
{
length=x;
width=y;
}
int rectarea()
{
int area;
area=length*width;
return(area);
}
}
class rectArea
{
public static void main(String args[])
{
int area1,area2;
rectangle rect1=new rectangle();
rectangle rect2=new rectangle();
rect1.length=15;
rect1.width=20;
area1=rect1.length*rect1.width;
rect2.getData(10,20);
area2=rect2.rectarea();
System.out.println("area1="+area1);
System.out.println("area2="+area2);
}
}