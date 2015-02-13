package im.actor.model.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.BserObject;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import java.io.IOException;

public class FileExVideo extends BserObject {

    private int w;
    private int h;
    private int duration;

    public FileExVideo(int w, int h, int duration) {
        this.w = w;
        this.h = h;
        this.duration = duration;
    }

    public FileExVideo() {

    }

    public int getW() {
        return this.w;
    }

    public int getH() {
        return this.h;
    }

    public int getDuration() {
        return this.duration;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.w = values.getInt(1);
        this.h = values.getInt(2);
        this.duration = values.getInt(3);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeInt(1, this.w);
        writer.writeInt(2, this.h);
        writer.writeInt(3, this.duration);
    }

}
