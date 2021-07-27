package reservation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Reservation {

	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		updateDates(checkin, checkout);
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	public Integer duration() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(checkout);
		int out = cal.get(Calendar.DATE);
		cal.setTime(checkin);
		int in = cal.get(Calendar.DATE);
		
		return out - in;
	}
	
	public void updateDates(Date checkin, Date checkout) {
		if (checkout)
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		
		sb.append("Reservation: Room ");
		sb.append(getRoomNumber());
		sb.append(", check-in: ");
		sb.append(sdf.format(getCheckin()));
		sb.append(", check-out: ");
		sb.append(sdf.format(getCheckout()));
		sb.append(", " + duration() + " nights");
		return sb.toString();
	}
}
