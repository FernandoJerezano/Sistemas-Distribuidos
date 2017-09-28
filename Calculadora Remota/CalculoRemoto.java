import java.rmi.server.*;
import java.rmi.*;

public class CalculoRemoto extends UnicastRemoteObject implements InterfazCalculoRemoto{
	
	public CalculoRemoto()throws RemoteException{
		super();	
	}
	
	public int calculaCuadrado(String A)throws RemoteException{
		System.out.println("Calculo Cuadrado Remoto");
		int a;
		A = A.trim();
		a = Integer.parseInt(A);
		return a*a;
	}
	
	public int calculaPotencia(String A, String B)throws RemoteException{
		System.out.println("Calculo Potencia Remoto");
		int a;
		int b;
		A = A.trim();
		B = B.trim();
		a = Integer.parseInt(A);
		b = Integer.parseInt(B);
		return (int)Math.pow(a,b);
	}
}
