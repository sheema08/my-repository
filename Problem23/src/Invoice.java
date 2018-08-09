

public class Invoice {
   protected Integer id;
   protected Double amount;
   public Invoice(){}
   public Invoice(Integer id,Double amount){
     this.id = id;
     this.amount = amount;
   }
   
   public void setId(Integer id){
    this.id = id;
   }
   public Integer getId(){
     return id;
   }
   
   public void setAmount(Double amount){
     this.amount = amount;
   }
   public Double getAmount(){
    return amount;
   }
   
    
}
