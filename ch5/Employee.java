class Employee 
{
	String name;
	String idnum;
	String title;
	int salary;

	public Employee(String name,String idnum){
		this.name=name;
		this.idnum=idnum;
	}
	public void work(){
		System.out.println("\tEmployee\""+name+"\"does his best.");
	}

}
