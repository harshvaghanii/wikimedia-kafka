package com.vaghani.springboot.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "wikimedia_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Wikimedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(name = "event_data", length = 65000)
    private String message;

}
