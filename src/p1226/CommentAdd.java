package p1226;

import java.sql.*;
public class CommentAdd {
    public CommentAdd() {}
    public static void main(String args[]) {	
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");	
    	}catch(ClassNotFoundException e ) {
    		e.printStackTrace();
    	}
    	String url = "jdbc:mysql://localhost:3306/한빛무역";
    	String user = "root";
    	String pass = "rnskdud1804!";
	try {		
		Connection con = DriverManager.getConnection(url,user,pass);		
		Statement stmt = con.createStatement();		
		String query = "insert into tb_comment(content, name) values('안녕하세요!','홍길동')";
		int i= stmt.executeUpdate(query);			
        System.out.println(i+"행이 추가되었습니다.");
		stmt.close();
		con.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}
  }
}
