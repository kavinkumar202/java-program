class methods{
 int plusemethod(int x,int y){
return x+y;
}
 double plusemethod(double x,double y){
return x+y;
}
public static void main(String[] agrs){
methods a=new methods();
int m=a.plusemethod(8,5);
double n=a.plusemethod(4.3,6.26);
System.out.println(m);
System.out.println(n);
}
}