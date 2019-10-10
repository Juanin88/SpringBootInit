/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.models;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author juangarfias
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
      List<Customer> findByLastName(String lastName);

	Customer findById(long id);
}
