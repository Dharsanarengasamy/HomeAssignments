package homeAssignment6;

public class JavaConnection1 extends MySqlConnection {

	public static void main(String[] args) {
		
		JavaConnection1 jc1= new JavaConnection1();
		
	    // calling the methods of interface
		jc1.connect();
		jc1.disConnect();
		jc1.executeUpdate();
		
		//calling the methods of abstract class
		jc1.executeQuerry();
		

	}
	
	//implementation of abstract classes

	@Override
	public void connect() 
	{
		System.out.println("Connect the database.");
	}

	@Override
	public void disConnect() {
		System.out.println("Disconnect the database.");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update the data in the given database.");
		
	}

}
