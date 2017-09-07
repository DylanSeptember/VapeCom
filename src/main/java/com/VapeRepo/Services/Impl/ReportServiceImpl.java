package com.VapeRepo.Services.Impl;

import com.VapeRepo.Domain.Report;
import com.VapeRepo.Repositories.ReportRepository;
import com.VapeRepo.Services.Interfaces.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dylan on 9/3/2017.
 */
@Component
public class ReportServiceImpl  implements ReportService {


    @Autowired
    private ReportRepository reportRepository;

    @Override
    public  Report save( Report entity) {
        return reportRepository.save(entity);
    }

    @Override
    public  Report findById(Integer s) {
        return reportRepository.findOne(s);
    }

    @Override
    public  Report update(Integer s) {
        return null;
    }
}
