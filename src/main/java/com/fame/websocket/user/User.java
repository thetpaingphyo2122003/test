package com.fame.websocket.user;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "\"user\"") // Escaping the table name with double quotes
public class User {
    @Id
    private String nickName;
    private String fullName;
    private Status status;
}
