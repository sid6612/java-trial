public class State
{
	int id;
	String name;
	int countryId;

	public State(int _id, String _name, int _countryId)
    {
		this.id = _id;
		this.name = _name;
		this.countryId = _countryId;
    }

    public void printStateDetails() 
    {
    	Country country = Search.searchCountryById(countryId);
    	System.out.println("Country: " + country.name);
    }
}