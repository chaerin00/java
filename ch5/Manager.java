class Manager extends Employee 
{
	String dept;
	Employee subordinate[];

	public Manager(String name,String idnum,String dept){
		super(name,idnum);
		this.dept=dept;
	}
	public void setSubordinate(Employee sub[]){
		subordinate=sub;
	}
	public void work(){
		System.out.println("Manager\""+name+"\"works hard with his subordinate.");
	}
}
