package br.com.newtweet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tb_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    private String name;

    public enum Values {
        ADMIN(1L),
        BASIC(2L);

        long roleId;

        Values(Long roleId) {
            this.roleId = roleId;
        }
    }
}
