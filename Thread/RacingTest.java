import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


class RacingTest extends JFrame
{
	JPanel content;
	JPanel menu;
	JPanel center;
	JButton go,stop,suspend,resume;
	Thread[] ths;
	Car2[] cars=new Car2[]{
		new Car2(new ImageIcon("car.png"),0,10),
		new Car2(new ImageIcon("car.png"),0,10),
		new Car2(new ImageIcon("car.png"),0,10),
		new Car2(new ImageIcon("car.png"),0,10),
		new Car2(new ImageIcon("car.png"),0,10),
	};

	public RacingTest(){
		super("Runnable test");
		ths=new Thread[cars.length];

		setBounds(100,10,1024,800);
		content=new JPanel();
		content.setLayout(new BorderLayout(0,0));
		setContentPane(content);

		menu=new JPanel();
		menu.setLayout(new GridLayout(1,4,5,5));
		go=new JButton("play");
		menu.add(go);
		stop=new JButton("stop");
		menu.add(stop);
		suspend=new JButton("suspend");
		menu.add(suspend);
		resume=new JButton("resume");
		menu.add(resume);
		content.add("North",menu);

		center=new JPanel();
		center.setLayout(new GridLayout(cars.length,1,5,5));
		content.add("Center",center);

		go.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				for(int i=0;i<cars.length;i++){
					center.add(cars[i].lane);
				}
				center.updateUI();
				Car2.rank1=0;
				game_play();
				 
			}
		});
		stop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				for(Thread t:ths){
					t.stop();
				}
			}
		});
		suspend.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				for(Thread t:ths){
					t.suspend();
				}
			}
		});
		resume.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				for(Thread t:ths){
					t.resume();
				}
			}
		});

	}

	public void game_play(){
		makeThread();
		for(int i=0;i<cars.length;i++){
			ths[i].start();
		}
	}
	public void makeThread(){
		for(int i=0;i<cars.length;i++){
			ths[i]=new Thread(cars[i]);
		}
	}
	
}
