package app.dto;

import app.model.User;

public class UserDto {
    private Long id;
    private String name;
    private String surname;
    private Byte age;

    public UserDto(String name, String surname, Byte age, Long id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.age = user.getAge();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }
}
