public interface P4_PC_MP_Channel_YashParab<E>
{
	// Send a message to the channel
	public void send(E item);

	// Receive a message from the channel
	public E receive();
}//interface ends