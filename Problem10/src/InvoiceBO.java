public class InvoiceBO {
	public int modifyItemPrice(Invoice invoice, Item item, int percentageOfDiscount) {
		//fill your code
		int discountedPrice = 0;		
		for(int i=0;i<invoice.getInvoiceLine().length;i++) {
			if(invoice.getInvoiceLine()[i].getItem().getId() == item.getId())
				discountedPrice = (invoice.getInvoiceLine()[i].getAmount() * percentageOfDiscount)/100;
		}				
		discountedPrice = invoice.getTotal()-discountedPrice;		
		return discountedPrice;
	}
}
