abstract class Person implements Payable, Comparable<Person> {
    protected static int idCounter = 0;
    protected int id;
    protected String name;
    protected String surname;

    public Person() {
        this.id = ++idCounter;
    }

    public Person(String name, String surname) {
        this.id = ++idCounter;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("%d. %s %s", this.id, this.name, this.surname);
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}