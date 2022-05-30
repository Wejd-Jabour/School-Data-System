public enum Level
{
	C,
	M,
	U,
	O;
	
	
	public String getFullName()
	{
		if(this == C)
			return "Collage";
		
		if(this == M)
			return "Mixed";
			
		if(this == U)
			return "University";
		
		return "Open";
	}
}
