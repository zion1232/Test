
	Scanner s = new Scanner(System.in);
	int attendance, examGrade, middleExam, hwGrade;
	double tempGrade;
	double finalGrade;
	System.out.println("Enter the attendance");
	attendance=s.nextInt();

	if (attendance < 80)
		finalGrade = 0;
	else

	{
		System.out.println("Enter the examGrade");
		examGrade=s.nextInt();

		if (examGrade < 60)
			finalGrade = examGrade;

		else
		{
			System.out.println("Enter the middleExam");
			middleExam=s.nextInt();
			tempGrade = 0.8*examGrade + 0.2*middleExam;
			if (tempGrade < examGrade)
				tempGrade = examGrade;

			System.out.println("Enter the hwGrade");
			hwGrade=s.nextInt();

			finalGrade = 0.1*hwGrade + 0.9*tempGrade;

		}
	}

	System.out.println("the Grade is "  + finalGrade );

	
}
	
}
