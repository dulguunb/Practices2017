package model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person
{
	protected String name;
	protected int number;
	protected Date dateOfBirth;
	protected String bloodType;
	public Person(String name,int number,Date dateOfBirth,String bloodType)
	{
		this.name = name;
		this.number = number;
		this.dateOfBirth = dateOfBirth;
		this.bloodType = bloodType;
	}
	public Person()
	{

	}
	public String getName()
	{
		return name;
	}
	public int getNumber()
	{
		return number;
	}
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}
	public String getBloodType()
	{
		return bloodType;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void getNumber(int number)
	{
		this.number = number;
	}
	public void getDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	public void setBloodType(String bloodType)
	{
		this.bloodType = bloodType;
	}
	public void copyPerson(Person person)
	{
		this.name = person.name;
		this.number = person.number;
		this.dateOfBirth = person.dateOfBirth;
		this.bloodType = person.bloodType;
	}
}