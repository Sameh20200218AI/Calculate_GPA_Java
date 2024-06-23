import java.util.*;;
public class Main {
  public static void print(Course [] courses_)
  {
    for(int i=0;i<courses_.length;i++)
    {
      System.out.println("For " + (i+1 )+ " st course");
      System.out.println("----------------");
       courses_[i].print_course();
       System.out.println(" ");
    }
   
    System.out.println("----------------------------------------------------------");
    more_info_about_courses(courses_);
  }
  public static void more_info_about_courses(Course [] Courses_)
  {
    int cnt_a=0,cnt_b=0,cnt_c=0,cnt_d=0,cnt_f=0;
    int cnt_aP=0,cnt_bP=0,cnt_cP=0,cnt_dP=0;
    int course_has_two_hours=0,course_has_three_hours=0,course_has_zero_hours=0,course_has_one_hours=0;
    for(int i=0;i<Courses_.length;i++)
    {
      if(Courses_[i].get_hours()==0)
      course_has_zero_hours++;
      else if(Courses_[i].get_hours()==1)
      course_has_one_hours++;
      else if(Courses_[i].get_hours()==2)
      course_has_two_hours++;
      else if(Courses_[i].get_hours()==3)
      course_has_three_hours++;

      if(Courses_[i].get_grade()=="A")
      cnt_a++;
      else if(Courses_[i].get_grade()=="A+")
      cnt_aP++;
      else if(Courses_[i].get_grade()=="B+")
      cnt_bP++;
      else if(Courses_[i].get_grade()=="B")
      cnt_b++;
      else if(Courses_[i].get_grade()=="C+")
      cnt_cP++;
      else if(Courses_[i].get_grade()=="C")
      cnt_c++;
      else if(Courses_[i].get_grade()=="D+")
      cnt_dP++;
      else if(Courses_[i].get_grade()=="D")
      cnt_d++;
      else if(Courses_[i].get_grade()=="F")
      cnt_f++;

    }
    System.out.println("Number of courses that has zero hours are : " + course_has_zero_hours);
    System.out.println("Number of courses that has one hours are : " + course_has_one_hours);
    System.out.println("Number of courses that has two hours are : " + course_has_two_hours);
    System.out.println("Number of courses that has three hours are : " + course_has_three_hours);
    System.out.println("Number of courses that your grade is A+ : " + cnt_aP);
    System.out.println("Number of courses that your grade is A : " + cnt_a);
    System.out.println("Number of courses that your grade is B+ : " + cnt_bP);
    System.out.println("Number of courses that your grade is B : " + cnt_b);
    System.out.println("Number of courses that your grade is C+ : " + cnt_cP);
    System.out.println("Number of courses that your grade is C : " + cnt_c);
    System.out.println("Number of courses that your grade is D+ : " + cnt_dP);
    System.out.println("Number of courses that your grade is D : " + cnt_d);
    System.out.println("Number of courses that your grade is F : " + cnt_f);

  }
  public static int calculate_totalHours(Course [] Courses_)
  {
    int sum = 0;
    for(int i=0;i<Courses_.length;i++)
    sum+= Courses_[i].get_hours();
    return sum;
  }
  public static double hours_multiply_by_values_of_grades(Course [] Courses_)
  {
    double mult = 0;
    for(int i=0;i<Courses_.length;i++)
    {
      mult += Courses_[i].get_hours()* Courses_[i].gpa_points_for_grade(Courses_[i].get_grade());
    }
    return mult;
  }
  public static double calculate_GPA(double t_hours_mult_grade_points,int t_hours)
  {
    return (t_hours_mult_grade_points / t_hours);
  }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of courses");
        String num_of_courses = input.nextLine(); 
        int ns = Integer.parseInt(num_of_courses);
        Course courses []= new Course [ ns];
    for(int i=0;i<ns;i++)
      {
        System.out.println("For " + (i+1) + " st course ");
        System.out.println("----------------");
        System.out.println("Enter name of the course");
        String n = input.nextLine();
        System.out.println("Enter code of the course");
        String c = input.nextLine();
        System.out.println("Enter hours of the course");
        String h = input.nextLine();
        while(Integer.parseInt(h)<0)
        {
          System.out.println("Enter hours of the course again : ");
           h = input.nextLine();

        }
        System.out.println("Enter marks of the course");
        String m = input.nextLine();
        while(Integer.parseInt(m)<0 ||Integer.parseInt(m)>100)
        {
          System.out.println("Enter total marks of the course again : ");
           m= input.nextLine();

        }
        courses[i] =new Course(n,c,Integer.parseInt(h), Integer.parseInt(m));

        System.out.println();
        
     }
     System.out.println("----------------------------------------------------------");
     
     print(courses);
     if(calculate_totalHours(courses)==0)
     {
        System.out.println("Your GPA is : 0.0");
     }
     else
     {
      System.out.println("Your GPA is : " + calculate_GPA(hours_multiply_by_values_of_grades(courses),calculate_totalHours(courses)));
     }
     
    
  }
}
