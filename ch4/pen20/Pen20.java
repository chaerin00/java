package PenP2020;

class Pen20
{
	String vender;
	String color;
	int price;

	public Pen20(){
	}

	public Pen20(String name){
		vender=name;
	}

	public Pen20(int value){
		price=value;
	}
	public Pen20(String name,String col,int pp){
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