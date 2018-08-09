import java.text.DecimalFormat;


public class LandService extends ServiceInvoice{
     
     
    private Integer rentTaxPercentage;
    
    public LandService(Integer id,Double amount,String serviceType,Integer rentTaxPercentage){
       super(id,amount,serviceType);
       this.rentTaxPercentage = rentTaxPercentage;
    }
    
    public void computeTax(Double amount){
        //fill your code
    	DecimalFormat df = new DecimalFormat("#.00");
    	double rentTax = (amount * rentTaxPercentage)/100;
    	double total = amount + rentTax;
    	
    	System.out.println("Tax to be paid for rent is "+df.format(rentTax));
 	   	System.out.println("Total amount to be paid is "+df.format(total));
    }
    
}
