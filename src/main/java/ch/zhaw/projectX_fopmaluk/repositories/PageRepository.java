package ch.zhaw.projectX_fopmaluk.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ch.zhaw.projectX_fopmaluk.entities.Page;

public interface PageRepository extends BaseRepository<Page> {

	@Query("select p from Page p where p.title = ?1")
    List<Page> findByTitle(String title);
}
