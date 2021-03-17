package SingletonPattern;

public class DBconn {
   private static DBconn instance=new DBconn();
   private DBconn() {}
   public static DBconn getInstance(){
	      return instance;
	   }
}
