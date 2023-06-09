package myDBtest.domain;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Objects;

public class Student {
    private long id;
    private String name;
    private String surname;
    private String patronymic;
    private Date birthdate;
    private String groupName;
    private static final SimpleDateFormat formatter = new SimpleDateFormat("d MMMM yyyy г.", Locale.getDefault());

    public Student(long id, String name, String surname, String patronymic, Date birthdate, String groupName) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthdate = birthdate;
        this.groupName = groupName;
    }

    public Student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student id - " + getId() +
                " | name: " + getName() +
                ", surname: " + getSurname() +
                ", patronymic: " + getPatronymic() +
                " | birthdate: " + formatter.format(getBirthdate()) +
                " | group: " + getGroupName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getId() == student.getId() && getName().equals(student.getName())
                && getSurname().equals(student.getSurname())
                && getPatronymic().equals(student.getPatronymic())
                && getBirthdate().equals(student.getBirthdate())
                && getGroupName().equals(student.getGroupName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getPatronymic(), getBirthdate(), getGroupName());
    }
}
