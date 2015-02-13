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

public class RequestImportContacts extends Request<ResponseImportContacts> {

    public static final int HEADER = 0x7;
    public static RequestImportContacts fromBytes(byte[] data) throws IOException {
        return Bser.parse(new RequestImportContacts(), data);
    }

    private List<PhoneToImport> phones;
    private List<EmailToImport> emails;

    public RequestImportContacts(List<PhoneToImport> phones, List<EmailToImport> emails) {
        this.phones = phones;
        this.emails = emails;
    }

    public RequestImportContacts() {

    }

    public List<PhoneToImport> getPhones() {
        return this.phones;
    }

    public List<EmailToImport> getEmails() {
        return this.emails;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        List<PhoneToImport> _phones = new ArrayList<PhoneToImport>();
        for (int i = 0; i < values.getRepeatedCount(1); i ++) {
            _phones.add(new PhoneToImport());
        }
        this.phones = values.getRepeatedObj(1, _phones);
        List<EmailToImport> _emails = new ArrayList<EmailToImport>();
        for (int i = 0; i < values.getRepeatedCount(2); i ++) {
            _emails.add(new EmailToImport());
        }
        this.emails = values.getRepeatedObj(2, _emails);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeRepeatedObj(1, this.phones);
        writer.writeRepeatedObj(2, this.emails);
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
