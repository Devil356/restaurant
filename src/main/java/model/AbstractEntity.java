package model;

public abstract class AbstractEntity {
    private Integer id;

    private String name;

    public AbstractEntity(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public AbstractEntity() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
