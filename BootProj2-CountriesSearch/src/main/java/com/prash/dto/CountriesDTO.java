package com.prash.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CountriesDTO implements Serializable
{
   String countryId;
   String countryName;
}
