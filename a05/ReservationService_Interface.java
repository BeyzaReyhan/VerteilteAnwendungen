package a05;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReservationService_Interface extends Remote {
	public abstract void executeReservation() throws  RemoteException;
	public abstract void showOccupancy() throws RemoteException;
}
