package com.driver;

import java.util.Date;
import java.util.List;

public class WhatsappService {
    public String createUser(String name, String mobile) {
        return null;
    }

    public Group createGroup(List<User> users) {
        return new Group(null,1);
    }

    public int createMessage(String content) {
        return 1;
    }

    public int sendMessage(Message message, User sender, Group group) {
        return 0;
    }

    public String changeAdmin(User approver, User user, Group group) {
        return null;
    }

    public int removeUser(User user) {
        return 1;
    }

    public String findMessage(Date start, Date end, int k) {
        return null;
    }
}
