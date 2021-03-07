package net.stzups.board.server.websocket.protocol.client;

import io.netty.util.collection.IntObjectHashMap;

import java.util.EnumSet;
import java.util.Map;

public enum ClientMessageType {
    OPEN_DOCUMENT(0),
    CANVAS(1),
    CREATE_DOCUMENT(2),
    HANDSHAKE(3),
    ;

    private static Map<Integer, ClientMessageType> messageTypeMap = new IntObjectHashMap<>();
    static {
        for (ClientMessageType messageType : EnumSet.allOf(ClientMessageType.class)) {
            messageTypeMap.put(messageType.id, messageType);
        }
    }

    private int id;

    ClientMessageType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static ClientMessageType valueOf(int id) {
        ClientMessageType messageType = messageTypeMap.get(id);
        if (messageType == null) {
            throw new IllegalArgumentException("Unknown PacketType for given id " + id);
        }
        return messageType;
    }
}