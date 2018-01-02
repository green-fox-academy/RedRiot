public class main {
  public static void main(String[] args) {

    BlogPost post = new BlogPost();
    post.authorName = "John Doe";
    post.publicationDate = "2000.05.04";
    post.title = "Lorem Ipsum";
    post.text = "Lorem ipsum dolor sit amet.";
    System.out.println(post.title + " titled by " + post.authorName + "posted at " + post.publicationDate +"\n"+ post.text);
  }
}
