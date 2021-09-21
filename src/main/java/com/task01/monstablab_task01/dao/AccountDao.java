package com.task01.monstablab_task01.dao;

import com.task01.monstablab_task01.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface AccountDao extends JpaRepository<Account, String> {
//  List<Account> findaAll();
}
