package ru.arsenev.restaurant.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.arsenev.restaurant.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
