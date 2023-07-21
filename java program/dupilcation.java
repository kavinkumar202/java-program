

import java.util.*;
class arylen{
public static void main(String[]agrs){
Scanner sc=new Scanner(System.in);
int a[]=new int [9];
int count=0;
for(int i=0;i<a.length;i++){
a[i]=sc.nextInt();

System.out.print(a[i]+"  ");
if(a[i]==a[i]){
count++;

}
if(count>=2){
                a[i]=a[i]+a[i]/ 2;
System.out.print(a[i]);
            }
        }
}
}
