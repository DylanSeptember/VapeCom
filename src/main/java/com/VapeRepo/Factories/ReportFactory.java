package com.VapeRepo.Factories;

import com.VapeRepo.Domain.Report;
import com.VapeRepo.Domain.Viewer;

import java.util.Map;

/**
 * Created by dylan on 9/3/2017.
 */
public class ReportFactory {
    public static Report buildReport(Map<String, Object> values) {
        Report report = new Report.Builder()
                .description((String) values.get("description"))
                .viewer((Viewer) values.get("viewer"))
                .build();
        return report;
    }
}
