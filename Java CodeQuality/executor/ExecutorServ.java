package executor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import prodcons.ProducerConsumer1;


public class ExecutorServ {
	static Logger logger = Logger.getLogger( ProducerConsumer1.class.getName(), null );
	static final BlockingQueue<Integer> queue =null; 
    ExecutorService executor = Executors.newFixedThreadPool(2); 
    
      public void addThread(Runnable r){  
      executor.submit(r);
      }
      
      public void finish(){
              try {
          executor.shutdown();
          executor.awaitTermination(50, TimeUnit.SECONDS);
      } catch (InterruptedException ex) {
          Logger.getLogger(ExecutorServ.class.getName()).log(Level.SEVERE, null, ex);
          Thread.currentThread().interrupt();
      }      
    logger.log(Level.INFO,"Finished all threads");
  }
}