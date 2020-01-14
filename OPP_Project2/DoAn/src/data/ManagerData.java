package data;

import java.util.ArrayList;
import java.util.List;
import model.Manager;

public class ManagerData {
	public static List<Manager> manager = new ArrayList<>();

	public static void managerData() {
		int manaCode1 = (manager.size() > 0) ? (manager.size() + 1) : 1;
		Manager manager1 = new Manager("hiep", "a", manaCode1, "Bui Huu Hiep", "Binh Dinh", "0979548034", 30, 15000000,
				19);
		manager.add(manager1);
		int manaCode2 = (manager.size() > 0) ? (manager.size() + 1) : 1;
		Manager manager2 = new Manager("vyvy", "2", manaCode2, "Le Thi Tuong Vy", "Binh Dinh", "013982452", 25,
				12000000, 19);
		manager.add(manager2);

	}

}
