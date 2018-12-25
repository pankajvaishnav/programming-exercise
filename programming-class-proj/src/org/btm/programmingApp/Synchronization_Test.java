package org.btm.programmingApp;
public class Synchronization_Test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Synchronization c = new Synchronization();
		
		Thread  t1 = new Thread(new Runnable() {
			
			@Override
			public void run() 
			{
				for(int i=1;i<=1000;i++)
				{
					c.increase();
				}
			}
		});
		Thread  t2 = new Thread(new Runnable() {
			
			@Override
			public void run() 
			{
				for(int i=1;i<=1000;i++)
				{
					c.increase();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count: "+c.count);
	}
}
