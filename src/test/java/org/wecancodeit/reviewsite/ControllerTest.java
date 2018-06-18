package org.wecancodeit.reviewsite;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewSiteController.class)
public class ControllerTest {

		
		@Resource
		MockMvc mvc;
		@MockBean
		ReviewSiteController controller;
		@Mock
		ReviewSiteRepository repo;
		
		//this just says its hitting the products page
		@Test
		public void getCourseShouldReturnCoursesView() throws Exception {
			mvc.perform(get("/ReviewHome")).andExpect( view().name(is(equalTo("reviews"))));
		}
		private Object view() {
			// TODO Auto-generated method stub
			return null;
		}
		private RequestBuilder get(String string) {
			// TODO Auto-generated method stub
			return null;
		}
		@Test
		public void getCourseShouldBeOk() throws Exception{
			mvc.perform(get("/courses")).andExpect(status().is2xxSuccessful());
		}
	}

}
