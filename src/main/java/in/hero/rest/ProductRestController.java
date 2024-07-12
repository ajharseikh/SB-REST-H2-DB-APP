package in.hero.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.hero.entity.Product;
import in.hero.repository.ProductRepository;

@RestController
@CrossOrigin
public class ProductRestController {
	
	private ProductRepository repo;
	
	//@Autowired
	public ProductRestController(ProductRepository repo) {
		this.repo=repo;
	}
	
	@PostMapping(value="/product", consumes= {"application/json"})
	public ResponseEntity<String> saveProduct(@RequestBody Product product){
		repo.save(product);
		return new ResponseEntity<>("Product saved", HttpStatus.CREATED);
	}
	
	@GetMapping(value="/products", produces= {"application/json"})
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> li=repo.findAll();
		return new ResponseEntity<>(li, HttpStatus.OK);
	}
}
