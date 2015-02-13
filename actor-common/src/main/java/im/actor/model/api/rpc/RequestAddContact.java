package im.actor.model.api.rpc;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.Bser;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import java.io.IOException;
import im.actor.model.network.parser.*;

public class RequestAddContact extends Request<ResponseSeq> {

    public static final int HEADER = 0x72;
    public static RequestAddContact fromBytes(byte[] data) throws IOException {
        return Bser.parse(new RequestAddContact(), data);
    }

    private int uid;
    private long accessHash;

    public RequestAddContact(int uid, long accessHash) {
        this.uid = uid;
        this.accessHash = accessHash;
    }

    public RequestAddContact() {

    }

    public int getUid() {
        return this.uid;
    }

    public long getAccessHash() {
        return this.accessHash;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.uid = values.getInt(1);
        this.accessHash = values.getLong(2);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeInt(1, this.uid);
        writer.writeLong(2, this.accessHash);
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
