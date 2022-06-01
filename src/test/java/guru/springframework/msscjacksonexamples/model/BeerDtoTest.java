package guru.springframework.msscjacksonexamples.model;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;


@JsonTest
class BeerDtoTest extends BaseTest {
	
	@Test
	void testSerializeDto() throws JsonProcessingException {
		
		BeerDto beer = getBeerDto();
		
		String json = mapper.writeValueAsString(beer);
		
		System.out.println(json);
	}

	@Test
	void testDeserialize() throws JsonParseException, JsonMappingException, IOException {
		
		String json = "{\"id\":\"1319e55e-9ac5-41ca-a117-c5d895d9fc77\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":1234512345,\"price\":12.99,\"createdDate\":\"2022-06-01T17:42:21.01445354-04:00\",\"lastUpdatedDate\":\"2022-06-01T17:42:21.016018402-04:00\"}";
		
		BeerDto beer = mapper.readValue(json, BeerDto.class);
		
		System.out.println(beer);
	}
	
}
