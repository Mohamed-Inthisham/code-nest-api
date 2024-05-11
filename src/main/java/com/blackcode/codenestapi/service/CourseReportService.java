package com.blackcode.codenestapi.service;

import com.blackcode.codenestapi.model.Course;
import com.blackcode.codenestapi.model.Internship;
import com.blackcode.codenestapi.repository.CourseRepository;
import com.blackcode.codenestapi.repository.InternshipRepository;
import lombok.AllArgsConstructor;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class CourseReportService {

    private final CourseRepository courseRepository;
    public String exportReport(String reportFormat) throws FileNotFoundException, JRException {

        String path = "C:\\Users\\isthi\\OneDrive\\Desktop\\CODE_NEST";

        List<Course> courseList = courseRepository.findAll();

        //load File
        File file = ResourceUtils.getFile("classpath:courses.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(courseList);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("CreatedBy","Code nest");

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);


        if (reportFormat.equalsIgnoreCase("pdf")){

            JasperExportManager.exportReportToPdfFile(jasperPrint, path+"\\courses.pdf");
        }

        return "Report Generated in path : "+path;
    }
}
