package com.Test;

import java.util.List;
import java.util.Scanner;

public class BookApp
{

	public static void main(String[] args)
	{
		BookDao dao = new BookDaoImpl();
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while (run)
		{
			System.out.println("1.조희 | 2.입력 | 3.수정 |4.삭제 | 5.검색 | 6.종료");
			int menuNo = sc.nextInt();
			switch (menuNo)
			{
			case 1:
				List<BookVo> list = dao.getList();
				for (BookVo vo : list)
				{
					System.out.println(vo);
				}
				break;
			case 2:
				//String sql = "INSERT INTO book " + "VALUES(SEQ_BOOK_ID.NEXTVAL, " + "?, ?, ?, ?)";
				BookVo vo1 = new BookVo(0, "title", "pubs", "pub_date", "author_id");  
				System.out.print("id : ");
				int inId = sc.nextInt();

				System.out.print("title : ");
				String inTitle = sc.next();
				
				System.out.print("pubs : ");
				String inPubs = sc.next();
				
				System.out.print("pub_date : ");
				String inPubDate = sc.next();
				
				System.out.print("author_id : ");
				String inAuthorId = sc.next();
				dao.insert(vo1);
				
				break;
			case 3:
				BookVo vo2 = new BookVo(0, "타이틀", "pubs", "pub_date", "author_id");
				System.out.println(" Book_Id | Title | Pubs | Pub_Date | Author_Id ");
				
				dao.update(vo2);
				break;
			case 4:
				BookVo de = new BookVo(0, "타이틀", "pubs", "pub_date", "author_id");
				System.out.print("책 번호 : ");
				int deid = sc.nextInt();
				long id = (deid);
				dao.delete(id);
				break;
			case 5:
				BookVo vo3 = new BookVo(0, "타이틀", "pubs", "pub_date", "author_id");
				dao.search(vo3);
			case 6: 
				System.out.println("종료");
				break;
			default:
				System.out.println("다시 입력");
				break;
			}

		}

	}
}