package org.wecancodeit.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ReviewSiteRepository {
	
	private Map<Long, Review> reviews = new HashMap<>();
	
	public Map<Long, Review> getReviews(){
		return reviews;
	}
	
	public ReviewSiteRepository() {
		Review reviewOne = new Review(1111L, "pitbulls", "much amazing", "null");
		Review reviewTwo = new Review(2222L, "German Shepards", "beauty great", "null");
		Review reviewThree = new Review(3333L, "Cats", "such majestic", "null");
	
		this.addReview(reviewOne);
		this.addReview(reviewTwo);
		this.addReview(reviewThree);
		
	}
	
	public Collection<Review> findAll(){
		return reviews.values();
	}
	
	public void addReview(Review review) {
		reviews.put(review.getId(), review);
	}
	
	public Object findById(Long id) {
		return reviews.get(id);
	}
	
	
}
