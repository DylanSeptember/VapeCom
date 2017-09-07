//package com.VapeRepo.Services.Impl;
//
//import com.VapeRepo.Domain.ViewerComment;
//import com.VapeRepo.Repositories.ViewerCommentRepository;
//import com.VapeRepo.Services.Interfaces.ViewerCommentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// * Created by dylan on 9/7/2017.
// */
//@Component
//public class ViewerCommentServiceImpl implements ViewerCommentService {
//
//    @Autowired
//    private ViewerCommentRepository viewerCommentRepository;
//
//    @Override
//    public ViewerComment save(ViewerComment entity) {
//        return viewerCommentRepository.save(entity);
//    }
//
//    @Override
//    public ViewerComment findById(String s) {
//        return viewerCommentRepository.findOne(s);
//    }
//
//    @Override
//    public ViewerComment update(String s) {
//        return null;
//    }
//}
