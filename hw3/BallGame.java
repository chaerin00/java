public class BallGame 
{
	public static void main(String[] args) 
	{
		Ball myball2=new Ball(10);
		myball2.check();

		try{
			myball2.get(-100);
		}catch(LeastBallException be){
			be.printStackTrace();
		}catch(MoreBallException be){
			be.printStackTrace();
		}
		myball2.check();

		try{
			myball2.get(100);
		}catch(LeastBallException be){
			be.printStackTrace();
		}catch(MoreBallException be){
			be.printStackTrace();
		}
		myball2.check();

		try{
			myball2.get(5);
		}catch(LeastBallException be){
			be.printStackTrace();
		}catch(MoreBallException be){
			be.printStackTrace();
		}
		myball2.check();

		try{
			myball2.get(5);
		}catch(LeastBallException be){
			be.printStackTrace();
		}catch(MoreBallException be){
			be.printStackTrace();
		}
		myball2.check();

		try{
			myball2.get(5);
		}catch(LeastBallException be){
			be.printStackTrace();
		}catch(MoreBallException be){
			be.printStackTrace();
		}
		myball2.check();

	}
}
