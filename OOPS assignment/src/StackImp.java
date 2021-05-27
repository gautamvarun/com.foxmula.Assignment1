
import java.util.*;
public class StackImp
{
public void display(Stack st1,Stack st2)
{
if(st1.size()==st2.size())
{
System.out.println("Total Numbers of Elements in both stack is : " + st2.size());
}
}
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
Stack s1=new Stack();
Stack s2=new Stack();
int choice,data;
StackImp si=new StackImp();
while(true)
{
System.out.println("\n1. Push into Stack 1");
System.out.println("2. Push into Stack 2");
System.out.println("3. Pop from Stack 1");
System.out.println("4. Pop from Stack 1");
System.out.println("Enter Your Choice : ");
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter The Data");
data=sc.nextInt();
s1.push(data);
si.display(s1,s2);
break;
case 2:
System.out.println("Enter The Data");
data=sc.nextInt();
s2.push(data);
si.display(s1,s2);
break;
case 3:
System.out.println(s1.pop());
si.display(s1,s2);
break;
case 4:
System.out.println(s2.pop());
si.display(s1,s2);
break;
default:
}
}
}
}