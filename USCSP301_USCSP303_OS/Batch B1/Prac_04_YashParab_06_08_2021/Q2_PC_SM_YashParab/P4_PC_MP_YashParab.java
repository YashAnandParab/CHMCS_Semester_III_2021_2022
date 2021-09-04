import java.util.Date;
public class P4_PC_MP_YashParab
{
	public static void main(String args[])
	{
		//Producer and Consumer process
		P4_PC_MP_Channel_YashParab<Date> mailBox = new
P4_PC_MP_MessageQueue_YashParab<Date>();
		int i = 0;
		do
		{
			Date message = new Date();
			System.out.println("Producer produced - " + (i+1) + " : " + message);
			mailBox.send(message);
			Date rightNow = mailBox.receive();
			if(rightNow != null)
		{
			System.out.println("Consumer consumed - " + (i+1) + " : " + rightNow);
		}
		i++;
	     }while (i<10);
	}// main ends
}// class ends 
		