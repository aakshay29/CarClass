
public class CompositionBasics {
	public static void main(String[] args) {
		Person bobby = new Person();
		System.out.println(bobby.getSalary());
		System.out.println(bobby.getSchool());
		
		Job job = new Job();		
		job.setId(1);
		job.setRole("Analyst");
		job.setSalary(2500000);
		System.out.println(job.toString());
		
		Education education = new Education();
		System.out.println(education.toString());
	}
}