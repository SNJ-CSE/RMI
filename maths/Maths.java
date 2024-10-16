import java.rmi.*;
public interface Maths extends Remote
{
    // Declaring the method prototype
    public int add(int n1,int n2) throws RemoteException;
}