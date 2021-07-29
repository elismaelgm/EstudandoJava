package reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainReservation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reserv = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reserv);
			
			System.out.println();
			
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			reserv.updateDates(checkIn, checkOut);
			
			System.out.println(reserv);
			
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		} finally {
			sc.close();
		}
		
	}

}
