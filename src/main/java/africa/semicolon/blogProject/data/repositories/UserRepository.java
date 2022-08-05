package africa.semicolon.blogProject.data.repositories;

import africa.semicolon.blogProject.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User , String> {

    User findByEmail(String email);
}
