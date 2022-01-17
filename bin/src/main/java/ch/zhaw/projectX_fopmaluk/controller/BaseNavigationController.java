package ch.zhaw.projectX_fopmaluk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ch.zhaw.projectX_fopmaluk.entities.Navigation;
import ch.zhaw.projectX_fopmaluk.repositories.BaseNavigationRepository;
import ch.zhaw.projectX_fopmaluk.repositories.BaseRepository;

import java.util.List;

public class BaseNavigationController<T extends Navigation> extends BaseController<T> {

    protected BaseNavigationRepository<T> baseNavigationRepository;

    public BaseNavigationController(BaseRepository<T> baseRepository, BaseNavigationRepository<T> baseNavigationRepository) {
        super(baseRepository);
        this.baseNavigationRepository = baseNavigationRepository;
    }

    @GetMapping(value = "/name/{name}")
    public ResponseEntity<List<T>> readByName(@PathVariable String name) {
        try {
            List<T> readNavigation = this.baseNavigationRepository.findByName(name);
            super.logger.info("Read " + readNavigation.size() + " " + super.entityName + " by name [" + name + "]");
            return new ResponseEntity<>(readNavigation, HttpStatus.OK);
        } catch (Exception e) {
            super.logger.severe("Failed to read " + super.entityName + " by name [" + name + "]");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
