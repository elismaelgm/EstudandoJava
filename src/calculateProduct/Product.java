package calculateProduct;

public class Product implements Comparable<Product> {

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return getName() + ", " + String.format("%.2f", getPrice());
	}

	@Override
	public int compareTo(Product o) {
		return this.getPrice().compareTo(o.getPrice());
	}
}
