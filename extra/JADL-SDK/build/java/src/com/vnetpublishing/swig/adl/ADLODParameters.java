/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLODParameters {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLODParameters(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLODParameters obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLODParameters(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setISize(int value) {
    jadl_sdkJNI.ADLODParameters_iSize_set(swigCPtr, this, value);
  }

  public int getISize() {
    return jadl_sdkJNI.ADLODParameters_iSize_get(swigCPtr, this);
  }

  public void setINumberOfPerformanceLevels(int value) {
    jadl_sdkJNI.ADLODParameters_iNumberOfPerformanceLevels_set(swigCPtr, this, value);
  }

  public int getINumberOfPerformanceLevels() {
    return jadl_sdkJNI.ADLODParameters_iNumberOfPerformanceLevels_get(swigCPtr, this);
  }

  public void setIActivityReportingSupported(int value) {
    jadl_sdkJNI.ADLODParameters_iActivityReportingSupported_set(swigCPtr, this, value);
  }

  public int getIActivityReportingSupported() {
    return jadl_sdkJNI.ADLODParameters_iActivityReportingSupported_get(swigCPtr, this);
  }

  public void setIDiscretePerformanceLevels(int value) {
    jadl_sdkJNI.ADLODParameters_iDiscretePerformanceLevels_set(swigCPtr, this, value);
  }

  public int getIDiscretePerformanceLevels() {
    return jadl_sdkJNI.ADLODParameters_iDiscretePerformanceLevels_get(swigCPtr, this);
  }

  public void setIReserved(int value) {
    jadl_sdkJNI.ADLODParameters_iReserved_set(swigCPtr, this, value);
  }

  public int getIReserved() {
    return jadl_sdkJNI.ADLODParameters_iReserved_get(swigCPtr, this);
  }

  public void setSEngineClock(ADLODParameterRange value) {
    jadl_sdkJNI.ADLODParameters_sEngineClock_set(swigCPtr, this, ADLODParameterRange.getCPtr(value), value);
  }

  public ADLODParameterRange getSEngineClock() {
    long cPtr = jadl_sdkJNI.ADLODParameters_sEngineClock_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ADLODParameterRange(cPtr, false);
  }

  public void setSMemoryClock(ADLODParameterRange value) {
    jadl_sdkJNI.ADLODParameters_sMemoryClock_set(swigCPtr, this, ADLODParameterRange.getCPtr(value), value);
  }

  public ADLODParameterRange getSMemoryClock() {
    long cPtr = jadl_sdkJNI.ADLODParameters_sMemoryClock_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ADLODParameterRange(cPtr, false);
  }

  public void setSVddc(ADLODParameterRange value) {
    jadl_sdkJNI.ADLODParameters_sVddc_set(swigCPtr, this, ADLODParameterRange.getCPtr(value), value);
  }

  public ADLODParameterRange getSVddc() {
    long cPtr = jadl_sdkJNI.ADLODParameters_sVddc_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ADLODParameterRange(cPtr, false);
  }

  public ADLODParameters() {
    this(jadl_sdkJNI.new_ADLODParameters(), true);
  }

}