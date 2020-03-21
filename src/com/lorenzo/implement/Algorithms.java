package com.lorenzo.implement;

import java.util.List;

public class Algorithms {
	
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
	
	public static void insertionSort( List<Integer> list ) {
		for( int i = 1; i < list.size(); ++i ) {
			int key = list.get( i );
			int j = i - 1;
			while( j >= 0 && list.get( j ) > key ) {
				list.set( j + 1, list.get( j ) );
				--j;
			}
			list.set( j + 1, key );
		}
	}

}
