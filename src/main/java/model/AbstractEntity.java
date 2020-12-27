package model;

public abstract class AbstractEntity {
    private Integer id;

    public AbstractEntity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
    public AbstractEntity(){

    }
}
