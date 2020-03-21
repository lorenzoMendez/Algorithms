package com.lorenzo.implement;

import java.util.List;

public class BinarySearch {
	
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
}
