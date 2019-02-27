package com.example.officeservice1.repositories;

import com.example.officeservice1.models.File;


@Repository
public interface FileRepository extends JpaRepository<File, Long>{

}