package ch.zhaw.projectX_fopmaluk.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import ch.zhaw.projectX_fopmaluk.entities.Navigation;

@NoRepositoryBean
public interface BaseNavigationRepository<T extends Navigation> extends BaseRepository<T>{

	@Query("select n from #{#entityName} n where n.name = ?1")
    List<T> findByName(String name);
}
