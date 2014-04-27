/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLGLSyncGenlockConfig {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLGLSyncGenlockConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLGLSyncGenlockConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLGLSyncGenlockConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIValidMask(int value) {
    jadl_sdkJNI.ADLGLSyncGenlockConfig_iValidMask_set(swigCPtr, this, value);
  }

  public int getIValidMask() {
    return jadl_sdkJNI.ADLGLSyncGenlockConfig_iValidMask_get(swigCPtr, this);
  }

  public void setISyncDelay(int value) {
    jadl_sdkJNI.ADLGLSyncGenlockConfig_iSyncDelay_set(swigCPtr, this, value);
  }

  public int getISyncDelay() {
    return jadl_sdkJNI.ADLGLSyncGenlockConfig_iSyncDelay_get(swigCPtr, this);
  }

  public void setIFramelockCntlVector(int value) {
    jadl_sdkJNI.ADLGLSyncGenlockConfig_iFramelockCntlVector_set(swigCPtr, this, value);
  }

  public int getIFramelockCntlVector() {
    return jadl_sdkJNI.ADLGLSyncGenlockConfig_iFramelockCntlVector_get(swigCPtr, this);
  }

  public void setISignalSource(int value) {
    jadl_sdkJNI.ADLGLSyncGenlockConfig_iSignalSource_set(swigCPtr, this, value);
  }

  public int getISignalSource() {
    return jadl_sdkJNI.ADLGLSyncGenlockConfig_iSignalSource_get(swigCPtr, this);
  }

  public void setISampleRate(int value) {
    jadl_sdkJNI.ADLGLSyncGenlockConfig_iSampleRate_set(swigCPtr, this, value);
  }

  public int getISampleRate() {
    return jadl_sdkJNI.ADLGLSyncGenlockConfig_iSampleRate_get(swigCPtr, this);
  }

  public void setISyncField(int value) {
    jadl_sdkJNI.ADLGLSyncGenlockConfig_iSyncField_set(swigCPtr, this, value);
  }

  public int getISyncField() {
    return jadl_sdkJNI.ADLGLSyncGenlockConfig_iSyncField_get(swigCPtr, this);
  }

  public void setITriggerEdge(int value) {
    jadl_sdkJNI.ADLGLSyncGenlockConfig_iTriggerEdge_set(swigCPtr, this, value);
  }

  public int getITriggerEdge() {
    return jadl_sdkJNI.ADLGLSyncGenlockConfig_iTriggerEdge_get(swigCPtr, this);
  }

  public void setIScanRateCoeff(int value) {
    jadl_sdkJNI.ADLGLSyncGenlockConfig_iScanRateCoeff_set(swigCPtr, this, value);
  }

  public int getIScanRateCoeff() {
    return jadl_sdkJNI.ADLGLSyncGenlockConfig_iScanRateCoeff_get(swigCPtr, this);
  }

  public ADLGLSyncGenlockConfig() {
    this(jadl_sdkJNI.new_ADLGLSyncGenlockConfig(), true);
  }

}
