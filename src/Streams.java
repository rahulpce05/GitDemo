import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Streams {
	
	//@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Abhejeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		Long count = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(count);
		
		long d = Stream.of("Abhejeet","Don","Alekhya","Adam","Ram").filter(s->
		{
			s.startsWith("A");
			return false;
			
		}).count();
		System.out.println(d);
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
	}
	
	@Test
	public void streamMap() {
		Stream.of("Abhejeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		Stream.of("Abhejeet","Don","Alekhya","Adam","Rama").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
	}

}
