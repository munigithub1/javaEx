package com.kosta.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FindPostCode
{

	public static void main(String[] args)
	{
		// 0. import java.sql.*;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("도로명을 입력하세요");
	    String keyDORO = sc.nextLine();
	    try {
	      // 1. JDBC 드라이버 (Oracle) 로딩
	      Class.forName("oracle.jdbc.driver.OracleDriver");

	      // 2. Connection 얻어오기
	      String url = "jdbc:oracle:thin:@localhost:1521:xe";
	      conn = DriverManager.getConnection(url, "webdb", "1234");
	      
	      // 3. SQL문 준비 / 바인딩 / 실행
	      String query = " SELECT  ZIPCODE , SIDO , DORO , BUILDINGNO1 , BUILDING , DONG \r\n" 
	      + "FROM POST_SEJONG " + "WHERE DORO LIKE ? " ;
	      pstmt = conn.prepareStatement(query);
	      pstmt.setString(1, "%" + keyDORO + "%");
	      
	      rs = pstmt.executeQuery();

	      // 4.결과처리
	      while (rs.next()) {
	          int ZIPCODE = rs.getInt("ZIPCODE");
	          String SIDO = rs.getString("SIDO");
	          String DORO = rs.getString("DORO");
	          String BUILDINGNO1 = rs.getString("BUILDINGNO1");
	          String BUILDING = rs.getString("BUILDING");
	          String DONG = rs.getString("DONG");
	          System.out.println("우편번호 : "+ZIPCODE + " 주소 : " + SIDO + " " + DORO + " " + BUILDINGNO1 + " " + BUILDING + " ( " + DONG + " ) ");
	      }

	    } catch (ClassNotFoundException e) {
	        System.out.println("error: 드라이버 로딩 실패 - " + e);
	    } catch (SQLException e) {
	        System.out.println("error:" + e);
	    } finally {
	        // 5. 자원정리
	        try {
	            if (rs != null) {
	                rs.close();
	            }                
	            if (pstmt != null) {
	                pstmt.close();
	            }
	            if (conn != null) {
	                conn.close();
	            }
	        } catch (SQLException e) {
	            System.out.println("error:" + e);
	        }

	    }
	}

}
