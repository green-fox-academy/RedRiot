public class Sponsor extends Person {
  private String company;
  private int hiredStudents= 0;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;

  }

  public void setHiredStudents(int hiredStudents) {
    this.hiredStudents = hiredStudents;
  }

  public Sponsor() {
    super("Jane doe",30,"female");
  }

  //Methods


  @Override
  public void introduce() {
    super.introduce();
  }

  public void hire() {
    hiredStudents = hiredStudents + 1;
   // System.out.println(hiredStudents);
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

}
