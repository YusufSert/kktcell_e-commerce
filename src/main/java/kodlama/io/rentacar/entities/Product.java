package kodlama.io.rentacar.entities;

import jakarta.persistence.*; // JPA
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



// JPA defines the specification(Şartname)
// ORM -> Object Relational Mapping: Table to Object or Object to Table mapping
// ORM tools(hibernate, Toplink) abstracts querying and gives us methods to use for manipulating the tables
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
    public class Product {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

     @Column(nullable = false, name = "name")
        private String name;

}
