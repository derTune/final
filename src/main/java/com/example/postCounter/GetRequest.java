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
@Table(name = "get")
public class GetRequest {
    @Id @GeneratedValue
    Long id;
    @Column
    Date date;
    @Column
    String request;
}
