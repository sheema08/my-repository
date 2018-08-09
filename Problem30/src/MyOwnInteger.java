
public class MyOwnInteger implements Comparable<MyOwnInteger>{

	Integer number;
	
	MyOwnInteger() {
	}

	MyOwnInteger(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public int compareTo(MyOwnInteger obj) {
		if(this.number > obj.getNumber())	
			return 1;
		else if(this.number < obj.getNumber())
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return ""+this.number;
	}	
}
