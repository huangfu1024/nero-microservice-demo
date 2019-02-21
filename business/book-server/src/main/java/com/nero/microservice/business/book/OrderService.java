package com.nero.microservice.business.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * date : 2019-02-21
 * time : 10:27
 * </p>
 *
 * @author Nero
 */
@RestController
public class OrderService {

    @GetMapping("/book/{id}")
    public String getBook(@PathVariable String id) {

        return "id: " + id + ", name: 道德经";
    }
}
