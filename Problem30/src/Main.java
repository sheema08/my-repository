import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		List<MyOwnInteger> unorderedNList = new ArrayList<MyOwnInteger>();
		List<MyOwnInteger> unorderedPList = new ArrayList<MyOwnInteger>();
		int temp = 0;
		for(int i=0;i<n;i++){
			temp = sc.nextInt();
			if(temp > 0){
				unorderedPList.add(new MyOwnInteger(temp));
			} else {
				unorderedNList.add(new MyOwnInteger(temp));
			}
		}
		Collections.sort(unorderedNList);
		Collections.sort(unorderedPList);
		Collections.reverse(unorderedPList);
		
		List<MyOwnInteger> orderedList = new ArrayList<MyOwnInteger>();
		
		orderedList.addAll(unorderedNList);
		orderedList.addAll(unorderedPList);
		
		
		System.out.print("[");
		int count = 1;
		for(int i=0;i<orderedList.size();i++){
			System.out.print(orderedList.get(i));
			if(count < orderedList.size()){
				System.out.print(",");
				count++;
			}
		}
		System.out.print("]");
	}
}
