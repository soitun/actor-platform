package im.actor.model.api.rpc;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.Bser;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import java.io.IOException;
import im.actor.model.network.parser.*;
import im.actor.model.api.*;

public class RequestCompleteUpload extends Request<ResponseCompleteUpload> {

    public static final int HEADER = 0x16;
    public static RequestCompleteUpload fromBytes(byte[] data) throws IOException {
        return Bser.parse(new RequestCompleteUpload(), data);
    }

    private UploadConfig config;
    private int blocksCount;
    private long crc32;

    public RequestCompleteUpload(UploadConfig config, int blocksCount, long crc32) {
        this.config = config;
        this.blocksCount = blocksCount;
        this.crc32 = crc32;
    }

    public RequestCompleteUpload() {

    }

    public UploadConfig getConfig() {
        return this.config;
    }

    public int getBlocksCount() {
        return this.blocksCount;
    }

    public long getCrc32() {
        return this.crc32;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.config = values.getObj(1, new UploadConfig());
        this.blocksCount = values.getInt(2);
        this.crc32 = values.getLong(3);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        if (this.config == null) {
            throw new IOException();
        }
        writer.writeObject(1, this.config);
        writer.writeInt(2, this.blocksCount);
        writer.writeLong(3, this.crc32);
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
