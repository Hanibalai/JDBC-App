package myDBtest.service;

import myDBtest.dao.GroupDao;
import myDBtest.domain.Group;
import myDBtest.ui.Validator;

import java.util.ArrayList;

public class GroupHandler {
    GroupDao groupDao = new GroupDao();
    public Group readGroup() {
        ArrayList<String> groupNames = groupDao.readGroupNames();
        return groupDao.readGroup(Validator.getGroupNameFromTable(groupNames));
    }

    public void close() {
        groupDao.closeConnection();
    }
}
