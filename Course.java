class Course implements Comparable<Course>
{
	String name;
	Subject subject;
	String code;
	int grade;
	Level level;
	String description;
	
	Course(String name, Subject subject, String code, int grade, Level level, String description)
	{
		this.name = name;
		this.subject = subject;
		this.code = code;
		this.grade = grade;
		this.level = level;
		this.description = description;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Subject getSubject()
	{
		return this.subject;
	}
	
	public void setSubject(Subject subject)
	{
		this.subject = subject;
	}
	
	public String getCode()
	{
		return this.code;
	}
	
	public int getGrade()
	{
		return this.grade;
	}
	
	public Level getLevel()
	{
		return this.level;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	@Override
	public String toString()
	{
		String print = "";
		print += "Name: " + name + "\n";
		print += "Subject: " + subject + "\n";
		print += "Code: " + code + "\n";
		print += "Grade: " + grade + "\n";
		print += "Level: " + level.getFullName() + "\n";
		print += "Description: " + description + "\n";
		
		return print;
	}
	
	
	public int compareTo(Course c)
	{
		if(this.name.compareTo(c.name) == 0)
		{
			return this.subject.compareTo(c.subject);
		}
			
		return this.name.compareTo(c.name);
	}
	
	
}
