import java.time.LocalDate;
import java.time.LocalDateTime;

final class Gigasecond {

	private LocalDate birthDate;
	private LocalDateTime birthDateTime;
	
	private final static long secondsLived = 1000000000;
	
    Gigasecond(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        
    	
    	if (birthDate != null)
    		birthDateTime = birthDate.atStartOfDay();
    	
    	birthDateTime = birthDateTime.plusSeconds(secondsLived);
    	
    	return birthDateTime;
    }

}
