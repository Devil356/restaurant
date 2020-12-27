package model.user;

import model.AbstractEntity;

public abstract class AbstractUser extends AbstractEntity {
    private Integer id;

    private String name;

    private String email;

    public AbstractUser(Integer id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    public AbstractUser() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}