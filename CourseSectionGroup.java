import java.util.*;

class CourseSectionGroup
{
	ArrayList<CourseSection> sections = new ArrayList<>();
	
	public void add(CourseSection c)
	{
		sections.add(c);
	}
	
	public void remove(CourseSection c)
	{
		sections.remove(c);
	}
	
	public void remove(int index)
	{
		sections.remove(index);
	}	
	
	public CourseSection get(int index)
	{
		return sections.get(index);
	}
	
	public int size()
	{
		return sections.size();
	} 
	
	
	public void courseSectionCheck(Student y)
	{
		int j = 1;
		for(int i = 0; i < sections.size(); i++)
		{
			if(sections.get(i).courseSectionStudentCheck(y) == true);
			{
				System.out.println(j + ":   Name: " + sections.get(i).getCourse().getName() + "  Teacher: " + sections.get(i).getTeacher().getFirstName() + " " + sections.get(i).getTeacher().getLastName() + "  Subject: " + sections.get(i).getCourse().getSubject() + "  Location: " + sections.get(i).getLocation());
				j++;
			}
		}
	}
	
	@Override
	public String toString()
	{
		Collections.sort(sections);
		String print = "";
		for(int i = 0; i < sections.size(); i++)
		{
			int j = i + 1;
			print += j + ":   Name: " + sections.get(i).getCourse().getName() + "  Teacher: " + sections.get(i).getTeacher().getFirstName() + " " + sections.get(i).getTeacher().getLastName() + "  Subject:" + sections.get(i).getCourse().getSubject() + "  Location: " + sections.get(i).getLocation() + "\n";
		}
		
		
		return print;
	}
}
