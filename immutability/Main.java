package immutability;
public class Main {
	
	public static void main(String[] args) {
		Address address=new Address();
		address.setLine("pratap nagar");
		Employee employee=new Employee("101","Virendra Singh",address);
		System.out.println(employee);
		employee.getAddress().setLine("Mayur Vihar");
		System.out.println(employee);
	
		
		/*Manager manager=new Manager("202","Viru");
		System.out.println(manager.getId());*/
	}
}
