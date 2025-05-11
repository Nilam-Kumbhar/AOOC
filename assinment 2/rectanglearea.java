import java.util.*;
class area{
double length;
double breadth;

void setDim(double l,double b){
length=l;
breadth=b;
}

void getArea(){
System.out.println("area of rectangle is"+length*breadth);
}
}
class rectanglearea{
public static void main(String args[]){
area ob=new area();
ob.setDim(4.0,5.0);
ob.getArea();
}
}

