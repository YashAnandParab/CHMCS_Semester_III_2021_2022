import java.util.concurrent.*; 
public class P7_Q1_Test_YP 
{ 
 public static void main(String args[]) 
 { 
         ExecutorService application = Executors.newCachedThreadPool(); 
         P7_Q1_CircularBuffer_YP sharedLocation = new P7_Q1_CircularBuffer_YP();          
	 sharedLocation.displayState("Initial State");          
	 application.execute(new P7_Q1_Producer_YP(sharedLocation));          
	 application.execute(new P7_Q1_Consumer_YP(sharedLocation));          
	 application.shutdown(); 
 } 
} 
