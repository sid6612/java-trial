public class Country
{
	int id;
	String name;

	public Country(int _id, String _name) 
    {
		this.id = _id;
		this.name = _name;
    }

    public void printCountryDetails()
    {
    	// ArrayList<City> cities = Search.getCitiesByCountryId(id);

    	System.out.println("| State ID | State Name         | City ID  | City Name               |");
    	for (int i = 0; i < Search.cities.size(); i++)
    	{
    		City currentCity = Search.cities.get(i);
    		State currentState = Search.searchStateById(currentCity.stateId);

    		int totalSpaceForStateId = 10;
    		String displayStateId = " " + currentState.id;
    		int spacesToAddStateId = totalSpaceForStateId - displayStateId.length();

    		for(int n = 0; n < spacesToAddStateId; n++)
    		{
    			displayStateId = displayStateId + " ";
    		}

    		int totalSpaceForStateName = 20;

    		String displayStateName = " " + currentState.name;
    		int spacesToAddStateName = totalSpaceForStateName - displayStateName.length();

    		for(int n = 0; n < spacesToAddStateName; n++)
    		{
    			displayStateName = displayStateName + " ";
    		}

    		int totalSpaceForCityId = 10;
    		String displayCityId = " " + currentCity.id;
    		int spacesToAddCityId = totalSpaceForCityId - displayCityId.length();

    		for(int n = 0; n < spacesToAddCityId; n++)
    		{
    			displayCityId = displayCityId + " ";
    		}

    		int totalSpaceForCityName = 25;
    		
    		String displayCityName = " " + currentCity.name;
    		int spacesToAddCityName = totalSpaceForCityName - displayCityName.length();

    		for(int n = 0; n < spacesToAddCityName; n++)
    		{
    			displayCityName = displayCityName + " ";
    		}

    		System.out.println("|" + displayStateId + "|" + displayStateName + "|" + displayCityId + "|" + displayCityName + "|");
    	}
    }
}