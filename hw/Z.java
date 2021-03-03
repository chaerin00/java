class Z extends Y 
{
	int i=30;
	String msg="I am a Z";

	void print(){
		System.out.println(msg);
	}
	void play(){
		System.out.println("Play.."+msg);
	}
	void doZ(){
		System.out.println("do something in Z");
	}

	void test(int i){
		Z z=new Z();
		Y y=z;
		X x=z;
		z.print();
		y.print();
		super.print();
		play();
		super.play();
		//y.doZ();
		//super.super.print();
		System.out.println("\ni="+i);
		System.out.println("this.i="+this.i);
		System.out.println("super.i="+super.i);
		System.out.println("y.i="+y.i);
		System.out.println("x.i="+x.i);
		System.out.println("((Y)this).i="+((Y)this).i);
		System.out.println("((X)this.i="+((X)this).i);
		//super.super.i=10;

	}
}
