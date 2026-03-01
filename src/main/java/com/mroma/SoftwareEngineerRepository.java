package com.mroma;

import org.springframework.data.jpa.repository.JpaRepository;

//to interact with table public.software_engineer from springboot api we need to create this repository
public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer, Integer> {   //Integer to specific data type of key





}
