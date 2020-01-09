package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
//TODO : Why this command classes are created.
public class CategoryCommand {
	
	private Long id;
    private String description;

}
