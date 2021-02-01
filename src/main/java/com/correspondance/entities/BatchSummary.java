package com.correspondance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BATCH_SUMMARY")
public class BatchSummary {
	@Id
	@GeneratedValue
	@Column(name="SUMMARY_ID")
	private Integer summaryId;
	@Column(name="BATCH_NAME")
	private String batchName;
	@Column(name="FAILURE_TRIGGER_COUNT")
	private Integer failureTriggerCount;
	@Column(name="SUCESS_TRIGGER_COUNT")
	private Integer successTriggerCOunt;
	@Column(name="TOTAL_TRIGGER_PROCESSED")
	private Integer totalTriggerProcessed;
}
