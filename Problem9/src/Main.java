import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		// fill code here
    	try{
		Scanner sc = new Scanner(System.in);
		
		int count1 = sc.nextInt();
		int[] dates = new int[count1];
		
		Date date = null;	
		String temp = "";
		for(int i=0;i < count1;i++){
			temp = sc.nextLine();
			date = new SimpleDateFormat("dd-MM-yyyy").parse(temp);
			dates[i] = date.getYear() - 5;
			System.out.println(dates[i]);
		}
		
		int count = 0, curr_cnt = 1, freq_num = 0, key = 0;
		for(int i = 0; i < count1-1; i++)
		{
		    key = dates[i];
		    for(int j =i+1; j < count; j++)
		    {
		        if(key == dates[j] && freq_num != key)
		        {
		            curr_cnt++;
		        }
		    }
		    if(count < curr_cnt)
		    {
		        count = curr_cnt;
		        curr_cnt = 1;
		        freq_num = key;
		    }
		}
		System.out.println(freq_num);
    	}catch(Exception e){
    		System.out.println("Exception Caught");
    	}
	}
}
