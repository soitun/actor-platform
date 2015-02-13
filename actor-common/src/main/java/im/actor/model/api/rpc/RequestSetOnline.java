package im.actor.model.api.rpc;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.Bser;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import java.io.IOException;
import im.actor.model.network.parser.*;

public class RequestSetOnline extends Request<ResponseVoid> {

    public static final int HEADER = 0x1d;
    public static RequestSetOnline fromBytes(byte[] data) throws IOException {
        return Bser.parse(new RequestSetOnline(), data);
    }

    private boolean isOnline;
    private long timeout;

    public RequestSetOnline(boolean isOnline, long timeout) {
        this.isOnline = isOnline;
        this.timeout = timeout;
    }

    public RequestSetOnline() {

    }

    public boolean isOnline() {
        return this.isOnline;
    }

    public long getTimeout() {
        return this.timeout;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.isOnline = values.getBool(1);
        this.timeout = values.getLong(2);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeBool(1, this.isOnline);
        writer.writeLong(2, this.timeout);
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
