import java.util.*;
class emp{
void display(){

Scanner sc=new Scanner(System.in);
String name=sc.next();
String department=sc.next();
int id=sc.nextInt();
long phoneno=sc.nextLong();
System.out.println("Name:"+name);
System.out.println("department:"+department);
System.out.println("empid:"+id);
System.out.println("phoneno:"+phoneno);
}
}class employee{
public static void main(String[]agrs){
emp sc=new emp();
sc.display();
}}
