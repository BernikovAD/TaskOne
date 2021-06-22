public class Employee {
    private long id;
    private Vacancy vacancy;

    public Employee(long id, Vacancy vacancy) {
        this.id = id;
        this.vacancy = vacancy;
    }

    long getId() {
        return id;
    }

    String getVacancy() {
        return vacancy.getVacancy ();
    }

}
