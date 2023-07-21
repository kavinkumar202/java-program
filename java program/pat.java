import java.util.*;
class pat{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=0;i<17;i++)
{
System.out.println("##"); 
for(int j=0;j<17;j++){
System.out.print("##");

if(i==17/2||j==17/2&&a<7)
{
System.out.print(" $");
}}
}
}
}
