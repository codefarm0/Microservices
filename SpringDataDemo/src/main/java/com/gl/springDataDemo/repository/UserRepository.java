package com.gl.springDataDemo.repository;

import com.gl.springDataDemo.dto.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    //indexed query
    @Query("select u from User u where u.firstName=?1")
    List<User> getAllUserByFirstName(String firstName);

    //named query

    @Query("select u from User u where u.gender=:gender")
    List<User> getUsersByGender(@Param("gender")String gender1);


    @Transactional
    @Modifying
    @Query("update User u set u.address=?2 where u.id=?1")
    void updateAddress(Long id, String newAddress);

}
