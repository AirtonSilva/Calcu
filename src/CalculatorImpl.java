public class CalculatorImpl extends java.rmi.server.UnicastRemoteObject implements Airton_Calculator {

	public CalculatorImpl() throws java.rmi.RemoteException {
		
		super();	
	} 

	public long soma(long a, long b) throws java.rmi.RemoteException { 
	
		return (a+b); 
	}
	
	public long subtrai(long a, long b)	throws java.rmi.RemoteException {
		
		return (a-b); 
	}
	
	public long multiplica(long a, long b) 	throws java.rmi.RemoteException {

		return (a*b); 
	}

	public long divide(long a, long b) throws java.rmi.RemoteException { 

		return (a/b);
	
	}

}