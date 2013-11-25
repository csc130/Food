import java.math.BigDecimal;


public class Food {

	String name;
	String description;
	BigDecimal price;
	
	public Food(String name, String description, BigDecimal price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", description=" + description
				+ ", price=" + price + "]";
	}
	
	
	
}
