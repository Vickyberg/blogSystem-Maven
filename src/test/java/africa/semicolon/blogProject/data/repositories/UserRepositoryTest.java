package africa.semicolon.blogProject.data.repositories;

import africa.semicolon.blogProject.data.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveTest() {
        User user = new User();
        var savedUser = userRepository.save(user);
        assertNotNull(savedUser.getId());

    }

    @Test
    public void loginTest() {
        User user = new User();
        user.setEmail("email");
        var loggedInUser = userRepository.save(user);
        assertNotNull(loggedInUser.getEmail());
    }
}