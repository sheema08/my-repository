
public class Payment {
    
    private int id;
    private String username;
    private int attempts;
    private double amount;
    private String status;

    public Payment(int id, String username, int attempts, double amount, String status) {
        this.id = id;
        this.username = username;
        this.attempts = attempts;
        this.amount = amount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String toString(){
    	return String.format("%-5s %-15s %-17s %-15s %s", getId(), getUsername(), getAttempts(), getAmount(), getStatus());
    }
}
