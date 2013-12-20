import model.jpa.JpaPlanetRepo;
import model.jpa.JpaPlayerRepo;
import model.jpa.JpaUserRepo;
import play.jobs.OnApplicationStart;
import play.modules.spring.Spring;


@OnApplicationStart
public class TestDataLoader {

	public static JpaUserRepo users = Spring.getBeanOfType(JpaUserRepo.class);
	public static JpaPlayerRepo players = Spring.getBeanOfType(JpaPlayerRepo.class);
	public static JpaPlanetRepo planets = Spring.getBeanOfType(JpaPlanetRepo.class);
	
	
}
