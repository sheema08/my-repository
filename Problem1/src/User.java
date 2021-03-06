
public class User {
    private String userName;
    private String firstName;
    private String lastName;
    private String contact;

    public User(String userName, String firstName, String lastName, String contact) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
    }

    User() {}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    //fill your code
    User findUser(User userArray[],String userName){
        User user = null;
        boolean isFound = false;
        for(int i=0;i<userArray.length;i++){
            user = userArray[i];
            if(userName.equals(user.getUserName())){
            	isFound = true;
                break;
            }
        }
        if(isFound)
        	return user;
        else
        	return null;
    }
    
    User findUser(User userArray[],String firstName,String lastName){
         User user = null;
         boolean isFound = false;
        for(int i=0;i<userArray.length;i++){
            user = userArray[i];
            if(firstName.equals(user.getFirstName()) && lastName.equals(user.getLastName())){
            	isFound = true;
                break;
            }
        }
        if(isFound)
        	return user;
        else
        	return null;
    }
}

