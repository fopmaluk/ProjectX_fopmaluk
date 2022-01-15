package ch.zhaw.projectX_fopmaluk.controller;

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
}
