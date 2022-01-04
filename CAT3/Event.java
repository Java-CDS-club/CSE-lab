public class Event {
	//Your code here
    String name;
    String detail;
    String type;
    String organiser;
    int attendeesCount;
    String projectExpenses;
    public Event(String name,String detail,String type,String organiser,int attendeesCount,double projectExpenses)
    {
        this.name=name;
        this.detail=detail;
        this.type=type;
        this.organiser=organiser;
        this.attendeesCount=attendeesCount;
        this.projectExpenses=String.format("%.1f",projectExpenses);
    }
    
   	public String toString() {
		//Your code here
         return ("Name:"+name+"\nDetail:"+detail+"\nType:"+type+"\nOrganiser:"+organiser+"\nAttendees Count:"+attendeesCount+"\nProjected Expense:"+projectExpenses);
        
	}
    
    
	
}
