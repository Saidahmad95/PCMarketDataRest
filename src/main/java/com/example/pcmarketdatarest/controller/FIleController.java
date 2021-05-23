package com.example.pcmarketdatarest.controller;

import com.example.pcmarketdatarest.entity.Attachment;
import com.example.pcmarketdatarest.entity.AttachmentContent;
import com.example.pcmarketdatarest.repository.AttachmentContentRepository;
import com.example.pcmarketdatarest.repository.AttachmentRepository;
import com.example.pcmarketdatarest.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
public class FIleController {

    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    AttachmentContentRepository attachmentContentRepository;
    @Autowired
    FileService fileService;

    @PostMapping("/upload")
    public String upload(MultipartHttpServletRequest request) throws IOException {
        return fileService.upload(request);
    }

    @GetMapping(value = "/download/{id}")
    public void download(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        fileService.download(id, response);
    }

}
