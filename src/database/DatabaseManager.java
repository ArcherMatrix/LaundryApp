package database;
 
import laundrytimesheet.Person;
/**
 * This class will create files.txt with the personal information of the users
 * possible operation:
 * 1 --> add(Person)
 * 2 --> doesUserExit(Person)
 * 3 --> removeUser(Person)  
 * @author LaundryApp
 */
public class DatabaseManager {
	
	
	
	/**
	 * saves space in disk for a Person object 
	 * @param person object being added to the database
	 * @return whether was able to create and save the Person on disk
	 */
	public boolean add(Person person) {
		return true;
	}
	
}
