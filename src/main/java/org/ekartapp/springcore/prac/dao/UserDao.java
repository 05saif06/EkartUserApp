package org.ekartapp.springcore.prac.dao;

import org.ekartapp.springcore.prac.model.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserTable,String> {

}
