import java.text.DecimalFormat;



public class SalesInvoice extends Invoice {
  
    
   private Integer vatTaxPercentage;
   private Integer cstTaxPercentage;
   
   public SalesInvoice(Integer id,Double amount,Integer vatTaxPercentage,Integer cstTaxPercentage){
      super(id,amount);
      this.vatTaxPercentage = vatTaxPercentage;
      this.cstTaxPercentage = cstTaxPercentage;
    }
   public void computeTax(Double amount){
      //fill your code
	   DecimalFormat df = new DecimalFormat("#.00");
	   double vat = (amount * vatTaxPercentage)/100;
	   
	   double cst = (amount * cstTaxPercentage)/100;
	   
	   double total = amount+vat+cst;
	   
	   System.out.println("Tax to be paid for vat is "+df.format(vat));
	   System.out.println("Tax to be paid for cst is "+df.format(cst));
	   System.out.println("Total amount to be paid is "+df.format(total));
    }
    
    
}
