package org.wecancodeit.reviewsite;

import java.util.Date;

public class Review {
	
	private Long id;
	private String name;
	private String review;
	private String content;
	private Date reviewDate;
	private String description;
	private String imgUrl;
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
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
	
	public String getImgUrl() {
		return imgUrl;
	}
	public Review(Long id, String name, String review, String content, String imgUrl) {
		this.id = id;
		this.name = name;
		this.review = review;
		this.content = content;
		this.imgUrl = imgUrl;
	}
	
	
	
	
}
