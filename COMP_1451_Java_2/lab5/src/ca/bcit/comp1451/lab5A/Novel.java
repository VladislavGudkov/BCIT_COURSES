package ca.bcit.comp1451.lab5A;

public class Novel extends ReadingMaterial
{
	//Instance variables
	private String mainCharacterName;
	private String theme;
	private String novelistName;
	
	//Constructor for class Novel
	public Novel(String title, int numberOfPages, String mainCharacterName, String theme, String novelistName)
	{
		super(title, numberOfPages);
		setMainCharacterName(mainCharacterName);
		setTheme(theme);
		setNovelistName(novelistName);
	}

	//Accesor method for mainCharacterName
	public String getMainCharacterName()
	{
		return mainCharacterName;
	}

	//Mutator method for mainCharacterName
	public void setMainCharacterName(String mainCharacterName)
	{
		if (mainCharacterName != null && !mainCharacterName.isEmpty())
		{
			this.mainCharacterName = mainCharacterName;
		}
		else
		{
			this.mainCharacterName = "unknown";
		}
	}

	//Accesor method for Theme
	public String getTheme()
	{
		return theme;
	}

	//Mutator method for theme
	public void setTheme(String theme)
	{
		if (theme != null && !theme.isEmpty())
		{
			this.theme = theme;
		}
		else
		{
			this.theme = "unknown";
		}
	}

	//Accesor method for novelistName
	public String getNovelistName()
	{
		return novelistName;
	}

	//Mutator method for novelistName
	public void setNovelistName(String novelistName)
	{
		if (novelistName != null && !novelistName.isEmpty())
		{
			this.novelistName = novelistName;
		}
		else
		{
			this.novelistName = "unknown";
		}
	}
	
	//Display details method
	public void displayDetails()
	{
		System.out.println("Title: "+ getTitle());
		System.out.println("Main Charcter Name: "+ getMainCharacterName());
		System.out.println("Theme: "+ getTheme());
		System.out.println("Novelist mame: "+ getNovelistName());
	}
	
	
	
}
