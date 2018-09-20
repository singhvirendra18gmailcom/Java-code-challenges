package immutability;

public final class Employee {

	private String id;
	private String name;
	private Address address;

	public Employee(String id, String name,Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address=address;
	}

	public String getId() {
		return id;
	}

	public Address getAddress() {
		Address cloneAddress=new Address();
		cloneAddress.setLine(address.getLine());
		return cloneAddress;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	


}
