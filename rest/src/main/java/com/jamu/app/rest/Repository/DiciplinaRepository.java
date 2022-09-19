package com.jamu.app.rest.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jamu.app.rest.Models.Diciplina;

@Repository
public interface DiciplinaRepository extends JpaRepository <Diciplina, Long> {
   
}


