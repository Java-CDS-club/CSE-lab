import java.util.*;
class Test7072  {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	int i,j,k=0,temp;
	for(i=0;i<n;i++) {
	    a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++) {
	    for(j=0;j<n;j++)
	    while(i!=j)
	    {
	    if(a[i]==a[j]) {
	        b[k]=a[i];
	        k++;
	    }
	    }
	    
	}
	    int max=b[0];
		for(i=0;i<k;i++) {
		    for(j=i+1;j<k;j++) {
		    if(b[i]<b[j]) {
		        temp=b[i];
		        b[i]=b[j];
		        b[j]=temp;
		    }
		    
		}
			}
			System.out.println(Arrays.toString(b));
	}
}