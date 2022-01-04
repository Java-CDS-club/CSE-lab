import java.util.*;
class Choose {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
int n[]=new int[a];
for(int i=0;i<a;i++)
{
System.out.println((i+1)+" Number");
n[i]=sc.nextInt();
} 
for(int j=0;j<a;j++) {
for(int k=0;k<a;k++){
if(n[j]<n[k])
count++;
}
if(count>1)
System.out.println("Result: "+n[j]);
count=0;
}
}}