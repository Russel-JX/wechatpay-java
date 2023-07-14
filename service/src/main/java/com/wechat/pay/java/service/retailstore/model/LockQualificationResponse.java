// Copyright 2021 Tencent Inc. All rights reserved.
//
// 营销加价购对外API
//
// 指定服务商可通过该接口报名加价购活动、查询某个区域内的加价购活动列表、锁定加价活动购资格以及解锁加价购活动资格。
//
// API version: 1.3.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.retailstore.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/** LockQualificationResponse */
public class LockQualificationResponse {
  /** 返回结果文案 说明：返回结果文案 */
  @SerializedName("return_message")
  private String returnMessage;
  /** 锁定成功的资格ID列表 说明：锁定成功的资格ID列表 */
  @SerializedName("succeed_qualification_ids")
  private List<String> succeedQualificationIds;
  /** 锁定失败的资格ID列表 说明：锁定失败的资格ID列表 */
  @SerializedName("failed_qualification_ids")
  private List<String> failedQualificationIds;

  public String getReturnMessage() {
    return returnMessage;
  }

  public void setReturnMessage(String returnMessage) {
    this.returnMessage = returnMessage;
  }

  public List<String> getSucceedQualificationIds() {
    return succeedQualificationIds;
  }

  public void setSucceedQualificationIds(List<String> succeedQualificationIds) {
    this.succeedQualificationIds = succeedQualificationIds;
  }

  public List<String> getFailedQualificationIds() {
    return failedQualificationIds;
  }

  public void setFailedQualificationIds(List<String> failedQualificationIds) {
    this.failedQualificationIds = failedQualificationIds;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockQualificationResponse {\n");
    sb.append("    returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
    sb.append("    succeedQualificationIds: ")
        .append(toIndentedString(succeedQualificationIds))
        .append("\n");
    sb.append("    failedQualificationIds: ")
        .append(toIndentedString(failedQualificationIds))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }
}