package com.code.Repository;

import com.code.Entity.ProductImg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductImgRepository extends JpaRepository<ProductImg,Integer> {

    @Query(value = "SELECT  p.* FROM ProductImg p WHERE ProductImg.id = ?1",nativeQuery = true)
    List<ProductImg> getByProduct(int id);
}
