  package com.kosta.jdbc;

import java.util.List;
import java.util.Scanner;

public class AuthorApp
{

	public static void main(String[] args)
	{
		// 인터페이스 레퍼런스 변수에 구현클래스의 객체 만들기
		AuthorDao dao = new AuthorDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.조희 | 2.입력 | 3.수정 |4.삭제 ");
		int menuNo = sc.nextInt();
		switch (menuNo)
		{
		case 1:
			List<AuthorVo> list = dao.select();
			for (AuthorVo vo : list)
			{
				System.out.println(vo);
			}
			break;
			
		case 2:
			AuthorVo vo1 = new AuthorVo(0, "저자명", "저자설명");
			
			dao.insert(vo1);
			System.out.println("완료!");
			break;
		case 3:
			AuthorVo vo2 = new AuthorVo(0, "저자명 ", "저자설명 ");
			System.out.println("번호,저자명, 저자설명");
			String updatemunja = sc.next();
			dao.update(vo2);
			break;
		case 4:
			AuthorVo de = new AuthorVo(0, "저자명", "저자설명");
			System.out.print("작가 번호 : ");
			int deid = sc.nextInt();
			long id=(deid);
			dao.delete(id);
			break;
		default:
			break;
		}
		
		// 1. 만들어진 객체의 select() 호출
		// for each 문으로 모든 데이터 출력
		// 2. 만들어진 객체의 insert() 호출
//		AuthorVo vo = new AuthorVo(0, "저자명", "저자설명");
//		if (dao.insert(vo) == true )
//		{
//			System.out.println("성공");
//		} else
//		{
//			System.out.println("오류");
//		}
//
//		// 3. 만들어진 객체의 update() 호출
//		if (dao.update(vo) )
//		{
//			System.out.println("성공");
//		} else
//		{
//			System.out.println("오류");
//		}
//		
//		long id=2;
//		// 4. 만들어진 객체의 delete() 호출
//		if (dao.delete(id) == true)
//		{
//			System.out.println("작업 성공");
//		} else
//		{
//			System.out.println("오류");
//		}
	}
}
