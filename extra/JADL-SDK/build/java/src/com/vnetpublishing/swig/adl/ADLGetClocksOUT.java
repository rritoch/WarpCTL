/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLGetClocksOUT {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLGetClocksOUT(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLGetClocksOUT obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLGetClocksOUT(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUlHighCoreClock(int value) {
    jadl_sdkJNI.ADLGetClocksOUT_ulHighCoreClock_set(swigCPtr, this, value);
  }

  public int getUlHighCoreClock() {
    return jadl_sdkJNI.ADLGetClocksOUT_ulHighCoreClock_get(swigCPtr, this);
  }

  public void setUlHighMemoryClock(int value) {
    jadl_sdkJNI.ADLGetClocksOUT_ulHighMemoryClock_set(swigCPtr, this, value);
  }

  public int getUlHighMemoryClock() {
    return jadl_sdkJNI.ADLGetClocksOUT_ulHighMemoryClock_get(swigCPtr, this);
  }

  public void setUlHighVddc(int value) {
    jadl_sdkJNI.ADLGetClocksOUT_ulHighVddc_set(swigCPtr, this, value);
  }

  public int getUlHighVddc() {
    return jadl_sdkJNI.ADLGetClocksOUT_ulHighVddc_get(swigCPtr, this);
  }

  public void setUlCoreMin(int value) {
    jadl_sdkJNI.ADLGetClocksOUT_ulCoreMin_set(swigCPtr, this, value);
  }

  public int getUlCoreMin() {
    return jadl_sdkJNI.ADLGetClocksOUT_ulCoreMin_get(swigCPtr, this);
  }

  public void setUlCoreMax(int value) {
    jadl_sdkJNI.ADLGetClocksOUT_ulCoreMax_set(swigCPtr, this, value);
  }

  public int getUlCoreMax() {
    return jadl_sdkJNI.ADLGetClocksOUT_ulCoreMax_get(swigCPtr, this);
  }

  public void setUlMemoryMin(int value) {
    jadl_sdkJNI.ADLGetClocksOUT_ulMemoryMin_set(swigCPtr, this, value);
  }

  public int getUlMemoryMin() {
    return jadl_sdkJNI.ADLGetClocksOUT_ulMemoryMin_get(swigCPtr, this);
  }

  public void setUlMemoryMax(int value) {
    jadl_sdkJNI.ADLGetClocksOUT_ulMemoryMax_set(swigCPtr, this, value);
  }

  public int getUlMemoryMax() {
    return jadl_sdkJNI.ADLGetClocksOUT_ulMemoryMax_get(swigCPtr, this);
  }

  public void setUlActivityPercent(int value) {
    jadl_sdkJNI.ADLGetClocksOUT_ulActivityPercent_set(swigCPtr, this, value);
  }

  public int getUlActivityPercent() {
    return jadl_sdkJNI.ADLGetClocksOUT_ulActivityPercent_get(swigCPtr, this);
  }

  public void setUlCurrentCoreClock(int value) {
    jadl_sdkJNI.ADLGetClocksOUT_ulCurrentCoreClock_set(swigCPtr, this, value);
  }

  public int getUlCurrentCoreClock() {
    return jadl_sdkJNI.ADLGetClocksOUT_ulCurrentCoreClock_get(swigCPtr, this);
  }

  public void setUlCurrentMemoryClock(int value) {
    jadl_sdkJNI.ADLGetClocksOUT_ulCurrentMemoryClock_set(swigCPtr, this, value);
  }

  public int getUlCurrentMemoryClock() {
    return jadl_sdkJNI.ADLGetClocksOUT_ulCurrentMemoryClock_get(swigCPtr, this);
  }

  public void setUlReserved(int value) {
    jadl_sdkJNI.ADLGetClocksOUT_ulReserved_set(swigCPtr, this, value);
  }

  public int getUlReserved() {
    return jadl_sdkJNI.ADLGetClocksOUT_ulReserved_get(swigCPtr, this);
  }

  public ADLGetClocksOUT() {
    this(jadl_sdkJNI.new_ADLGetClocksOUT(), true);
  }

}
