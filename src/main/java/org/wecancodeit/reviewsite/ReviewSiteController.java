package org.wecancodeit.reviewsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReviewSiteController {

	@Autowired
	ReviewSiteRepository reviewSiteRepo;

	@RequestMapping("/ReviewHome")
	public String reviewHome(Model model) {
		model.addAttribute("reviews", reviewSiteRepo.findAll());
		return "ReviewHome";
	}

	@RequestMapping("/reviews/{id}")
	public String getReview(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("reviews", reviewSiteRepo.findById(id));
		return "reviews";
	}

	@RequestMapping("/reviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviewSiteRepo.getReviews());
		return "reviews";
	}

}
