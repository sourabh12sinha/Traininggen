package com.org.gen.Info;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostWebController {
 
	
	@RequestMapping(value = "/postdata1", method = RequestMethod.POST)
	@ResponseBody
	public PostDataResponse Test(@RequestBody PostData p)
	{
		PostDataResponse p1=new PostDataResponse();
		p1.setName(p.getName());
		p1.setPhoneNo(p.getPhoneNo());
		p1.setProjectName("working on project");
		
		
		return p1;
	}
	
	
}
