
public class Cheque {
    private int id;
    private String bank_name;
    private String cheque_number;
    private Payment payment;
    private String status;

    public Cheque(int id, String bank_name, String cheque_number, Payment payment, String status) {
        this.id = id;
        this.bank_name = bank_name;
        this.cheque_number = cheque_number;
        this.payment = payment;
        this.status = status;
    }
    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getCheque_number() {
        return cheque_number;
    }

    public void setCheque_number(String cheque_number) {
        this.cheque_number = cheque_number;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
