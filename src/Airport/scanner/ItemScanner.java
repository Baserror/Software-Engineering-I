package Airport.scanner;

import Airport.base.Employee;
import Airport.base.IDCard;
import Airport.base.Item;

import java.util.ArrayList;

public class ItemScanner extends Scanner implements IItemScanner {
    public ItemScanner(String uuid, String id, String type, StringSearchAlgorithm stringSearchAlgorithm, ArrayList<Employee> registeredEmployees, IReadingDevice readingDevice, Employee employee) {
        super(uuid, id, type, stringSearchAlgorithm, registeredEmployees, readingDevice, employee);
    }

    @Override
    public boolean scan(Item item, String pattern) {
        return false;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void register(Employee employee) {

    }

    @Override
    public void unregister(Employee employee) {

    }

    @Override
    public boolean login(IDCard idCard, String password) {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}
