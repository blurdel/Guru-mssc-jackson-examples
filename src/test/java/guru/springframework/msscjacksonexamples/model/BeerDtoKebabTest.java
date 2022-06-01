package guru.springframework.msscjacksonexamples.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import com.fasterxml.jackson.core.JsonProcessingException;


@ActiveProfiles("kebab")
@JsonTest
class BeerDtoKebabTest extends BaseTest {

	@Test
	void testSerializeDto() throws JsonProcessingException {
		
		BeerDto beer = getBeerDto();
		
		String json = mapper.writeValueAsString(beer);
		
		System.out.println(json);
	}

}
