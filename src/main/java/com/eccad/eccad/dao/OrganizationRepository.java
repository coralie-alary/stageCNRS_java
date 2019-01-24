package com.eccad.eccad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eccad.eccad.model.Organization;

//En étendant le répertoire Spring CrudRepository, nous aurons implémenté certaines méthodes pour notre référentiel de données, 
//notamment findAll (). 

@Repository
public interface OrganizationRepository extends
		JpaRepository<Organization, Integer> {

}
