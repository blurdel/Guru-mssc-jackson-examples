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
		
		String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":1234512345,\"price\":\"12.99\",\"createdDate\":\"2022-06-01T18:45:25-0400\",\"lastUpdatedDate\":\"2022-06-01T18:45:25.222741528-04:00\",\"myLocalDate\":\"20220601\",\"beerId\":\"29e8db3a-639a-4523-975b-859424ec4e2e\"}";
		
		BeerDto beer = mapper.readValue(json, BeerDto.class);
		
		System.out.println(beer);
	}
	
}
