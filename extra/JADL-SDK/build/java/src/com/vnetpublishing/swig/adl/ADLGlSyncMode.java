/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLGlSyncMode {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLGlSyncMode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLGlSyncMode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLGlSyncMode(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIControlVector(int value) {
    jadl_sdkJNI.ADLGlSyncMode_iControlVector_set(swigCPtr, this, value);
  }

  public int getIControlVector() {
    return jadl_sdkJNI.ADLGlSyncMode_iControlVector_get(swigCPtr, this);
  }

  public void setIStatusVector(int value) {
    jadl_sdkJNI.ADLGlSyncMode_iStatusVector_set(swigCPtr, this, value);
  }

  public int getIStatusVector() {
    return jadl_sdkJNI.ADLGlSyncMode_iStatusVector_get(swigCPtr, this);
  }

  public void setIGLSyncConnectorIndex(int value) {
    jadl_sdkJNI.ADLGlSyncMode_iGLSyncConnectorIndex_set(swigCPtr, this, value);
  }

  public int getIGLSyncConnectorIndex() {
    return jadl_sdkJNI.ADLGlSyncMode_iGLSyncConnectorIndex_get(swigCPtr, this);
  }

  public ADLGlSyncMode() {
    this(jadl_sdkJNI.new_ADLGlSyncMode(), true);
  }

}
