package net.stzups.board.server.websocket.protocol.server.messages;

import io.netty.buffer.ByteBuf;
import net.stzups.board.data.objects.User;
import net.stzups.board.server.websocket.protocol.server.ServerMessageType;
import net.stzups.board.server.websocket.protocol.server.ServerMessageUser;

public class ServerMessageAddUser extends ServerMessageUser {
    public ServerMessageAddUser(User user) {
        super(ServerMessageType.ADD_USER, user);
    }

    @Override
    public void serialize(ByteBuf byteBuf) {
        super.serialize(byteBuf);
    }
}