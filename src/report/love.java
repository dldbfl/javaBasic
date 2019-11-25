package report;

import java.util.Scanner;

public class love {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String Q1 = "Q1.나는 금방 사랑에 빠진다.";
		String Q2 = "Q2.연애할 때 끌려다니는 편이다.";
		String Q3 = "Q3.데이트 코스는 미리 짜는 편이 좋다.";
		String Q4 = "Q4.감정 기복이 크지 않다.";
		String Q5 = "Q5.감정표현에 솔직한 편이다.";
		String Q6 = "Q6.활동적인 데이트가 좋다.";
		String Q7 = "Q7.연락이 없어도 믿고 기다리는 편이다.";
		String Q8 = "Q8.이성친구는 존재할 수 없다.";
		String Q9 = "Q9.아무것도 아닌 일에 섭섭함이 쌓인다.";

		String A_type = "A타입입니다.";
		String B_type = "B타입입니다.";
		String C_type = "C타입입니다.";
		String D_type = "D타입입니다.";
		
		
		

		System.out.println(Q1 + "Y/N");
		String A = s.nextLine();

		if (A.equals("Y")) {
			System.out.println(Q2 + "Y/N");
			A = s.nextLine();

			if (A.equals("Y")) {
				System.out.println(Q5 + "Y/N");
				A = s.nextLine();

				if (A.equals("Y")) {
					System.out.println(Q8 + "Y/N");
					A = s.nextLine();

					if (A.equals("Y")) {
						System.out.println(Q9 + "Y/N");
						A = s.nextLine();

						if (A.equals("Y")) {
							A = D_type;
							System.out.println(A);
						}

						else if (A.equals("N")) {
							A = C_type;
							System.out.println(A);// Q9에서 옴.
						}
					} else if (A.equals("N")) {
						A = B_type;
						System.out.println(A);// Q8에서 옴.
					}
				}

				else if (A.equals("N")) {
					System.out.println(Q6 + "Y/N");// Q5번에서 옴.
					A = s.nextLine();

					if (A.equals("Y")) {
						System.out.println(Q8 + "Y/N");
						A = s.nextLine();

						if (A.equals("Y")) {
							System.out.println(Q9 + "Y/N");
							A = s.nextLine();

							if (A.equals("Y")) {
								A = D_type;
								System.out.println(A);
							}

							else if (A.equals("N")) {
								A = C_type;
								System.out.println(A);
							}// Q9에서 옴.
						}

						else if (A.equals("N")) {
							A = B_type;
							System.out.println(A);
						}// Q8에서 옴.
					}

					else if (A.equals("N")) {
						System.out.println(Q9 + "Y/N"); // Q6에서 옴
						A = s.nextLine();

						if (A.equals("Y")) {
							A = D_type;
							System.out.println(A);
						}

						else if (A.equals("N")) {
							A = C_type;
							System.out.println(A);
						}// Q9에서 옴.
					}

					if (A.equals("Y")) {
						System.out.println(Q8 + "Y/N");
						A = s.nextLine();

						if (A.equals("Y")) {
							System.out.println(Q9 + "Y/N");
							A = s.nextLine();

							if (A.equals("Y")) {
								A = D_type;
								System.out.println(A);
							}

							else if (A.equals("N")) {
								A = C_type;
								System.out.println(A);
							}
						}

						else if (A.equals("N")) {
							A = B_type;
							System.out.println(A);
						}
					}

					else if (A.equals("N")) {
						System.out.println(Q9 + "Y/N");
						A = s.nextLine();

						if (A.equals("Y")) {
							A = D_type;
							System.out.println(A);
						}

						else if (A.equals("N")) {
							A = C_type;
							System.out.println(A);
						}
					}
				}
			}

			else if (A.equals("N")) {
				System.out.println(Q3 + "Y/N");
				A = s.nextLine();

				if (A.equals("Y")) {
					System.out.println(Q6 + "Y/N");
					A = s.nextLine();

					if (A.equals("Y")) {
						System.out.println(Q8 + "Y/N");
						A = s.nextLine();

						if (A.equals("Y")) {
							A = A_type;
							System.out.println(A);
						}

						else if (A.equals("N")) {
							System.out.println(Q8 + "Y/N");
							A = s.nextLine();

							if (A.equals("Y")) {
								System.out.println(Q9 + "Y/N");
								A = s.nextLine();

								if (A.equals("Y")) {
									A = D_type;
									System.out.println(A);
								}

								else if (A.equals("N")) {
									A = C_type;
									System.out.println(A);
								}
							}

							else if (A.equals("N")) {
								A = B_type;
								System.out.println(A);
							}
						}
					}

					else if (A.equals("N")) {
						System.out.println(Q9 + "Y/N");
						A = s.nextLine();

						if (A.equals("Y")) {
							A = D_type;
							System.out.println(A);
						}

						else if (A.equals("N")) {
							A = C_type;
							System.out.println(A);
						}

					}
				}

				else if (A.equals("N")) {
					System.out.println(Q5 + "Y/N");
					A = s.nextLine();

					// 수리 시작합니다 2
					if (A.equals("Y")) {
						System.out.println(Q8 + "Y/N");
						A = s.nextLine();

						if (A.equals("Y")) {
							System.out.println(Q9 + "Y/N");
							A = s.nextLine();

							if (A.equals("Y")) {
								A = D_type;
								System.out.println(A);
							}

							else if (A.equals("N")) {
								A = C_type;
								System.out.println(A);
							}
						}

						else if (A.equals("N")) {
							A = B_type;
							System.out.println(B_type);
						}
					}

					else if (A.equals("N")) {
						System.out.println(Q6 + "Y/N");
						A = s.nextLine();

						if (A.equals("Y")) {
							System.out.println(Q8 + "Y/N");
							A = s.nextLine();

							if (A.equals("Y")) {
								System.out.println(Q9 + "Y/N");
								A = s.nextLine();

								if (A.equals("Y")) {
									A = D_type;
									System.out.println(A);
								}

								else if (A.equals("N")) {
									A = C_type;
									System.out.println(A);
								}
							}

							else if (A.equals("N")) {
								A = B_type;
								System.out.println(A);
							}
						}

						else if (A.equals("N")) {
							System.out.println(Q9 + "Y/N");
							A = s.nextLine();

							if (A.equals("Y")) {
								A = D_type;
								System.out.println(A);
							}

							else if (A.equals("N")) {
								A = C_type;
								System.out.println(A);
							}
						}
					}
				}
			}
		}

		else if (A.equals("N")) {
			System.out.println(Q4 + "Y/N");
			A = s.nextLine();

			if (A.equals("Y")) {
				System.out.println(Q7 + "Y/N");
				A = s.nextLine();

				if (A.equals("Y")) {
					A = A_type;
					System.out.println(A);
				}

				else if (A.equals("N")) {
					System.out.println(Q8 + "Y/N");
					A = s.nextLine();

					if (A.equals("Y")) {
						System.out.println(Q9 + "Y/N");
						A = s.nextLine();

						if (A.equals("Y")) {
							A = D_type;
							System.out.println(A);
						}

						else if (A.equals("N")) {
							A = C_type;
							System.out.println(A);
						}
					}

					else if (A.equals("N")) {
						A = B_type;
						System.out.println(A);
					}
				}
			}

			else if (A.equals("N")) {
				System.out.println(Q5 + "Y/N");
				A = s.nextLine();

				if (A.equals("Y")) {
					System.out.println(Q8 + "Y/N");
					A = s.nextLine();

					if (A.equals("Y")) {
						System.out.println(Q9 + "Y/N");
						A = s.nextLine();

						if (A.equals("Y")) {
							A = D_type;
							System.out.println(A);
						}

						else if (A.equals("N")) {
							A = C_type;
							System.out.println(A);
						}
					}

					else if (A.equals("N")) {
						A = B_type;
						System.out.println(B_type);
					}
				}

				else if (A.equals("N")) {
					System.out.println(Q6 + "Y/N");
					A = s.nextLine();

					if (A.equals("Y")) {
						System.out.println(Q8 + "Y/N");
						A = s.nextLine();

						if (A.equals("Y")) {
							System.out.println(Q9 + "Y/N");
							A = s.nextLine();

							if (A.equals("Y")) {
								A = D_type;
								System.out.println(A);
							}

							else if (A.equals("N")) {
								A = C_type;
								System.out.println(A);
							}
						}

						else if (A.equals("N")) {
							A = B_type;
							System.out.println(A);
						}
					}

					else if (A.equals("N")) {
						System.out.println(Q9 + "Y/N");
						A = s.nextLine();

						if (A.equals("Y")) {
							A = D_type;
							System.out.println(A);
						}

						else if (A.equals("N")) {
							A = C_type;
							System.out.println(A);
						}
					}
				}
			}
		}
	}
}
