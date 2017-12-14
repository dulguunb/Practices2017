package model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Patient
{
	Person person;
	protected boolean registeration;
	protected boolean emergency;
	protected boolean checkup;
	protected Date exitDate;
	protected String myIllness ;
	protected String[] illness = {"brain","cancer"};
	public Patient()
	{
		registeration = false;
		emergency = false;
		checkup = false;
	    Random myRandom = new Random();
		myIllness = illness[myRandom.nextInt(illness.length)];
	}
	public String getIllness() // get illness hahahaha 
	{
		return myIllness;
	}
	public void setPriority(boolean registration,boolean emergency,boolean checkup)
	{
		this.registeration = registeration;
		this.emergency = emergency;
		this.checkup = checkup;
		person = new Person();
	}
	public Person getPerson()
	{
		return person;
	}
	public void setPerson(Person person)
	{
		this.person.copyPerson(person);
	}
	public Patient(boolean registration , boolean emergency , boolean checkup)
	{
		if(registeration && emergency && checkup)
		{
			System.out.println("can't create a patient!");
		}
		else
		{	
			this.registeration = registeration;
			this.emergency = emergency;
			this.checkup = checkup;
		}
	}
	public boolean toBeRegistered()
	{
		return registeration;
	}
	public boolean isEmergency()
	{
		return emergency;
	}
	public boolean isCheckUp()
	{
		return checkup;
	}
	public void setExitDate(Date exitDate)
	{
		this.exitDate = exitDate;
	}
	public Date getExitDate()
	{
		return exitDate;
	}
	
}
