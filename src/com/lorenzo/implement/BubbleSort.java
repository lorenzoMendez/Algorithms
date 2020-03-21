package com.lorenzo.implement;

import java.util.List;

public class BubbleSort {
	
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
