import java.util.*;
import java.lang.*;
class SDeviation {
public static void main (String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int i, sum=0;
double avg, SD=0;
for(i=0;i<a.length;i++) {
a[i]=sc.nextInt();
}
for(i=0;i<a.length;i++) {
sum=sum+a[i];
}
avg=sum/a.length;
for(i=0;i<a.length;i++) {
SD=SD+Math.pow((a[i]-avg),2.0);
}
System.out.println(Math.sqrt(SD));
 }
}



