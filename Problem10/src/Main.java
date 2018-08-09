import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		Invoice invoiceObj = new Invoice("INV/02/53","Alex Parish");
		Item[] itemArray = new Item[5];
		itemArray[0] = new Item(1,"Mobile phone",8500);
		itemArray[1] = new Item(2,"Laptop",35000);
		itemArray[2] = new Item(3,"Camera",9000);
		itemArray[3] = new Item(4,"Television",30000);
		itemArray[4] = new Item(5,"Home Theater",19500);
		
		InvoiceLine[] invoiceLineArray = new InvoiceLine[3];
		invoiceLineArray[0] = new InvoiceLine(itemArray[0],2,invoiceObj);
		invoiceLineArray[0].setPrice(invoiceLineArray[0].getItem().getPrice());
		invoiceLineArray[0].setAmount(invoiceLineArray[0].getPrice() * invoiceLineArray[0].getQuantity());
		
		invoiceLineArray[1] = new InvoiceLine(itemArray[2],1,invoiceObj);
		invoiceLineArray[1].setPrice(invoiceLineArray[1].getItem().getPrice());
		invoiceLineArray[1].setAmount(invoiceLineArray[1].getPrice() * invoiceLineArray[1].getQuantity());
		
		invoiceLineArray[2] = new InvoiceLine(itemArray[4],2,invoiceObj);
		invoiceLineArray[2].setPrice(invoiceLineArray[2].getItem().getPrice());
		invoiceLineArray[2].setAmount(invoiceLineArray[2].getPrice() * invoiceLineArray[2].getQuantity());
		
		invoiceObj.setInvoiceLine(invoiceLineArray);
		int total = 0;
		
		for(int i=0;i<invoiceObj.getInvoiceLine().length;i++) {
			total += invoiceObj.getInvoiceLine()[i].getAmount();
		}
		invoiceObj.setTotal(total);
		
		System.out.println("Available item details are");
		System.out.format("%-25s %-25s %s\n","Id","Item Name","Price");
		for(int i=0;i<itemArray.length;i++) {
			System.out.format("%-25s %-25s %s\n",itemArray[i].getId(),itemArray[i].getName(),itemArray[i].getPrice());
		}
		
		// fill code here
		System.out.println("Enter the item id for discount :");
		int itemID = Integer.parseInt(buff.readLine());
		
		System.out.println("Enter the discount percentage :");
		int discount = Integer.parseInt(buff.readLine());
		
		int discountedPrice = invoiceObj.getTotal();
		InvoiceBO invoiceBO = new InvoiceBO();
		System.out.println("Invoice details before giving discount :");
		System.out.format("%-25s %-25s %-25s %-25s %s\n","Item ID","Item Name","Price","Quantity","Amount");
		for(int i=0;i<invoiceLineArray.length;i++) {
			System.out.format("%-25s %-25s %-25s %-25s %s\n",
					invoiceLineArray[i].getItem().getId(),
					invoiceLineArray[i].getItem().getName(),
					invoiceLineArray[i].getItem().getPrice(),
					invoiceLineArray[i].getQuantity(),
					invoiceLineArray[i].getAmount());
		}
		for(int i=0;i<invoiceLineArray.length;i++) {
			if(itemID == invoiceLineArray[i].getItem().getId()){
				discountedPrice = invoiceBO.modifyItemPrice(invoiceLineArray[i].getInvoice(), invoiceLineArray[i].getItem(), discount);				
			}
		}
		System.out.println("Total invoice amount is "+invoiceObj.getTotal());
		System.out.println("Total invoice amount after giving discount is "+discountedPrice);
	}
}
