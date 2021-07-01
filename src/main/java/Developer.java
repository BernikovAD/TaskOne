public class Developer extends Employee{
    public Developer(long id, Vacancy vacancy) {
        super (id, vacancy);
    }

    @Override
    long getId() {
        return super.getId ();
    }

    @Override
    String getVacancy() {
        return super.getVacancy ();
    }
    //Разработчики не умеют рисовать , нарушает LSP
    @Override
    boolean drawsAPicture() {
        super.drawsAPicture ();
        return false;
    }
}
