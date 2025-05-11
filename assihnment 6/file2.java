import java.io.*;
class file2{
public static void main(String args[]){
try{
FileInputStream fin= new FileInputStream("Sample.txt");
FileOutputStream fout= new FileOutputStream("Sample1.txt");
int a;
do
{
a=fin.read();
fout.write(a);
}
while(a!=0);
}
catch(FileNotFoundException e){
System.out.println(e);
}

catch(IOException e1){
System.out.println(e1);
}}
}