import java.util.ArrayList;
import java.util.List;

public class PallidaClass {
  private String classname;
  private List<Student> students = new ArrayList<>();
  private List<Mentor> mentors = new ArrayList<>();

  public String getClassname() {
    return classname;
  }

  public void setClassname(String classname) {
    this.classname = classname;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public List<Mentor> getMentors() {
    return mentors;
  }

  public void setMentors(List<Mentor> mentors) {
    this.mentors = mentors;
  }

  public PallidaClass( List<Student> students, List<Mentor> mentors) {

    this.students = students;
    this.mentors = mentors;
  }

  public PallidaClass(String classname) {
    this.classname = classname;
  }

  //Method
  public void addStudent(Student student) {
    students.add(student);

  }
  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println(classname);
  }
}

