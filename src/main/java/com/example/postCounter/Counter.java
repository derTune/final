package com.example.postCounter;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "counter")
public class Counter {
    @Id @GeneratedValue
    Long id;
    @Column(name = "date")
    Date date;
    @Column(name = "request")
    String request;

}

