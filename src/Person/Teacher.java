package Person;

import Person.Person;

public class Teacher extends Person {
    @Override
    public int getId() {
        return this.id;
    }

    public Teacher(int id, String name, String birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
