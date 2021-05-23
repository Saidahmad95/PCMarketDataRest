package com.example.pcmarketdatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AttachmentContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private byte[] content;

    @OneToOne
    private Attachment attachment;

    public AttachmentContent(byte[] content, Attachment attachment) {
        this.content = content;
        this.attachment = attachment;
    }
}
