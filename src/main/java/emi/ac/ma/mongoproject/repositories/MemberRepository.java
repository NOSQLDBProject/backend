package emi.ac.ma.mongoproject.repositories;

import emi.ac.ma.mongoproject.entities.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberRepository extends MongoRepository<Member, String> {
}
