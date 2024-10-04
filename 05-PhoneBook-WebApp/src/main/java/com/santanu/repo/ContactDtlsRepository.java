package com.santanu.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santanu.entity.ContactEntity;

public interface ContactDtlsRepository extends JpaRepository<ContactEntity, Serializable>{

}
