import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.lorenzo.commons.Person;
import com.lorenzo.implement.Algorithms;
import com.lorenzo.recursion.Add;

public class Main {
	
	public static void main( String[] args ) {
		
		comparatorTest();
	}
	
	public static void comparatorTest() {
		System.out.println( "########################################## COMPARATOR INTERFACE ##########################################" );
		/********************************************************/
		List<Person> listPerson = Arrays.asList(
				new Person( "LORENZO", 10, 700.00 ),
				new Person( "ANA", 35, 20.90 ),
				new Person( "PEDRO", 25, 230.99 )
		);
		
		Collections.sort( listPerson , Person.NameComparator );
		System.out.println( "List ordered by Name: " + listPerson.toString() );
		
		Collections.sort( listPerson , Person.AgeComparator );
		System.out.println( "List ordered by Age: " + listPerson.toString() );
		
		Collections.sort( listPerson , Person.SalaryComparator );
		System.out.println( "List ordered by Salary: " + listPerson.toString() );
		
		// Find a Person
		Person person = listPerson.stream().filter( p -> p.getName().compareTo( "LORENZO" ) == 0 ).findAny().orElse( null );
		if( person != null )
			System.out.println( "Persona encontrada con edad: " + person.getAge() + " y salario: " + person.getSalary() );
	}
	
	public static void sortTest() {
		List<Integer> bigList = new ArrayList<>();
		for( int i = 0; i <= 100000; ++i ) {
			bigList.add( i );
		}
		
		List<Integer> list = Arrays.asList( 23, 67, 82, 99, 1, 6, 9, 3, 7, 10, 4, 8, 5, 2 );
		print( list );
		System.out.println( "BUBBLE SORT" );
		Algorithms.bubbleSort( list );
		
		System.out.println( "BINARY SEARCH" );
		int position = Algorithms.binarySearch( bigList, 10 );
		System.out.println( position != -1 ? "Encontrado en la posicion: " + position : "Elemento No encontrado" );
		print( list );
		
		System.out.println( "RECURSIVE ADDING" );
		int sum = Add.sum( 100 );
		print( Arrays.asList( sum ) );
		int total = Add.sumList( list, list.size() - 1 );
		print( Arrays.asList( total ) );
		
		System.out.println( "INSERTION SORT" );
		List<Integer> list2 = Arrays.asList( 99, 98, 82, 23, 1, 6, 9 );
		Algorithms.insertionSort( list2 );
		print( list2 );
		
		String str = "PEPE";
		test( str );
		System.out.println( str );
		
		Integer integer = 1;
		test( integer );
		System.out.println( integer );
	}
	
	public static void print( List<Integer> list ) {
		list.forEach( p -> {
			System.out.print( p + " " );
		} );
		System.out.println( "" );
	}
	
	public static void test( String str ) {
		str = "TEST";
		System.out.println( str );
	}
	
	public static void test( Integer integer ) {
		integer = 10;
		System.out.println( integer );
	}
}
