package im.actor.model.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.BserObject;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import java.io.IOException;

public class EncryptedAesKey extends BserObject {

    private long keyHash;
    private byte[] aesEncryptedKey;

    public EncryptedAesKey(long keyHash, byte[] aesEncryptedKey) {
        this.keyHash = keyHash;
        this.aesEncryptedKey = aesEncryptedKey;
    }

    public EncryptedAesKey() {

    }

    public long getKeyHash() {
        return this.keyHash;
    }

    public byte[] getAesEncryptedKey() {
        return this.aesEncryptedKey;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.keyHash = values.getLong(1);
        this.aesEncryptedKey = values.getBytes(2);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeLong(1, this.keyHash);
        if (this.aesEncryptedKey == null) {
            throw new IOException();
        }
        writer.writeBytes(2, this.aesEncryptedKey);
    }

}
