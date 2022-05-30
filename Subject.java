public enum Subject
{
	COMPUTER_STUDIES,
	BUSINESS,
	MATH,
	MUSIC,
	SCIENCE,
	TECHNOLOGY;
	
	
	public String getFullName()
	{
		if(this == COMPUTER_STUDIES)
			return "Computer Studies";
			
		if(this == BUSINESS)
			return "Business";
			
		if(this == MATH)
			return "Math";
			
		if(this == MUSIC)
			return "Music";
		if(this == SCIENCE)
			return "Science";
			
		return "Technology";
	}
	
	public String getPrefix()
	{
		if(this == COMPUTER_STUDIES)
			return "COM";
			
		if(this == BUSINESS)
			return "BUS";
			
		if(this == MATH)
			return "MAT";
			
		if(this == MUSIC)
			return "MUS";
		
		if(this == SCIENCE)
			return "SCI";
		
		return "TEC";
	}
	
}
