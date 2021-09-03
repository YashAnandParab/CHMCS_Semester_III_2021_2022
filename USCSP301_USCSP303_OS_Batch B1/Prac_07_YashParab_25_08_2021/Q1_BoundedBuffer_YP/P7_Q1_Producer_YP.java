import java.util.Random; 
public class P7_Q1_Producer_YP implements Runnable 
{ 
 private final static Random generator = new Random(); 
 private final P7_Q1_Buffer_YP sharedLocation; 
 public P7_Q1_Producer_YP(P7_Q1_Buffer_YP shared) 
 { 
    sharedLocation=shared;  
 } 
public void run() 
 { 
    for(int count = 1;count <= 10;count++) 
    { 
     try{ 
             Thread.sleep(generator.nextInt(3000));              sharedLocation.set(count);      }catch(InterruptedException e){              e.printStackTrace(); 
     } 
    } 
    System.out.println("Producer done producing.Terminating Producer"); 
 }//run() ends 
}//Producer class ends 
