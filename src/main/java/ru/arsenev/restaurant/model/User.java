package ru.arsenev.restaurant.model;

import javax.persistence.*;
import java.util.Set;

/**
Юзер должен голосовать за ресторан (id ресторана), в котором он сегодня желает обедать.
Только один голос учитывается. Если юзер меняет свое решение в тот же день, то до 11:00 он еще может его изменить.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @SequenceGenerator(
            name = "users_seq",
            sequenceName = "users_seq",
            allocationSize = 1,
            initialValue = 100000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_seq"
    )
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "role"))
    @ElementCollection
    private Set<Role> roles;

    public User(Integer id, String name, String email, Role... roles) {
        this.id = id;
        this.name = name;
        this.email = email;
        setRoles(Set.of(roles));
    }

    public User(String name, String email, Role... roles) {
        this.name = name;
        this.email = email;
        setRoles(Set.of(roles));
    }


    public User() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
