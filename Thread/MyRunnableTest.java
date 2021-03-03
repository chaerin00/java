class MyRunnableTest
{
	MyRunnableTest(){
		Thread t1=new Thread(new MyRunnable1(),"An");
		Thread t2=new Thread(new MyRunnable2(),"Chae");
		Thread t3=new Thread(new MyRunnable3(),"Lin");

		t1.start();
		t2.start();
		t3.start();
	}
	
}
