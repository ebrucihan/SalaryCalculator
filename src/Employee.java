import java.time.LocalDate;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    // Maaşa uygulanan vergiyi hesaplayan metot
    public double tax() {
        if (salary > 1000) {

            return salary * 0.03;

        } else {
            return 0;

        }
    }

    // Bonus ücretlerini hesaplayan metot
    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    // Maaş artışını hesaplayan metot
    public double raiseSalary() {
        int currentYear = LocalDate.now().getYear();
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;

        }
    }

    // Çalışana ait bilgileri ekrana bastıran metot
    public String toString() {
        double totalSalary = salary - tax() + bonus() + raiseSalary();

        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax() +
                "\nBonus: " + bonus() +
                "\nMaaş Artışı: " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş: " + (salary - tax() + bonus()) +
                "\nToplam Maaş: " + totalSalary;


    }

}




