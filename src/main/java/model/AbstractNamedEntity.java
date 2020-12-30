package model;

import javax.persistence.Column;

public abstract class AbstractNamedEntity extends AbstractEntity {

    @Column(name = "name")
    private String name;

    public AbstractNamedEntity(Integer id, String name){
        super(id);
        this.name = name;
    }

    public AbstractNamedEntity() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
