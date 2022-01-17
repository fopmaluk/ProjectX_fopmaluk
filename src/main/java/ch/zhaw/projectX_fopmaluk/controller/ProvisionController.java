package ch.zhaw.projectX_fopmaluk.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.projectX_fopmaluk.repositories.BaseRepository;
import ch.zhaw.projectX_fopmaluk.repositories.ProvisionRepository;
import ch.zhaw.projectX_fopmaluk.entities.Provision;

@RestController
@RequestMapping(value = "/provision")
public class ProvisionController extends BaseController<Provision> {
	private final ProvisionRepository provisionRepository;
	
	public ProvisionController(BaseRepository<Provision> baseRepository, ProvisionRepository provisionRepository) {
		super(baseRepository);
        this.provisionRepository = provisionRepository;
	}
	
	@GetMapping(value = "/edges")
	public ResponseEntity<List<Provision>> findEdges() {
		List<Provision> edgesFound = this.provisionRepository.findEdges();
        super.logger.info("Read " + edgesFound.size() + " " + super.entityName);
        return new ResponseEntity<>(edgesFound, HttpStatus.OK);
	}
		/*try {
            
        } catch (Exception e) {
            super.logger.severe("Failed to read " + super.entityName);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	/*	public List<Provision> findALLmains() {

	provisionRepository.findEdges();
	return (List<Provision>) this.provisionRepository.findEdges();
} */
}
