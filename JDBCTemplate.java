package com.kosta.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate
{
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("[Error] : JDBCTemplate.Driver");
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "webdb";
		String password = "1234";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
		}
		catch (SQLException e) {
			System.out.println("[Error] : JDBCTemplate.getConnection");
			e.printStackTrace();
		}
		return con;
	}
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			System.out.println("[Error] : JDBCTemplate.close(rs)");
			e.printStackTrace();
		}
	}

	// 5. DB 종료
	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			System.out.println("[Error] : JDBCTemplate.close(stmt)");
			e.printStackTrace();
		}
	}

	// 5. DB 종료
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("[Error] : JDBCTemplate.close(con)");
			e.printStackTrace();
		}
	}

	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			System.out.println("[Error] : JDBCTemplate.commit(con)");
			e.printStackTrace();
		}
	}

	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			System.out.println("[Error] : JDBCTemplate.rollback(con)");
			e.printStackTrace();
		}
	}
}
