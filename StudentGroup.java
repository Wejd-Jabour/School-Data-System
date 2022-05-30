import java.util.*;

class StudentGroup
{
	ArrayList<Student> students = new ArrayList<>();
	
	public void add(Student s)
	{
		students.add(s);
		Collections.sort(students);
	}
	
	public void remove(Student s)
	{
		students.remove(s);
	}
	
	public void remove(int index)
	{
		students.remove(index);
	}	
	
	public int get(Student s)
	{
		for(int i = 0; i < students.size(); i++)
		{
			if(students.get(i) == s)
			{
				return i;
			}
		}
		return -1;
	}
	
	public Student get(int index)
	{
		return students.get(index);
	}
	
	public int size()
	{
		return students.size();
	}
	
	@Override
	public String toString()
	{
		Collections.sort(students);
		String print = "";
		for(int i = 0; i < students.size(); i++)
		{
			int j = i + 1;
			print += j + ": " + students.get(i).getFirstName() + " " + students.get(i).getLastName() + "    (" + students.get(i).getDateOfBirth() + ")\n";
		}
		
		
		return print;
	}
	
}
