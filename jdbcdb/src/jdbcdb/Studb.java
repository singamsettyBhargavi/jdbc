package jdbcdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.sql.Statement;

public class Studb {
	dbcon2 ob;
	Studb(dbcon2 ob)
	{
		this.ob = ob;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con =dbcon2.getCon();
		
		/*String s = "insert into user values(?,?,?)";*/
		/*String s = "delete from user where name = ?";*/
		String s ="update user set password = ?,email = ? where name = ?";
		
		PreparedStatement ps = con.prepareStatement(s);
		ps.setString(1, "abcijkritu");
		ps.setString(2, "ritur@");
		ps.setString(3, "ritu");
		
		int i = ps.executeUpdate();
		if(i>0)
		{
			System.out.println("updation done");
		}
		else
		{
			System.out.println("not done");
		}
		
//    con.close(); 
		
        String s1 = "select * from user";
		PreparedStatement ps1 = con.prepareStatement(s1);
//		Statement s22 = con.createStatement();
		ResultSet rs = ps1.executeQuery();
		while(rs.next())
		{
			String name = rs.getString(1);
			String password = rs.getString(2);
			String email = rs.getString(3);
			System.out.println(name +" "+password+ " " + email);
		}
	
		
		
		
	}

}
