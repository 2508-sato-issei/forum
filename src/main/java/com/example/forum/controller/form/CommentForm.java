package com.example.forum.controller.form;

import lombok.Getter;
import lombok.Setter;
import org.thymeleaf.spring6.processor.SpringActionTagProcessor;

import java.util.Date;

@Getter
@Setter
public class CommentForm {

    private int id;
    private int reportId;
    private String text;

}
