package fr.toulouse.service.impl;

import fr.toulouse.service.ObjectService;
import fr.toulouse.dao.ObjectDao;
import fr.toulouse.entity.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectImpl implements ObjectService {

    @Autowired
    private ObjectDao objectDao;

    @Override
    public List<Object> getAllObjects() {
        return objectDao.queryObjects();
    }

    @Override
    public Object getObjectById(String id) {
        return objectDao.queryObjectById(id);
    }

    @Override
    public List<Object> getObjectsByOwner(Integer ownerId) {
        return objectDao.queryObjectsByOwner(ownerId);
    }

    @Override
    public List<Object> getObjectsByTag(String tag) {
        return objectDao.queryObjectsByTag(tag);
    }

    @Override
    public boolean addObject(Object object) {
        return false;
    }

    @Override
    public boolean deleteObject(Integer id) {
        return false;
    }

    @Override
    public boolean modifyObject(Object object) {
        return false;
    }
}
