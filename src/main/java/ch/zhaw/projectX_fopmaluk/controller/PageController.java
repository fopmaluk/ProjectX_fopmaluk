package ch.zhaw.projectX_fopmaluk.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.projectX_fopmaluk.entities.Page;
import ch.zhaw.projectX_fopmaluk.repositories.BaseRepository;
import ch.zhaw.projectX_fopmaluk.repositories.PageRepository;

@RestController
@RequestMapping(value = "/page")
public class PageController extends BaseController<Page> {
	private final PageRepository pageRepository;
	
	public PageController(BaseRepository<Page> baseRepository, PageRepository pageRepository) {
		super(baseRepository);
        this.pageRepository = pageRepository;
	}
	
	@GetMapping(value = "/title/{title}")
    public ResponseEntity<List<Page>> readByName(@PathVariable String title) {
        try {
            List<Page> readTitles = this.pageRepository.findByTitle(title);
            super.logger.info("Read " + readTitles.size() + " " + super.entityName + " by name [" + title + "]");
            return new ResponseEntity<>(readTitles, HttpStatus.OK);
        } catch (Exception e) {
            super.logger.severe("Failed to read " + super.entityName + " by name [" + title + "]");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
