package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	private int id;
	private String name;
	private String department;
	private int sal;
	public Employee(int id, String name, String department, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", sal=" + sal + "]";
	}
	
}
public class EmployeeGroupBy {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(1, "ravi", "it", 20));
		list.add(new Employee(2, "mavi", "it", 30));
		list.add(new Employee(4, "savi", "HR", 12));
		list.add(new Employee(3, "kavi", "HR", 10));
		
		List<Employee> list1 = 	list.stream().sorted(Comparator.comparingInt(x -> x.getSal()))
		            .sorted(Comparator.comparing(x -> x.getName())).collect(Collectors.toList());
		
		for(Employee e : list1) {
			System.out.println(e.toString());
		}
		
		Map<Object, Optional<Employee>> result = list.stream()
				.collect(Collectors.groupingBy(x -> x.getDepartment(), 
						Collectors.maxBy(Comparator.comparing(x -> x.getSal()))));
		
		for(Object o : result.keySet()) {
			System.out.println(o +" "+ result.get(o).get().getSal());
		}
		
		
	}

}
