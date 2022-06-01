package guru.springframework.msscjacksonexamples.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

	@JsonProperty("beerId") // Warning!!! This overrides the naming strategy (snake, kebab) can break serial/deserialization if not careful
    @Null
    private UUID id;

    @NotBlank
    private String beerName;

    @NotBlank
    private String beerStyle;

    @Positive
    private Long upc;

    @JsonFormat(shape = JsonFormat.Shape.STRING) // Can format as String vs number
    private BigDecimal price;
    
    // yyyy-MM-dd'T'HH:mm:ssZ
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime createdDate;
    
    private OffsetDateTime lastUpdatedDate;
    
    @JsonSerialize(using = LocalDateSerializer.class) // Another way to format
    private LocalDate myLocalDate;
}
