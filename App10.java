public class App10 {

  public App10()
  {
    
    System.out.println("App10");
  }
  
  public App10(int i)
  {this();
    System.out.println(i);
    
  }
  
  public static void main(String[] args) {
    
    App10 obj = new App10(5);
  }

}