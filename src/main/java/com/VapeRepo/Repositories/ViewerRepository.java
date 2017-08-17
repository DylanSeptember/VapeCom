package com.VapeRepo.Repositories;

import com.VapeRepo.Domain.Viewer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dylan on 8/13/2017.
 */
public interface ViewerRepository extends CrudRepository<Viewer, String> {

   /* Viewer create(Viewer viewer);
    Viewer read(String email);
    Viewer update(Viewer viewer);
    void delete(String email);*/
}
