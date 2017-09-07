package com.VapeRepo.Services.Impl;

import com.VapeRepo.Domain.Mixer;
import com.VapeRepo.Domain.Viewer;
//import com.VapeRepo.Repositories.Impl.MixerRepositoryImpl;
import com.VapeRepo.Repositories.MixerRepository;
import com.VapeRepo.Services.Interfaces.MixerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dylan on 8/14/2017.
 */
@Component
public class MixerServiceImpl implements MixerService{


    @Autowired
    private  MixerRepository mixerRepository;

    @Override
    public  Mixer save( Mixer entity) {
        return mixerRepository.save(entity);
    }

    @Override
    public  Mixer findById(String s) {
        return mixerRepository.findOne(s);
    }

    @Override
    public  Mixer update(String s) {
        return null;
    }
  /*  MixerRepository repository;

    public MixerServiceImpl(){
        // service = new ViewerServiceImpl();
        repository = new MixerRepositoryImpl();
    }

    public Mixer create(Mixer mixer) {
        return repository.create(mixer);
    }

    public Mixer read(Viewer viewer) {
        return repository.read(viewer);
    }

    public Mixer update(Mixer mixer) {
        return repository.update(mixer);
    }

    public void delete(Viewer viewer) {
        repository.delete(viewer);

    }*/
}
