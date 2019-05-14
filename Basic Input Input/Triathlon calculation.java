	final static double SWIMMING  = 1.5;
	final static double RUNNIG = 40;
	final static double RIDING  = 10;

	public static void main(String[] args) {
		double Swimming_speed, Running_speed, Speed_riding;
		double Swimming_time, Running_time, time_riding,total;
		
		System.out.println("enter Swimming_speed, Running_speed, Speed_riding  \n");
		Scanner scan = new Scanner(System.in);
		Swimming_speed=scan.nextDouble();
		Running_speed=scan.nextDouble();
		Speed_riding=scan.nextDouble();
		
		Swimming_time = SWIMMING/Swimming_speed;
		Running_time = RUNNIG/Running_speed;
		time_riding = RIDING/Speed_riding;
		
		
		total = Swimming_time + Running_time + time_riding;
		System.out.println("Swimming_time -  " + Swimming_time );
		System.out.println("Running_time -  " + Running_time );
		System.out.println("time_riding -  " + time_riding );
		System.out.println("total -  " + total );
		
		

	}

}
