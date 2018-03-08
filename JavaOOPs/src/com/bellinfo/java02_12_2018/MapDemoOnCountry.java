package com.bellinfo.java02_12_2018;

import java.util.HashMap;
import java.util.Set;

public class MapDemoOnCountry {
	enum Code{
		IND, USA, CHN, NHL, CNA;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c1=new Country("India", 130000000, 6.5, "Asia");
		Country c2=new Country("USA", 40000000, 5.5, "NorthAmerica");
		Country c3=new Country("China", 140000000, 4.5, "Asia");
		Country c4=new Country("Netherlands", 3000000, 7.5, "Europe");

			HashMap<String, Country> hm=new HashMap<>();
			hm.put("IND", c1);
			hm.put("USA", c2);
			hm.put("CHN", c3);
			hm.put("NHL", c4);
			Set<String> countrySet=hm.keySet() ;
			for(String str:countrySet) {
				if (str.equals(Code.CHN.toString())) {
					System.out.println(hm.get(str));
				}
			}
			System.out.println("***************************");
			HashMap<Country, String> hm1=new HashMap<>();
			hm1.put(c1,"IND");
			hm1.put(c2, "CHN");
			hm1.put(c3, "USA");
			hm1.put(c4, "NHL");
			Set<Country> countrySet1=hm1.keySet() ;
			for(Country str:countrySet1) {
				System.out.println(str);
			}
	}

}
class Country{
	String name;
	int population;
	double gdp;
	String contenent;
	public Country(String name, int population, double gdp, String contenent) {
		super();
		this.name = name;
		this.population = population;
		this.gdp = gdp;
		this.contenent = contenent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public double getGdp() {
		return gdp;
	}
	public void setGdp(double gdp) {
		this.gdp = gdp;
	}
	public String getContenent() {
		return contenent;
	}
	public void setContenent(String contenent) {
		this.contenent = contenent;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + ", gdp=" + gdp + ", contenent=" + contenent
				+ "]";
	}
	
}