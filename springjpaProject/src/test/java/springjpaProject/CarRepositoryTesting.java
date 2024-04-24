package springjpaProject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.kpit.repo.CarRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="{classpath.myspring.xml}")
public class CarRepositoryTesting {
	@Autowired
	CarRepository carRepo;
	
	@Test
	public void createCarTest() {
		
	}
	
}
