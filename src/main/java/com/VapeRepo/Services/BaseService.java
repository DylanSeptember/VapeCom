package com.VapeRepo.Services;

/**
 * Created by dylan on 8/17/2017.
 */
public interface BaseService<E, ID> {
    E save(E entity);
    E findById(ID id);
    E update(ID id);
}
