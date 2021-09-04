import java.util.ArrayList;

import java.util.Scanner;


public class P5_Q3_Fibo_YP

{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		ArrayList al = new ArrayList();

		int a;

		System.out.println("Enter the number: ");

		a = scan.nextInt();

		P5_Q3_FiboThread_YP fibTh = new P5_Q3_FiboThread_YP(a);

		fibTh.start();

		try{

			fibTh.join();

		}catch(InterruptedException ex){

			ex.printStackTrace();

		}

		int fseries[] = fibTh.arr;

		System.out.println("First "+a+" fibonacci numbers are:");

		for(int i=0;i<a;i++){

			System.out.println(fseries[i]+ "");

		}
 
	}//main ends

}//class ends

class P5_Q3_FiboThread_YP extends Thread

{

	private int a,i;

	Thread t;

	int arr[];

	
	public P5_Q3_FiboThread_YP(int a){

		this.a = a;

		arr = new int[a];

	}

	public void run(){

		arr[0] = 0;

		arr[1] = 1;

		for(i=2;i<a;i++){

			arr[i] = arr[i-1] + arr[i-2];

		}

	}//run ends

}//class ends