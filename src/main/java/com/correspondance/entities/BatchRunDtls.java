package com.correspondance.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BATCH_RUN_DTLS")
public class BatchRunDtls {
	@Id
	@GeneratedValue
	@Column(name="BATCH_RUN_SEQ")
	private Integer batchRunSeq;
	@Column(name="BATCH_NAME")
	private String batchName;
	@Column(name="BATCH_RUN_STATUS")
	private String batchRunStatus;
	@Column(name="END_DATE")
	private Timestamp endDate;
	@Column(name="INSTANCE_NUM")
	private Integer instanceNum;
	@Column(name="START_DATE")
	private Timestamp startDate;
}
