import java.util.Scanner;
import java.io.*;

class Main1
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Event Name");
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        System.out.println("Enter the Event Details");
        Scanner scan1=new Scanner(System.in);
        String details=scan1.nextLine();
        System.out.println("Enter the Event Type");
        Scanner scan2=new Scanner(System.in);
        String type=scan2.next();
        System.out.println("Enter the Organiser Name");
        Scanner scan3=new Scanner(System.in);
        String org=scan3.next();
        System.out.println("Enter the Attendees Count");
        Scanner scan4=new Scanner(System.in);
        int atten=scan4.nextInt();
        System.out.println("Enter the Project Expense");
        Scanner scan5=new Scanner(System.in);
        double project=scan5.nextDouble();
        
        Event e=new Event(name,details,type,org,atten,project);
        System.out.println(e);
    }
 
	}
