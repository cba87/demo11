package com.example.demo11;

public class HomeTown {

	private String city;

	private String state;

	private String country;

	//建構方法
	public HomeTown() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HomeTown(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	//一般方法 屬性的get方法
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}
	
	@Override
    public String toString() {
        return "HomeTown{" +
               "city='" + city + '\'' +
                ", country =" + country +
                ", state ="+ state +
                '}';
	}
}
