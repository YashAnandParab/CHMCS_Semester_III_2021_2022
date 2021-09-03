import java.rmi.*;

public class P4_RMI_CalcClient_YashParab

{

	public static void main(String args[])

	{

	try

	{

		String CSURL = "rmi://"+args[0]+"/CSB1";

		P4_RMI_CalcServerIntf_YashParab CSIntf = (P4_RMI_CalcServerIntf_YashParab)
Naming.lookup(CSURL);

		System.out.println("The first number is: " + args[1]);

		int x = Integer.parseInt(args[1]);

		System.out.println("The second number is: " + args[2]);

		int y = Integer.parseInt(args[2]);

		System.out.println("=======Arithmetic Operations=======");

		System.out.println("Addition: " + x + " + " + y + " = " + CSIntf.add(x,y));

		System.out.println("Subtraction: " + x + " - " + y + " = " + CSIntf.subtract(x,y));

		System.out.println("Addition: " + x + " * " + y + " = " + CSIntf.multiply(x,y));

		System.out.println("Addition: " + x + " / " + y + " = " + CSIntf.divide(x,y));

	}//try ends

	catch(Exception e){

		System.out.println("Exception: " + e);

	}//catch ends

	}//main ends

}//class ends