/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLAdapterODClockInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLAdapterODClockInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLAdapterODClockInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLAdapterODClockInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setISize(int value) {
    jadl_sdkJNI.ADLAdapterODClockInfo_iSize_set(swigCPtr, this, value);
  }

  public int getISize() {
    return jadl_sdkJNI.ADLAdapterODClockInfo_iSize_get(swigCPtr, this);
  }

  public void setIFlags(int value) {
    jadl_sdkJNI.ADLAdapterODClockInfo_iFlags_set(swigCPtr, this, value);
  }

  public int getIFlags() {
    return jadl_sdkJNI.ADLAdapterODClockInfo_iFlags_get(swigCPtr, this);
  }

  public void setSMemoryClock(ADLODClockSetting value) {
    jadl_sdkJNI.ADLAdapterODClockInfo_sMemoryClock_set(swigCPtr, this, ADLODClockSetting.getCPtr(value), value);
  }

  public ADLODClockSetting getSMemoryClock() {
    long cPtr = jadl_sdkJNI.ADLAdapterODClockInfo_sMemoryClock_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ADLODClockSetting(cPtr, false);
  }

  public void setSEngineClock(ADLODClockSetting value) {
    jadl_sdkJNI.ADLAdapterODClockInfo_sEngineClock_set(swigCPtr, this, ADLODClockSetting.getCPtr(value), value);
  }

  public ADLODClockSetting getSEngineClock() {
    long cPtr = jadl_sdkJNI.ADLAdapterODClockInfo_sEngineClock_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ADLODClockSetting(cPtr, false);
  }

  public ADLAdapterODClockInfo() {
    this(jadl_sdkJNI.new_ADLAdapterODClockInfo(), true);
  }

}