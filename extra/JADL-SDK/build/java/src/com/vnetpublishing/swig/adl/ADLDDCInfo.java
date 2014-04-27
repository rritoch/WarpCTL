/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLDDCInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLDDCInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLDDCInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLDDCInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUlSize(int value) {
    jadl_sdkJNI.ADLDDCInfo_ulSize_set(swigCPtr, this, value);
  }

  public int getUlSize() {
    return jadl_sdkJNI.ADLDDCInfo_ulSize_get(swigCPtr, this);
  }

  public void setUlSupportsDDC(int value) {
    jadl_sdkJNI.ADLDDCInfo_ulSupportsDDC_set(swigCPtr, this, value);
  }

  public int getUlSupportsDDC() {
    return jadl_sdkJNI.ADLDDCInfo_ulSupportsDDC_get(swigCPtr, this);
  }

  public void setUlManufacturerID(int value) {
    jadl_sdkJNI.ADLDDCInfo_ulManufacturerID_set(swigCPtr, this, value);
  }

  public int getUlManufacturerID() {
    return jadl_sdkJNI.ADLDDCInfo_ulManufacturerID_get(swigCPtr, this);
  }

  public void setUlProductID(int value) {
    jadl_sdkJNI.ADLDDCInfo_ulProductID_set(swigCPtr, this, value);
  }

  public int getUlProductID() {
    return jadl_sdkJNI.ADLDDCInfo_ulProductID_get(swigCPtr, this);
  }

  public void setCDisplayName(String value) {
    jadl_sdkJNI.ADLDDCInfo_cDisplayName_set(swigCPtr, this, value);
  }

  public String getCDisplayName() {
    return jadl_sdkJNI.ADLDDCInfo_cDisplayName_get(swigCPtr, this);
  }

  public void setUlMaxHResolution(int value) {
    jadl_sdkJNI.ADLDDCInfo_ulMaxHResolution_set(swigCPtr, this, value);
  }

  public int getUlMaxHResolution() {
    return jadl_sdkJNI.ADLDDCInfo_ulMaxHResolution_get(swigCPtr, this);
  }

  public void setUlMaxVResolution(int value) {
    jadl_sdkJNI.ADLDDCInfo_ulMaxVResolution_set(swigCPtr, this, value);
  }

  public int getUlMaxVResolution() {
    return jadl_sdkJNI.ADLDDCInfo_ulMaxVResolution_get(swigCPtr, this);
  }

  public void setUlMaxRefresh(int value) {
    jadl_sdkJNI.ADLDDCInfo_ulMaxRefresh_set(swigCPtr, this, value);
  }

  public int getUlMaxRefresh() {
    return jadl_sdkJNI.ADLDDCInfo_ulMaxRefresh_get(swigCPtr, this);
  }

  public void setUlPTMCx(int value) {
    jadl_sdkJNI.ADLDDCInfo_ulPTMCx_set(swigCPtr, this, value);
  }

  public int getUlPTMCx() {
    return jadl_sdkJNI.ADLDDCInfo_ulPTMCx_get(swigCPtr, this);
  }

  public void setUlPTMCy(int value) {
    jadl_sdkJNI.ADLDDCInfo_ulPTMCy_set(swigCPtr, this, value);
  }

  public int getUlPTMCy() {
    return jadl_sdkJNI.ADLDDCInfo_ulPTMCy_get(swigCPtr, this);
  }

  public void setUlPTMRefreshRate(int value) {
    jadl_sdkJNI.ADLDDCInfo_ulPTMRefreshRate_set(swigCPtr, this, value);
  }

  public int getUlPTMRefreshRate() {
    return jadl_sdkJNI.ADLDDCInfo_ulPTMRefreshRate_get(swigCPtr, this);
  }

  public void setUlDDCInfoFlag(int value) {
    jadl_sdkJNI.ADLDDCInfo_ulDDCInfoFlag_set(swigCPtr, this, value);
  }

  public int getUlDDCInfoFlag() {
    return jadl_sdkJNI.ADLDDCInfo_ulDDCInfoFlag_get(swigCPtr, this);
  }

  public ADLDDCInfo() {
    this(jadl_sdkJNI.new_ADLDDCInfo(), true);
  }

}
