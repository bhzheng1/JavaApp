package team.service;

import team.domain.*;

import static team.service.Data.*;

public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[Data.EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = this.createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = this.createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = this.createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    private Equipment createEquipment(int index) {
        int equipmentType = Integer.parseInt(EQUIPMENTS[index][0]);
        String modelOrName = EQUIPMENTS[index][1];
        String priceOrDisplayOrType = EQUIPMENTS[index][2];

        switch (equipmentType) {
            case PC:
                return new PC(modelOrName, priceOrDisplayOrType);
            case NOTEBOOK:
                double price = Double.parseDouble(priceOrDisplayOrType);
                return new Notebook(modelOrName, price);
            case PRINTER:
                return new Printer(modelOrName, priceOrDisplayOrType);
        }
        return null;
    }

    public Employee[] getAllEmployees() {
        return this.employees;
    }

    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (id == employees[i].getId()) {
                return employees[i];
            }
        }
        throw new TeamException("no such employee");
    }
}
