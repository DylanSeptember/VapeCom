package com.VapeRepo.Services.Interfaces;

import com.VapeRepo.Domain.Viewer;
import com.VapeRepo.Services.BaseService;

import java.util.List;

/**
 * Created by dylan on 8/14/2017.
 */
public interface ViewerService extends BaseService<Viewer, String>{
    List<Viewer> getViewer();
   /* Viewer create(Viewer viewer);
    Viewer read(String email);
    Viewer update(Viewer viewer);
    void delete (String email);*/
}
