public class City
{
	int id;
	String name;
	int stateId;
    int cityId;

	public City(int _id, String _name, int _stateId) 
    {
		this.id = _id;
		this.name = _name;
		this.stateId = _stateId;
    }

    public void printCityDetails() 
    {
       /* City city = Search.searchCityById(cityId);
        System.out.println("City: " + city.name);*/

        State state = Search.searchStateById(stateId);
    	System.out.println("State: " + state.name);

    	Country country = Search.searchCountryById(state.countryId);
    	System.out.println("Country: " + country.name);
    }

    public static void printAllCityNames()
    {
        System.out.println("\n");
        System.out.println("|    City Name    |");
        for (int i = 0; i < Search.cities.size(); i++)
        {
            City currentCity = Search.cities.get(i);

            int totalSpaceForCityName = 17;
            String displayCityName = " " + currentCity.name;
            int spacesToAddCityName = totalSpaceForCityName - displayCityName.length();

            for(int n = 0; n < spacesToAddCityName; n++)
            {
                displayCityName = displayCityName + " ";
            }
            
            System.out.println("|" + displayCityName + "|");
        }
    }
}