package solveProblems;

import java.util.*;

public class AngryProfessor {
	Scanner sc = new Scanner(System.in);

	int K_NumberOfPresentStudent;
	int N_NumberOfStudents;
	int T_NumberOfTestCases;
	int b;
	int count = 0;

//	, int N_NumberOfStudents, int K_NumberOfPresentStudent
	public AngryProfessor(int T_NumberOfTestCases) {
		if (T_NumberOfTestCases >= 1 && T_NumberOfTestCases <= 10) {

			System.out.println(T_NumberOfTestCases);

		} else {
			System.err.println("Enter between 1-10");
		}
	}

	public static void main(String[] args) {
		AngryProfessor ass = new AngryProfessor(2);

	}

}
