package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData saledata = new SalesData();
		
		displayGreeting();
		saledata.display();
		
	}
		
		private static void displayGreeting()
		{
			System.out.println("Hello Happy Sales People....");
			System.out.println("This application is for Sales Data");
			
			System.out.println("Just to check the update");
		}

	}


