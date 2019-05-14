
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int Tasks, Grade, TotalGrade;
	double AVRg;
	System.out.println("enter Grade ");
	Grade=s.nextInt();
	System.out.println("enter Tasks ");
	Tasks=s.nextInt();
	System.out.println("enter AVRg ");
	AVRg=s.nextDouble();
	if (Tasks <= 4)
	{
		TotalGrade = Grade;
	}

	else if (Tasks > 4 && Tasks < 8)
	{
		if (Grade >= 60)
			TotalGrade = (int)(0.8*Grade + 0.2*AVRg);
		else
			TotalGrade = (int)(0.9*Grade + 0.1*AVRg);
	}
	else
	{
		if (Grade >= 60)		
			TotalGrade = (int)(0.7*Grade + 0.3*AVRg);
		else
			TotalGrade = (int)(0.6*Grade + 0.4*AVRg);
		}
	
	System.out.println("the Grade  " +TotalGrade);
}
}
