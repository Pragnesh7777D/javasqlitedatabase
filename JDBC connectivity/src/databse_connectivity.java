import java.sql.*;
import java.time.LocalDate;
import java.text.*;

import java.util.*;
import java.util.Date;
public class databse_connectivity {
	
 
	public static void main(String[] args)throws Exception {
		 date d = new date();
		 d.getdate();
		System.out.println( d.updatemonth(1));
		 Connection c = null;
		 Statement stmt = null;
		 PreparedStatement ptmt = null;
	 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("1.for book");
		 System.out.println("2.for employee");
		 System.out.println("3.for issue");
		 System.out.println("4.search");
		 int k = sc.nextInt();
		 
		 if(k==1) {
		 
		 System.out.println("1.for addition");
		 System.out.println("2.for list");
		 System.out.println("3.for deletion");
		 System.out.println("4.or update");
		 int n = sc.nextInt();
	      
//		 try {
//		      Class.forName("org.sqlite.JDBC");
//		      c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Shree Ganesha\\Downloads\\jar_files\\test23");
//		      System.out.println("Opened database successfully");
//		      stmt = c.createStatement();
//
//		      String sql = "CREATE TABLE BOOKS(ID INT PRIMARY KEY , NAME TEXT, AUTHER_NAME TEXT)";
//		   	  stmt.executeUpdate(sql);
//		   	  stmt.close();
//		   	  c.close();
//	      	}catch ( Exception e ) {
//	            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//	            System.exit(0);
//	         }
//	         System.out.println("Table BOOKS created successfully");
		 if(n==1) {
	      try {
	    	 
	          Class.forName("org.sqlite.JDBC");
	          c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Shree Ganesha\\Downloads\\jar_files\\test23");
	          c.setAutoCommit(false);

	          System.out.println("enter unique book id");
              int ID =sc.nextInt();
	          System.out.println("enter unique book name");
	          sc.nextLine();
	          String NAME =sc.nextLine();
	          System.out.println("enter unique book auther");

	          String AUTHER_NAME  = sc.next();
	          System.out.println("Opened database successfully");
	          stmt = c.createStatement();
	          String sql = "INSERT INTO BOOKS (ID,NAME,AUTHER_NAME) " +
	                         "VALUES ("+ID+", ' "+NAME+ "',  '"+AUTHER_NAME+"' );"; 
	          stmt.executeUpdate(sql);
	          
	          c.commit();
	          c.close();
	       } catch ( Exception e ) {
	          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	          System.exit(0);
	       }
	       System.out.println("Records created successfully");
		 }
	
		 
		 
		 
		 else if(n==2) {
			 
			 try {
			      Class.forName("org.sqlite.JDBC");
			      c = DriverManager.getConnection("jdbc:sqlite:C:\\\\Users\\\\Shree Ganesha\\\\Downloads\\\\jar_files\\\\test23");
			      c.setAutoCommit(false);
			      System.out.println("Opened database successfully");

			      stmt = c.createStatement();
			      ResultSet rs = stmt.executeQuery( "SELECT * FROM BOOKS;" );
			      
			      while ( rs.next() ) {
			         int id = rs.getInt("ID");
			         String  name = rs.getString("NAME");
			         String age  = rs.getString("AUTHER_NAME");
			       
			         System.out.println( "ID = " + id );
			         System.out.println( "NAME = " + name );
			         System.out.println( "AUTHER_NAME = " + age );
			    
			         System.out.println();
			      }
			      rs.close();
			      stmt.close();
			      c.close();
			   } catch ( Exception e ) {
			      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			      System.exit(0);
			   }
			   System.out.println("Operation done successfully");

		 }else if(n==3) {
			 try {
		         Class.forName("org.sqlite.JDBC");
		         c = DriverManager.getConnection("jdbc:sqlite:C:\\\\Users\\\\Shree Ganesha\\\\Downloads\\\\jar_files\\\\test23");
		         c.setAutoCommit(false);
		         System.out.println("Opened database successfully");
		         System.out.println("enter id you want to delete");
		         int ID = sc.nextInt();
		         stmt = c.createStatement();
		         String sql = "DELETE from BOOKS where ID="+ ID+ ";";
		         stmt.executeUpdate(sql);
		         c.commit();
		         stmt.close();
		         c.close();
		         } catch ( Exception e ) {
		            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		            System.exit(0);
		         }
		         System.out.println("Operation done successfully");
		 }else if(n==4) {
			 
			   try {
			      Class.forName("org.sqlite.JDBC");
			      c = DriverManager.getConnection("jdbc:sqlite:C:\\\\Users\\\\Shree Ganesha\\\\Downloads\\\\jar_files\\\\test23");
			      c.setAutoCommit(false);
			      System.out.println("Opened database successfully");
			      System.out.println("ener id in which you want to update");
			      int id = sc.nextInt();
			      System.out.println("enter new book name");
		          sc.nextLine();
			      String name = sc.nextLine(); 
			      System.out.println("enter new auther name");
			      String auther_name = sc.next();
			      stmt = c.createStatement();
			      String sql = "UPDATE BOOKS set NAME ='"+name+"',AUTHER_NAME='"+auther_name+"' where ID="+id+";";
			      stmt.executeUpdate(sql);
			      c.commit();
			      stmt.close();
			      c.close();
		 }catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		   }
		    System.out.println("Operation done successfully");
		 }
		 
		 }else if(k==2) {
			 System.out.println("1.for addition");
			 System.out.println("2.for list");
			 System.out.println("3.for deletion");
			 System.out.println("4.for issue");
			 System.out.println("5.for updte");

			 int p = sc.nextInt();
//			 try {
//		      Class.forName("org.sqlite.JDBC");
//		      c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Shree Ganesha\\Downloads\\jar_files\\test23");
//		      System.out.println("Opened database successfully");
//		      stmt = c.createStatement();
//
//		      String sql = "CREATE TABLE empolyee(ID INT PRIMARY KEY , NAME TEXT ,ISSUED TEXT)";
//		   	  stmt.executeUpdate(sql);
//		   	  stmt.close();
//		   	  c.close();
//	      	}catch ( Exception e ) {
//	            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//	            System.exit(0);
//	         }
//	         System.out.println("Table employee created successfully");
			 if(p==1) {
				 try {
			    	 
			          Class.forName("org.sqlite.JDBC");
			          c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Shree Ganesha\\Downloads\\jar_files\\test23");
			          c.setAutoCommit(false);
			          System.out.println("enter unique emp id");
		              int ID =sc.nextInt();
			          System.out.println("enter unique emp name");
			          sc.nextLine();
			          String NAME =sc.nextLine();
//			          System.out.println("enter unique emp gender");
//
//			          String EMP_GENDER  = sc.next();
			          System.out.println("Opened database successfully");
			          stmt = c.createStatement();
			          String sql = "INSERT INTO EMPs (ID,NAME,ISSUED) " +
			                         "VALUES ("+ID+", ' "+NAME+ "','');"; 
			          stmt.executeUpdate(sql);


			          stmt.close();
			          c.commit();
			          c.close();
			       } catch ( Exception e ) {
			          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			          System.exit(0);
			       }
			       System.out.println("Records created successfully in emplyoee table");
				 
			 }else if(p==2) {
				 
				 try {
				      Class.forName("org.sqlite.JDBC");
				      c = DriverManager.getConnection("jdbc:sqlite:C:\\\\Users\\\\Shree Ganesha\\\\Downloads\\\\jar_files\\\\test23");
				      c.setAutoCommit(false);
				      System.out.println("Opened database successfully");

				      stmt = c.createStatement();
				      ResultSet rs = stmt.executeQuery( "SELECT * FROM EMPs;" );
				      
				      while ( rs.next() ) {
				         int id = rs.getInt("ID");
				         String  name = rs.getString("NAME");
//				         String EMP_GENDER  = rs.getString("EMP_GENDER");
				         String ISSUED  = rs.getString("ISSUED");

				       
				         System.out.println( "ID = " + id );
				         System.out.println( "NAME = " + name );
//				         System.out.println( "AUTHER_NAME = " + EMP_GENDER );
				         System.out.println("ISSUED BOOK= "+ ISSUED);
				    
				         System.out.println();
				      }
				      rs.close();
				      stmt.close();
				      c.close();
				   } catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				   }
				   System.out.println("Operation done successfully");

				 
			 }else if(p==3) {
				 try {
			         Class.forName("org.sqlite.JDBC");
			         c = DriverManager.getConnection("jdbc:sqlite:C:\\\\Users\\\\Shree Ganesha\\\\Downloads\\\\jar_files\\\\test23");
			         c.setAutoCommit(false);
			         System.out.println("Opened database successfully");
			         System.out.println("enter id you want to delete");
			         int ID = sc.nextInt();
			         stmt = c.createStatement();
			         String sql = "DELETE from EMPs where ID="+ ID+ ";";
			         stmt.executeUpdate(sql);
			         c.commit();
			         stmt.close();
			         c.close();
			         } catch ( Exception e ) {
			            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			            System.exit(0);
			         }
			         System.out.println("Operation done successfully");
				 
			 }else if(p==4) 
			 { try
			 	{
		         Class.forName("org.sqlite.JDBC");
		         c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Shree Ganesha\\\\Downloads\\\\jar_files\\\\test23");
		         c.setAutoCommit(false);
		         System.out.println("Opened database successfully");
		       
		         System.out.println("enter book id you want to issue");
		         int IDb = sc.nextInt();
		         stmt = c.createStatement();
		      
		         String sql1 = "SELECT NAME FROM BOOKS  WHERE ID="+IDb+";";
		         ResultSet rs1= stmt.executeQuery(sql1);
		         String b = rs1.getString(IDb);
		                      
		         while(  rs1.next()){
		         System.out.println(b);
		        }
		   
		         System.out.println("enter your id to isuue book");
		         int IDe = sc.nextInt();
		         String sql2 = "UPDATE EMPs SET ISSUED ='"+b+"' WHERE ID="+IDe+";";
		         stmt.executeUpdate(sql2);
		       
		         String sql3 = "SELECT*FROM EMPs";
		          ResultSet rs=  stmt.executeQuery(sql3);
		         while ( rs.next() ) {
			         int id = rs.getInt("ID");
			         String  name = rs.getString("NAME");
//			         String EMP_GENDER  = rs.getString("EMP_GENDER");
			         String ISSUED  = rs.getString("ISSUED");

			       
			         System.out.println( "ID = " + id );
			         System.out.println( "NAME = " + name );
//			         System.out.println( "AUTHER_NAME = " + EMP_GENDE R );
			         System.out.println("ISSUED BOOK= "+ ISSUED);
			    
			         System.out.println();
			      }
		         stmt.close();
		        c.close();
		         } catch ( Exception e ) {
		            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		            System.exit(0);
		         }
		         System.out.println("Operation done successfully");
				 
			 }else if(p==5) {
				  try {
				      Class.forName("org.sqlite.JDBC");
				      c = DriverManager.getConnection("jdbc:sqlite:C:\\\\Users\\\\Shree Ganesha\\\\Downloads\\\\jar_files\\\\test23");
				      c.setAutoCommit(false);
				      System.out.println("Opened database successfully");
				      System.out.println("ener id in which you want to update");
				      int id = sc.nextInt();
				      System.out.println("enter new emp name");
			          sc.nextLine();
				      String name = sc.nextLine(); 
				      System.out.println("enter new  issued");
				      String ISSUED = sc.next();
				      stmt = c.createStatement();
				      String sql = "UPDATE EMPs set NAME ='"+name+"',ISSUED='"+ISSUED+"' where ID="+id+";";
				      stmt.executeUpdate(sql);
				      c.commit();
				      stmt.close();
				      c.close();
			 }catch ( Exception e ) {
			      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			      System.exit(0);
			   }
			    System.out.println("Operation done successfully");
				 
			 }

			 
		 }else if(k==3) {
			 
			 
//			 try {
//			      Class.forName("org.sqlite.JDBC");
//			      c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Shree Ganesha\\Downloads\\jar_files\\test23");
//			      System.out.println("Opened database successfully");
//			      stmt = c.createStatement();
//	
//			      String sql = "CREATE TABLE Issued4(ID INTEGER PRIMARY KEY AUTOINCREMENT , EMP_ID INT, BOOK_ID INT, ISSUE_DATE date , RETURN_DATE date )";
////			      String sql2 = "alter table Issued2 add ISSUED_BOOK2 TEXT";
//			   	  stmt.executeUpdate(sql);
//			   	  stmt.close();
//			   	  c.close();
//		      	}catch ( Exception e ) {
//		            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//		            System.exit(0);
//		         }
//		         System.out.println("table Issued4 created successfully");
			
		    ////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
			 
			 
			 try {
		    	 
		          Class.forName("org.sqlite.JDBC");
		          c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Shree Ganesha\\Downloads\\jar_files\\test23");
		          c.setAutoCommit(false);
		        
	              System.out.println("enter book id to issue");
		          int idb = sc.nextInt();
		          
		          System.out.println("enter emp id");
			      int ide = sc.nextInt();
				          
			      
			      			
				        	 // String sql4 = "insert into Issued4(EMP_ID,BOOK_ID,ISSUE_DATE,RETURN_DATE) values ("+ ide+","+idb+","++",);";
//			 		          PreparedStatement pstmt4 = c.prepareStatement(sql4);
//			 		          pstmt4.setInt(1, ide);
//			 		          pstmt4.setInt(2 ,idb);
//			 		          pstmt4.setInt(3, );
//			 		          pstmt4.executeUpdate();
//			 		          
//			 		          pstmt4.close();
			 		          c.commit();
 		                      c.close();
		 }catch(Exception e) {
			 
			 System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		 } 		          System.out.println("book issued");

    }   else if(k==4) {
    	
    	
    	 try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Shree Ganesha\\Downloads\\jar_files\\test23");
		      System.out.println("1.for employee search");
		      System.out.println("2.for book search");
		      int x = sc.nextInt();
		       if(x==1) {
				      System.out.println("enter employee id to search in database");
				      
				      int ide = sc.nextInt();
				      
				      String sql = "select ISSUED_BOOK1 , ISSUED_BOOK2 ,ISSUED_BOOK3  from Issued3 where EMP_ID=?;";
				      PreparedStatement pstmt = c.prepareStatement(sql);
				      pstmt.setInt(1, ide);
				      ResultSet rs = pstmt.executeQuery();
				      while(rs.next()) {
				    	  System.out.println("emp issued  1."+rs.getString("ISSUED_BOOK1")+" 2."+rs.getString("ISSUED_BOOK2")+" 3."+rs.getString("ISSUED_BOOK3")+" books");
				      }
				      

		       }else if(x==2) {
		    	   	  System.out.println("enter book id to search");
		    	   	  int idb = sc.nextInt();
		    	   	  
		    	   	  String sql = "select NAME from BOOKS where ID=?";
		    	   	  PreparedStatement pstmt = c.prepareStatement(sql);
		    	   	  pstmt.setInt(1, idb);
		    	   	  
		    	   	  ResultSet rs = pstmt.executeQuery();
		    	   	  String sbook = rs.getString("NAME");
		    	   	  
		    	   	  ArrayList<String> al = new ArrayList<>();
			          ArrayList<String> al2 = new ArrayList<>();
			          ArrayList<String> al3 = new ArrayList<>();
			          String oo = "select ISSUED_BOOK1 ,ISSUED_BOOK2,ISSUED_BOOK3 from Issued3;";
			          PreparedStatement op= c.prepareStatement(oo);


			          ResultSet or=  op.executeQuery();

			          while(or.next()){
			        	  al.add(or.getString("ISSUED_BOOK1"));
			        	  al2.add(or.getString("ISSUED_BOOK2"));
			        	  al3.add(or.getString("ISSUED_BOOK3"));
			          }
			          
			          if(al.contains(sbook)) {
			          String sql1 = "select EMP_NAME from Issued3 where ISSUED_BOOK1=?;";	  
			          PreparedStatement p1 = c.prepareStatement(sql1);
			          p1.setString(1, sbook);
			          ResultSet r1 = p1.executeQuery();
			          String s1 = r1.getString("EMP_NAME");
			          
			          System.out.println("employee:-"+s1+" issued "+sbook);
			        	  
			          }else if(al2.contains(sbook)) {
			        	  String sql1 = "select EMP_NAME from Issued3 where ISSUED_BOOK2=?;";	  
				          PreparedStatement p1 = c.prepareStatement(sql1);
				          p1.setString(1, sbook);
				          ResultSet r1 = p1.executeQuery();
				          String s1 = r1.getString("EMP_NAME");
				          
				          System.out.println("employee:-"+s1+" issued "+sbook);
			          }else if(al3.contains(sbook)) {
			        	  String sql1 = "select EMP_NAME from Issued3 where ISSUED_BOOK3=?;";	  
				          PreparedStatement p1 = c.prepareStatement(sql1);
				          p1.setString(1, sbook);
				          ResultSet r1 = p1.executeQuery();
				          String s1 = r1.getString("EMP_NAME");
				          
				          System.out.println("employee:-"+s1+" issued "+sbook);
			          }else {
			        	  System.out.println("book:_"+sbook+" not issued by anyone");
			          }
		       }
		       
		   	    c.close();
	      	   }catch ( Exception e ) {
	            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	            System.exit(0);
	         }
    }
}
static	class date{
	LocalDate d = LocalDate.now();
	Date d1 = new Date();
		public  void getdate() {
			
			SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");

			System.out.println(ft.format(d1));
		}
		public String updatemonth(int x) {
			SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
			d1.setMonth(d1.getMonth()+x);
			return (ft.format(d1));
		}
	}
	
}


