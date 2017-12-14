package model;
import java.util.*;
public class Doctor extends Person
{
	private String medicDoctorLicence;
	private String speciality;
	private boolean generalDoctor;
	
	public Doctor(String name,int number,Date dateOfBirth,String bloodType,String medicDoctorLicence,String speciality,boolean generalDoctor)
	{
		super(name,number,dateOfBirth,bloodType);
		this.medicDoctorLicence = medicDoctorLicence;
		this.speciality = speciality;
		this.generalDoctor = generalDoctor;
	}
	public boolean isGeneralDoctor()
	{
		return generalDoctor;
	}
	public void setSpeciality(String speciality)
	{
		this.speciality = speciality;
	}
	public void setLicence(String medicDoctorLicence)
	{
		this.medicDoctorLicence = medicDoctorLicence;
	}
	public String getSpeciality()
	{
		return speciality;
	}
	public String getMedicDoctorLicence()
	{
		return medicDoctorLicence;
	}
	public void examine(Patient patient)
	{

		Random random = new Random();
		int a = random.nextInt(4);

	/*	if(patient.getIllness().equals("brain"))
		{
			patient.setPriority(true,false,false);
		}
		else{
			patient.setPriority(false,false,true);
		}*/

		if( a == 1) //<- Randomized check
		{
			patient.setPriority(true,false,false);
		}
		else if( a == 2)
		{
			patient.setPriority(false,true,false);
		}
		else
		{
			patient.setPriority(false,false,true);
		}
	}
	public void setExitDate(Patient patient)
	{
		Date date = new Date();
		Random random = new Random();
		int rMonth = random.nextInt((12-date.getMonth()+1)) + date.getMonth();
		int rDay = random.nextInt((30-date.getDay()+1)) + date.getDay();
		String dateR = date.getYear() + "/" + rMonth + "/" + rDay;
		Date releaseDate = new Date(dateR);
		patient.setExitDate(releaseDate);
	}

}