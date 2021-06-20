package com.prash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prash.bo.CountriesBO;
import com.prash.dao.IContriesDAO;
import com.prash.dto.CountriesDTO;

@Service("countriesService")
public class ContriesServiceImpl implements ICountriesService {

	@Autowired
	private IContriesDAO dao;
	
	@Override
	public List<CountriesDTO> fetchCountriesById(String[] cId) throws Exception {
		// TODO Auto-generated method stub
		
		StringBuffer buffer= new StringBuffer("(");
		for(int i=0;i<cId.length;++i)
		{
			if(i==cId.length-1)
				buffer.append("'"+cId[i]+"'");
			else
				buffer.append("'"+cId[i]+"',");
		}
		buffer.append(")");
		String cond=buffer.toString();
		
		List<CountriesBO> listBO=dao.getContriesById(cond);
		List<CountriesDTO> listDTO= new ArrayList();
		listBO.forEach(bo-> {
			CountriesDTO dto=new CountriesDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		
		return listDTO;
	}

}
