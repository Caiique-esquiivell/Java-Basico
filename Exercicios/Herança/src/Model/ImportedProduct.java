package Model;

public class ImportedProduct extends Product {
	
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFee = customsFree;
	}
	
	public Double getCustomsFree() {
		return customsFee;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFee = customsFree;
	}

	public Double totalPrice() {

		return getPrice() + customsFee;
	}

	@Override
	public String priceTag (){
		return getName()
				+" $ "
				+ String.format("%.2f", totalPrice())
				+ "(Custms fee: $"
				+ String.format("%.2f", customsFee)
				+")";
	
}
}
