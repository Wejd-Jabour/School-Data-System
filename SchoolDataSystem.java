import java.util.Scanner;
import java.time.LocalDate;
import java.util.*;

class SchoolDataSystem
{
	
	private StudentGroup studentList;
	private CourseGroup courseList;
	private CourseSectionGroup courseSectionList;
	private TeacherGroup teacherList;
	
	private int currentMenu = 0;
	private final int Main_Menu = 0;
	private final int Student_Menu = 1;
	private final int Teacher_Menu = 2;
	private final int Course_Menu = 3;
	private final int CourseSection_Menu = 4;
	private final int Exit = 5;
	
	public static Scanner in = new Scanner(System.in);
	
	public SchoolDataSystem()
	{
		studentList = new StudentGroup();
		courseList = new CourseGroup();
		courseSectionList = new CourseSectionGroup();
		teacherList = new TeacherGroup();
	}
	


	public void run()
	{
		do
		{
			if(currentMenu == Main_Menu)
				mainMenu();
			
			if(currentMenu == Student_Menu)
				studentMenu();
			
			if(currentMenu == Teacher_Menu)
				teacherMenu();
			
			if(currentMenu == Course_Menu)
				courseMenu();
			
			if(currentMenu == CourseSection_Menu)
				courseSectionMenu();
			
		}
		while(currentMenu != Exit);
		System.out.println("Farewell");
		
	}
	
	public void mainMenu()
	{
		System.out.println("******************************");
		System.out.println("Welcome to St. Mary's School Directory");
		System.out.println("******************************");
		System.out.println();
		System.out.println("1. Students");
		System.out.println("2. Teachers");
		System.out.println("3. Courses");
		System.out.println("4. Course Section");
		System.out.println("5. Exit");
		System.out.println();
		System.out.println("Which section do you want to go to?");
		int input = in.nextInt();
		clear();
		currentMenu = input;
	}
	
	public void studentMenu()
	{
		System.out.println("******************************");
		System.out.println("STUDENT MENU");
		System.out.println("******************************");
		System.out.println();
		System.out.println("1. Add Student");
		System.out.println("2. Remove Student");
		System.out.println("3. View Student Info");
		System.out.println("4. List Students");
		System.out.println("5. Back to Main_Menu");
		System.out.println();
		System.out.println("What would you like to to?");
		int input = in.nextInt();
		clear();
		if(input == 1)
		{
			System.out.println("Enter Student's First Name");
			String fname = in.next();
			
			System.out.println();
			
			System.out.println("Enter Student's Last Name");
			String lname = in.next();
			
			System.out.println();
			
			System.out.println("Enter Student's ID");
			int iD = in.nextInt();
			
			System.out.println();
			
			System.out.println("Enter Year of Birth --- (yyyy)");
			int year = in.nextInt();
			System.out.println("Enter Month of Birth --- (mm)");
			int month = in.nextInt();
			System.out.println("Enter Date of Birth --- (dd)");
			int date = in.nextInt();
			
			Student s = new Student(iD, fname, lname, LocalDate.of(year, month, date));
			studentList.add(s);
			
			clear();
		}
		
		if(input == 2)
		{
			System.out.println(studentList);
			System.out.println("Which index would you like to remove?");
			int input2 = in.nextInt();
			studentList.remove(input2 - 1);
			clear();
		}
		
		if(input == 3)
		{
			clear();
			System.out.println(studentList);
			System.out.println("Which Student's Info Are You Looking For?");
			int input2 = in.nextInt();
			clear();
			System.out.println(studentList.get(input2 - 1));
			courseSectionList.courseSectionCheck(studentList.get(input2 - 1));
			System.out.println();
			System.out.println();
			
		}
		
		if(input == 4)
		{
			clear();
			System.out.println(studentList);
		}
		
		if (input == 5)
		{
			currentMenu = 0;
			clear();
		}
		
	
	}
	
	public void teacherMenu()
	{
		System.out.println("******************************");
		System.out.println("TEACHER MENU");
		System.out.println("******************************");
		System.out.println();
		System.out.println("1. Add Teacher");
		System.out.println("2. Remove Teacher");
		System.out.println("3. List Teachers");
		System.out.println("4. Back to Main_Menu");
		System.out.println();
		System.out.println("What would you like to to?");
		int input = in.nextInt();
		clear();
		
		if(input == 1)
		{
			System.out.println("Enter Teacher's First Name");
			String fname = in.next();
			
			System.out.println();
			
			System.out.println("Enter Teacher's Last Name");
			String lname = in.next();
			
			System.out.println();
			
			System.out.println("Enter Teacher's ID");
			int iD = in.nextInt();
			
			Teacher t = new Teacher(iD, fname, lname);
			
			teacherList.add(t);
			clear();
			
		}
		
		else if(input == 2)
		{
			System.out.println(teacherList);
			System.out.println("Which index would you like to remove?");
			int input2 = in.nextInt();
			teacherList.remove(input2 - 1);
			clear();
		}
		
		else if(input == 3)
		{
			clear();
			System.out.println(teacherList);
		}
		
		else if (input == 4)
		{
			currentMenu = 0;
			clear();
		}
		
	
	}
	
	
	public void courseMenu()
	{
		System.out.println("******************************");
		System.out.println("COURSE MENU");
		System.out.println("******************************");
		System.out.println();
		System.out.println("1. Add Course");
		System.out.println("2. Remove Course");
		System.out.println("3. View Course Info");
		System.out.println("4. List Courses");
		System.out.println("5. Back to Main_Menu");
		System.out.println();
		System.out.println("What would you like to to?");
		int inp = in.nextInt();
		clear();
		if(inp == 1)
		{
			in.nextLine();
			System.out.println("Enter course name");
			String name = in.nextLine();
			
			System.out.println();
			
			System.out.println("Choose subject");
			System.out.println("1. COMPUTER_STUDIES");
			System.out.println("2. BUSINESS");
			System.out.println("3. MATH");
			System.out.println("4. MUSIC");
			System.out.println("5. TECHNOLOGY");
			int subj = in.nextInt();
			Subject subjectf = subjectConvert(subj);
			
			System.out.println();
			
			System.out.println("Enter code");
			String code = in.next();
			
			System.out.println();
			
			System.out.println("Enter grade");
			int grade = in.nextInt();
			
			System.out.println();
			
			System.out.println("Choose level");
			System.out.println("1. OPEN");
			System.out.println("2. MIXED");
			System.out.println("3. COLLEGE");
			System.out.println("4. UNIVERSITY");
			int level = in.nextInt();
			Level levelf = levelConvert(level);
			
			System.out.println();
			in.nextLine();
			System.out.println("Enter description");
			String description = in.nextLine();
			
			Course c = new Course(name, subjectf, code, grade, levelf, description);
			
			courseList.add(c);
			clear();
		}
		
		if(inp == 2)
		{
			System.out.println(courseList);
			System.out.println("Which index would you like to remove?");
			int input2 = in.nextInt();
			courseList.remove(input2 - 1);
			clear();
		}
		
		if(inp == 3)
		{
			System.out.println(courseList);
			System.out.println("Which course info would you like to view?");
			int input2 = in.nextInt();
			clear();
			System.out.println(courseList.get(input2 - 1));
		}
		
		if(inp == 4)
		{
			clear();
			System.out.println(courseList);
		}
		
		if (inp == 5)
		{
			currentMenu = 0;
			clear();
		}
	}
	
	
	public void courseSectionMenu()
	{
		System.out.println("******************************");
		System.out.println("COURSE SECTION MENU");
		System.out.println("******************************");
		System.out.println();
		System.out.println("1. Add Course Section");
		System.out.println("2. Remove Course Section");
		System.out.println("3. Add Students to Course Section");
		System.out.println("4. Remove Students to Course Section");
		System.out.println("5. View a Course Section's Info");
		System.out.println("6. List Course Sections");
		System.out.println("7. Back to Main_Menu");
		System.out.println();
		System.out.println("What would you like to to?");
		int input = in.nextInt();
		clear();
		if(input == 1)
		{
			System.out.println(courseList);
			System.out.println("Choose a Course");
			int subj = in.nextInt();
			
			
			System.out.println();
			
			System.out.println(teacherList);
			System.out.println("Choose a Teacher");
			int teach = in.nextInt();
			
			System.out.println();
			
			System.out.println("1. RM01");
			System.out.println("2. RM02");
			System.out.println("3. RM03");
			System.out.println("4. RM04");
			System.out.println("5. RM05");
			System.out.println("6. RM06");
			System.out.println("Enter Location");
			int location = in.nextInt();
			
			Location l = locationConverter(location);
			
			System.out.println();
			
			Teacher t = teacherConverter(teach);
			
			CourseSection cs = new CourseSection(courseList.get(subj - 1), new StudentGroup(), t, l);
			courseSectionList.add(cs);
			clear();
		}
		
		if(input == 2)
		{
			System.out.println(courseSectionList);
			System.out.println("Which index would you like to remove?");
			int input2 = in.nextInt();
			courseSectionList.remove(input2 - 1);
			clear();
		}
		
		if(input == 3)
		{
			clear();
			System.out.println(courseSectionList);
			System.out.println("Which Course Section Would You Like to Add a Student to?");
			int csChoice = in.nextInt();
			System.out.println();
			System.out.println(studentList);
			System.out.println("Which Student's Would You Like to Add?");
			int input2 = in.nextInt();
			courseSectionList.get(csChoice-1).addStudent(studentList.get(input2 - 1));
		}
		
		if(input == 4)
		{
			
			clear();
			System.out.println(courseSectionList);
			System.out.println("Which Course Section Would You Like to Remove a Student from?");
			int csChoice = in.nextInt();
			System.out.println();
			courseSectionList.get(csChoice-1).listStudents();
			System.out.println("Which Student's Would You Like to Remove?");
			int input2 = in.nextInt();
			courseSectionList.get(csChoice-1).removeStudent(input2-1);
			
		}
		
		if(input == 5)
		{
			clear();
			System.out.println(courseSectionList);
			System.out.println("Which Course Section Would You Like to View?");
			int csChoice = in.nextInt();
			System.out.println();
			System.out.println(courseSectionList.get(csChoice-1));
		}
		
		if(input == 6)
		{
			clear();
			System.out.println(courseSectionList);
		}
		
		if (input == 7)
		{
			currentMenu = 0;
			clear();
		}
		
	}
	
	
	public static Subject subjectConvert(int s)
	{
		if(s == 1)
			return Subject.COMPUTER_STUDIES;
			
		if(s == 2)
			return Subject.BUSINESS;
			
		if(s == 3)
			return Subject.MATH;
			
		if(s == 4)
			return Subject.MUSIC;
		
		return Subject.TECHNOLOGY;
	}
	
	public static Level levelConvert(int l)
	{
		if(l == 1)
			return Level.O;
			
		if(l == 2)
			return Level.M;
			
		if(l == 3)
			return Level.C;
		
		return Level.U;
	}
	
	public Teacher teacherConverter(int t)
	{
		return teacherList.get(t-1);
	}
	
	public Location locationConverter(int i)
	{
		if(i == 1)
			return Location.RM01;
		if(i == 2)
			return Location.RM02;
		if(i == 3)
			return Location.RM03;
		if(i == 4)
			return Location.RM04;
		if(i == 5)
			return Location.RM05;
			
		return Location.RM06;
			
	}
	
	public void clear()
	{
		for(int i = 0; i < 60; i++)
		{
			System.out.println();
		}
	}
	
	public void autoAdd()
	{
		Student d = new Student(510010076, "Scott", "Barron", LocalDate.of(2004, 05, 03));
		Student s = new Student(510010077, "Jeannine", "Simmons", LocalDate.of(2004, 03, 06));
		Student r = new Student(510010078, "Fredric", "Hodge", LocalDate.of(2007, 11, 12));
		Student d1 = new Student(510053076, "Paige", "Robles", LocalDate.of(2005, 12, 30));
		Student s2 = new Student(515624277, "Jim", "Hicks", LocalDate.of(2005, 8, 9));
		Student r3 = new Student(515632486, "Alicia", "Fuller", LocalDate.of(2004, 01, 25));
		
		studentList.add(d);
		studentList.add(s);
		studentList.add(r);
		studentList.add(d1);
		studentList.add(s2);
		studentList.add(r3);
		
		Teacher t0 = new Teacher(5213891, "Dustin", "Wilkinson");
		Teacher t1 = new Teacher(5853891, "Leona", "Boyle");
		Teacher t2 = new Teacher(5213753, "Sanford", "Medina");
		Teacher t3 = new Teacher(5213245, "Adalberto", "Ellis");
		Teacher t4 = new Teacher(5853562, "Bret", "Pitts");
		Teacher t5 = new Teacher(5275553, "Dianne", "Kirk");
		Teacher t6 = new Teacher(5213256, "Kip", "Hooper");
		
		teacherList.add(t0);
		teacherList.add(t1);
		teacherList.add(t2);
		teacherList.add(t3);
		teacherList.add(t4);
		teacherList.add(t5);
		teacherList.add(t6);
		
		Course c = new Course("Calculus", Subject.MATH, "CALC01", 12, Level.U, "This course builds on students’ previous experience with functions and their developing understanding of rates of change. Students will solve problems involving geometric and algebraic representations of vectors and representations of lines and planes in three dimensional space; broaden their understanding of rates of change to include the derivatives of polynomial, sinusoidal, exponential, rational, and radical functions; and apply these concepts and skills to the modelling of real-world relationships. Students will also refine their use of the mathematical processes necessary for success in senior mathematics. This course is intended for students who choose to pursue careers in fields such as science, engineering, economics, and some areas of business, including those students who will be required to take a university-level calculus, linear algebra, or physics course.");
		Course b = new Course("Business", Subject.BUSINESS, "BUS101", 9, Level.M, "This course introduces students to information and communication technology in a business environment and builds a foundation of digital literacy skills necessary for success in a technologically driven society. Students will develop word processing, spreadsheet, database, desktop publishing, presentation software, and website design skills. Throughout the course, there is an emphasis on digital literacy, effective electronic research and communication skills, and current issues related to the impact of information and communication technology.");
		Course m = new Course("Chemistry", Subject.SCIENCE, "CHM201", 11, Level.C, "This course enables students to deepen their understanding of chemistry through the study of the properties of chemicals and chemical bonds; chemical reactions and quantitative relationships in those reactions; solutions and solubility; and atmospheric chemistry and the behaviour of gases. Students will further develop their analytical skills and investigate the qualitative and quantitative properties of matter, as well as the impact of some common chemical reactions on society and the environment.");
		Course tx = new Course("Religious Education", Subject.TECHNOLOGY, "REL018", 9, Level.O, "This course both invites and challenges the adolescent to personalize the Gospel values and social justice principles that guide Catholics in understanding their role in shaping culture as disciples of Jesus. Students will explore such foundational topics as: what it means to be human, created in God’s image, what is culture, Christ and culture, living together in solidarity, social justice, prayer and sacrament, friendship and intimacy. Connections between the living Church and contemporary culture are explored in terms of what it means to be a responsible Christian adolescent in a secularized, pluralistic world.");
		Course csi = new Course("Computer Science", Subject.COMPUTER_STUDIES, "CPS255", 12, Level.U, "This course enables students to further develop knowledge and skills in computer science. Students will use modular design principles to create complex and fully documented programs, according to industry standards. Student teams will manage a large software development project, from planning through to project review. Students will also analyse algorithms for effectiveness. They will investigate ethical issues in computing and further explore environmental issues, emerging technologies, areas of research in computer science, and careers in the field.");
		courseList.add(c);
		courseList.add(csi);
		courseList.add(b);
		courseList.add(m);
		courseList.add(tx);
		
		
		
	}
	
	public static void main(String[] args)
	{
		SchoolDataSystem school = new SchoolDataSystem();
		school.autoAdd();
		school.run();
		
	}
}

