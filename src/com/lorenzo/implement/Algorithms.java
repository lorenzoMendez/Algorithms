package com.lorenzo.implement;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	
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
	
	/*
	 * Sort the Array
	 * Worst case O(n^2)
	 * Best case O(n), the list is in order
	 * 
	 * */
	public static void insertionSort( List<Integer> list ) {
		for( int i = 1; i < list.size(); ++i ) {
			int key = list.get( i );
			int j = i - 1;
			
			while( j >= 0 && list.get( j ) > key ) {
				list.set( j + 1, list.get( j ) );
				--j;
			}
			
			list.set( j + 1 , key );
		}
	}
	
	public void test() {
		test2();
		System.out.println( "Metodo no estatico." );
	}
	
	public static void test2() {
		// this.test();				Error en tiempo de compilacion  
		System.out.println( "Metodo estatico." );
	}
	
	public static void mergeSort( List<Integer> list, int p, int q, int r ) {
		int n1 = q - p + 1;
		int n2 = r - q;
		List<Integer> left = new ArrayList<>( n1 );
		List<Integer> right = new ArrayList<>( n2 );
		
//		for( int i = 0; i < n1; ++i )
//			left[ i ] = list.get( p + i );
	}
}
