public class Employee {
    private long id;
    private Vacancy vacancy;

    public Employee(long id, String vacancy) {
        this.id = id;
        this.vacancy = new Vacancy (vacancy);
    }

    long getId() {
        return id;
    }

    String getVacancy() {
        return vacancy.getVacancy ();
    }

}
