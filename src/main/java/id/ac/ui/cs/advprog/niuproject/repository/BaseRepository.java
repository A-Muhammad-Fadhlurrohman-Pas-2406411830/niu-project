package id.ac.ui.cs.advprog.niuproject.repository;

import id.ac.ui.cs.advprog.niuproject.model.BaseProduct;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public abstract class BaseRepository<T extends BaseProduct> {

    protected List<T> data = new ArrayList<>();

    public T create(T entity) {
        data.add(entity);
        return entity;
    }

    public Iterator<T> findAll() {
        return data.iterator();
    }

    public T findById(String id) {
        return data.stream()
                .filter(entity -> entity.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public T edit(T entity) {
        T existing = findById(entity.getId());
        if (existing != null) {
            existing.setName(entity.getName());
            existing.setQuantity(entity.getQuantity());
            updateSpecificFields(existing, entity);
        }
        return existing;
    }

    public void delete(T entity) {
        T existing = findById(entity.getId());
        if (existing != null) {
            data.remove(existing);
        }
    }

    protected void updateSpecificFields(T existing, T updated) {
    }
}