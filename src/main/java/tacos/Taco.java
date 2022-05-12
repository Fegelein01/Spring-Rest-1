package tacos;

import java.util.Date;
import java.util.List;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Taco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date createdAt;
	private String name;
	@ManyToMany(targetEntity = Ingredient.class)
	private List<Ingredient> ingredients;

	@PrePersist
	void createdAt() {
		this.createdAt = new Date();
	}
}
