package im.actor.model.api.rpc;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.Bser;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import java.io.IOException;
import im.actor.model.network.parser.*;
import java.util.List;
import java.util.ArrayList;
import im.actor.model.api.*;

public class ResponseGetAuthSessions extends Response {

    public static final int HEADER = 0x51;
    public static ResponseGetAuthSessions fromBytes(byte[] data) throws IOException {
        return Bser.parse(new ResponseGetAuthSessions(), data);
    }

    private List<AuthSession> userAuths;

    public ResponseGetAuthSessions(List<AuthSession> userAuths) {
        this.userAuths = userAuths;
    }

    public ResponseGetAuthSessions() {

    }

    public List<AuthSession> getUserAuths() {
        return this.userAuths;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        List<AuthSession> _userAuths = new ArrayList<AuthSession>();
        for (int i = 0; i < values.getRepeatedCount(1); i ++) {
            _userAuths.add(new AuthSession());
        }
        this.userAuths = values.getRepeatedObj(1, _userAuths);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeRepeatedObj(1, this.userAuths);
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
