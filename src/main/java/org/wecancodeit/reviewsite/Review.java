package org.wecancodeit.reviewsite;

import java.util.Date;

public class Review {
	
	private Long id;
	private String title;
	private String review;
	private String content;
	private Date reviewDate;
	private String description;
	
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getReview() {
		return review;
	}
	public String getContent() {
		return content;
	}
	public Date getReviewDate() {
		return reviewDate;
	}
	public String getDescription() {
		return description;
	}
	public Review(Long id, String title, String review, String content) {
		super();
		this.id = id;
		this.title = title;
		this.review = review;
		this.content = content;
	}
	public void put(Long id, Review review2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
