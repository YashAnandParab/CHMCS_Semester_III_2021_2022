import java.util.Vector;
public class P4_PC_MP_MessageQueue_YashParab<E> implements
P4_PC_MP_Channel_YashParab<E>
{
	private Vector<E> queue;

	public P4_PC_MP_MessageQueue_YashParab(){
	     queue = new Vector<E>();
	}
	
	// This implements a nonblockimg send
	public void send(E item){
		queue.addElement(item);
	}//send() ends

	//This implements a nonblocking receive
	public E receive(){
		if(queue.size() == 0)
			return null;
		else
			return queue.remove(0);
	}// receive() ends
}// class ends