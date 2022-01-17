package ch.zhaw.projectX_fopmaluk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.projectX_fopmaluk.entities.Item;
import ch.zhaw.projectX_fopmaluk.repositories.BaseNavigationRepository;
import ch.zhaw.projectX_fopmaluk.repositories.BaseRepository;

@RestController
@RequestMapping(value = "/item")
public class ItemController extends BaseNavigationController<Item> {

	public ItemController(BaseRepository<Item> baseRepository,
			BaseNavigationRepository<Item> baseNavigationRepository) {
		super(baseRepository, baseNavigationRepository);
	}
}
