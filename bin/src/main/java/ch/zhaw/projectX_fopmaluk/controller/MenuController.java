package ch.zhaw.projectX_fopmaluk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.projectX_fopmaluk.entities.Menu;
import ch.zhaw.projectX_fopmaluk.repositories.BaseNavigationRepository;
import ch.zhaw.projectX_fopmaluk.repositories.BaseRepository;


@RestController
@RequestMapping(value = "/menu")
public class MenuController extends BaseNavigationController<Menu> {

	public MenuController(BaseRepository<Menu> baseRepository,
			BaseNavigationRepository<Menu> baseNavigationRepository) {
		super(baseRepository, baseNavigationRepository);
	}
}
