package org.wecancodeit.reviewsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewSiteController {

	@Autowired
	ReviewSiteRepository reviewSiteRepo;
	
	@RequestMapping("/ReviewHome")
	public String reviewHome(Model model) {
		model.addAttribute("reviews", reviewSiteRepo.findAll());
		return "ReviewHome";
	}
	
	@RequestMapping("/review/{id}")
	public String getReview(@PathVariable(name="id") Long id, Model model) {
		model.addAttribute("review", reviewSiteRepo.findById(id));
		return "review";
	}
}
