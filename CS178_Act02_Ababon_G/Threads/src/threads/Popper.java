/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author ababon
 */
public class Popper implements Runnable{
	private final long id;
	private MyStack ms;
	Popper(long id, MyStack ms)
	{
		this.id=id;
		this.ms=ms;
		
	}
	
	@Override
	public void run()
	{
		
			while(ms.getLastNdx() > -1)
			{
				int j = ms.pop();
				System.out.println("Popper " + id + " popped " + j + " out of the stack. Remaining size: " + (ms.getLastNdx()+1));
			}
	}
}