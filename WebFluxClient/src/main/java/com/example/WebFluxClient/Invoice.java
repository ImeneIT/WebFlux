package com.example.WebFluxClient;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Invoice {
    
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private String number;
	@NonNull
	private Double amount;
}