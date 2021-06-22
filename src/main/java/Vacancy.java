public class Vacancy {
    private String vacancy;
    private int salary;
/*  Если в будущем изменится класс Vacancy, например, добавится поле salary
    типа int, которое нужно будет проинициализировать в конструкторе класса
    Vacancy, будем дублировать параметр в конструкторе класса Employee? Как
    можно улучшить код?*/
    public Vacancy(String vacancy,int salary) {
        this.vacancy = vacancy;
        this.salary = salary;
    }

    public String getVacancy() {
        return vacancy;
    }
}
