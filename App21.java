 class Student 
{
     private String name;
     private String email;
     
     public String getName()
     {
    	 return name;
     }
     public String getEmail()
     {
    	 return email;
     }
     
     public void setName(String n)
     {
    	 if(n.length()<3)
    	 {
    		 this.email="Invalid Email";
    	 }
    	 else
    	 {
    		 this.name=n;
    	 }
    	 
     }
     
     
     public void setEmail(String e)
     {
    	 if(e.indexOf("@")==-1)
    	 {
    		 this.email="Invalid Email";
    	 }
    	 else
    	 {
    		 this.email=e;
    	 }
     }
}


public class App21 
{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("sam  ");
		s1.setEmail("ss@ss.com");
		
		System.out.println("Name:"+s1.getName()+"Email:"+s1.getEmail());	}
}
