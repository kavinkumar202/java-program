import java.util.*;
class element{
public static void main(String[]agrs){
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int column=sc.nextInt();
int array[][]=new int[row][column];
for(int i=0;i<row;i++){
for(int j=0;j<column;j++){
array[i][j]=sc.nextInt();

if(i==1&&j==1){
System.out.print(array[1][1]);
}
 if(i==0&&j==0){
System.out.print(array[0][0]+array[1][1]);}
if(i==0&&j==2){
System.out.print(array[0][2]+array[1][1]);}
if(i==2&&j==0){
System.out.print(array[2][0]+array[1][1]);}
if(i==2&&j==2){
System.out.print(array[2][2]+array[1][1]);}
else if((i==0&&j==1)||(i==1&&j==0)||(i==1&&j==2)||(i==2&&j==1))
{
System.out.print(" * ");}
}
System.out.println();
}
}
}