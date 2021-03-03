class MyThreadMain 
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread("An");
		MyThread t2=new MyThread("Chae");
		MyThread t3=new MyThread("lin");

		t1.start();
		t2.start();
		t3.start();
	}
}
