package com.fame.websocket.chat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="chat_messge")
public class ChatMessage {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    private String chatId;
    private String senderId;
    private String recipientId;
    private String content;
    private Date timestamp;
}
