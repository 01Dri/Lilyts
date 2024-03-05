package br.com.lilyts.Lilyts.repository;

import br.com.lilyts.Lilyts.entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesReposiitory extends JpaRepository<Sales, Long> {
}
