package com.capgemini;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class JdbcPreparedStatement {
	public static void main(String args[])
	{
		Connection con=null;
		//Statement stmt=null;
		PreparedStatement stmt=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con=(Connection) DriverManager.getConnection("jdbc:mysql://10.102.54.157:3306/mullapudi","mraghura","password");
			
			//stmt=(Statement) con.createStatement();
			//stmt.execute("create table marks(rno int not NULL, mark int not NULL, PRIMARY KEY(rno))");
			
			stmt = (PreparedStatement) con.prepareStatement("create table marks(rno int not NULL, mark int not NULL, PRIMARY KEY(rno))");
			//stmt = (PreparedStatement) con.prepareStatement("insert into marks(rno,mark) values(1,527),(2,526),(3,937),(4,935),(5,938)");
			
			stmt.execute("insert into marks(rno,mark) values(6,527)");
			
			printResults(stmt.executeQuery("select rno,mark from marks"));
			
			stmt.executeUpdate("update marks set mark=936 where rno=4");
			stmt.executeUpdate("delete from marks where rno=3");
			
			System.out.println("------------------------------------------");
			printResults(stmt.executeQuery("select rno,mark from marks"));
			
			//stmt.execute("drop table marks");
		    
		    stmt.close();
		    con.close();
		}
		catch(ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		catch(SQLException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	static void printResults(ResultSet rs)
	{
		try 
		{
			while(rs.next())
			{
			     int rno  = rs.getInt("rno");
			     int mark  = rs.getInt("mark");
			     
			     System.out.print("For RoLL Number " + rno);
			     System.out.println(" marks are : " + mark);
			     
			}
			rs.close();
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
