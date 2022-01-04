import java.util.*;
class Assign
{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter your first name: ");
String Name=sc.next();
String h;
int i=0;
int j=0;
System.out.println("Enter your Reg number: ");
String Reg_No=sc.next();
System.out.println("Enter your Branch: ");
String Branch=sc.next();
System.out.println("Enter your year: ");
int year=sc.nextInt();
System.out.println("Enter your mobile number: ");
String mobile_number=sc.next();
System.out.println("Enter your State: ");
String State=sc.next();
int count=0;
for(i=0;i<Name.length();i++) {
if(Name.charAt(i)=='a' || Name.charAt(i)=='e' || Name.charAt(i)=='o' || Name.charAt(i)=='i' ||
Name.charAt(i)=='u')
count++;
}
if(count%2==1)
h="Internship";
else
h="NSS";
System.out.println("Enter number of days: ");
int days=sc.nextInt();
String Final[][]=new String[days][3];
switch (h)
{
case "Internship":
System.out.println("Internship");
for(i=0;i<days;i++) {
System.out.println("For day "+(i+1));
System.out.println("Enter the technology going to work (C/C++/JAVA/PYTHON): ");
Final [i] [0]=sc.next();
System.out.println("Enter the module: ");
Final [i] [1]=sc.next();
System.out.println("Enter the number of people involved: ");
Final [i] [2]=sc.next();
}
break;
case "NSS":
System.out.println("NSS");
for(i=0;i<days;i++) {
System.out.println("For day "+(i+1));
System.out.println("Enter the name of the place going to visit: ");
Final [i] [0]=sc.next();
System.out.println("Enter the kind of social service did during the camp: ");
Final [i] [1]=sc.next();
System.out.println("Enter number of people benifited: ");
Final [i] [2]=sc.next();
}
break;
}
System.out.println("Name is "+Name);
System.out.println("Reg no. is "+Reg_No);
System.out.println("Branch is "+Branch);
System.out.println(h);
switch (h)
{
case "Internship":
for(i=0;i<days;i++) {
System.out.println("For day : "+(i+1));
System.out.println("The technology going to work is "+Final[i][0]);
System.out.println("The module is "+Final[i][1]);
System.out.println("The number of people involved is "+Final[i][2]);
}
break;
case "NSS":
System.out.println("NSS");
while(j<days) {
System.out.println("For day : "+(j+1));
System.out.println("The name of the place going to visit is "+Final[j][0]);
System.out.println("The kind of social service did during the camp is "+Final[j][1]);
System.out.println("The number of people benifited are "+Final[j][2]);
j++;
}
}
}}