package model.user;

import model.AbstractNamedEntity;

public abstract class AbstractNamedUser extends AbstractNamedEntity {
    private String name;

    private String email;

    public AbstractNamedUser(Integer id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    public AbstractNamedUser() {
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
