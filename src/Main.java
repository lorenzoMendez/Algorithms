import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lorenzo.implement.BinarySearch;
import com.lorenzo.implement.BubbleSort;
import com.lorenzo.implement.InsertionSort;

import Recursion.Add;

public class Main {
	
	public static void main( String[] args ) {
//		List<Integer> bigList = new ArrayList<>();
//		for( int i = 0; i <= 100000; ++i ) {
//			bigList.add( i );
//		}
//		
//		List<Integer> list = Arrays.asList( 23, 67, 82, 99, 1, 6, 9, 3, 7, 10, 4, 8, 5, 2 );
//		print( list );
//		BubbleSort.bubbleSort( list );
//		
//		int position = BinarySearch.binarySearch( bigList, 10 );
//		System.out.println( position != -1 ? "Encotrado en la posicion: " + position : "Elemento No encontrado" );
//		print( list );
//		
//		int sum = Add.sum( 100 );
//		print( Arrays.asList( sum ) );
//		int total = Add.sumList( list, list.size() - 1 );
//		print( Arrays.asList( total ) );
		
		List<Integer> list = Arrays.asList( 23, 67, 82, 99, 1, 6, 9, 3, 7, 10, 4, 8, 5, 2 );
		InsertionSort.insertionSort(list);
		print( list );
	}
	
	public static void print( List<Integer> list ) {
		list.forEach( p -> {
			System.out.print( p + " " );
		} );
		System.out.println( "" );
	}
}
