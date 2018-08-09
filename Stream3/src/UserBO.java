import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class UserBO {
	public void saveAllUser(List<User> userList,String fileName) throws IOException{
		
		FileWriter writer = new FileWriter(fileName);
		User user = null;
		for(int i=0;i<userList.size();i++){
			user = userList.get(i);
			writer.write(user.getId()+","+
						user.getFirstName()+","+
						user.getLastName()+","+
						user.getUsername()+","+
						user.getPassword()+","+
						user.getMobileNumber()+","+
						user.getRole().getRoleId()+","+
						user.getRole().getName()+"\n");
		}
		writer.flush();
		writer.close();
		System.out.println("User information saved successfully");
	}
}
