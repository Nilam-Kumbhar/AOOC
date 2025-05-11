import java.util.*;
interface areaa{

 double compute(double d1,double d2);
}
class rectangle implements areaa{
 double compute(double d1 ,double d2)
{
return d1*d2;
}
}
class triangle implements areaa{
 double compute(double d1 ,double d2)
{
return d1*d2*0.5;
}
}
class areaademo{
public static void main(String args[]){
areaa a;
rectangle r=new rectangle();
triangle t=new triangle();
a=r;
System.out.println("rectangle area="+a.compute(10,5));

a=t;
System.out.println("triangle area="+a.compute(10,5));

}
}