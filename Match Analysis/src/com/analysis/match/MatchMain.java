package com.analysis.match;

import java.util.ArrayList;
import java.util.List;

public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfMatches = 10;
		List<Integer> list = new ArrayList<Integer>();
		list.add(250);
		list.add(350);
		list.add(200);
		list.add(200);
		list.add(340);
		list.add(150);
		list.add(280);
		list.add(360);
		list.add(250);
		list.add(280);
		
		int sum = 0;
		for(Integer b : list) {
			sum = b+sum;
		}
		System.out.println("The total points scored are : " + sum);
		System.out.println("The average points scored are : " + sum/noOfMatches);



	}

}
