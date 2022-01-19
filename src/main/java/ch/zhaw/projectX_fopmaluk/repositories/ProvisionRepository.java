package ch.zhaw.projectX_fopmaluk.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;

import ch.zhaw.projectX_fopmaluk.entities.Provision;

public interface ProvisionRepository extends BaseRepository<Provision>{

	@Query("SELECT p1.page.id, p2.page.id FROM Provision p1 INNER JOIN Provision p2 ON p1.menu.id = p2.menu.id AND p1.page.id > p2.page.id")
//	@Query(value= "SELECT p1.page_id AS lhs, p2.page_id AS rhs FROM projectx_fopmaluk.provision p1, projectx_fopmaluk.provision p2 WHERE p1.menu_id = p2.menu_id AND p1.page_id < p2.page_id", nativeQuery=true)
	Collection<Long> findEdges();
}