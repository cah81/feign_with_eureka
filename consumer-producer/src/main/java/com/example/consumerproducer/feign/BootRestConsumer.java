package com.example.consumerproducer.feign;

import com.example.consumerproducer.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="BOOK-SERVICE")
public interface BootRestConsumer {

    @GetMapping("/book/data")
    public String getBookData();

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable Integer id);

    @GetMapping("/book/all")
    public List<Book> getAll();

    @GetMapping("/book/entity")
    public ResponseEntity<String> getEntityData();
}
