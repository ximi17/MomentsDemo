package com.example.MomentDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByDescriptionStartingWith(String prefix);
}
