package im.actor.model.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.BserObject;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import java.io.IOException;

public class GroupOutPeer extends BserObject {

    private int groupId;
    private long accessHash;

    public GroupOutPeer(int groupId, long accessHash) {
        this.groupId = groupId;
        this.accessHash = accessHash;
    }

    public GroupOutPeer() {

    }

    public int getGroupId() {
        return this.groupId;
    }

    public long getAccessHash() {
        return this.accessHash;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.groupId = values.getInt(1);
        this.accessHash = values.getLong(2);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeInt(1, this.groupId);
        writer.writeLong(2, this.accessHash);
    }

}
