package academy.belhard;

import java.util.Objects;

public final class Person {
    private final String lastName;
    private final String firstName;
    private final Gender gender;

    public Person(String lastName, String firstName, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName) && Objects.equals(firstName, person.firstName) && gender == person.gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, gender);

    }

}
