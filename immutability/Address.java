package immutability;

public class Address {

	private String line;

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	@Override
	public String toString() {
		return "Address [line=" + line + "]";
	}
	
	
}
