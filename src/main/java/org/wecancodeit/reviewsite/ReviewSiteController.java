package org.wecancodeit.reviewsite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewSiteController {

	@RequestMapping("/")
	public String reviewHome(Model model) {
		model.addAttribute("review", null);
		return "home";
	}
}
