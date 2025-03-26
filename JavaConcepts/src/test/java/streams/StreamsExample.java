package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>();
		
		names.add("Adele");
		names.add("Carla");
		names.add("Abhijeet");
		names.add("Don");
		names.add("Aruna");
		
		Long cnt = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(cnt);
		System.out.println("------------------------------------");
		
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		System.out.println("------------------------------------");
		
		//this above statement limits the output to 1 
		//and returns only one name starting with A and length > 4
		
		//adding map method to manipulate the streams
		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		

	}

}
