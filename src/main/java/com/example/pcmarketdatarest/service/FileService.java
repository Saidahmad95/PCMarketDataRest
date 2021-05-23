package com.example.pcmarketdatarest.service;

import com.example.pcmarketdatarest.entity.Attachment;
import com.example.pcmarketdatarest.entity.AttachmentContent;
import com.example.pcmarketdatarest.repository.AttachmentContentRepository;
import com.example.pcmarketdatarest.repository.AttachmentRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.Optional;

@Service
public class FileService {
    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    @SneakyThrows
    public String upload(MultipartHttpServletRequest request) {
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());
        if (file != null) {
            String originalFilename = file.getOriginalFilename();
            long size = file.getSize();
            String contentType = file.getContentType();

            Attachment attachment = new Attachment(originalFilename, size, contentType);
            Attachment savedAttachment = attachmentRepository.save(attachment);

            AttachmentContent attachmentContent = new AttachmentContent(file.getBytes(), savedAttachment);
            attachmentContentRepository.save(attachmentContent);

            return "File with id: '" + savedAttachment.getId() + "' successfully uploaded !";

        }
        return "Not file !";
    }

    @SneakyThrows
    public void download(Integer id, HttpServletResponse response) {
        Optional<Attachment> byIdAttachment = attachmentRepository.findById(id);
        if (byIdAttachment.isPresent()) {
            Attachment attachment = byIdAttachment.get();
            Optional<AttachmentContent> byAttachmentContentId = attachmentContentRepository.findByAttachmentId(id);
            if (byAttachmentContentId.isPresent()) {
                AttachmentContent attachmentContent = byAttachmentContentId.get();
                response.setHeader("Content-Disposition", "attachment; filename=\"" + attachment.getOriginalName() + "\"");
                response.setContentType(attachment.getType());
                FileCopyUtils.copy(attachmentContent.getContent(), response.getOutputStream());
            }
        }
    }
}
