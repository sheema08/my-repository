

public class DeluxeRoom extends Room {
	private String roomChoice;
	
	public DeluxeRoom(Double cost, Integer length, Integer breadth) {
		//fill the code
		super(cost, length, breadth);
	}
	
	public String getRoomChoice() {
		return roomChoice;
	}

	public void setRoomChoice(String roomChoice) {
		this.roomChoice = roomChoice;
	}

	public Double calculateTotalCost(int noOfPersons, int noOfDays){
		Double totalCost = super.getCost()*noOfDays*noOfPersons;
		return totalCost;
	 }
	    
	 public Integer calculateArea(){
		 return (super.getLength() * super.getBreadth());
	 }
}
