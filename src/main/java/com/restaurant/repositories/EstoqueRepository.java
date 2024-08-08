package com.restaurant.repositories;

import com.restaurant.models.EstoqueEntity;
import com.restaurant.models.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<EstoqueEntity, Long> {
}
