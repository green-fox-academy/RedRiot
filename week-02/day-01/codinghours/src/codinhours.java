public class codinhours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //

    double week , hours, work ;
    week = 17;
    hours = 6;
    work = week * hours * 5;

    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    double perc, max;
    max = 52;

    perc = work /(week * max)*100;
    System.out.println(work);
    System.out.println(perc + "%");


  }
}
