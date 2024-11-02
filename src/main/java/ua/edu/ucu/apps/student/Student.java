package ua.edu.ucu.apps.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
@Getter
@Setter
public class Student {
   private String name;
   private String gender;
   @Transient
   private int age;
   private LocalDate dateOfBirth;
   public int getAge() {
      if (dateOfBirth != null) {
          return Period.between(dateOfBirth, LocalDate.now()).getYears();
      }
      return 0;
  }

   public void setAge(int age) {
      if (age >= 0) {
         this.dateOfBirth = LocalDate.now().minusYears(age);
         this.age = age;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
