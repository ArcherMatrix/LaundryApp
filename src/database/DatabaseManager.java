package database;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import laundrytimesheet.Person;
/**
 * This class will create files.txt with the personal information of the users
 * possible operation:
 * 1 --> add(Person)
 * 2 --> doesUserExist(Person)
 * 3 --> removeUser(Person)  
 * 4 --> getRegisteredPerson();
 * @author Sheldon
 */
public class DatabaseManager {
	/**
	 * saves space in disk for a Person object 
	 * @param person object being added to the database
	 * @return whether was able to create and save the Person on disk
	 */
	public DatabaseManager() {		
	}
	File file = new File(""); 
	
	//Adds a person to the database directory and then writes their info into a their personal file.
	public void add(Person person) throws FileNotFoundException {
		file = new File("src/database", person.getName()+".txt");
		PrintWriter output = new PrintWriter(file);
		output.println("Name: " + person.getName());
		output.println("PhoneNumber: " + String.valueOf(person.getMobileNumber()));
		output.println("Password: " + String.valueOf(person.getPassword()));
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
        /**
         * This method is for retrieving information about a person
         * @param person the person you wish to look for 
         * @return returns a Person with the information saved in disk
         */
        public Person getRegisteredPerson(Person person) {
            file = new File("src/database", person.getName()+".txt");
            Person personRegistered = new Person();
            try {
                Scanner scanner = new Scanner(file);
                while(scanner.hasNext()){
                    switch(scanner.next()) {
                        case "Name:":
                            personRegistered.setName(scanner.next());
                            break;
                        case "PhoneNumber:":
                            personRegistered.setMobileNumber(scanner.nextInt());
                            break;
                        case "Password:":
                            personRegistered.setPassword(scanner.next());
                            break;
                    }
                }
            }catch(FileNotFoundException e) {e.printStackTrace();}
//            System.out.println("name: " + personRegistered.getName());
//            System.out.println("phone: " + personRegistered.getMobileNumber());
//            System.out.println("password: " + personRegistered.getPassword());
            return personRegistered;
        }
}