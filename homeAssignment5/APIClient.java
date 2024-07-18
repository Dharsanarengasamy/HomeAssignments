package homeAssignment5;

public class APIClient {
	
	public void sendRequest(String endPoint)
	{
		System.out.println("The end point is "+ endPoint);
	}
	
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus )
	{
		System.out.println("The end point is "+ endPoint +" and the request body is "+ requestBody+" and the request status is "+ requestStatus);
	}
     public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("End of the work");
		api.sendRequest("end of the work", "Finish the work", true);
		
	}
}
