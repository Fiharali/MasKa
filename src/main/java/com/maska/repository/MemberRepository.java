package com.maska.repository;


import org.springframework.data.repository.CrudRepository;
import com.maska.domain.entities.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
