public class CompanyShipment extends Shipment{
    
    private Double luxuryTax;
    private Double corporateTax;

    public CompanyShipment(String name,String source,String destination,double price,double luxuryTax,double corporateTax){
    	super(name, source, destination, price);
    	this.luxuryTax = luxuryTax;
    	this.corporateTax = corporateTax;
    }
    public double getLuxuryTax() {
        return luxuryTax;
    }

    public void setLuxuryTax(double luxuryTax) {
        this.luxuryTax = luxuryTax;
    }

    public Double getCorporateTax() {
        return corporateTax;
    }

    public void setCorporateTax(double corporateTax) {
        this.corporateTax = corporateTax;
    }
    
    @Override
    double calculateShipmentAmount()
    {
        //fill code here.
    	double luxTax = (this.price * this.luxuryTax)/100;
    	double corpTax = (this.price * this.corporateTax)/100;
    	return (this.price+luxTax+corpTax);
    }
    
}
