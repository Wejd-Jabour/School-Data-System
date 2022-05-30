import java.util.*;

class CourseGroup
{
	ArrayList<Course> courses = new ArrayList<>();
	
	public void add(Course c)
	{
		courses.add(c);
		Collections.sort(courses);
	}
	
	public void remove(Course c)
	{
		courses.remove(c);
	}
	
	public void remove(int index)
	{
		courses.remove(index);
	}	
	
	public Course get(int index)
	{
		return courses.get(index);
	}
	
	public int get(Course c)
	{
		for(int i = 0; i < courses.size(); i++)
		{
			if(courses.get(i) == c)
			{
				return i;
			}
		}
		return -1;
	}
	
	public int size()
	{
		return courses.size();
	} 
	
	@Override
	public String toString()
	{
		Collections.sort(courses);
		String print = "";
		for(int i = 0; i < courses.size(); i++)
		{
			int j = i + 1;
			print += j + ": " + courses.get(i).getName() + "  Subject: " + courses.get(i).getSubject() + "  Grade: " + courses.get(i).getGrade() + " Level: " + courses.get(i).getLevel() + "\n";
		}
		
		
		return print;
	}
}
