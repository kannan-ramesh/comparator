package com.kannanrameshrk;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator1 implements Comparator {

	public static void main(String[] args) {
		TreeSet<Student> set=new TreeSet<>(new Comparator1());
		
		set.add(new Student("Ramesh",75));
		set.add(new Student("kannan",50));
		set.add(new Student("rk",65));
		set.add(new Student("suresh",45));
		
		 System.out.println(set);
	}

	@Override
	public int compare(Object o1, Object o2) {
		int marks1=((Student) o1).getMarks();
		int marks2=((Student) o2).getMarks();
		return marks1-marks2;
	}

}
