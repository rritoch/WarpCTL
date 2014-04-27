/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLOD6CurrentStatus {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLOD6CurrentStatus(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLOD6CurrentStatus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLOD6CurrentStatus(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIEngineClock(int value) {
    jadl_sdkJNI.ADLOD6CurrentStatus_iEngineClock_set(swigCPtr, this, value);
  }

  public int getIEngineClock() {
    return jadl_sdkJNI.ADLOD6CurrentStatus_iEngineClock_get(swigCPtr, this);
  }

  public void setIMemoryClock(int value) {
    jadl_sdkJNI.ADLOD6CurrentStatus_iMemoryClock_set(swigCPtr, this, value);
  }

  public int getIMemoryClock() {
    return jadl_sdkJNI.ADLOD6CurrentStatus_iMemoryClock_get(swigCPtr, this);
  }

  public void setIActivityPercent(int value) {
    jadl_sdkJNI.ADLOD6CurrentStatus_iActivityPercent_set(swigCPtr, this, value);
  }

  public int getIActivityPercent() {
    return jadl_sdkJNI.ADLOD6CurrentStatus_iActivityPercent_get(swigCPtr, this);
  }

  public void setICurrentPerformanceLevel(int value) {
    jadl_sdkJNI.ADLOD6CurrentStatus_iCurrentPerformanceLevel_set(swigCPtr, this, value);
  }

  public int getICurrentPerformanceLevel() {
    return jadl_sdkJNI.ADLOD6CurrentStatus_iCurrentPerformanceLevel_get(swigCPtr, this);
  }

  public void setICurrentBusSpeed(int value) {
    jadl_sdkJNI.ADLOD6CurrentStatus_iCurrentBusSpeed_set(swigCPtr, this, value);
  }

  public int getICurrentBusSpeed() {
    return jadl_sdkJNI.ADLOD6CurrentStatus_iCurrentBusSpeed_get(swigCPtr, this);
  }

  public void setICurrentBusLanes(int value) {
    jadl_sdkJNI.ADLOD6CurrentStatus_iCurrentBusLanes_set(swigCPtr, this, value);
  }

  public int getICurrentBusLanes() {
    return jadl_sdkJNI.ADLOD6CurrentStatus_iCurrentBusLanes_get(swigCPtr, this);
  }

  public void setIMaximumBusLanes(int value) {
    jadl_sdkJNI.ADLOD6CurrentStatus_iMaximumBusLanes_set(swigCPtr, this, value);
  }

  public int getIMaximumBusLanes() {
    return jadl_sdkJNI.ADLOD6CurrentStatus_iMaximumBusLanes_get(swigCPtr, this);
  }

  public void setIExtValue(int value) {
    jadl_sdkJNI.ADLOD6CurrentStatus_iExtValue_set(swigCPtr, this, value);
  }

  public int getIExtValue() {
    return jadl_sdkJNI.ADLOD6CurrentStatus_iExtValue_get(swigCPtr, this);
  }

  public void setIExtMask(int value) {
    jadl_sdkJNI.ADLOD6CurrentStatus_iExtMask_set(swigCPtr, this, value);
  }

  public int getIExtMask() {
    return jadl_sdkJNI.ADLOD6CurrentStatus_iExtMask_get(swigCPtr, this);
  }

  public ADLOD6CurrentStatus() {
    this(jadl_sdkJNI.new_ADLOD6CurrentStatus(), true);
  }

}
