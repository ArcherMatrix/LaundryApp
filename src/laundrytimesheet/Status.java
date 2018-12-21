package laundrytimesheet;
import java.io.File;

public class Status {
	Status(){	
	}
	File file;
	boolean status;
	
	public void setStatus(Person a) {
		file = new File(a.getName()+"log.txt");
	}
	public boolean checkStatus() {
		if(file.exists()) {
			status = true;
		}
		else {
			status = false;
		}
		return status;
	}
		

}
