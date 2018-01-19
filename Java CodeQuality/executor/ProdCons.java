package executor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import prodcons.ProducerConsumer1;

public class ProdCons {
	static Logger logger = Logger.getLogger( ProducerConsumer1.class.getName(), null );
	
	ExecutorServ executorServiceThreadPool;
    static ArrayList<Integer> consumerdata = new ArrayList<>(); 
    
    public static void main(String[] args) {
    	ProdCons prodconsumer = new ProdCons();
        prodconsumer.init();
                Iterator<Integer> itr = consumerdata.iterator(); 
                    while(itr.hasNext()) {
                        Object element = itr.next(); 
                        logger.log(Level.INFO," {0} ",element);    
                    } 
    }
    private void init() {
        executorServiceThreadPool = new ExecutorServ();
        for(int i = 0; i < 10; i++){
            executorServiceThreadPool.addThread(new Producer(i));   
            executorServiceThreadPool.addThread(new Consumer(i));
        }
                executorServiceThreadPool.finish();
    }
    private class Producer implements Runnable {
            int data;
            public Producer(int datatoput) {
               data = datatoput;
             }
        @Override
        public void run() {         
        	logger.log(Level.INFO,"Inserting Element {0} ", data);
            try {
            	ExecutorServ.queue.put(data);
                    Thread.sleep(100);
            } catch (InterruptedException e) {
            	Thread.currentThread().interrupt();
            }
        }
    }
    private class Consumer implements Runnable {
                int datatake;
                int data;
                public Consumer(int datatoput) {
                    data = datatoput;
                  }
        @Override
        public void run() {                                 
                try 
                {
                	logger.log(Level.INFO,"Consuming Element {0}", data);
                    datatake = ExecutorServ.queue.take();
                    consumerdata.add(datatake);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                	Thread.currentThread().interrupt();
                }
        }
    }
}