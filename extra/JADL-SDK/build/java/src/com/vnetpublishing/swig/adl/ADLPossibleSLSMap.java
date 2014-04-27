/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLPossibleSLSMap {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLPossibleSLSMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLPossibleSLSMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLPossibleSLSMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setISLSMapIndex(int value) {
    jadl_sdkJNI.ADLPossibleSLSMap_iSLSMapIndex_set(swigCPtr, this, value);
  }

  public int getISLSMapIndex() {
    return jadl_sdkJNI.ADLPossibleSLSMap_iSLSMapIndex_get(swigCPtr, this);
  }

  public void setINumSLSMap(int value) {
    jadl_sdkJNI.ADLPossibleSLSMap_iNumSLSMap_set(swigCPtr, this, value);
  }

  public int getINumSLSMap() {
    return jadl_sdkJNI.ADLPossibleSLSMap_iNumSLSMap_get(swigCPtr, this);
  }

  public void setLpSLSMap(ADLSLSMap value) {
    jadl_sdkJNI.ADLPossibleSLSMap_lpSLSMap_set(swigCPtr, this, ADLSLSMap.getCPtr(value), value);
  }

  public ADLSLSMap getLpSLSMap() {
    long cPtr = jadl_sdkJNI.ADLPossibleSLSMap_lpSLSMap_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ADLSLSMap(cPtr, false);
  }

  public void setINumSLSTarget(int value) {
    jadl_sdkJNI.ADLPossibleSLSMap_iNumSLSTarget_set(swigCPtr, this, value);
  }

  public int getINumSLSTarget() {
    return jadl_sdkJNI.ADLPossibleSLSMap_iNumSLSTarget_get(swigCPtr, this);
  }

  public void setLpDisplayTarget(ADLDisplayTarget value) {
    jadl_sdkJNI.ADLPossibleSLSMap_lpDisplayTarget_set(swigCPtr, this, ADLDisplayTarget.getCPtr(value), value);
  }

  public ADLDisplayTarget getLpDisplayTarget() {
    long cPtr = jadl_sdkJNI.ADLPossibleSLSMap_lpDisplayTarget_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ADLDisplayTarget(cPtr, false);
  }

  public ADLPossibleSLSMap() {
    this(jadl_sdkJNI.new_ADLPossibleSLSMap(), true);
  }

}