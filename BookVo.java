package com.kosta.jdbc;

public class BookVo
{
	private int book_id;
	private String title;
	private String pubs;
	private String pub_date;
	private String author_id;
	
	
	public String getAuthor_id()
	{
		return author_id;
	}
	public void setAuthor_id(String author_id)
	{
		this.author_id = author_id;
	}
	public int getBook_id()
	{
		return book_id;
	}
	public void setBook_id(int book_id)
	{
		this.book_id = book_id;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getPubs()
	{
		return pubs;
	}
	public void setPubs(String pubs)
	{
		this.pubs = pubs;
	}
	public String getPub_date()
	{
		return pub_date;
	}
	public void setPub_date(String pub_date)
	{
		this.pub_date = pub_date;
	}
	/**
	 * @param book_id
	 * @param title
	 * @param pubs
	 * @param pub_date
	 */
	public BookVo(int book_id, String title, String pubs, String pub_date, String author_id)
	{
		super();
		this.book_id = book_id;
		this.title = title;
		this.pubs = pubs;
		this.pub_date = pub_date;
		this.author_id = author_id;
	}
	/**
	 * 
	 */
	public BookVo()
	{
	}
	@Override
	public String toString()
	{
		return "BookVo [book_id=" + book_id + ", title=" + title + ", pubs=" + pubs + ", pub_date=" + pub_date
				+ ", author_name=" + author_id + "]";
	}
	
	

}
