package hipster.model;

public class Hipster 
{
	private String name;
	private String[] hipsterPhrases;

	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[6];
		setupArray();
	}

	private void setupArray()
	{
		hipsterPhrases[0] = "";
		hipsterPhrases[1] = "";
		hipsterPhrases[2] = "";
		hipsterPhrases[3] = "";
		hipsterPhrases[4] = "";
		hipsterPhrases[5] = "";
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String[] getHipsterPhrases() 
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases) 
	{
		this.hipsterPhrases = hipsterPhrases;
	}
	
}

