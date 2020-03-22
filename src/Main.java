import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.lorenzo.implement.Algorithms;
import Recursion.Add;

public class Main {
	
	public static void main( String[] args ) {
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
	}
	
	public static void print( List<Integer> list ) {
		list.forEach( p -> {
			System.out.print( p + " " );
		} );
		System.out.println( "" );
	}
}
