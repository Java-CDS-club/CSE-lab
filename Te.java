import java.util.*;
import java.lang.*;
class Te {
public static void main(String args[]){
//String s1="VIT-AP-AMARAVATI";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String: ");
String s1=sc.nextLine(); 
String s2="";
for(int i=0;i<s1.length();i++) {
if(s1.charAt(i)=='A' || s1.charAt(i)=='a') {
s2=s2+'$';
}
else 
s2=s2+s1.charAt(i);
}
System.out.println(s2);
}
}