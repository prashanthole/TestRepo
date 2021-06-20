package com.prash.dao;

import java.util.List;

import com.prash.bo.CountriesBO;

public interface IContriesDAO 
{
   List<CountriesBO> getContriesById(String id) throws Exception;
}
