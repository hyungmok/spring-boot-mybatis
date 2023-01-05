package com.hyungmok.springbootmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private CompanyMapper companyMapper;
	
	public int post(@RequestBody Company company) {
		return companyMapper.insert(company);
	}

}
