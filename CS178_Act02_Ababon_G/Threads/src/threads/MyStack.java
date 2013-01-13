/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author ababon
 */

public class MyStack {
	private int max;
	private int lastNdx;
	private int[] array;
	public MyStack(int size)
	{
		lastNdx = -1;
		array = new int[size];
		max=size;
	}
	
	public int getLastNdx()
	{
		return lastNdx;
	}
	
	public synchronized void push(int i)
	{
		if(lastNdx+1 < max)
			array[++lastNdx]=i;
	}
	
	public synchronized int pop()
	{
		//if(lastNdx-1 > -1)
			//System.out.println(array[lastNdx] + " was popped");
		return array[lastNdx--];
	}
}