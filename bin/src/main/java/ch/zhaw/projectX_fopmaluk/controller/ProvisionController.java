package ch.zhaw.projectX_fopmaluk.controller;

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
}
