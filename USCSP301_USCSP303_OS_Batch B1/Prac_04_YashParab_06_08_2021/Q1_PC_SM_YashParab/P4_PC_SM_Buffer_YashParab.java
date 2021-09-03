public interface P4_PC_SM_Buffer_YashParab
{
	//Producers call this method
	public void insert(String item);

	//Consumers call this method
	public String remove();
}//interface ends