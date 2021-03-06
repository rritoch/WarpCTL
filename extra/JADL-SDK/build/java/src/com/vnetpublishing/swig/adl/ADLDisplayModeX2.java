/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLDisplayModeX2 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLDisplayModeX2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLDisplayModeX2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLDisplayModeX2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIWidth(int value) {
    jadl_sdkJNI.ADLDisplayModeX2_iWidth_set(swigCPtr, this, value);
  }

  public int getIWidth() {
    return jadl_sdkJNI.ADLDisplayModeX2_iWidth_get(swigCPtr, this);
  }

  public void setIHeight(int value) {
    jadl_sdkJNI.ADLDisplayModeX2_iHeight_set(swigCPtr, this, value);
  }

  public int getIHeight() {
    return jadl_sdkJNI.ADLDisplayModeX2_iHeight_get(swigCPtr, this);
  }

  public void setIScanType(int value) {
    jadl_sdkJNI.ADLDisplayModeX2_iScanType_set(swigCPtr, this, value);
  }

  public int getIScanType() {
    return jadl_sdkJNI.ADLDisplayModeX2_iScanType_get(swigCPtr, this);
  }

  public void setIRefreshRate(int value) {
    jadl_sdkJNI.ADLDisplayModeX2_iRefreshRate_set(swigCPtr, this, value);
  }

  public int getIRefreshRate() {
    return jadl_sdkJNI.ADLDisplayModeX2_iRefreshRate_get(swigCPtr, this);
  }

  public void setITimingStandard(int value) {
    jadl_sdkJNI.ADLDisplayModeX2_iTimingStandard_set(swigCPtr, this, value);
  }

  public int getITimingStandard() {
    return jadl_sdkJNI.ADLDisplayModeX2_iTimingStandard_get(swigCPtr, this);
  }

  public ADLDisplayModeX2() {
    this(jadl_sdkJNI.new_ADLDisplayModeX2(), true);
  }

}
