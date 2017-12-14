import model.*;
import java.util.*;
public class Hospital{

	public static void main(String[] args)
	{
		Date doctor1date =  new Date("1970/11/21");
		Date doctor2date =  new Date("1970/11/21");	
		Doctor doctor1 = new Neurologist("Jon",454,doctor1date,"AB+","as23-12","neurologist",false);
		Doctor doctor2 = new Doctor("Simon",256,doctor2date,"AB+","ab67-12","general doctor",true);
		
		ArrayList <Doctor> doctors = new ArrayList<>();
		doctors.add(doctor1);
		doctors.add(doctor2);

		Patient patient1 = new Patient();
		Patient patient2 = new Patient();
		Patient patient3 = new Patient();
		
		ArrayList<Patient> patients = new ArrayList<>();
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);

		for(int i=0;i<doctors.size();i++)
		{
			System.out.println("Available doctors: " + doctors.get(i).getName() + " " + doctors.get(i).getSpeciality());
			for(int j=0;j<patients.size();j++){
				if(doctors.get(i).isGeneralDoctor())
				{
					doctors.get(i).examine(patients.get(j));
				}
			}
		}

		Date mydate =  new Date("1995/12/21");	
		Person person1 = new Person("Sara",123,mydate,"A+");
		Date mydate2 =  new Date("1997/09/21");	
		Person person2 = new Person("Emily",123,mydate2,"AB+");
		Date mydate3 =  new Date("2003/09/21");	
		Person person3 = new Person("Alex",123,mydate3,"AB+");
	
		ArrayList<Person> people = new ArrayList<>();
		people.add(person1);
		people.add(person2);
		people.add(person3);
		
		ArrayList <Patient> nonRegistered = new ArrayList<>();
		int k=0;
		for(int i=0;i<patients.size();i++)
		{
			   
				if( patients.get(i).isEmergency() )
				{
					System.out.println("patient number " + i + " is sent to the specialist");
					nonRegistered.add(patients.get(i));
				}
				else if ( patients.get(i).toBeRegistered() )
				{
					System.out.println("normal patient at " + i );
					patients.get(i).setPerson(people.get(i));
					k++;
					
				}
				else
				{
					System.out.println("patient number " + i + " is checkup patient! ");
					patients.get(i).setPerson(people.get(i));
					k++;
				}
		}
		System.out.println("Non-Registered Patients are  " + nonRegistered.size() );
		System.out.println("Registered Patients are  " +  k);
	for(int i=0;i<patients.size();i++)
	{
		if(patients.get(i).getPerson().getName()!=null){
			System.out.println(patients.get(i).getPerson().getName());
		}
	}


}

}