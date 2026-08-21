import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Java_20260818_proxy_GumballMachineRemote extends Remote {

    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    String getState() throws RemoteException;
}


