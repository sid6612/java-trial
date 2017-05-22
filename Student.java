class Student{
	static int TotalFees = 10000;
	String name;
	int feesPaid;
	int remainingFees;

	public int FeesTOBePaid(){
		int a = TotalFees + (TotalFees * 15/100);
		return a;
	}

	public int RemainingFees(){
		return FeesTOBePaid() - feesPaid;
	}

	public static void main (String args[]){
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();

		s1.name = "Leena";
		s2.name = "Harshal";
		s3.name = "Siddharth";
		s4.name = "Nimesh";
		s5.name = "Harsh";

		s1.feesPaid = 1000;
		s2.feesPaid = 1500;
		s3.feesPaid = 2000;
		s4.feesPaid = 2500;
		s5.feesPaid = 3000;

		System.out.println(s1.name  + "needs to pay :" + s1.RemainingFees());
		System.out.println(s2.name  + "needs to pay :" + s2.RemainingFees());
		System.out.println(s3.name  + "needs to pay :" + s3.RemainingFees());
		System.out.println(s4.name  + "needs to pay :" + s4.RemainingFees());
		System.out.println(s5.name  + "needs to pay :" + s5.RemainingFees());
	}
}