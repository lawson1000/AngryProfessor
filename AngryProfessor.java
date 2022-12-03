package solveProblems;

import java.util.*;

public class AngryProfessor {
	Scanner sc = new Scanner(System.in);

	int K_NumberOfPresentStudent;
	int N_NumberOfStudents;
	int T_NumberOfTestCases;
	int Attendee;
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
				while (true) {
					try {
						System.out.println(">> Enter Number of Present Student: ");
						K_NumberOfPresentStudent = sc.nextInt();
						if (K_NumberOfPresentStudent >= 1 && K_NumberOfPresentStudent <= N_NumberOfStudents) {
							break;
						} else {
							System.err.println("Enter between the range of Number of Students");
						}

					} catch (InputMismatchException e) {
						System.err.println("Invalid Input");
						sc.next();
					}

				}

				System.out.println(N_NumberOfStudents + " " + K_NumberOfPresentStudent);

				for (int a = 0; a < N_NumberOfStudents; a++) {

					while (true) {
						try {
							System.out.println(">> Enter time Student Entered: ");
							Attendee = sc.nextInt();
							if (Attendee >= -100 && Attendee <= 100) {
								if (Attendee <= 0) {
									count += 1;
									break;
								}
								break;
							} else {
								System.err.println("Enter between the range of -100 - 100");
							}

						} catch (InputMismatchException e) {
							System.err.println("Invalid Input");
							sc.next();
						}
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
