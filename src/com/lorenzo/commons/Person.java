package com.lorenzo.commons;

import java.io.Serializable;
import java.util.Comparator;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 8942564479374998643L;
	private String name;
	private Integer age;
	private Double salary;
	
	public Person() {
		super();
	}
	
	public Person( Person person ) {
		this.setName( person.getName() );
		this.setAge( person.getAge() );
		this.setSalary( person.getSalary() );
	}
	
	public Person( String name, Integer age, Double salary ) {
		this.setName(name);
		this.setAge(age);
		this.setSalary(salary);
	}
	
	/*
	 * Define Comparators for the class
	 * 
	 * */
	public static Comparator<Person> NameComparator = new Comparator<Person>() {
		@Override
		public int compare( Person a, Person b ) {
			return a.getName().compareTo( b.getName() );
		}
	};
	
	public static Comparator<Person> AgeComparator = new Comparator<Person>() {
		@Override
		public int compare( Person a, Person b ) {
			return a.getAge().compareTo( b.getAge() );
		}
	};
	
	public static Comparator<Person> SalaryComparator = new Comparator<Person>() {
		@Override
		public int compare( Person a, Person b ) {
			return b.getSalary().compareTo( a.getSalary() );
		}
	};
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
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
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
