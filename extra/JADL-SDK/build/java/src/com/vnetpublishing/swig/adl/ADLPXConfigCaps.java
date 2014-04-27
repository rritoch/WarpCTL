/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLPXConfigCaps {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLPXConfigCaps(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLPXConfigCaps obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLPXConfigCaps(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIAdapterIndex(int value) {
    jadl_sdkJNI.ADLPXConfigCaps_iAdapterIndex_set(swigCPtr, this, value);
  }

  public int getIAdapterIndex() {
    return jadl_sdkJNI.ADLPXConfigCaps_iAdapterIndex_get(swigCPtr, this);
  }

  public void setIPXConfigCapMask(int value) {
    jadl_sdkJNI.ADLPXConfigCaps_iPXConfigCapMask_set(swigCPtr, this, value);
  }

  public int getIPXConfigCapMask() {
    return jadl_sdkJNI.ADLPXConfigCaps_iPXConfigCapMask_get(swigCPtr, this);
  }

  public void setIPXConfigCapValue(int value) {
    jadl_sdkJNI.ADLPXConfigCaps_iPXConfigCapValue_set(swigCPtr, this, value);
  }

  public int getIPXConfigCapValue() {
    return jadl_sdkJNI.ADLPXConfigCaps_iPXConfigCapValue_get(swigCPtr, this);
  }

  public ADLPXConfigCaps() {
    this(jadl_sdkJNI.new_ADLPXConfigCaps(), true);
  }

}