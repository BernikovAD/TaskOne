public class Employee {
    private long id;
    private String vacancy;

    public Employee(long id, String vacancy) {
        this.id = id;
        this.vacancy = vacancy;
    }

    public Employee(long id) {
        this.id = id;
        this.vacancy = vacancy;
    }


    public long getId() {
        return id;
    }

    public String getVacancy() {
        return getVacancy ();
    }
}
class Vacancy {
    public static Employee createAnon(int id, String vacancy) {
        return new Employee (id, vacancy) {
            public String getVacancy() {
                return vacancy;
            }
        };
    }
}