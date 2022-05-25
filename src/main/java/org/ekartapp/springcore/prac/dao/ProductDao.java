package org.ekartapp.springcore.prac.dao;

import org.ekartapp.springcore.prac.model.ProductTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<ProductTable,Integer> {

}
