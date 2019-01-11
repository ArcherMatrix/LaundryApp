package database;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import laundrytimesheet.Person;
/**
 * This class will create files.txt with the personal information of the users
 * possible operation:
 * 1 --> add(Person)
 * 2 --> doesUserExist(Person)
 * 3 --> removeUser(Person)  
 * @author LaundryApp
 */
public class DatabaseManager {
	/**
	 * saves space in disk for a Person object 
	 * @param person object being added to the database
	 * @return whether was able to create and save the Person on disk
	 */
	File file = new File(""); 
	
	//Adds a person to the database directory and then writes their info into a their personal file.
	public void add(Person person) throws FileNotFoundException {
		file = new File("src/database", person.getName()+".txt");
		PrintWriter output = new PrintWriter(file);
		output.println("Name: " + person.getName());
		output.println("PhoneNumber: " + String.valueOf(person.getMobileNumber()));
		output.println("Username " + person.getUsername());
		output.println("Password: " + person.getPassword());
		output.close();
	}
	//Checks if the Persons's file exists and can be accessed.
	public boolean doesUserExist(Person person){
		file = new File("src/database", person.getName()+".txt");
		if(file.exists()) {
			return true;
		}
		else {
			return false;
		}
	}
	//Removes user from file system.
	public void remove(Person person) {
		file = new File("src/database", person.getName()+".txt");
		if(file.exists()) {
			file.delete();
		}
		else {
			System.out.println("Error: User does not exist");
		} 

}
	
}