class Pen2 
{
	String vender;
	String color;
	int price;

	public Pen2(){
	}

	public Pen2(String name){
		vender=name;
	}

	public Pen2(int value){
		price=value;
	}
	public Pen2(String name,String col,int pp){
		price=pp;
		vender=name;
		color=col;
	}
	public void write(){
		System.out.println("Penwrite()");
		System.out.println("Pen vender: "+vender);
		System.out.println("Pen color: "+color);
		System.out.println("Pen Price: "+price);
	}
	public void erase(){
		System.out.println("Pen: erase()");
	}

}
