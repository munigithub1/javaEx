package com.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDaoImpl implements BookDao {

	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "webdb", "1234");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버 로드 실패!");
		}
		return conn;
	}

	// search
	public boolean search(BookVo bookVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("찾고자 하는 저자의 이름을 입력 하세요 >> ");
		String inputName = sc.nextLine();

		if (!inputName.equals(null) || !"".equals(inputName)) {

			try {
				// 1. JDBC 드라이버 (Oracle) 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");

				// 2. Connection 얻어오기
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				conn = DriverManager.getConnection(url, "webdb", "1234");

				// 3. SQL문 준비 / 바인딩 / 실행
				String query = " SELECT title, pubs, to_char(pub_date,'YYYY/MM/DD') pub_date, author_name \r\n"
						+ " FROM book b, author a \r\n" + " WHERE b.AUTHOR_ID = a.AUTHOR_ID \r\n"
						+ " AND   a.AUTHOR_NAME LIKE ? ";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, "%" + inputName + "%");
				rs = pstmt.executeQuery();

				// 4.결과처리
				while (rs.next()) {
					// int bookId = rs.getInt("book_id");
					String title = rs.getString("title");
					String pubs = rs.getString("pubs");
					String pub_date = rs.getString("pub_date");
					String authorName = rs.getString("author_name");
					System.out.println(authorName + ":" + title + "/" + pubs + "(" + pub_date + ")");
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
		return false;
	}

	@Override
	public List<BookVo> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		// 데이터 전송을 위한 리스트
		List<BookVo> list = new ArrayList<>();

		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = " SELECT book_id, title, pubs, pub_date, author_id " + " FROM book " + " order by book_id ";

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				BookVo bookVo = new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
				list.add(bookVo);
			}
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		}
		return list;
	}

	@Override
	public BookVo get(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		BookVo bookVo = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			String sql = " SELECT book_id, title, pubs, pub_date, author_id " + " FROM book " + " WHERE book_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id)); // 바인딩

			rs = pstmt.executeQuery();

			if (rs.next()) {
				bookVo = new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.err.println("ERROR:" + e.getMessage());
			}
		}
		return bookVo;
	}

	@Override // insert
	public boolean insert(BookVo bookVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		int insertedCount = 0;
		String sql = "INSERT INTO book " + "VALUES" + "?, ?, ?, ?, ?)";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			// String sql = "INSERT INTO book " + "VALUES(SEQ_BOOK_ID.NEXTVAL, " + "?, ?, ?	, ?)";
			String Book_id = "";
			String Title = "";
			String Pubs = "";
			String Pub_date = "";
			String Author_id = "";
			
			for (int i=0; i<10000; i++) {
				
				pstmt.setInt(1, bookVo.getBook_id());
				pstmt.setString(2, bookVo.getTitle());
				pstmt.setString(3, bookVo.getPubs());
				pstmt.setString(4, bookVo.getPub_date());
				pstmt.setString(5, bookVo.getAuthor_id());
				pstmt.addBatch();
				pstmt.clearParameters();
				
				insertedCount = pstmt.executeUpdate();
			}
			pstmt.executeBatch();
			pstmt.clearBatch();
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.err.println("ERROR:" + e.getMessage());
			}
		}
		return insertedCount == 1;
	}

	@Override // delete
	public boolean delete(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;

		try {
			conn = getConnection();
			String sql = "DELETE FROM book WHERE book_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);

			deletedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.err.println("ERROR:" + e.getMessage());
			}
		}
		return deletedCount == 1;
	}

	@Override
	public boolean update(BookVo bookVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int updatedCount = 0;

		try {
			conn = getConnection();
			String sql = "UPDATE BOOK SET " + "book_id=?, title=?, pubs, pub_date, author_id " + "WHERE book_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookVo.getBook_id());
			pstmt.setString(2, bookVo.getTitle());
			pstmt.setString(3, bookVo.getPubs());
			pstmt.setString(4, bookVo.getPub_date());
			pstmt.setString(5, bookVo.getAuthor_id());

			updatedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.err.println("ERROR:" + e.getMessage());
			}
		}
		return 1 == updatedCount;
	}

	@Override
	public List<BookVo> getList(String text) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 데이터 전송을 위한 리스트
		List<BookVo> list = new ArrayList<>();

		try {
			conn = getConnection();

			String sql = " SELECT b.book_id, \r\n" + "        b.title, \r\n" + "        b.pubs, \r\n"
					+ "        to_char( b.pub_date,'YYYY-MM-DD'), \r\n" + "        a.author_name\r\n"
					+ " FROM author a, book b\r\n" + " where a.author_id = b.author_id\r\n"
					+ " and (b.title || b.pubs || a.author_name) LIKE '%'|| ? ||'%' ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, text); // 바인딩
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BookVo vo = new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
				list.add(vo);
			}
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		}

		return list;
	}

	@Override
	public List<BookVo> select() {
		// TODO Auto-generated method stub
		return null;
	}

}
