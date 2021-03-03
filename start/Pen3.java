public class Pen3
{
	String vender,color;
	int price;
	public Pen3(){
	}

	public Pen3(String name){
		vender=name;
	}

	public Pen3(int value){
		price=value;
	}
	public Pen3(String name,String col,int pp){
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
	public void write(int xx){
		System.out.println("Pen: write()");
		System.out.println("Pen vender: "+vender);
		System.out.println("Pen color: "+color);
		System.out.println("Pen Price: "+xx);
	}
	public void write(int xx,String yy){
		System.out.println("Pen: write()");
		System.out.println("Pen vender: "+vender);
		System.out.println("Pen color: "+yy);
		System.out.println("Pen Price: "+xx);
	}
	public void erase(){
		System.out.println("Pen: erase()");
	}

}
