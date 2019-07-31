package com.gl.springDataDemo.repository;

import com.gl.springDataDemo.dto.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Transactional
    @Modifying
    @Query("update User set address=:address where id = :id ")
    void updateAddress(@Param("id") Long id,
                       @Param("address") String address);

    User findByFirstName(String firstName);
   /* @Override
            @Transactional()
    <S extends User> Iterable<S> saveAll(Iterable<S> entities);*/
}
