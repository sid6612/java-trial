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
                String[] country = line.split(cvsSplitBy);

                // System.out.println("Country [id= " + country[0] + " , name=" + country[1] + "]");

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
                String[] country = line.split(cvsSplitBy);

                // System.out.println("Country [id= " + country[0] + " , name=" + country[1] + "]");

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
                cities.add(new City(12"Toronto"));
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
                cities.add(new City(35,"Austin"));
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

	// return country or null
	public static int findCountryByName(string name)
	{

	}

	// return state or null
	public static int findStateByName(string name)
	{

	}

	// return city or null
	public static int findCityByName(string name)
	{

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

    public static void main(String[] args)
    {
    	loadCountryCsvToArrayList();
    	loadStateCsvToArrayList();
    	loadCityCsvToArrayList();
    	printCountries();
    	printStates();
    	printCiyies();
	}
}