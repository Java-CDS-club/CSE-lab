import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
class MiniProject {
public static void main(String args[]) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter number of items: ");
int n=sc.nextInt();

String[] item_name=new String[n];
double price[]=new double[n];
int quantity[]=new int[n];
double temp_price[]=new double[n];
int i;
double total=0;


//input details
for(i=0;i<n;i++) {
System.out.println("Enter the Item "+(i+1)+" name:");
item_name[i] =sc.next();
System.out.println("Enter the price of the item: ");
price[i]=sc.nextDouble();
System.out.println("Enter the quantity of the item: ");
quantity[i]=sc.nextInt();
temp_price[i]=(double)price[i]*quantity[i];
}

 for(i=0;i<n;i++){
 total=(double)total+temp_price[i];
 }
double GST = total*0.05;
double SB=total*0.02;
double sales=total*0.04;

//finial bill

//for printing date and time 
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now)); 



System.out.println("\t\t\tUnlimited Stores");
 for(i=0;i<n;i++) {
 System.out.println("\tItem:\t"+item_name[i]+"\n"+"\tPrice:\t"+price[i]+"\n"+"\tQuantity:\t"+quantity[i]+"\n"+"\tSubtotal:\t"+temp_price[i]);
 }


System.out.printf("GST = %.2f\n",GST);
System.out.printf("Swatch Bharath Tax = %.2f\n",SB);
System.out.printf("Sales Tax = %.2f\n",sales);


System.out.printf("Total Bill is %.2f",(total+GST+SB+sales));

}
}
	/* Submitted by 
 		Marcus     18MIS7072
		Siddeshwar 18MIS7212											
		Charan     18MIS7001
	*/