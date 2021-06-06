package com.ojas.Polymorphism;

import java.util.Scanner;

enum ManagerType{
​​​​​​​
    HR, SALES
}

class Employees {
	​String name;
	int id;
	double salary;

	public Employees() {​​​​​​​
        super();
  }
	public Employees(String name, int id, double salary) {​​​​​​​
        super();
        this.name = name;
        this.id = id;
        this.salary = salary;
    }​ ​ ​ ​ ​ ​ ​

	public String getName() {​​​​​​​
        return name;
    }​ ​ ​ ​ ​ ​ ​

	public void setName(String name) {​​​​​​​
        this.name = name;
    }​ ​ ​ ​ ​ ​ ​

	public int getId() {​​​​​​​
        return id;
    }​ ​ ​ ​ ​ ​ ​

	public void setId(int id) {​​​​​​​
        this.id = id;
    }​ ​ ​ ​ ​ ​ ​

	public double getSalary() {​​​​​​​
        return salary;
    }​ ​ ​ ​ ​ ​ ​

	public void setSalary(double salary) {​​​​​​​
        this.salary = salary;
    }​ ​ ​ ​ ​ ​ ​
}​ ​ ​ ​ ​ ​ ​ ​ ​ ​ ​ ​ ​ ​

class Manager extends Employees {
	​ ​ ​ ​ ​ ​ ​
	ManagerType type;

	public Manager() {​​​​​​​
        super();
	}​ ​ ​ ​ ​ ​ ​

	public Manager(String name, int id, double salary, ManagerType type) {​​​​​​​
        super(name, id, salary);
        this.type = type;
    }​ ​ ​ ​ ​ ​ ​

	public ManagerType getType() {​​​​​​​
        return type;
    }​ ​ ​ ​ ​ ​ ​

	public void setType(ManagerType type) {​​​​​​​
        this.type = type;
    }​ ​ ​ ​ ​ ​ ​

	String setSalary() {​​​​​​​
        String res = "";
        switch (type) {​​​​​​​
        case HR:
            res = "Total salary : " + (salary + 1000);
            break;
        case SALES:
            res = "Total salary : " + (salary + 5000);
            break;
        }​​​​​​​
        return res;
    }​ ​ ​ ​ ​ ​ ​

	@Override
    public String toString() {​​​​​​​
        return "Manager [type=" + type + ", name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }​ ​ ​ ​ ​ ​ ​

}​ ​ ​ ​ ​ ​ ​

class Clerk extends Employees {
	​ ​ ​ ​ ​ ​ ​
	int speed;
	int accuracy;

	public Clerk() {​​​​​​​
        super();
   }​ ​ ​ ​ ​ ​ ​

	public Clerk(String name, int id, double salary, int speed, int accuracy) {​​​​​​​
        super(name, id, salary);
        this.speed = speed;
        this.accuracy = accuracy;


    }​ ​ ​ ​ ​ ​ ​

	public int getSpeed() {​​​​​​​
        return speed;
    }​ ​ ​ ​ ​ ​ ​

	public void setSpeed(int speed) {​​​​​​​
        this.speed = speed;
    }​ ​ ​ ​ ​ ​ ​

	public int getAccuracy() {​​​​​​​
        return accuracy;
    }​ ​ ​ ​ ​ ​ ​

	public void setAccuracy(int accuracy) {​​​​​​​
        this.accuracy = accuracy;
    }​ ​ ​ ​ ​ ​ ​

	double setSalary() {​​​​​​​
        double res = 0;
        if (speed > 70 && accuracy > 80) {​​​​​​​
            res = salary + 1000;
        }​​​​​​​ else {​​​​​​​
            res = salary;
        }​​​​​​​
        return res;
    }​ ​ ​ ​ ​ ​ ​

	@Override
    public String toString() {​​​​​​​
        return "Clerk [speed=" + speed + ", accuracy=" + accuracy + ", name=" + name + ", id=" + id + ", salary="
                + setSalary() + "]";
    }​ ​ ​ ​ ​ ​ ​

}​

public class ManagerTester {​
	public static void main(String[] args) {​​​​​​​
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name,id salary");
        Manager m1 = new Manager(scanner.next(), scanner.nextInt(), scanner.nextDouble(), ManagerType.HR);
        System.out.println("The salary is : " + m1.setSalary());
        System.out.println(m1);
        System.out.println("Enter the name,id salary,speed,Accuracy");
        Clerk c1 = new Clerk(scanner.next(), scanner.nextInt(), scanner.nextDouble(), scanner.nextInt(),
                scanner.nextInt());
        System.out.println("The salary : " + c1.setSalary());
        System.out.println(c1);


        scanner.close();
 }​ ​ ​ ​ ​ ​
	​}​ ​ ​ ​ ​ ​ ​
