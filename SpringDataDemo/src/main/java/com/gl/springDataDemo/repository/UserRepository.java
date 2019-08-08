package com.gl.springDataDemo.repository;

import com.gl.springDataDemo.dto.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //indexed query
    @Query("select u from User u where u.firstName=?1")
    List<User> getAllUserByFirstName(String firstName);

    //named query

    @Query(value = "select u from User u where u.gender=:gender"/*, nativeQuery = true*/)
    List<User> getUsersByGender(@Param("gender")String gender1);


    //@Lock(LockModeType.WRITE)
    @Transactional
    @Modifying
    @Query("update User u set u.address=?2 where u.id=?1")
    void updateAddress(Long id, String newAddress);

    //@Lock(LockModeType.READ)
    @Query("select u from User u where u.gender=:gender")
    List<User> getUsersByGenderAndSort(@Param("gender")String gender1, Sort sort);
}
