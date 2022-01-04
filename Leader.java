import java.util.*;
class Leader {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
int n[]=new int[a];
for(int i=0;i<a;i++)
{
System.out.println(i+"Number");
n[i]=sc.nextInt();
} 
System.out.println("Enter the number");
int x=sc.nextInt();
fot(int j=0;j<n.length;j++) {
if(x<n[j])
count++;
}
if(count>1)
System.out.println(x);
else 
System.out.println("Take another number");
}}