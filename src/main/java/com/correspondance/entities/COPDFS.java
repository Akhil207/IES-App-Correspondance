package com.correspondance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CO_PDFS")
public class COPDFS {
	@Id
	@GeneratedValue
	@Column(name="CO_PDF_ID")
	private Integer coPDFId;
	@Column(name="PLAN_STATUS")
	private String planStatus;
	@Column(name="CASE_NUMBER")
	private String caseNumber;
	@Column(name="PDF_DOCUMENT")
	private Byte[] pdfDocument;
	@Column(name="PLAN_NAME")
	private String planName;
}
