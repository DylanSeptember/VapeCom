package com.VapeRepo.Repositories.Impl;

import com.VapeRepo.Domain.Viewer;
import com.VapeRepo.Repositories.ViewerRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dylan on 8/13/2017.
 */
public class ViewerRepositoryImpl implements ViewerRepository {

    Map<String, Viewer> viewerTable;

    public ViewerRepositoryImpl(){
        viewerTable = new HashMap<String, Viewer>();
    }

    public Viewer create(Viewer viewer) {
        viewerTable = new HashMap<String, Viewer>();
        Viewer savedViewer = viewerTable.get(viewer.getEmail());
        return savedViewer;
    }

    public Viewer read(String email) {
        Viewer viewer = viewerTable.get(email);
        System.out.println(" The Viewer Object is " + viewer);

        return viewer;
    }

    public Viewer update(Viewer viewer) {
        viewerTable.put(viewer.getEmail(), viewer);
        Viewer savedViewer = viewerTable.get(viewer.getEmail());
        return savedViewer;
    }

    public void delete(String email) {
        viewerTable.remove(email);
    }
}
