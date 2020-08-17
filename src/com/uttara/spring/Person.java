package com.uttara.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	
	@Value("manjula")
	private String name;
	
	@Value("34")
	private int age;
	
	
	@Autowired
	private Address address;
	
	
	
	//private Account acc;
	 
	 @Autowired
	  private List <Account> acc;
	
//	public Account getAcc() {
//		return acc;
//	}
//
//	@Autowired
//	@Qualifier("cc")
//	public void setAcc(Account acc) {
//		this.acc = acc;
//	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", acc=" + acc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acc == null) ? 0 : acc.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (acc == null) {
			if (other.acc != null)
				return false;
		} else if (!acc.equals(other.acc))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Person()
	{
		System.out.println("Person class no arguement constructor");
	}

	public Person(String name, int age) {
		
		super();
		this.name = name;
		this.age = age;
		System.out.print("Person class arguement constructor");
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
		System.out.print("Person name from set method"  +name);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
		System.out.print("Person Age from set method"  +age);
	}
	
	public void dance()
	{
		if(age<40)
		{
			System.out.print("Person " + name +"  can dance ");
		}
		else
		{
			System.out.print("Person cannot dance ");
		}
	}





	
	

}
