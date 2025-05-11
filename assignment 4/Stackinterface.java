import java.util.*;
interface Stack{
int size = 6;
public void push();
public void pop();
public void display();
}

class IntegerStack implements Stack{
int[] stk = new int[size];
int top; 
IntegerStack(){
top=-1;
}
public void push() {
if (top == size - 1) {
System.out.println("Cannot push the element, stack is overflow!");
} else {
Scanner sc = new Scanner(System.in);
System.out.print("Enter element to push: ");
int n = sc.nextInt();
top++;
stk[top] = n;
}
}
    
public void pop() {
if (top == -1) {
System.out.println("Cannot pop element, stack is underflow");
} else {
int n = stk[top];
top--;
System.out.println("Popped element: " + n);
}
}
    
public void display() {
if (top == -1) {
System.out.println("Stack is empty");
} else {
System.out.println("Stack elements:");
for (int i = top; i >= 0; i--) {
System.out.println(stk[i]);
}
}
}
}

public class Stackinterface{
public static void main(String[] args) {
IntegerStack s= new IntegerStack();
Scanner sc = new Scanner(System.in);
int choice;
	
do {
System.out.println("\nStack Operations:");
System.out.println("1. Push");
System.out.println("2. Pop");
System.out.println("3. Display");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
            
choice = sc.nextInt();
            
switch (choice) {
case 1:
s.push();
break;
case 2:
s.pop();
break;
case 3:
s.display();
break;
case 4:
System.out.println("Exiting program");
break;
default:
System.out.println("Invalid choice");
}
} while (choice != 4);        
}
}




