/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

// Write your code here
package com.example.geohub.repository;

import com.example.geohub.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityJpaRepository extends JpaRepository<City, Integer> {

}