package com.kosta.jdbc;

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
				BookVo vo1 = new BookVo(0, "타이틀", "pubs", "pub_date", "author_id");
				System.out.println("입력 : id title pubs pub_date author_id");
				String insertb = sc.next();
				dao.insert(vo1);
				System.out.println("완료!");
				break;
			case 3:
				BookVo vo2 = new BookVo(0, "타이틀", "pubs", "pub_date", "author_id");
				System.out.println("번호,저자명, 저자설명");
				String updatemunja = sc.next();
				String updatemunja2 = sc.next();
				String updatemunja3 = sc.next();
				String updatemunja4 = sc.next();
				String updatemunja5 = sc.next();
				
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
			default:
				System.out.println("잘못 입력 or 오류");
				break;
			}

		}

	}
}