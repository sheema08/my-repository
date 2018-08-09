public class UserBO {
    
        //fill code here.
	public void validatePassword(User user) throws WeakPasswordException {
		
		String regex = "((?=.*\\d)(?=.*[!@#$%]).{8,20})";
		if(!user.getPassword().matches(regex)){
			throw new WeakPasswordException("Password is weak");
		}
	}
}