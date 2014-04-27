/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLI2C {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLI2C(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLI2C obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLI2C(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setISize(int value) {
    jadl_sdkJNI.ADLI2C_iSize_set(swigCPtr, this, value);
  }

  public int getISize() {
    return jadl_sdkJNI.ADLI2C_iSize_get(swigCPtr, this);
  }

  public void setILine(int value) {
    jadl_sdkJNI.ADLI2C_iLine_set(swigCPtr, this, value);
  }

  public int getILine() {
    return jadl_sdkJNI.ADLI2C_iLine_get(swigCPtr, this);
  }

  public void setIAddress(int value) {
    jadl_sdkJNI.ADLI2C_iAddress_set(swigCPtr, this, value);
  }

  public int getIAddress() {
    return jadl_sdkJNI.ADLI2C_iAddress_get(swigCPtr, this);
  }

  public void setIOffset(int value) {
    jadl_sdkJNI.ADLI2C_iOffset_set(swigCPtr, this, value);
  }

  public int getIOffset() {
    return jadl_sdkJNI.ADLI2C_iOffset_get(swigCPtr, this);
  }

  public void setIAction(int value) {
    jadl_sdkJNI.ADLI2C_iAction_set(swigCPtr, this, value);
  }

  public int getIAction() {
    return jadl_sdkJNI.ADLI2C_iAction_get(swigCPtr, this);
  }

  public void setISpeed(int value) {
    jadl_sdkJNI.ADLI2C_iSpeed_set(swigCPtr, this, value);
  }

  public int getISpeed() {
    return jadl_sdkJNI.ADLI2C_iSpeed_get(swigCPtr, this);
  }

  public void setIDataSize(int value) {
    jadl_sdkJNI.ADLI2C_iDataSize_set(swigCPtr, this, value);
  }

  public int getIDataSize() {
    return jadl_sdkJNI.ADLI2C_iDataSize_get(swigCPtr, this);
  }

  public void setPcData(String value) {
    jadl_sdkJNI.ADLI2C_pcData_set(swigCPtr, this, value);
  }

  public String getPcData() {
    return jadl_sdkJNI.ADLI2C_pcData_get(swigCPtr, this);
  }

  public ADLI2C() {
    this(jadl_sdkJNI.new_ADLI2C(), true);
  }

}
