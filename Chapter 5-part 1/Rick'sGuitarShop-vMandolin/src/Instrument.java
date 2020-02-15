
public abstract class Instrument {
	
	private InstrumentSpec spec;
	private String serialNumber;
	private double price;
	
	public Instrument(String serialNumber, double price,
						InstrumentSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}
	
	public String getSeriaNumber() {
		return serialNumber;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public InstrumentSpec getSpec() {
		return spec;
	}

}
