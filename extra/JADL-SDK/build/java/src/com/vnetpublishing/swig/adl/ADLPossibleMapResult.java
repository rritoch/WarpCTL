/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLPossibleMapResult {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLPossibleMapResult(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLPossibleMapResult obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLPossibleMapResult(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIIndex(int value) {
    jadl_sdkJNI.ADLPossibleMapResult_iIndex_set(swigCPtr, this, value);
  }

  public int getIIndex() {
    return jadl_sdkJNI.ADLPossibleMapResult_iIndex_get(swigCPtr, this);
  }

  public void setIPossibleMapResultMask(int value) {
    jadl_sdkJNI.ADLPossibleMapResult_iPossibleMapResultMask_set(swigCPtr, this, value);
  }

  public int getIPossibleMapResultMask() {
    return jadl_sdkJNI.ADLPossibleMapResult_iPossibleMapResultMask_get(swigCPtr, this);
  }

  public void setIPossibleMapResultValue(int value) {
    jadl_sdkJNI.ADLPossibleMapResult_iPossibleMapResultValue_set(swigCPtr, this, value);
  }

  public int getIPossibleMapResultValue() {
    return jadl_sdkJNI.ADLPossibleMapResult_iPossibleMapResultValue_get(swigCPtr, this);
  }

  public ADLPossibleMapResult() {
    this(jadl_sdkJNI.new_ADLPossibleMapResult(), true);
  }

}