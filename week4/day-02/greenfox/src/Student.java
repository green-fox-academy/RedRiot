
public class Student extends Person {

  private String previousOrganizations;
  private int skippedDays;

  //Methods




public void introduce() {
  System.out.println("Hi, I am " + getName() + " a " + getAge() + " year old" + getGender() + "from " + previousOrganizations + "who skipped " + skippedDays +
          "days from the course already.");
}

  @Override
  public void getGoal() {

    System.out.println("Be a junior software developer");
  }
  public void skipDays(int number) {
    skippedDays = skippedDays+number ;

  }


  public Student(String name, int age, String gender, String previousOrganizations) {
    super(name, age, gender);
    this.previousOrganizations = previousOrganizations;
  }
  public Student(){
    super("Jane doe",30,"female");

  }
}


