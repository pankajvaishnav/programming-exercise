package org.btm.programmingApp;
public class Synchronization 
{
	int count;
	
	synchronized void increase() //Making a method synchronized
	{
		count++;
	}
}
