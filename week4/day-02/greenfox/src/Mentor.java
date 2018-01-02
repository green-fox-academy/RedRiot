public class Mentor extends Person {
  private String level;


  public Mentor(String name, int age, String gender, String level) {

    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super("Jane doe",30,"female");
  }


  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }


  // Method

  public void level() {
    System.out.println(getLevel());
  }

  @Override
  public void introduce() {
     System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getAge());
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
