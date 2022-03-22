package com.kosta.jdbc;

import static com.kosta.jdbc.JDBCTemplate.close;
import static com.kosta.jdbc.JDBCTemplate.commit;
import static com.kosta.jdbc.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AuthorUpdateTest
{
// 리턴 필요
	public static void main(String[] args)
	{
		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try
		{
			// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webdb", "1234");
			System.out.println("접속성공");
			/////////////////////////////////////////////////////////////////
			Scanner sc = new Scanner(System.in);
			
			System.out.print("업데이트할 작가 id : ");
			int author_id = sc.nextInt();
			
			System.out.print("업데이트할 작가 name : ");
			String author_name = sc.next();
			
			System.out.print("업데이트할 작가 desc : ");
			String author_desc = sc.next();
			/////////////////////////////////////////////////////////////////
			
			// 3. SQL문 준비 / 바인딩 / 실행
			String query = "UPDATE author SET"+"author_id=?"+"author_name=?"
			+" author_desc=?"+"where author_id=?";
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, author_id);
			pstmt.setString(2, author_name);
			pstmt.setString(3, author_name);
			//pstmt.setInt(4, author_id);

			int count = pstmt.executeUpdate();
			
			//rs = pstmt.executeQuery();
			// 4.결과처리
			System.out.println(count + "건 처리");
			
		} catch (ClassNotFoundException e)
		{
			System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e)
		{
			System.out.println("error:" + e);
		} finally
		{
			// 5. 자원정리
			try
			{
				if (rs != null) {
	                rs.close();
				}
				if (pstmt != null)
				{
					pstmt.close();
				}
				if (conn != null)
				{
					conn.close();
				}
			} catch (SQLException e)
			{
				System.out.println("error:" + e);
			}

		}
	}

}
