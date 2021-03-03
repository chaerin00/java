public class Ball 
{
	int amount=0;

	public Ball(int a){
		this.amount=a;
	}
	public void get(int x) throws LeastBallException,MoreBallException{
		if(x<0){
			throw new LeastBallException();
		}
		if(x>amount){
			throw new MoreBallException();
		}
		amount-=x;
		System.out.println(x+"���� ���� ���½��ϴ�.");
	}
	public void check(){
		System.out.println("���� ���� ����: "+amount+"\n");
	}
}
