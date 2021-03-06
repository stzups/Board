package net.stzups.board.server.websocket.protocol.server;

import io.netty.buffer.ByteBuf;

import java.nio.charset.StandardCharsets;

/**
 * Represents a packet sent by the server
 */
public abstract class ServerPacket {
    private ServerPacketType packetType;

    ServerPacket(ServerPacketType packetType) {
        this.packetType = packetType;
    }

    /** overriding classes need to call this first */
    public void serialize(ByteBuf bytebuf) {
        bytebuf.writeByte((byte) packetType.getId());
    }

    /** poorly encodes strings as utf 8 preceded by a one byte unsigned length */
    static void writeString(String string, ByteBuf byteBuf) {
        if (string.length() > 0xff) {
            throw new UnsupportedOperationException("String too long");
        }
        byte[] buffer = string.getBytes(StandardCharsets.UTF_8);
        byteBuf.writeByte((byte) buffer.length);
        byteBuf.writeBytes(buffer);
    }
}
