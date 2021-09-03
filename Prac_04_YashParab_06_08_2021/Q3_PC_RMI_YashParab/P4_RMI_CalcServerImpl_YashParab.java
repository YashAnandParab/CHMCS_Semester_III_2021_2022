import java.rmi.*;

import java.rmi.server.*;

public class P4_RMI_CalcServerImpl_YashParab extends UnicastRemoteObject implements
P4_RMI_CalcServerIntf_YashParab

{

	public P4_RMI_CalcServerImpl_YashParab()throws RemoteException{

	}
	
	public int add(int a, int b)throws RemoteException

	{

		return a + b;

	}

	public int subtract(int a, int b)throws RemoteException

	{

	return a - b;

	}

	public int multiply(int a, int b)throws RemoteException

	{

	return a * b;

	}

	public int divide(int a, int b)throws RemoteException

	{

	return a / b;

	}
}//class ends