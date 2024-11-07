package ua.edu.ucu.apps.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {
    // @Query("SELECT u FROM students u WHERE u.email = ?1")
    // public Optional<Student> findByFirstName(String name);
}
