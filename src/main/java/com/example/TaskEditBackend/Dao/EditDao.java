package com.example.TaskEditBackend.Dao;

import com.example.TaskEditBackend.Model.Details;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EditDao extends CrudRepository<Details,Integer> {

    @Modifying
    @Transactional
    @Query(value="UPDATE `details` SET `id`=:id,`name`=:name,`descriptions`=:descriptions,`tickdata`=:tickdata,`tick`=:tick WHERE `id`= :id",nativeQuery = true)
    void editDetails(@Param("id") int id, @Param("name") String name,@Param("descriptions") String descriptions, @Param("tickdata") String tickdata, @Param("tick") boolean tick );

       @Query(value = "SELECT `id`, `name`, `descriptions`, `tickdata`, `tick` FROM `details` WHERE `id`= :id", nativeQuery = true)
       List<Details> Getbyid(@Param("id") int id);
}
