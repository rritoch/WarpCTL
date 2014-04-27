/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLOD6StateEx {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLOD6StateEx(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLOD6StateEx obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLOD6StateEx(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIEngineClockPercent(int value) {
    jadl_sdkJNI.ADLOD6StateEx_iEngineClockPercent_set(swigCPtr, this, value);
  }

  public int getIEngineClockPercent() {
    return jadl_sdkJNI.ADLOD6StateEx_iEngineClockPercent_get(swigCPtr, this);
  }

  public void setIMemoryClockPercent(int value) {
    jadl_sdkJNI.ADLOD6StateEx_iMemoryClockPercent_set(swigCPtr, this, value);
  }

  public int getIMemoryClockPercent() {
    return jadl_sdkJNI.ADLOD6StateEx_iMemoryClockPercent_get(swigCPtr, this);
  }

  public void setIPowerControlPercent(int value) {
    jadl_sdkJNI.ADLOD6StateEx_iPowerControlPercent_set(swigCPtr, this, value);
  }

  public int getIPowerControlPercent() {
    return jadl_sdkJNI.ADLOD6StateEx_iPowerControlPercent_get(swigCPtr, this);
  }

  public void setIExtValue(int value) {
    jadl_sdkJNI.ADLOD6StateEx_iExtValue_set(swigCPtr, this, value);
  }

  public int getIExtValue() {
    return jadl_sdkJNI.ADLOD6StateEx_iExtValue_get(swigCPtr, this);
  }

  public void setIExtMask(int value) {
    jadl_sdkJNI.ADLOD6StateEx_iExtMask_set(swigCPtr, this, value);
  }

  public int getIExtMask() {
    return jadl_sdkJNI.ADLOD6StateEx_iExtMask_get(swigCPtr, this);
  }

  public ADLOD6StateEx() {
    this(jadl_sdkJNI.new_ADLOD6StateEx(), true);
  }

}
