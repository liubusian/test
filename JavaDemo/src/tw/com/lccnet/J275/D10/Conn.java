package tw.com.lccnet.J275.D10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Conn {

	@Test
	public void Show(){
		
		List<PersonPojo> persons = new ArrayList<PersonPojo>();
		persons.add(new PersonPojo("AA", 15));
		persons.add(new PersonPojo("AB", 15));
		persons.add(new PersonPojo("AC", 15));
		persons.add(new PersonPojo("AD", 15));
		
		print(persons);
		show3(persons);
	}
	
	@Test
	public void Show1(){
		
		List<PersonPojo> persons = new LinkedList<PersonPojo>();
		persons.add(new PersonPojo("AA", 15));
		persons.add(new PersonPojo("AB", 15));
		persons.add(new PersonPojo("AC", 15));
		persons.add(new PersonPojo("AD", 15));
		
		print(persons);
	}
	
	
	public void show3(List<PersonPojo> persons){
		
		Object[] lp = (PersonPojo[])persons.toArray();
		
		for(Object x:lp){
			System.out.println(((PersonPojo)x).getName());
		}
		
	}
	private void print(List<PersonPojo> persons) {
		Iterator<PersonPojo> itPersons = persons.iterator();
		
		while (itPersons.hasNext()) {
			PersonPojo person = itPersons.next();
			System.out.println(person.getName());
			System.out.println(person.getAge());
			
		}
		
	}
}
