import java.text.DecimalFormat;



public class AirService extends ServiceInvoice {
  
    
    private Integer  travelTaxPercentage;
    
   public AirService(Integer id,Double amount,String serviceType,Integer travelTaxPercentage){
       super(id,amount,serviceType);
      this.travelTaxPercentage = travelTaxPercentage;
    }
    
    public void computeTax(Double amount){
      //fill your code
    	DecimalFormat df = new DecimalFormat("#.00");
    	double travelTax = (amount * travelTaxPercentage)/100;
    	double total = amount + travelTax;
    	
    	System.out.println("Tax to be paid for federal excise is "+df.format(travelTax));
 	   	System.out.println("Total amount to be paid is "+df.format(total));
    }
    
    
}
