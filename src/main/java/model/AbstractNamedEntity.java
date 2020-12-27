package model;

public abstract class AbstractNamedEntity extends AbstractEntity {

    private String name;

    public AbstractNamedEntity(Integer id, String name){
        super(id);
        this.name = name;
    }

    public AbstractNamedEntity() {
    }

    public String getName() {
        return name;
    }
}
