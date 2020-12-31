package model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Set;

/**
Юзер должен голосовать за ресторан (id ресторана), в котором он сегодня желает обедать.
Только один голос учитывается. Если юзер меняет свое решение в тот же день, то до 11:00 он еще может его изменить.
 */
@Entity
@Table(name = "users")
public class User extends AbstractNamedEntity {

    @Column(name = "email")
    private String email;

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "role"))
    @ElementCollection
    private Set<Role> roles;

    @OneToMany(mappedBy = "admin", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Restaurant> restaurants;

    public User(Integer id, String name, String email, Role... roles) {
        super(id, name);
        this.email = email;
        setRoles(Set.of(roles));
    }

    public User() {

    }

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<Restaurant> restaurants) {
        this.restaurants = restaurants;
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
}
