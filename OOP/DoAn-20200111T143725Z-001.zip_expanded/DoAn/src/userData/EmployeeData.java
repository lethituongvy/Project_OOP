package userData;

import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeeData {
	public static List<Employee> employee = new ArrayList<>();

	public static void employeeData() {
		int empCode1 = (employee.size() > 0) ? (employee.size() + 1) : 1;
		Employee employee1 = new Employee("hung", "a", empCode1, "Nguyen Van Hung", "Quang Binh", "590465", 15, 120000,
				19);
		employee.add(employee1);

		int empCode2 = (employee.size() > 0) ? (employee.size() + 1) : 1;
		Employee employee2 = new Employee("long", "2", empCode2, "Duong Long", "Ha Noi", "4686346", 19, 500000, 18);
		employee.add(employee2);

		int empCode3 = (employee.size() > 0) ? (employee.size() + 1) : 1;
		Employee employee3 = new Employee("linh", "3", empCode3, "Linh Dan", "Nghe An", "8936509632", 10, 400000, 27);
		employee.add(employee3);

		int empCode4 = (employee.size() > 0) ? (employee.size() + 1) : 1;
		Employee employee4 = new Employee("minh", "4", empCode4, "Hong Minh", "Ben Tre", "6303596", 20, 700000, 25);
		employee.add(employee4);

		int empCode5 = (employee.size() > 0) ? (employee.size() + 1) : 1;
		Employee employee5 = new Employee("truong", "5", empCode5, "Minh Truong", "Long An", "359066", 23, 200000, 16);
		employee.add(employee5);

		int empCode6 = (employee.size() > 0) ? (employee.size() + 1) : 1;
		Employee employee6 = new Employee("duy", "6", empCode6, "Van Duy", "Ha Tinh", "630956", 23, 600000, 19);
		employee.add(employee6);

		int empCode7 = (employee.size() > 0) ? (employee.size() + 1) : 1;
		Employee employee7 = new Employee("chuc", "7", empCode7, "Cong Chuc", "Binh Duong", "9653056", 12, 700000, 16);
		employee.add(employee7);

		int empCode8 = (employee.size() > 0) ? (employee.size() + 1) : 1;
		Employee employee8 = new Employee("thai", "8", empCode8, "Hong Thai", "Lao Cai", "84380523", 19, 900000, 25);
		employee.add(employee8);

		int empCode9 = (employee.size() > 0) ? (employee.size() + 1) : 1;
		Employee employee9 = new Employee("thoai", "9", empCode9, "Van Thoai", "Thai Nguyen", "8429252462", 12, 900000,
				23);
		employee.add(employee9);

		int empCode10 = (employee.size() > 0) ? (employee.size() + 1) : 1;
		Employee employee10 = new Employee("doan", "10", empCode10, "Van Doan", "Binh Dinh", "9-532563265", 15, 400000,
				28);
		employee.add(employee10);

		int empCode11 = (employee.size() > 0) ? (employee.size() + 1) : 1;
		Employee employee11 = new Employee("son", "01", empCode11, "Kim Son", "Da Nang", "6365035", 29, 400000, 30);
		employee.add(employee11);

		int empCode12 = (employee.size() > 0) ? (employee.size() + 1) : 1;
		Employee employee12 = new Employee("dat", "02", empCode12, "Ba Dat", "Kien Giang", "57576585", 30, 800000, 28);
		employee.add(employee12);
		int empCode13 = (employee.size() > 0) ? (employee.size() + 1) : 1;
		Employee employee13 = new Employee("vu", "03", empCode13, "Thanh Vu", "Binh Dinh", "47373484", 17, 2000000, 25);
		employee.add(employee13);
	}
}