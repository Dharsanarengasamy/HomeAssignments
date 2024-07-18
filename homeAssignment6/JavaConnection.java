package homeAssignment6;


public class JavaConnection implements DatabaseConnection{

	public static void main(String[] args) {
		
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disConnect();
		jc.executeUpdate();

	}

	@Override
	public void connect() {

		System.out.println("Connect the database.");
		
	}

	@Override
	public void disConnect() {
		System.out.println("Disconnect the database.");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update the data in the given database and execute it.");
		
	}

}
