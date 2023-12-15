/**
 * 
 */
package com.eurekaclient.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chandrasekaran.k
 *
 */
@RestController
@RequestMapping("/api")
public class SpringClientController {

	@RequestMapping(value="/", method = RequestMethod.GET)
    public String getName(){
        return "Welcome eureka client";
    }

}
