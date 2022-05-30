import java.util.Scanner;

class School
{
	/**
	public class School()
	{
		private StudentGroup studentList;
		private CourseGroup courseList;
		private CourseSectionGroup courseSectionList;
		private TeacherGroup teacherList;
		private int currentMenu;
		
		private final int Main_Menu = 0;
		private final int Students = 1;
		private final int Teachers = 2;
		private final int Courses = 3;
		
		
	}
	**/
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		mainMenu();
		
	}
	
	
	public static void mainMenu()
	{
		System.out.println("Welcome to St. Mary's School Directory");
		System.out.println("1. Students");
		System.out.println("2. Teachers");
		System.out.println("3. Courses");
		System.out.println("4. Course Section");
		System.out.println("Which section do you want to go to?");
		int input = in.nextInt();
		
		if(input == 1)
		{
			
		}
		
		else if(input == 2)
		{
			
			
		}
		
		else if(input == 3)
		{
			courseMenu();
		}
		
		else if(input == 4)
		{
			
			
		}
		
		else
		{
			
		}
		
	}
	
	
	public static void courseMenu()
	{
		System.out.println("COURSES");
		System.out.println("1. Add Course");
		System.out.println("2. Remove Course");
		System.out.println("3. List Courses");
		System.out.println("What would you like to to?");
		int input = in.nextInt();
		
		if(input == 1)
		{
			System.out.println("Enter course name");
			String name = in.next();
			
			System.out.println("Enter subject");
			String subject = in.next();
			
			System.out.println("Enter code");
			String code = in.next();
			
			System.out.println("Enter grade");
			int grade = in.nextInt();
			
			System.out.println("Enter level");
			String level = in.next();
			
			System.out.println("Enter description");
			String description = in.next();
			
			
		}
		
		else if(input == 2)
		{
			
			
		}
		
		else if(input == 3)
		{
			
		}
		
		else
		{
			
		}
		
	}
	
	public static Subject convert(String s)
	{
		return Subject.BUSINESS;
	}
	
	public static void clear()
	{
		for(int i = 0; i < 40; i++)
		{
			System.out.println();
		}
	}
}
