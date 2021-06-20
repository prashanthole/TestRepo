package com.prash.service;

import java.util.List;

import com.prash.dto.CountriesDTO;

public interface ICountriesService 
{
   public List<CountriesDTO> fetchCountriesById(String[] cId) throws Exception;
}
