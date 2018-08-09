

public class ServiceInvoice extends Invoice {

     protected String serviceType;
     public ServiceInvoice(){}
     public ServiceInvoice(Integer id,Double amount,String serviceType)
     {
       super(id,amount);
       this.serviceType = serviceType;
     }

}
