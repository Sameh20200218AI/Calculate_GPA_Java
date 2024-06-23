class Course
{
    private String Name;
    private String Code ;
    private int Hours;
    private int Total_marks;
    private String Grade;
    public String get_value_of_grade(int t_marks)
    {
      if(t_marks >=90)
      return "A+";
      else if(t_marks>=85)
      return "A";
      else if(t_marks>=80)
      return "B+";
      else if(t_marks >=75)
      return "B";
      else if(t_marks>=70)
      return "C+";
      else if(t_marks>=65)
      return "C";
      else if (t_marks>=60)
      return "D+";
      else if(t_marks>=50)
      return "D";

      return "F";
    }
    public double gpa_points_for_grade(String g)
    {
        if(g=="A+")
        return 4.0;
        else if(g=="A")
        return 3.7;
        else if(g=="B+")
        return 3.3;
        else if(g=="B")
        return 3;
        else if(g=="C+")
        return 2.7;
        else if(g=="C")
        return 2.4;
        else if(g=="D+")
        return 2.2;
        else if(g=="D")
        return 2.0;

        return 0;
    }
    public Course(String n,String c,int h,int m)
    {
       this.Name = n;
       this.Code = c;
       this.Hours = h;
       this.Total_marks = m;
       this.Grade = get_value_of_grade(m);
    }
    public int get_hours()
    {
        return this.Hours;
    }
    public String get_grade()
    {
        return this.Grade;
    }
    public void print_course()
    {
        System.out.println("The name of the course is : " + this.Name);
        System.out.println("The code of the course is : " + this.Code);
        System.out.println("The hours of the course is : " + this.Hours);
        System.out.println("The total marks of the course is : " + this.Total_marks);
        System.out.println("The Grade of the course is : " + this.Grade);
    }

}