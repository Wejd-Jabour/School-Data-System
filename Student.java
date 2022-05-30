import java.util.*;
import java.time.LocalDate;

class Student implements Comparable<Student>
{
	int studentID;
	String firstName;
	String lastName;
	LocalDate dateOfBirth;
	
	public Student(int studentID, String firstName, String lastName, LocalDate dateOfBirth)
	{
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getStudentID()
	{
		return this.studentID;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public LocalDate getDateOfBirth()
	{
		return this.dateOfBirth;
	}
	
	public void setFirstName(String name)
	{
		this.firstName = name;
	}
	
	public void setLastName(String name)
	{
		this.lastName = name;
	}
	
	public void setDateOfBirth(LocalDate date)
	{
		this.dateOfBirth = date;
	}
	
	
	@Override
	public String toString()
	{
		String print = "";
		print += "Student ID: " + studentID + "\n";
		print += "First Name: " + firstName + "\n";
		print += "Last Name: " + lastName + "\n";
		print += "Date Of Birth: " + dateOfBirth + "\n";
		
		return print;
	}
	
	@Override
	public boolean equals(Object s)
	{
		if(this == s)
			return true;
			
		if(!(s instanceof Student))
			return false;
			
		Student other = (Student)s;
		
		if(this.studentID == other.studentID && this.firstName == other.firstName && this.lastName == other.lastName && this.dateOfBirth.equals(other.dateOfBirth))
		{
			return true;
		}
		return false;
	}  
	
	public int compareTo(Student s)
	{
		
		if(this.lastName.compareTo(s.lastName) == 0)
		{
			return this.firstName.compareTo(s.lastName);
		}
			
		return this.lastName.compareTo(s.lastName);
	}
}
