import java.io.*;
class file1{
public static void main(String args[]){
try{
FileInputStream fin= new FileInputStream("Sample.txt");
char ch ;
int a;
do
{
a=fin.read();
ch=(char)a;
System.out.print(ch);
}
while(a!=-1);
}
catch(FileNotFoundException e){
System.out.println(e);
}

catch(IOException e1){
System.out.println(e1);
}}
}