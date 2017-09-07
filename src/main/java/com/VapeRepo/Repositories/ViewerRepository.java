package com.VapeRepo.Repositories;

import com.VapeRepo.Domain.Viewer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dylan on 8/13/2017.
 */
//@Repository
public interface ViewerRepository extends CrudRepository<Viewer, String> {



   /* Viewer create(Viewer viewer);
    Viewer read(String email);
    Viewer update(Viewer viewer);
    void delete(String email);*/
}
