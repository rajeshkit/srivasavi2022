package secondproject;

	public class Trainee {
		int traineeId; // primitive instance variable
		String traineeName;//reference instance variable
		
		public Trainee(int traineeId, String traineeName) {
			this.traineeId = traineeId;
			this.traineeName = traineeName;
		}
		public static void main(String[] args) {// static method
			
			Trainee t1=new Trainee(100,"abc");
			System.out.println(t1.traineeId);
			System.out.println(t1.traineeName);
			Trainee t2=new Trainee(200,"bcd");
			System.out.println(t2.traineeId);
			System.out.println(t2.traineeName);
			Trainee t3=new Trainee(300,"def");
			System.out.println(t3.traineeId);
			System.out.println(t3.traineeName);
		}
	}
