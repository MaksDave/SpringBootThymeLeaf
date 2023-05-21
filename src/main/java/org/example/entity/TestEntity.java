package org.example.entity;


import jakarta.persistence.*;
import javassist.bytecode.ByteArray;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.net.http.HttpResponse;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table()
@Builder
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private byte[] file;

}
