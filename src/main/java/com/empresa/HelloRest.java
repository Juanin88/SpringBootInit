/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa;

import com.empresa.services.Utils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {

    @RequestMapping("/hello")
    public String helloWorld() {
        Utils u = new Utils();
        String nombre = u.test();
        return "Hello : " + nombre;

    }
}
