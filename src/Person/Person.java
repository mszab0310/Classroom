package Person;

public abstract class Person {
    protected int id;
    protected String name;
    protected String birthDate;
    public abstract int getId();
    public abstract String getName();
    public abstract String getBirthDate();
    public abstract void setId(int id);
    public abstract void setName(String name);
    public abstract void setDate(String birthDate);

}
