public class Employee {
    private long id;
    private Vacancy vacancy;

    public Employee(long id, Vacancy vacancy) {
        this.id = id;
        this.vacancy = vacancy;
    }

    public long getId() {
        return id;
    }


}
