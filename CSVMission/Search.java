import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Search
{

	// Create an ArrayList of coutries.
	public static ArrayList<Country> countries =  new ArrayList<Country>();
	public static ArrayList<State> states =  new ArrayList<State>();
	public static ArrayList<City> cities =  new ArrayList<City>();
	
	// Create a function 
	public static void loadCountryCsvToArrayList()
	{
		String csvFile = "C:/Users/informationworks/Documents/JavaProjects/CSVMission/countries.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try
        {
        	int i = 0;
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null)
            {
            	if(i == 0) {
            		i++;
            		continue;
            	}

                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                countries.add(new Country(Integer.parseInt(country[0]), country[1]));
                // System.out.println("Country [id= " + country[0] + " , name=" + country[1] + "]");
                // Create a new Country object with the id and name.
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
	}

		public static void loadStateCsvToArrayList()
	{
		String csvFile = "C:/Users/informationworks/Documents/JavaProjects/CSVMission/states.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

     	try
        {
        	int i = 0;
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null)
            {
            	if(i == 0) {
            		i++;
            		continue;
            	}

                // use comma as separator
                String[] state = line.split(cvsSplitBy);
                states.add(new State(Integer.parseInt(state[0]), state[1],Integer.parseInt(state[2])));
                // System.out.println("Country [id= " + state[0] + " , name=" + state[1] + "]");
                // Create a new Country object with the id and name.
            }
        }
        catch (FileNotFoundException e)
        {           
        	e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
	}

	
	public static void loadCityCsvToArrayList()
	{
		String csvFile = "C:/Users/informationworks/Documents/JavaProjects/CSVMission/cities.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try
        {
        	int i = 0;
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null)
            {
            	if(i == 0){
            		i++;
            		continue;
            	}
                // use comma as separator
                String[] city = line.split(cvsSplitBy);
                cities.add(new City(Integer.parseInt(city[0]), city[1],Integer.parseInt(city[2])));

                // System.out.println("City [id= " + city[0] + " , name=" + city[1] + "]");

                // Create a new Country object with the id and name.
               
                // Add the newly created country to array list
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
	}


	public static void showMenuForCountrySearch() {
		System.out.print("\n");
		System.out.println("What do you want to search by?");
    	System.out.println("1. Id");
    	System.out.println("2. Name");	

    	Scanner sc = new Scanner(System.in);

		System.out.print("Select option from above : ");
		int selectedOption = sc.nextInt();

		if (selectedOption == 1) {
			System.out.print("\n");
			System.out.print("Please Enter ID: ");
			int countryId = sc.nextInt();
			Country country = searchCountryById(countryId);

			if(country == null) {
				//country.printCountryDetails();
				System.out.print("Please Enter Valid ID....");
			} else {
				
				System.out.print("Your Country Name is " + country.name );
			}
		} else if (selectedOption == 2) {
			System.out.print("\n");
			System.out.print("Please Enter Name: ");
			String countryName = sc.next();
			Country country = searchCountryByName(countryName);

			if(country == null) {
				System.out.print("Please Enter Valid Name....");
				//country.printCountryDetails();
			} else {
				System.out.print("Your Country ID is " + country.id );
			}
		}
	}

	public static Country searchCountryById(int idToSearch)
	{
		for (int i = 0; i < countries.size(); i++) 
		{
			Country country = countries.get(i);
			if(country.id == idToSearch)
			{
				return country;
			}
		}
		return null;
	}

	public static Country searchCountryByName(String nameToSearch)
	{
		for (int i = 0; i < countries.size(); i++) 
		{
			Country country = countries.get(i);
			if(country.name.equals(nameToSearch))
			{
				return country;
			}
		}
		return null;
	}

	public static void showMenuForStateSearch() {
		System.out.print("\n");
		System.out.println("What do you want to search by?");
    	System.out.println("1. Id");
    	System.out.println("2. Name");	

    	Scanner sc = new Scanner(System.in);

		System.out.print("Select option from above : ");
		int selectedOption = sc.nextInt();

		if (selectedOption == 1) {
			System.out.print("\n");
			System.out.print("Please Enter ID: ");
			int stateId = sc.nextInt();
			State state = searchStateById(stateId);
			if(state == null) {
				System.out.print("Please Enter Valid ID....");
			} else {
				//state.printStateDetails();
				System.out.print("Your State name is " + state.name );
			}
		} else if (selectedOption == 2) {
			System.out.print("\n");
			System.out.print("Please Enter Name: ");
			String stateName = sc.next();
			State state = searchStateByName(stateName);

			if(state == null) {
				System.out.print("Please Enter Valid Name....");
			} else {
				//state.printStateDetails();
				System.out.print("Your State ID is " + state.id );
			}
		}
	}

	public static State searchStateById(int idToSearch)
	{
		for (int i = 0; i < states.size(); i++) 
		{
			State state = states.get(i);
			if(state.id == idToSearch)
			{
				return state;
			}
		}
		return null;
	}

	public static State searchStateByName(String nameToSearch)
	{
		for (int i = 0; i < states.size(); i++) 
		{
			State state = states.get(i);
			if(state.name.equals(nameToSearch))
			{
				return state;
			}
		}
		return null;
	}

	public static void showMenuForCitySearch()
	{
		System.out.print("\n");
		System.out.println("What do you want to search by?");
    	System.out.println("1. Id");
    	System.out.println("2. Name");	

    	Scanner sc = new Scanner(System.in);

		System.out.print("Select option from above : ");
		int selectedOption = sc.nextInt();

		if (selectedOption == 1)
		{
			System.out.print("\n");
			System.out.print("Please Enter ID: ");
			int cityId = sc.nextInt();
			City city = searchCityById(cityId);

			if(city == null)
			{
				System.out.print("Please Enter Valid ID....");
			}
			else
			{
				city.printCityDetails();
				// System.out.print("Your City Name is " + city.name );
			}
		}
		else if (selectedOption == 2)
		{
			System.out.print("\n");
			System.out.print("Please Enter Name: ");
			String cityName = sc.next();
			City city = searchCityByName(cityName);

			if(city == null)
			{
				System.out.print("Please Enter Valid Name....");
			}
			else
			{
				city.printCityDetails();
				// System.out.print("Your City ID is " + city.id );
			}
		}
	}

	public static City searchCityById(int idToSearch)
	{
		for (int i = 0; i < cities.size(); i++) 
		{
			City city = cities.get(i);
			if(city.id == idToSearch)
			{
				return city;
			}
		}
		return null;
	}

	public static City searchCityByName(String nameToSearch)
	{
		for (int i = 0; i < cities.size(); i++) 
		{
			City city = cities.get(i);
			if(city.name.equals(nameToSearch))
			{
				return city;
			}
		}
		return null;
	}

	public static void printSearchMenu()
	{
		System.out.print("\n");
		System.out.println("What do you want to search ?");
    	System.out.println("1. Country");
    	System.out.println("2. State");
    	System.out.println("3. City");

    	Scanner sc = new Scanner(System.in);

		System.out.print("Select option from above : ");
		int selectedOption = sc.nextInt();

		if (selectedOption == 1)
		{
			showMenuForCountrySearch();
		}
		else if (selectedOption == 2)
		{
			showMenuForStateSearch();	
		}
		else if (selectedOption == 3)
		{
			showMenuForCitySearch();
		}
		else 
		{
			System.out.println("Invalid Option....");
		}
	}

	public static void viewList()
	{
		System.out.println("\n");
		System.out.println("What do you want to View ?");
		System.out.println("1. Country");
		System.out.println("2. state");
		System.out.println("3. City");

		Scanner sc = new Scanner(System.in);

		System.out.println("\n");
		System.out.println(countries.size());
		System.out.print("Select option from above : ");
		int selectedOption = sc.nextInt();

		if(selectedOption == 1)
		{
			
			System.out.println("| Country ID | Country Name  |");
			for (int i = 0; i < countries.size(); i++) 
			{
    			int totalSpaceForCountryId = 12;
    			String displayCountryId = " " + countries.get(i).id;
    			int spacesToAddCountryId = totalSpaceForCountryId - displayCountryId.length();

    			for(int n = 0; n < spacesToAddCountryId; n++)
    			{
	    			displayCountryId = displayCountryId + " ";
    			}

    			int totalSpaceForCountryName = 15;
				String displayCountryName = " " + countries.get(i).name;
    			int spacesToAddCountryName = totalSpaceForCountryName - displayCountryName.length();

    			for(int n = 0; n < spacesToAddCountryName; n++)
    			{
    				displayCountryName = displayCountryName + " ";
    			}
	        	//System.out.println(countries.get(i).name);

	        	System.out.println("|" + displayCountryId + "|" + displayCountryName + "|");
	    	}
		}
		else if (selectedOption == 2)
		{
			System.out.println("| State ID | State Name     |");
			for (int j = 0; j < states.size(); j++) 
			{
				int totalSpaceForStateId = 10;
    			String displayStateId = " " + states.get(j).id;
    			int spacesToAddStateId = totalSpaceForStateId - displayStateId.length();

    			for(int n = 0; n < spacesToAddStateId; n++)
    			{
    				displayStateId = displayStateId + " ";
    			}

    			int totalSpaceForStateName = 16;
				String displayStateName = " " + states.get(j).name;
    			int spacesToAddStateName = totalSpaceForStateName - displayStateName.length();

    			for(int n = 0; n < spacesToAddStateName; n++)
    			{
    				displayStateName = displayStateName + " ";
	    		}
	        	
	        	//System.out.println(states.get(j).name);

	        	System.out.println("|" + displayStateId + "|" + displayStateName + "|");
	    	}
		}
		else if (selectedOption == 3)
		{
			System.out.println("| City ID | City Name      |");
			for (int k = 0; k < cities.size(); k++) 
			{
	        	int totalSpaceForCityId = 9;
    			String displayCityId = " " + cities.get(k).id;
    			int spacesToAddCityId = totalSpaceForCityId - displayCityId.length();

    			for(int n = 0; n < spacesToAddCityId; n++)
    			{
    				displayCityId = displayCityId + " ";
    			}

    			int totalSpaceForCityName = 16;
    		
    			String displayCityName = " " + cities.get(k).name;
    			int spacesToAddCityName = totalSpaceForCityName - displayCityName.length();

    			for(int n = 0; n < spacesToAddCityName; n++)
    			{
    				displayCityName = displayCityName + " ";
    			}

	        	//System.out.println(cities.get(k).name);

	        	System.out.println("|" + displayCityId + "|" + displayCityName + "|");
	    	}
		}
	}

	public static void searchStatByCity()
	{
	   	Scanner sc = new Scanner(System.in);

		System.out.print("\n");
		System.out.print("Please Enter City Name: ");
		String cityName = sc.next();
		City city = searchCityByName(cityName);

		if(city != null)
		{
			System.out.println("City: " + city.name);

			State state = searchStateById(city.stateId);

			if(state != null)
			{
				System.out.println("State: " + state.name);
			}
			else
			{
				System.out.print("State not found...");
			}
		}
		else
		{
			System.out.print("Please Enter Valid Name....");
			City.printAllCityNames();
		}
	}

    public static void main(String[] args)
    {
    	loadCountryCsvToArrayList();
    	loadStateCsvToArrayList();
    	loadCityCsvToArrayList();

    	while(true)
    	{
    		System.out.println("\n");
    		System.out.println("********************");
    		System.out.println("* Choose an option *");
    		System.out.println("********************");
    		System.out.println("1. View List");
    		System.out.println("2. Search Option");
    		System.out.println("3. Search State By City");
    		System.out.println("Enter 0 to exit");


			Scanner sc = new Scanner(System.in);

			System.out.println("\n");
			System.out.print("Select option from above : ");
			int selectedOption = sc.nextInt();

			if(selectedOption == 0)
			{
				System.out.println("Visit Again...");
				break;
			}
			else if (selectedOption == 1)
			{
				viewList();
			}
			else if (selectedOption == 2)
			{
				printSearchMenu();
			}
			else if (selectedOption == 3)
			{
				searchStatByCity();
			}
			else
			{
				System.out.print("Invalid Option....");
			}
    	}
	}
}

