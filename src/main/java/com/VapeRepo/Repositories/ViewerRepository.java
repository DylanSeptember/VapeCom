package com.VapeRepo.Repositories;

import com.VapeRepo.Domain.Viewer;

/**
 * Created by dylan on 8/13/2017.
 */
public interface ViewerRepository {
    Viewer create(Viewer viewer);
    Viewer read(String email);
    Viewer update(Viewer viewer);
    void delete(String email);
}
