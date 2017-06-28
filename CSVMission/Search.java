import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Search
{

	// Create an ArrayList of coutries.
	static ArrayList<Country> coutries =  new ArrayList<Country>();
	static ArrayList<State> states =  new ArrayList<State>();
	static ArrayList<City> cities =  new ArrayList<City>();
	
	// Create a function 
	public static void loadCountryCsvToArrayList()
	{
		String csvFile = "C:/Users/informationworks/Documents/JavaProjects/CSVMission/countries.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try
        {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null)
            {
                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                // System.out.println("Country [id= " + country[0] + " , name=" + country[1] + "]");

                // Create a new Country object with the id and name.
                coutries.add(new Country(1,"India"));
                coutries.add(new Country(2,"Canada"));
                coutries.add(new Country(3,"Australia"));
                coutries.add(new Country(4,"USA"));
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

	/*public static void addCountry()
	{
        // Add the newly created country to array list
        String countryName;
		int countryId = getIdForNewcountry();

		Scanner sc = new Scanner(System.in);
		System.out.print("\n");
		System.out.print("Enter name to add new country: ");
		countryName = sc.nextLine();
		System.out.println("\n");

		coutries.add(new Country(countryId, countryName));
		System.out.println("\n");
		System.out.print("A new country is being added. Country Id  assigned is" + countryId + ".");		
	}

	public static int getIdForNewcountry()
	{
		int maxNumber = 0;

		for (int n = 0; n < coutries.size(); n++)
		{
			Country country = coutries.get(n);
			if (country.id > maxNumber)
			{
				maxNumber = country.id;
			}
		}

		return maxNumber + 1;
	}
*/
		public static void loadStateCsvToArrayList()
	{
		String csvFile = "C:/Users/informationworks/Documents/JavaProjects/CSVMission/states.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try
        {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null)
            {
                // use comma as separator
                String[] state = line.split(cvsSplitBy);

                // System.out.println("State [id= " + state[0] + " , name=" + state[1] + "]");

                // Create a new Country object with the id and name.
                states.add(new State(1,"Gujarat"));
                states.add(new State(2,"Maharashtra"));
                states.add(new State(3,"Goa"));
                states.add(new State(4,"Ontario"));
                states.add(new State(5,"Manitoba"));
                states.add(new State(6,"Quebec"));
                states.add(new State(7,"New South Wales"));
                states.add(new State(8,"Queensland"));
                states.add(new State(9,"Victoria"));
                states.add(new State(10,"New York"));
                states.add(new State(11,"Florida"));
                states.add(new State(12,"Texas"));
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

	
	public static void loadCityCsvToArrayList()
	{
		String csvFile = "C:/Users/informationworks/Documents/JavaProjects/CSVMission/cities.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try
        {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null)
            {
                // use comma as separator
                String[] city = line.split(cvsSplitBy);

                // System.out.println("City [id= " + city[0] + " , name=" + city[1] + "]");

                // Create a new Country object with the id and name.
                cities.add(new City(1,"Bharuch"));
                cities.add(new City(2,"Vadodara"));
                cities.add(new City(3,"Surat"));
                cities.add(new City(4,"Mumbai"));
                cities.add(new City(5,"Pune"));
                cities.add(new City(6,"Nagpur"));
                cities.add(new City(7,"Panaji"));
                cities.add(new City(8,"Vasco da Gama"));
                cities.add(new City(9,"Margao"));
                cities.add(new City(10,"Belleville"));
                cities.add(new City(11,"Ottawa"));
                cities.add(new City(12,"Toronto"));
                cities.add(new City(13,"Brandon"));
                cities.add(new City(14,"Winnipeg"));
                cities.add(new City(15,"Steinbach"));
                cities.add(new City(16,"Amos"));
                cities.add(new City(17,"Delson"));
                cities.add(new City(18,"Lévis"));
                cities.add(new City(19,"Sydney"));
                cities.add(new City(20,"Newcastle"));
                cities.add(new City(21,"Taree"));
                cities.add(new City(22,"Gold Coast"));
                cities.add(new City(23,"Logan City‎"));
                cities.add(new City(24,"Mount Isa‎"));
                cities.add(new City(25,"Melbourne‎"));
                cities.add(new City(26,"Ballarat"));
                cities.add(new City(27,"Ararat"));
                cities.add(new City(28,"Buffalo"));
                cities.add(new City(29,"Niagara Falls"));
                cities.add(new City(30,"Geneva"));
                cities.add(new City(31,"Coral Springs"));
                cities.add(new City(32,"Fort Lauderdale"));
                cities.add(new City(33,"Hollywood"));
                cities.add(new City(34,"Antonio"));
                cities.add(new City(35,"Houston"));
                cities.add(new City(36,"Austin"));
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
			if (selectedOption == countryId) {
				System.out.print("Your country name is " + country.name );
			}
			else
			{
				System.out.print("Please Enter Valid ID....");
			}
		} else if (selectedOption == 2) {
			System.out.print("\n");
			System.out.print("Please Enter Name: ");
			String countryName = sc.next();
			Country country = searchCountryByName(countryName);

			if(country == null) {
				System.out.print("Please Enter Valid Name....");
			} else {
				System.out.print("Your Country ID is " + country.id );
			}
		}
	}

	public static Country searchCountryById(int idToSearch)
	{
		for (int i = 0; i < coutries.size(); i++) 
		{
			Country country = coutries.get(i);
			if(country.id == idToSearch)
			{
				return country;
			}
		}
		return null;
	}

	public static Country searchCountryByName(String nameToSearch)
	{
		for (int i = 0; i < coutries.size(); i++) 
		{
			Country country = coutries.get(i);
			if(country.name.equals(nameToSearch))
			{
				return country;
			}
		}
		return null;
	}

	public static void printSearchMenu()
	{
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
			
		}
		else if (selectedOption == 3)
		{
			
		}
		else 
		{
			System.out.println("Invalid Option....");
		}
	}

/*	// return country or null
	public static int findCountryByName(string name)
	{
		String countryName;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter country name; ");
		countryName = sc.nextLine();
		if (loadCountryCsvToArrayList.equals(name))
		{
			return 1;

		}
	}

	// return state or null
	public static int findStateByName(string name)
	{
		if (loadStateCsvToArrayList.equals(name))
		{
			return 1;

		}
	}

	// return city or null
	public static int findCityByName(string name)
	{
		if (loadCityCsvToArrayList.equals(name))
		{
			return 1;

		}
	}

	public static void printCountries()
	{
	
	}

	public static void printStates()
	{

	}

	public static void printCiyies()
	{

	}
*/
    public static void main(String[] args)
    {
    	loadCountryCsvToArrayList();
    	loadStateCsvToArrayList();
    	loadCityCsvToArrayList();
    	
    	printSearchMenu();
    	
    	/*
    	printCountries();
    	printStates();
    	printCiyies();
    	*/
	}
}