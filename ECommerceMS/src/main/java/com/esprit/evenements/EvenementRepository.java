package com.esprit.evenements;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EvenementRepository extends JpaRepository<Evenement, Integer>{

	@Query("select c from Evenement c where c.titre like :titre")
	public Page<Evenement> evenementByTitle(@Param("titre") String n,Pageable pageable);

}
