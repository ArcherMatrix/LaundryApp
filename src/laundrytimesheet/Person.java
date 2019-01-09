package laundrytimesheet;

public class Person {
		private String name;
		private String password;
<<<<<<< HEAD
		private String username;
		private int phoneNumber;
		
		//Sets and returns name.
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		//Sets and returns username.
		public void setUsername(String password) {
			this.password = password;
		}
		public String getUsername() {
			return password;
		}
		//Sets and returns password.
=======
		private int phoneNumber;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
>>>>>>> 27fd3a8e036e39952f0de850358a2c43f344c144
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
<<<<<<< HEAD
		//Sets and returns phone number.
=======
>>>>>>> 27fd3a8e036e39952f0de850358a2c43f344c144
		public int getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
}
