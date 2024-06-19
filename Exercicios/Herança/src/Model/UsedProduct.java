package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	
	private LocalDate manufactureDate;

	public UsedProduct(String name, Double price, LocalDate date) {
		super(name, price);
		this.manufactureDate = date;
	}

	public LocalDate getManufactureDate() {

		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return getName()
				+" (used) $ "
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date:  "
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+" ) ";
	}	
}
