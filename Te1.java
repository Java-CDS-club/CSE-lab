import java.util.*;
import java.lang.*;
class Te1 {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int count=0;
System.out.println("Enter the String: ");
String s1=sc.nextLine(); 
for(int i=0;i<s1.length();i++) {
if((int)s1.charAt(i)>=48 && (int)s1.charAt(i)<=57) {
count++;
}
}
System.out.println("There are "+count+" numbers");
}
}