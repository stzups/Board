package net.stzups.board.room.protocol.server;

import io.netty.util.collection.IntObjectHashMap;

import java.util.EnumSet;
import java.util.Map;

public enum ServerPacketType {
    ADD_CLIENT(0),
    REMOVE_CLIENT(1),
    DRAW(2),
    OFFSET_DRAW(3),
    ;

    private static Map<Integer, ServerPacketType> packetTypeMap = new IntObjectHashMap<>();
    static {
        for (ServerPacketType packetType : EnumSet.allOf(ServerPacketType.class)) {
            packetTypeMap.put(packetType.id, packetType);
        }
    }

    private int id;

    ServerPacketType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static ServerPacketType valueOf(int id) {
        ServerPacketType packetType = packetTypeMap.get(id);
        if (packetType == null) {
            throw new IllegalArgumentException("Unknown PacketTypeServer for given id " + id);
        }
        return packetType;
    }
}