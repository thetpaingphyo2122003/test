package com.fame.websocket.chatroom;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Integer> {
    Optional<ChatRoom> findBySenderIdAndRecipientId(String senderId, String recipientId);
}
