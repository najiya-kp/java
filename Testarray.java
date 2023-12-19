import java.util.Scanner;
class Testarray
{  
public static void main(String args[])
{  
int a[]=new int[5]; 
int c[]=new int[5];
a[0]=10; 
a[1]=40;  
a[2]=70;  
a[3]=80;  
a[4]=50;
Scanner sc=new Scanner();
System.out.println("enter the limit");
a=sc.nextInt();
for(int i=0;)
for(int i=0;i<a.length;i++)  
for(int j=i+1;j<a.length;j++)  
{
if(a[j]<a[i])
{
c[i]=a[i];
a[i]=a[j];
a[j]=c[i];
}
}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}
