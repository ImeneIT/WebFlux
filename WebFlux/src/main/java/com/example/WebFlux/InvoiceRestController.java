package com.example.WebFlux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/invoice")
public class InvoiceRestController {

	@Autowired
	private IInvoiceService service;
	
	@PostMapping("/save")
	public Mono<Invoice> saveOneInvoice(@RequestBody Invoice invoice){
		return service.saveInvoice(invoice);
				// for Mono<String>
				// service.saveInvoice(invoice);
				// return Mono.just("Invoice saved" + invoice.getId());
	}
	
	@GetMapping("/allInvoices")
	public Flux<Invoice> getAllInvoices(){
		return service.findAllInvoices();
	}
	
	@GetMapping("/get/{id}")
	public Mono<Invoice> getOneInvoice(@PathVariable Integer id){
		Mono<Invoice> invoice= service.getOneInvoice(id);
		return invoice;
	}
	
	@DeleteMapping("/delete/{id}")
	public Mono<String> deleteInvoice(@PathVariable Integer id){
		service.deleteInvoice(id);
		return Mono.just("Invoice with id: " +id+ " deleted !");
	}
}