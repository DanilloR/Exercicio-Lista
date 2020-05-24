package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Double increaseSalary(double percentage) {
		return this.salary = ((salary*percentage)/100)+salary;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString() {
		return id
				+", "+name
				+", " 
				+ String.format("%.2f", salary);
	}
}
