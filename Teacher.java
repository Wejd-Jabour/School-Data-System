class Teacher implements Comparable<Teacher>
{
	int teacherID;
	String firstName;
	String lastName;
	
	Teacher(int teacherID, String firstName, String lastName)
	{
		this.teacherID = teacherID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getTeacherID()
	{
		return this.teacherID;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setFirstName(String name)
	{
		this.firstName = name;
	}
	
	public void setLastName(String name)
	{
		this.lastName = name;
	}
	
	@Override
	public String toString()
	{
		return firstName + " " + lastName + "    Teacher ID: " + teacherID;

	}
	
	@Override
	public boolean equals(Object t)
	{
		if(this == t)
			return true;
			
		if(!(t instanceof Teacher))
			return false;
			
		Teacher other = (Teacher)t;
		
		if(this.teacherID == other.teacherID && this.firstName == other.firstName && this.lastName == other.lastName)
		{
			return true;
		}
		return false;
	}  
	
	public int compareTo(Teacher t)
	{
		if(this.lastName.compareTo(t.lastName) == 0)
		{
			return this.firstName.compareTo(t.lastName);
		}
			
		return this.lastName.compareTo(t.lastName);
			
	}
	
}
