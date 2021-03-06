package br.com.joseluiz.pedidex.repositories;

import br.com.joseluiz.pedidex.models.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
