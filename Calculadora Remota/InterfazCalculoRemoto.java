import java.rmi.*;

public interface InterfazCalculoRemoto extends Remote{

	public int calculaCuadrado(String S) throws RemoteException;
	public int calculaPotencia(String A, String B) throws RemoteException;
	
}
