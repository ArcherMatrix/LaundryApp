package laundrytimesheet;

public class Person {
		private String name;
		private int mobileNumber;
		private String emailAddress;
		private String username;
		private char[] password;
		
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setMobileNumber(int phoneNumber) {
			this.mobileNumber = phoneNumber;
		}
		public int getMobileNumber() {
			return mobileNumber;
		}
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getUsername(){
			return username;
		}
                public void setPassword(String password) {
                    this.password = password.toCharArray();
                }
		public void setPassword(char[] password) {
			this.password = password;
		}
		public char[] getPassword() {
			return password;
		}
}
