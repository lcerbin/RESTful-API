package me.luca.SpringRestAPI;
import javafx.util.Pair;
import java.util.Hashtable;
public class UserObject {
	
	private float id;
	private String username;
	private String password;
	Hashtable moods = new Hashtable();
	
	public UserObject() {
	}
	public UserObject(float id, String username, String password) {
		this.setId(id);
		this.setPassword(password);
		this.setUsername(username);
	}

	public float getId() {
		return id;
	}
		
	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}
		
	public void setId(float id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	/*public void addToData(Pair moods, String date) {
			
	}*/
}
