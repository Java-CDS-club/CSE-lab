import java.util.*;
class EvOdd {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of the array: ");
int n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int i, f=0, k=n-1;
for(i=0;i<n;i++) {
System.out.println("Enter "+(i+1)+" element");
a[i]=sc.nextInt();
}
for(i=0;i<n;i++){
if(a[i]%2==0){
b[f]=a[i];
f++;
}
else { 
b[k]=a[i];
k--;
}
}
System.out.println("Result "+Arrays.toString(b));
}
}
