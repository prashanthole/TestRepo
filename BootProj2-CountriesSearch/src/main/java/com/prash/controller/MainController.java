package com.prash.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.prash.dao.ICountriesDAOImpl;
import com.prash.dto.CountriesDTO;
import com.prash.service.ICountriesService;
import com.prash.vo.CountriesVO;

@Controller("controller")
public class MainController 
{
	@Autowired
    private ICountriesService service;
	
	public List<CountriesVO> showCountriesById(String[] ids) throws Exception
	{
		List<CountriesDTO> listDTO=service.fetchCountriesById(ids);
		List<CountriesVO> listVO=new ArrayList();
		listDTO.forEach(dto->{
			CountriesVO vo= new CountriesVO();
			BeanUtils.copyProperties(dto, vo);
			listVO.add(vo);
		});
		
		return listVO;
	}
}
