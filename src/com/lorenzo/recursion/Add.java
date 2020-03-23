package com.lorenzo.recursion;

import java.util.List;

public class Add {

	public static Integer sum( int n ) {
		if( n == 1 )
			return n;
		return n + sum( n - 1 );
	}
	
	public static Integer sumList( List<Integer> list, int index ) {
		if( index == 0 )
			return list.get( index );
		return list.get( index ) + sumList( list, index - 1 );
	}
}
