/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infosys.irs.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.infosys.irs.entity.AdminUserEntity;


@Repository
public interface AdminUserRepository extends JpaRepository<AdminUserEntity, String> {
	
	@Modifying(clearAutomatically = true)
    @Transactional
    @Query(value="update AdminUserEntity set password=:password where email=:email and phone=:phone")
    int updatePassword(@Param("email") String email, @Param("phone") String phone,@Param("password") String password);
}