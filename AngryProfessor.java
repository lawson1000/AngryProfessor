package solveProblems;

import java.util.*;

public class AngryProfessor {
	Scanner sc = new Scanner(System.in);

	int K_NumberOfPresentStudent;
	int N_NumberOfStudents;
	int T_NumberOfTestCases;
	int b;
	int count = 0;

	public AngryProfessor(int T_NumberOfTestCases) {
		if (T_NumberOfTestCases >= 1 && T_NumberOfTestCases <= 10) {

			System.out.println(T_NumberOfTestCases);

			for (int i = 0; i < T_NumberOfTestCases; i++) {
				while (true) { 
					try {
						System.out.println(">> Enter Number of total Student: ");
						N_NumberOfStudents = sc.nextInt();
						if (N_NumberOfStudents >= 1 && N_NumberOfStudents <= 1000) {
							break;
						} else {
							System.err.println("Enter between 1-1000");
						}

					} catch (InputMismatchException e) {
						System.err.println("Invalid Input");
						sc.next();
					}

				}
				
				System.out.println(">> Enter Number of Present Student: ");
				K_NumberOfPresentStudent = sc.nextInt();

				System.out.println(N_NumberOfStudents + " " + K_NumberOfPresentStudent);

				for (int a = 0; a < N_NumberOfStudents; a++) {
					System.out.println(">> Enter time Student Entered: ");
					b = sc.nextInt();
					if (b <= 0) {
						count += 1;
					}

				}
				if (count >= K_NumberOfPresentStudent) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}
			}
			
		} else {
			System.err.println("Enter between 1-10");
		}
	}

	public static void main(String[] args) {

		AngryProfessor ass = new AngryProfessor(2);

	}

}
