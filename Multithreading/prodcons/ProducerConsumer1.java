package prodcons;

import java.util.LinkedList;

public class ProducerConsumer1
{
    public static void main(String[] args) throws InterruptedException
    {
        final ProConsumer pc = new ProConsumer();
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    pc.produce();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    pc.consume();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("All the items have been consumed");
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
                    System.out.println("Producer has produced : " + val);
                    itemlist.add(val++);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
 
        public void consume() throws InterruptedException
        {
            while (val<15)
            {
                synchronized (this)
                {
                    while (itemlist.size()==0)
                        wait();
                    int element = itemlist.removeFirst();
                    System.out.println("Consumer has consumed : "+ element);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
}