public class Employee {
    private long id;
    private String nameVacancy;
    private Vacancy vacancy;

    public Employee(long id, String nameVacancy) {
        this.id = id;
        this.nameVacancy = nameVacancy;
        vacancy = new Vacancy (nameVacancy);
    }

    public long getId() {
        return id;
    }

    public String getNameVacancy() {
        return vacancy.getVacancy ();
    }


}
