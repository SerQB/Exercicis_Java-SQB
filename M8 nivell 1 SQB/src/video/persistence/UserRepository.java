package video.persistence;

import java.util.ArrayList;
import java.util.List;
import video.domain.Usuari;


public class UserRepository {
	
	private static List<Usuari> users=new ArrayList<>();

	public UserRepository() {
		
	}
	public List<Usuari> getAllMembers(){
		return new ArrayList<>(getUsers());
	}
	
	public void addMember(Usuari user) throws Exception{
		if(user==null) throw new Exception();
		getUsers().add(user);
	}
	public static List<Usuari> getUsers() {
		return users;
	}
	public static void setUsers(List<Usuari> users) {
		UserRepository.users = users;
	}

}
