import java.util.ArrayList;
import java.util.List;

public class SearchProviderThread extends Thread{

    //fill in your attributes here
	String itemName;
	List<Item> itemList = new ArrayList<Item>();
	List<Item> filteredItems = new ArrayList<Item>();
    
    public SearchProviderThread(String itemName,List<Item> itemList) {
        this.itemName = itemName;
        this.itemList = itemList;
    }
    
    public void run() {
        
       //fill in your code here
        for(int i=0;i<itemList.size();i++){
        	if(itemName.equals(itemList.get(i).getName())){
         		 filteredItems.add(itemList.get(i));
        	}
        }       
    }

    public List<Item> getFilteredItems() {
        return filteredItems;
    }

    public void setFilteredItems(List<Item> filteredItems) {
        this.filteredItems = filteredItems;
    }
    
    
}
