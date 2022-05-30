import java.util.*;

class TeacherGroup
{
	ArrayList<Teacher> teachers = new ArrayList<>();
	
	public void add(Teacher t)
	{
		teachers.add(t);
		Collections.sort(teachers);
	}
	
	public void remove(Teacher t)
	{
		teachers.remove(t);
	}
	
	public void remove(int index)
	{
		teachers.remove(index);
	}	
	
	public int get(Teacher t)
	{
		for(int i = 0; i < teachers.size(); i++)
		{
			if(teachers.get(i) == t)
			{
				return i;
			}
		}
		return -1;
	}
	
	public Teacher get(int index)
	{
		return teachers.get(index);
	}
	
	public int size()
	{
		return teachers.size();
	}
	
	@Override
	public String toString()
	{
		Collections.sort(teachers);
		String print = "";
		for(int i = 0; i < teachers.size(); i++)
		{
			int j = i + 1;
			print += j + ": " + teachers.get(i) + "\n";
		}
		
		
		return print;
	}
}
