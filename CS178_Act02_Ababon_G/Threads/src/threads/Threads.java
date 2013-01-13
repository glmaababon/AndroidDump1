/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ababon
 */
public class Threads {

    public static void main(String[] args) {
        // TODO code application logic here
                MyStack ms = new MyStack(20);
		List<Thread> threads = new ArrayList<Thread>();
		
		for(int i =1; i<=2; i++)
		{
			Runnable task = new Pusher(i, ms);
			Thread worker = new Thread(task);
			worker.setName(String.valueOf(i));
			worker.start();
			threads.add(worker);
		}
		
			Runnable task = new Popper(1, ms);
			Thread worker = new Thread(task);
			worker.setName(String.valueOf(1));
			worker.start();
			threads.add(worker);
		
		
    }
}
