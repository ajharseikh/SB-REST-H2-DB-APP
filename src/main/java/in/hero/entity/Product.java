package in.hero.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name="product")
@Data
public class Product {

	@Id
	@Column(name="productId")
	private int id;
	
	@Column(name="productName")
	private String name;
	private double price;
}
