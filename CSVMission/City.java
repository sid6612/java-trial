public class City
{
	int id;
	String name;
	int stateId;

	public City(int _id, String _name, int _stateId) 
    {
		this.id = _id;
		this.name = _name;
		this.stateId = _stateId;
    }

    public void printCityDetails() 
    {
    	State state = Search.searchStateById(stateId);
    	System.out.println("State: " + state.name);

    	Country country = Search.searchCountryById(state.countryId);
    	System.out.println("Country: " + country.name);
    }
}