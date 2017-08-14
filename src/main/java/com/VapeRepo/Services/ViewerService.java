package com.VapeRepo.Services;

import com.VapeRepo.Domain.Viewer;

/**
 * Created by dylan on 8/14/2017.
 */
public interface ViewerService {
    Viewer create(Viewer viewer);
    Viewer read(String email);
    Viewer update(Viewer viewer);
    void delete (String email);
}
