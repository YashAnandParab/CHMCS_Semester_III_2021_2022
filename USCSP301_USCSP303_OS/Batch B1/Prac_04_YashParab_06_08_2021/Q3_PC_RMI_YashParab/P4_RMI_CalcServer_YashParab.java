import java.net.*;

import java.rmi.*;

public class P4_RMI_CalcServer_YashParab

{

	public static void main(String args[])

	{

		try

		{
	
	P4_RMI_CalcServerImpl_YashParab csi = new P4_RMI_CalcServerImpl_YashParab();

	Naming.rebind("CSB1", csi);

		}//try ends

		catch(Exception e) {

		System.out.println("Exception: " + e);

		}//catch ends

	}//main ends

}//class ends