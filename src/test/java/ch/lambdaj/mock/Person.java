package ch.lambdaj.mock;

import java.util.*;
import java.math.*;

/**
 * @author Mario Fusco
 */
public class Person implements IPerson {
	
	private String firstName;
	private String lastName;
	private int age;
	private Date birthDate;
	
	private IPerson bestFriend;
	
	public Person() { }

	public Person(String firstName) { 
		this.firstName = firstName;
	}
	
	public Person(String firstName, String lastName) { 
		this(firstName);
		this.lastName = lastName;
	}
	
	public Person(String firstName, int age) { 
		this(firstName);
		setAge(age);
	}
	
	public Person(String firstName, String lastName, int age) { 
		this(firstName, lastName);
		setAge(age);
	}
	
	public Gender getGender() {
		return Gender.MALE;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFailingLastName(String lastName) {
		throw new UnsupportedOperationException();
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		birthDate = new GregorianCalendar(2009 - age, 0, 1).getTime();
	}
	
    public BigInteger getAgeAsBigInteger() {
        return BigInteger.valueOf(getAge());
    }
    public BigDecimal getAgeAsBigDecimal() {
        return BigDecimal.valueOf(getAge());
    }

	public Date getBirthDate() {
		return birthDate;
	}

	public Person getBestFriend() {
		return (Person)bestFriend;
	}
	public void setBestFriend(IPerson bestFriend) {
		this.bestFriend = bestFriend;
	}
	
	public boolean isYoungerThan(int maxAge) {
		return age < maxAge;
	}
	
	public boolean isFailingYoungerThan(int maxAge) {
		throw new UnsupportedOperationException();
	}

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public String toString() {
        return getFullName();
    }

    @Override
    public boolean equals(Object obj) {
        return Person.class.isInstance(obj) && getFullName().equals(((Person)obj).getFullName());
    }

    @Override
    public int hashCode() {
        return getFullName().hashCode();
    }
}