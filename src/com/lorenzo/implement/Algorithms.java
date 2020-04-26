package com.lorenzo.implement;

import java.util.ArrayList;
import java.util.List;


/*
 * This class implemented this sort algorith
 * - Insertion Sort
 * - Merge Sort
 * - Heapsort
 * - Quicksort
 * - Counting Sort
 * - Radix Sort
 * - Bucket Sort
 * 
 * */
public class Algorithms {
	
	/*
	 * Sort the Array
	 * Worst case O(n^2)
	 * Best case O(n), the list is in order
	 * 
	 * */
	public static void insertionSort( List<Integer> listIntegers ) {
		
		for( int i = 1; i < listIntegers.size(); ++i ) {
			int key = listIntegers.get( i );
			int j = i - 1;
			
			while( j >= 0 && listIntegers.get( j ) > key ) {
				listIntegers.set( j + 1, listIntegers.get( j ) );
				--j;
			}
			listIntegers.set( j + 1, key );
		}
	}
	
	public static void mergeSort( List<Integer> list, int l, int r ) {
		if( l < r ) {
			int q = l + ( r - l ) / 2;
			mergeSort( list, l, q );
			mergeSort( list, q + 1, r );
			merge( list, l, q, r );
		}
	}
	
	public static void merge( List<Integer> list, int l, int m, int r ) {
		
		int i, j, k;
		int n1 = m - l + 1;
		int n2 = r - m;
		
		List<Integer> L = new ArrayList<>();
		List<Integer> R = new ArrayList<>();
		
		for( i = 0; i < n1; ++i ) {
			L.add( list.get( l + i  ) );
		}
		
		for( i = 0; i < n2; ++i ) {
			R.add( list.get( m + i + 1 ) );
		}
		
		L.add( Integer.MAX_VALUE );
		R.add( Integer.MAX_VALUE );
		
		i = j = 0;
		k = l;
		
		while( i < n1 && j < n2 ) {
			if( L.get(i ) <= R.get( j ) ) {
				list.set( k, L.get( i ) );
				++i;
			} else {
				list.set( k, R.get( j ) );
				++j;
			}
			++k;
		}
		
		while( i < n1 ) {
			list.set(k , L.get( i ) );
			++k;
			++i;
		}
		
		while( j < n2 ) {
			list.set(k , R.get( j ) );
			++k;
			++j;
		}
		
	}
	
	/*
	 * Return the position where the item found, or else -1
	 * 
	 * */
	public static int binarySearch( List<Integer> list, Integer item ) {
		int low = 0;
		int top = list.size() - 1;
		while( low <= top ) {
			int mid = ( low +  top ) / 2;
			if( item > list.get( mid ) ) {
				low = mid + 1;
			} else if( item < list.get( mid ) ) {
				top = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	/*
	 * Sort the Array
	 * 
	 * */
	public static void bubbleSort( List<Integer> list ) {
		for( int i = 0; i < list.size() ; ++i ) {
			for( int j = 0; j < list.size() - 1 - i; ++j ) {
				if( list.get( j ) > list.get( j + 1 ) ) {
					int temp = list.get( j + 1 );
					list.set( j + 1, list.get( j ) );
					list.set( j, temp );
				}
			}
		}
	}
}
