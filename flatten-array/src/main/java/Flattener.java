import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flattener {
	List<Object> result = new ArrayList<>();
	
	public List<Object> flatten(List<Object> list){
		
	return list
			.stream()
			.flatMap(e -> e instanceof List ? new Flattener().flatten((List<Object>) e).stream() : Stream.of(e))
			.filter(Objects::nonNull)
			.collect(Collectors.toList());
	}
	
}