package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseTest {

	@Autowired
	ObjectMapper mapper;
	
	BeerDto getBeerDto() {
		return BeerDto.builder()
				.beerName("BeerName")
				.beerStyle("Ale")
				.id(UUID.randomUUID())
				.createdDate(OffsetDateTime.now())
				.lastUpdatedDate(OffsetDateTime.now())
				.price(new BigDecimal("12.99"))
				.upc(1234512345L)
				.build();
	}
}
