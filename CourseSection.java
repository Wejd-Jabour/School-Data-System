class CourseSection implements Comparable<CourseSection>
{
	Course course;
	StudentGroup students;
	Teacher teacher;
	Location location;
	
	CourseSection(Course course, StudentGroup students, Teacher teacher, Location location)
	{
		this.course = course;
		this.students = students;
		this.teacher = teacher;
		this.location = location;
	}
	
	public Course getCourse()
	{
		return this.course;
	}
	
	public Teacher getTeacher()
	{
		return this.teacher;
	}
	
	public Location getLocation()
	{
		return this.location;
	}
	
	public void setLocation(Location l)
	{
		this.location = l;
	}
	
	public void setCourse(Course c)
	{
		this.course = course;
	}
	
	public void setTeacher(Teacher t)
	{
		this.teacher = teacher;
	}
	
	public void addStudent(Student s)
	{
		students.add(s);
	}
	
	public void removeStudent(int index)
	{
		students.remove(index);
	}
	
	public void listStudents()
	{
		System.out.println(students);
		
	}
	
	public int compareTo(CourseSection cs)
	{
		if(this.course.compareTo(cs.course) == 0)
		{
			return this.teacher.compareTo(cs.teacher);
		}
		return this.course.compareTo(cs.course);
	}
	
	public boolean courseSectionStudentCheck(Student z)
	{
		for(int i = 0; i < students.size();i++)
		{
			if(this.students.get(i).equals(z))
			{
				return true;
			}
		}
		return false;

	}
	
	@Override
	public String toString()
	{
		String print = "";
		print += course;
		print += location + "\n";
		print +=  "\n";
		print += "Students \n";
		print += students + "\n";
		return print;
	}
	
}
