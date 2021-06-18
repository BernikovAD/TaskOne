public class TaskOne {
    /*    public static void main(String[] args) {
        Employee tester = new Employee(7,“Developer”);
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
    class Employee {
        private long id;
        private Vacancy vacancy;
        String getVacancy() {
            return vacancy.getVacancy();
        }
        long getId() {
            return id;
        }
    }
    class Vacancy {
        String getVacancy() {
            return "engineer";
        }
    }
    В данной реализации нет конструкторов, которые создают объект Employee и Vacancy
    Так же вызов метода tester.getVacancy(); не может осуществиться, так как в объкте класса Employee нет метода такого
    */
    public static void main(String[] args) {
        Employee tester = Vacancy.createAnon(7,"Developer");
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy ());

    }

}
