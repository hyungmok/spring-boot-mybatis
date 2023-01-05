package com.hyungmok.springbootmybatis;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CompanyMapper {
	
	@Insert("INSERT INTO company (company_name, company_address) VALUES (#{company.name}, #{company.address})")
	int insert(@Param("Company") Company company);
	
}
