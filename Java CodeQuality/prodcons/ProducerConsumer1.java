package prodcons;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumer1
{
	static Logger logger = Logger.getLogger( ProducerConsumer1.class.getName(), null );
    public static void main(String[] args) throws InterruptedException
    {
        final ProConsumer pc = new ProConsumer();
        Runnable r1 = () -> {
        	try
            {
                pc.produce();
            }
            catch(InterruptedException e)
            {
            	Thread.currentThread().interrupt();
            }
        };
        Thread t1 = new Thread(r1);
        
        Runnable r2 = () -> {
            try
            {
                pc.consume();
            }
            catch(InterruptedException e)
            {
            	Thread.currentThread().interrupt();
            }
        
        };
        
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        logger.log(Level.INFO,"All the items have been consumed");
    }
 
    public static class ProConsumer
    {
        static int val = 0;
        LinkedList<Integer> itemlist = new LinkedList<>();
        int capacity = 1;
        public void produce() throws InterruptedException
        {
            while (val<15)
            {
                synchronized (this)
                {
                    while (itemlist.size()==capacity)
                        wait();
                    logger.log(Level.INFO,"Producer has produced : {0}", val);
                    itemlist.add(val++);
                    notifyAll();
                    this.wait(1000);
                }
            }
        }
 
        public void consume() throws InterruptedException
        {
            while (val<15)
            {
                synchronized (this)
                {
                    while (itemlist.isEmpty())
                        wait();
                    int element = itemlist.removeFirst();
                    logger.log(Level.INFO,"Consumer consumed item: {0} ", element);                   notifyAll();
                    this.wait(1000);
                }
            }
        }
    }
}