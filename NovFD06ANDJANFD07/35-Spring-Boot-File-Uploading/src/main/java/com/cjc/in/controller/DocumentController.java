package com.cjc.in.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.in.model.Document;
import com.cjc.in.service.DocumentService;

@RestController
@RequestMapping("/docApi")
@CrossOrigin("*")
public class DocumentController {

	@Autowired
	private DocumentService service;

	@PostMapping(value = "/uploadDoc",
			consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<String> insertDocument(
			@RequestPart MultipartFile f1,
			@RequestPart MultipartFile f2,
			@RequestPart MultipartFile f3,
			@RequestPart MultipartFile f4) throws IOException {

		Document doc = new Document();
		doc.setAdhar(f1.getBytes());
		doc.setPan(f2.getBytes());
		doc.setVoterId(f3.getBytes());
		doc.setDrivingLicence(f4.getBytes());

		service.uploadDocument(doc);

		return new ResponseEntity<String>("Files Uploaded Successfull!!",HttpStatus.CREATED);

	}
}
