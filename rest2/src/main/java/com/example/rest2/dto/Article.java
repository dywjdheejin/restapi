package com.example.rest2.dto;

import java.util.Date;

public class Article {
	private int article_n;
	private Date update_date;
	private int levels;
	private String title;
	private String content;
	
	public Article() {
		super();
	}
	
	public int getArticleNumber() {
    	return article_n;
    }
    public void setArticleNumber(int article_n) {
    	this.article_n = article_n;
    }
    
    public Date getUpdate_date() {
    	return update_date;
    }
    public void setUpdate_date(Date update_date) {
    	this.update_date = update_date;
    }
    
    public int getLevels() {
    	return levels;
    }
    public void setLevels(int levels) {
    	this.levels = levels;
    }
    
    public String getTitle() {
    	return title;
    }
    public void setUsertype(String title) {
    	this.title = title;
    }
    
    public String getContent() {
    	return content;
    }
    public void setContent(String content) {
    	this.content = content;
    }
    
    @Override
    public String toString() {
    	return "article [article_n="+article_n+", update_date="+update_date+", levels="+levels+", title="+title+", content="+content+"]";
    }
}
