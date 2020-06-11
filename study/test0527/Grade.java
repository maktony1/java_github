package test0527;

import java.util.Scanner;

public class Grade {
	int math, science, english;
	double avg;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	double average() {
		return (math+science+english)/3;
	}
}
