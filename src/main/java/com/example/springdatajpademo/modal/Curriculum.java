package com.example.springdatajpademo.modal;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * The persistent class for the Curricula database table.
 */
@Entity
@Table(name = "curricula")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Curriculum implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private Long id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "DESCRIPTION_TEXT")
  private String description;

  @Column(name = "IS_SHOW_DESC")
  private Boolean isShowDesc = false;

  @Column(name = "IS_ACTIVE")
  private Boolean isActive = false;

  @Column(name = "IS_PUBLISHED")
  private Boolean isPublished = false;

  @Column(name = "IS_ARCHIVED")
  private Boolean isArchived = false;

  @Column(name = "TAGS", nullable = true)
  private String tags;

  @Column(name = "CLIENT_NAME", nullable = true)
  private String clientName;

  @Column(name = "DETAILED_VIEW_LINK", nullable = true)
  private String detailedViewLink;

  @Column(name = "SUMMARY_VIEW_LINK", nullable = true)
  private String summaryViewLink;

  @Column(name = "CREATED_BY")
  private Long createdBy;

  @Column(name = "CREATED_ON")
  private LocalDateTime createdOn;

  @Column(name = "UPDATED_BY")
  private Long updatedBy;

  @Column(name = "UPDATED_ON")
  private LocalDateTime updatedOn;

  @Column(name = "ORG_ID")
  private Long orgId;

  @Column(name = "IS_UPDATED")
  private Boolean isUpdated = false;



  public Curriculum() {

  }

  public Curriculum(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getShowDesc() {
    return isShowDesc;
  }

  public void setShowDesc(Boolean showDesc) {
    isShowDesc = showDesc;
  }

  public Boolean getActive() {
    return isActive;
  }

  public void setActive(Boolean active) {
    isActive = active;
  }

  public Boolean getPublished() {
    return isPublished;
  }

  public void setPublished(Boolean published) {
    isPublished = published;
  }

  public Boolean getArchived() {
    return isArchived;
  }

  public void setArchived(Boolean archived) {
    isArchived = archived;
  }

  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public String getDetailedViewLink() {
    return detailedViewLink;
  }

  public void setDetailedViewLink(String detailedViewLink) {
    this.detailedViewLink = detailedViewLink;
  }

  public String getSummaryViewLink() {
    return summaryViewLink;
  }

  public void setSummaryViewLink(String summaryViewLink) {
    this.summaryViewLink = summaryViewLink;
  }

  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public LocalDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(LocalDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public Long getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(Long updatedBy) {
    this.updatedBy = updatedBy;
  }

  public LocalDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(LocalDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public Boolean getUpdated() {
    return isUpdated;
  }

  public void setUpdated(Boolean updated) {
    isUpdated = updated;
  }
}
