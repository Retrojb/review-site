package org.wecancodeit.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewSiteRepository {
	
	private Map<Long, Review> reviews = new HashMap<>();
	
	public Map<Long, Review> getReviews(){
		return reviews;
	}
	
	public ReviewSiteRepository() {
		Review reviewOne = new Review(1111L, "Pitbulls", "Much Amazing", "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum ", "/img/nya.jpg");
		Review reviewTwo = new Review(2222L, "German Shepards", "Beauty Great", "lorem bacon lorem bacon lorem bacon lorem bacon lorem bacon lorem bacon ", "/img/germanshepard.jpg");
		Review reviewThree = new Review(3333L, "Cats", "Such Majestic", "Thought it was a cat, but you have been bamboloazed by another DOGGO", "/img/thundercat.jpg");
	
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
	
	

	

