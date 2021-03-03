class MyRunnable2 implements Runnable 
{
	public void run(){
		int sum=0;
		for(int i=10;i>=0;i--){
			sum=sum+i;
			System.out.println("Chae"+i+" ");
		}
		System.out.println("Chae-SUM"+sum+" " );
	}
}

