package barbosa.guilherme.LitSpacev2.repository;

import barbosa.guilherme.LitSpacev2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Apenas para ser mais direto para o spring security
    UserDetails findByUsername(String username);

    Optional<User> findUserByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
