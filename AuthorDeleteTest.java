package com.kosta.jdbc;

import static com.kosta.jdbc.JDBCTemplate.close;
import static com.kosta.jdbc.JDBCTemplate.commit;
import static com.kosta.jdbc.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
// 완성 
public class AuthorDeleteTest
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 번호 : ");
		int Author_id = sc.nextInt();
		
		Connection connection = getConnection();
		Statement stmt = null;
		int res = 0;
		String sql = "DELETE FROM author WHERE author_id = " + Author_id;
		try {
			stmt = connection.createStatement();
			res = stmt.executeUpdate(sql);
			
			if (res > 0) {
				System.out.println("삭제 성공");
				commit(connection);
			} else {
				System.out.println("0개의 row가 삭제됨");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(connection);
			sc.close();
		}
	}

}
