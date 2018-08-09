
public class Port {
    private Integer id;
	private String name;
	private String country = "India";
	
	public Port(Integer id,String name, String country){
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Port(Integer id,String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		return String.format("%-15d %-15s %-15s",this.id,this.name,this.country);
	}
}