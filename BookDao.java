package com.kosta.jdbc;
import java.util.List;

public interface BookDao
{
	public List<BookVo> select();
	
	public List<BookVo> getList();
	
	public BookVo get(String id);

	public boolean insert(BookVo bookVo);

	public boolean delete(Long id);

	public boolean update(BookVo bookVo);

	public List<BookVo> getList(String text);
	
	//public boolean select(BookVo bookVo);
	
	public boolean search(BookVo bookVo);
}
