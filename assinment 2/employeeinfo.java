import java.util.*;
class employee{
String fname;
String lname;
double m_salary;
double y_salary;
double r_salary;

employee(){
fname="";
lname="";
m_salary=0.0;
y_salary=0.0;
r_salary=0.0;
}

void getinfo(){
Scanner sc=new Scanner(System.in);
System.out.println("enter first name:");
fname=sc.nextLine();
System.out.println("enter last name:");
lname=sc.nextLine();
System.out.println("enter monthly salary:");
m_salary=sc.nextDouble();
}

void setinfo(){
System.out.println("first name="+fname);
System.out.println("last name="+lname);
System.out.println("monthly salary="+m_salary);
y_salary=m_salary*12;
System.out.println("yearly salary="+y_salary);
r_salary=y_salary+(y_salary*10)/100;
System.out.println(" raised yearly salary="+r_salary);
}
}
class employeeinfo{
public static void main(String args[]){
System.out.println("\n first employee information");
employee ob= new employee();
ob.getinfo();
ob.setinfo();

System.out.println("\n second employee information");
employee ob1= new employee();
ob1.getinfo();
ob1.setinfo();

}
}

