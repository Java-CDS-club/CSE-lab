import java.util.*;
class Main  {
	public static void main(String args[]) {
		int n;
		
		int sum1=0,sum2=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
		a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    if(i%2==0)
		    {
		        switch(a[i])
		        {
		            case 1 : 
		                int k=0;
		            for(int j=i+1;j<=4+i;j++)
		            if(a[j]!=11&&a[j]!=12&&a[j]!=13&&a[j]!=1)
		            k++;
		            if(k==4)
		            {  sum1+=4;
		            System.out.println("Player A scores 4 point(s)");}
		            
		            break;
		            case 13: 
		                int l=0;
		            for(int j=i+1;j<=3+i;j++)
		            if(a[j]!=11&&a[j]!=12&&a[j]!=1&&a[j]!=13)
		            l++;
		            if(l==3)
		            {
		                sum1+=3;
		                System.out.println("Player A scores 3 point(s)");}
		            break;
		            case 12: {
		                int m=0;
		                for(int j=i+1;j<=2+i;j++)
		                if(a[j]!=11&&a[j]!=1&&a[j]!=13&&a[j]!=12)
		                m++;
		                if(m==2)
		                { sum1+=2;
		                System.out.println("Player A scores 2 point(s)");}
		            }break;
		            case 11:
		               {
		                   int o=0;
		                   for(int j=i+1;j<=i+1;j++)
		                   if(a[j]!=1&&a[j]!=12&&a[j]!=13&&a[j]!=11)
		                   o++;
		                   if(o==1)
		                   {
		                       System.out.println("Player A scores 1 point(s)");}
		                   }break;
		               
		    }
		}
	if(i%2==1)
	{
	    switch(a[i])
	    {
	        case 1: { int p=0;
	        for(int j=i+1;j<=i+4;j++)
	        if(a[j]!=11&&a[j]!=12&&a[j]!=13&&a[j]!=1)
	        p++;
	        if(p==4)
	        { sum2+=4;
	        System.out.println("Player B scores 4 point(s)");}
	    }break;
	    case 13: { int q=0;
	        for(int j=i+1;j<=i+3;j++)
	        if(a[j]!=11&&a[j]!=12&&a[j]!=1&&a[j]!=13)
	        q++;
	        if(q==3)
	        { sum2+=3;
	        System.out.println("Player B scores 3 point(s)");}
	    }break;
	    case 12: { int r=0;
	        for(int j=i+1;j<=i+2;j++)
	        if(a[j]!=11&&a[j]!=1&&a[j]!=13&&a[j]!=12)
	        r++;
	        if(r==2)
	        { sum2+=2;
	        System.out.println("Player B scores 2 point(s)");}
	    }break;
	    case 11: { int s=0;
	        for(int j=i+1;j<=i+1;j++)
	        if(a[j]!=1&&a[j]!=12&&a[j]!=13&&a[j]!=11)
	        s++;
	        if(s==1)
	        { sum2+=1;
	        System.out.println("Player B scores 1 point(s)");}
	    }break;
	}
		
	}
}
System.out.println("Player A: "+sum1+" point(s)");
System.out.println("Player B: "+sum2+" point(s)");
}
}