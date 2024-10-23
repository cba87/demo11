package com.example.demo11;

public class Employee {

	private String id;

	private String name;

	private int age;

	private String gender;

	// 把自定義的整個HomeTown 當作別的屬性之一
	private HomeTown homeTown;
	
	 

	public Employee(String id, String name, int age, String gender, HomeTown homeTown) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.homeTown = homeTown;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public HomeTown getHomeTown() {
		return homeTown;
	}

	@Override
    public String toString() {
        return "employee{name='" + name + "', age=" + age + ",id =" + id +",gender ="+gender+",homeTown ="+homeTown+"}";
    }


	
}
