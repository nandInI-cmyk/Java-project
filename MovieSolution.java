import java.util.Scanner;

class Movie
{
 private int  movieId;
 private String  director;
 private int  rating;
 private int  budget;
 
 Movie(int mid,String dtor,int rat,int bud)
 {
   this.movieId=mid;
   this.director=dtor;
   this.rating=rat;
   this.budget=bud;
 }
 
 
int getMovieId() {
  return movieId;
}
void setMovieId(int movieId) {
  this.movieId = movieId;
}
String getDirector() {
  return director;
}
void setDirector(String director) {
  this.director = director;
}
int getRating() {
  return rating;
}
void setRating(int rating) {
  this.rating = rating;
}
int getBudget() {
  return budget;
}
void setBudget(int budget) {
  this.budget = budget;
}
 
 
 

}
public class MovieSolution {

  
  public static int findAvgBudgetByDirector(Movie arr[],String director)
  {
    int bud=0;int cnt=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i].getDirector().equals(director))
      {
        bud =bud+arr[i].getBudget();
        cnt++;
      }
    }
    int res=0;
    if(cnt>0)
    {
       res = bud/cnt;  
    }
    
    return res;
  }
  
  
  public static Movie getMovieByRatingBudget (int rating,int budget, Movie arr[])
  
  {
    Movie m=null;
    for(int i=0;i<arr.length;i++)
    {
      if( arr[i].getRating()==rating && arr[i].getBudget()==budget
          && (arr[i].getBudget()%arr[i].getRating())==0)
      {
        m = arr[i];
      }
    }
    
    
    return m;
  }
  
  public static void main(String[] args) {
    Movie arr[] = new Movie[4];
    Scanner sc = new Scanner(System.in);
    System.out.println("Input");
    for(int i=0;i<arr.length;i++)
    {
      int mid = sc.nextInt();
      sc.nextLine();
      String dtor = sc.nextLine();
      int rat = sc.nextInt();
      int bud=sc.nextInt();
      Movie e = new Movie(mid, dtor, rat, bud);
      arr[i]=e;
    }

    int res = findAvgBudgetByDirector(arr,"ratham");
    if(res>0)
    {
      System.out.println(res);
    }
    else
    {
      System.out.println("Sorry - The given director has not yet directed a movie");
    }
    
    Movie m = getMovieByRatingBudget(5,300,arr);
    if(m==null)
    {
      System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
    }
    else
    {
      System.out.println(m.getMovieId());
    }
  }

}