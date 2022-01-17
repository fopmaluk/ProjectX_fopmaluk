package ch.zhaw.projectX_fopmaluk.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ch.zhaw.projectX_fopmaluk.entities.Provision;

public interface ProvisionRepository extends BaseRepository<Provision>{

	@Query("SELECT p1.page.id, p2.page.id FROM Provision p1 INNER JOIN Provision p2 ON p1.menu.id = p2.menu.id AND p1.page.id > p2.page.id")
	List<Provision> findEdges();
}
