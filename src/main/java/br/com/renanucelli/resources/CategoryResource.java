package br.com.renanucelli.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.renanucelli.domain.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Category> listar() {
		Category cat1 = new Category(1, "Intormática");
		Category cat2 = new Category(1, "Escritório");
		
		List<Category> list = new ArrayList<>();
		list.addAll(Arrays.asList(cat1, cat2));
		
		return list;
		
	}

}
