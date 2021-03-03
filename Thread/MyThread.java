class  MyThread extends Thread
{
	String name;
	public MyThread(String s){
		name=s;
	}
	public void run(){
		for(int i=10;i>=0;i--){
			System.out.println(name+i+" ");
			try{
				sleep(1000);
			}
			catch(Exception ex){}
		}
	}
}
