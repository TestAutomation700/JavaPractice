package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsList {
	
	public static void main(String[] args) {
	
	//Count the names starting with A in the list

	ArrayList<String> al = new ArrayList<String>();

	al.add("Abhijeet");
	al.add("Alekya");
	al.add("Don");
	al.add("Adam");
	al.add("Ram");

	int count=0;

	for(String s:al) {

	if(s.startsWith("A")) {

	count++;

	}

	}

	System.out.println("Normal way count is "+count);

	StreamsList t1 = new StreamsList();
	t1.m1();



	}

	public void m1() {

	ArrayList<String> al = new ArrayList<String>();

	al.add("Abhijeet");
	al.add("Alekya");
	al.add("Don");
	al.add("Adam");
	al.add("Ram");

	//stream - We are assiging the array list to streams
	//filter - It will filter based on our condition
	//lambda exp lhs -paramter, rhs - action which we are going to perform on that parameter
	//s -> LHS - here s can be any name. Like for each here
	//s.startsWith("A") - RHS - We are writing the action
	//count - We are completing the stream here
	//Long c - The O/P of count is Long in streams

	//Filter
	//Count
	//For each
	//Limit
	//Map
	//Sorted
	//Stream.concat
	//anyMatch
	//collect
	//distinct




	Long cnt = al.stream().filter(s->s.startsWith("A")).count();
	System.out.println("APPROACH 1 --- The stream count for words starting with A is "+cnt);

	System.out.println("=======================");

	//APPROACH 2

	Long lc = Stream.of("Abhijeet","Alekya","Don","Adam","Ram").filter(s->s.startsWith("A")).count();

	System.out.println("APPROACH 2 --- Using stream.Of way, count is "+lc);

	System.out.println("=======================");

	//APPROACH 3

	//RULE 1 : There is no life for intermediate operator (filter) if terminal operator is not there (count)
	//RULE 2 : Terminal operator will execute only if intermediate operator returns true. (ONLY FOR FILTER)


	Long l = Stream.of("Abhijeet","Alekya","Don","Adam","Ram").filter(s->

	{
	s.startsWith("A");
	return true; //IMPORTANT here if you dont return statement, syntax error would be there
	//This format is to give conditions inside

	}

	).count();

	System.out.println("APPROACH 3 --- Using stream.Of way, with more conditional loop, count is "+lc);

	System.out.println("=======================");

	//APPROACH 4 :

	//Here return is not needed bcos we are not executing terminal operator
	//From main stream we have created substream and from that we are printing them using for each

	al.stream().filter(s->s.length()>4).forEach(s->{

	System.out.println("APPROACH 4 --- Using streams, printing names with length>4 == "+s);



	}
	);

	System.out.println("=======================");

	//APPROACH 5

	al.stream().filter(s->s.length()>4).limit(1).forEach(s->{

	System.out.println("APPROACH 5 --- Using streams, printing only one name with length>4 == "+s);



	}
	);

	System.out.println("=======================");

	//APPROACH 6

	//map - Used to modify stream filter results
	Stream.of("Abhijeet","Alekya","Don","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
	forEach(s->System.out.println("APPROACH 6 --- Using streams, printing names ending with 'a' and conerting it into upper case "+s));

	System.out.println("=======================");

	//APPROACH 7

	Stream.of("Abhijeet","Alekya","Don","Adam","Rama").map(s->s.toUpperCase()).
	forEach(s->System.out.println("APPROACH 7 --- Using streams, printing names by converting it into upper case "+s));

	System.out.println("=======================");

	//APPROACH 8

	Stream.of("Abhijeet","Alekya","Don","Adam","Rama").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).
	forEach(s->System.out.println("APPROACH 8 --- Using streams, names starting with 'a', sorting the names and converting it into upper case "+s));

	System.out.println("=======================");

	//APPROACH 9

	//Merging two streams and printing them

	ArrayList<String> al2 = new ArrayList<String>();

	al2.add("Vill");
	al2.add("Mark");
	al2.add("Elliot");
	al2.add("Amban");

	Stream newStream = Stream.concat(al.stream(), al2.stream());

	newStream.sorted().forEach(s->{

	System.out.println("APPROACH 9 --- Concatinating two streams(Array lists) and printing them "+s);


	});

	System.out.println("=======================");

	//APPROACH 10

	//anymatch - its not same as filter. filter will filter from input and we need to perform operation

	boolean flag = Stream.of("Abhijeet","Alekya","Don","Adam","Rama").anyMatch(s->s.equalsIgnoreCase("Don"));
	System.out.println("APPROACH 10 --- Using streams, printing if value is there in the list "+flag);

	System.out.println("=======================");

	//APPROACH 11

	List<String> nl = Stream.of("Abhijeet","Alekya","Don","Adam","Rama").filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println("APPROACH 11 --- Using streams, return a list as a new list after manipulations "+nl);

	//APPROACH 11.1

	Set<String> se = Stream.of("Abhijeet","Alekya","Don","Adam","Rama").filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toSet());
	System.out.println("APPROACH 11.1 --- Using streams, return a list as a new set after manipulations "+se);

	System.out.println("=======================");

	//APPROACH 12

	//print unique nos

	ArrayList<Integer> al3 = new ArrayList<Integer>();

	al3.add(3);
	al3.add(5);
	al3.add(3);
	al3.add(4);
	al3.add(7);

	al3.stream().distinct().forEach(s->System.out.println("APPROACH 12 --- The distinct values are "+s));

	System.out.println("=======================");

	//APPROACH 13
	//from unique elements, sort and print 3rd element

	List<Integer> ll = al3.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println("APPROACH 13 --- The third value after sorting "+ll.get(3));

	}


}
