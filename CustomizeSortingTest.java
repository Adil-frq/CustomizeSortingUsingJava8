import java.util.*;
class Student {
	public String name;
	
}
public class CustomizeSortingTest {
	public static void main(String []args) {
		Student s[] = new Student[5];
		for(int i = 0 ; i < s.length;i++) 
			s[i] = new Student();
		
		s[0].name = "Zaid";
		s[1].name = "Java";
		s[2].name = "Faiz";
		s[3].name = "Adil";
		s[4].name = "Khalid";

        
		//converting array into list
		List<Student> students = Arrays.asList(s);
		
		System.out.println("Before sorting");
		System.out.println("-----------------------");
		//getting stram on student[]
		Arrays.stream(s).forEach(s1->System.out.println(s1.name));
		/*
		* sorting using annonymous inner class
		*/
		/*
		Collections.sort(students, new Comparator<Student>(){
			@Override
			public int compare(Student s1, Student s2) {
				
				return s1.name.compareTo(s2.name); 
			}
		});
		*/
		
		/*
		 *sorting using java 8
		*/
		
		Collections.sort(students, (s1,s2)->s1.name.compareTo(s2.name));
		System.out.println("After sorting");
		System.out.println("-----------------------");
		students.forEach(s1-> System.out.println(s1.name));
		
		
	}
}