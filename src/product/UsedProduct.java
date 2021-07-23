package product;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactore) {
		super(name, price);
		this.manufactureDate = manufactore;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append(" (used) $ ");
		sb.append(String.format("%.2f", this.getPrice()));
		sb.append(" (Manufacture date: ");
		sb.append(sdf.format(this.getManufactureDate()));
		sb.append(")");
		return sb.toString();
	}
}
