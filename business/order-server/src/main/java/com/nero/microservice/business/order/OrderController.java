package com.nero.microservice.business.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * date : 2019-02-21
 * time : 10:16
 * </p>
 *
 * @author Nero
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/order/book/{id}", method = RequestMethod.GET)
    public String queryBook(@PathVariable String id) {

        return restTemplate.getForObject("http://book-server/book/{0}", String.class, id);
    }
}
