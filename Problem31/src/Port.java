
public class Port implements Comparable<Port>{

	private Integer id;
	private String name;
	private String country;

	public Port() {
	}

	public Port(Integer id, String name, String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {
		return String
				.format("%-15s %-15s %-15s", getId(), getName(), getCountry());
	}
	
	public int compareTo(Port obj) {
		return (this.country.compareTo(obj.getCountry()));
	}
}
