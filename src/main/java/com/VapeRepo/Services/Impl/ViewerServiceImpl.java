package com.VapeRepo.Services.Impl;

import com.VapeRepo.Domain.Viewer;
import com.VapeRepo.Repositories.Impl.ViewerRepositoryImpl;
import com.VapeRepo.Repositories.ViewerRepository;
import com.VapeRepo.Services.ViewerService;

/**
 * Created by dylan on 8/14/2017.
 */
public class ViewerServiceImpl implements ViewerService {

    //private ViewerServiceImpl service;



    /*public static ViewerServiceImpl getInstance(){
        if(service == null)
            service = new ViewerServiceImpl();
        return service;
    }*/

    ViewerRepository repository;

    public ViewerServiceImpl(){
       // service = new ViewerServiceImpl();
        repository = new ViewerRepositoryImpl();
    }

    public Viewer create(Viewer viewer) {
        return repository.create(viewer);
    }

    public Viewer read(String id) {
        return repository.read(id);
    }

    public Viewer update(Viewer viewer) {
        return repository.update(viewer);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
