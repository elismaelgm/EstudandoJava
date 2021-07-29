package reservation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
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
	
	public Long duration() {
		long diff = this.checkout.getTime() - this.checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		if (checkIn.after(checkOut)) {
			throw new DomainException("Erro in reservation: Check-out date must be after check-in date.");
		} 
		if (checkOut.before(now) || checkIn.before(now)) {
			throw new DomainException("Erro in reservation: Reservation dates for update must be future dates.");
		}
		this.checkin = checkIn;
		this.checkout = checkOut;
		
	}
	
	@Override
	public String toString() {
		
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
