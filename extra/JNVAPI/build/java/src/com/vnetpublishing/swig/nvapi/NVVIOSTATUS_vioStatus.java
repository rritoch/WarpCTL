/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NVVIOSTATUS_vioStatus {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NVVIOSTATUS_vioStatus(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVVIOSTATUS_vioStatus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NVVIOSTATUS_vioStatus(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInStatus(NVVIOINPUTSTATUS value) {
    jnvapiJNI.NVVIOSTATUS_vioStatus_inStatus_set(swigCPtr, this, NVVIOINPUTSTATUS.getCPtr(value), value);
  }

  public NVVIOINPUTSTATUS getInStatus() {
    long cPtr = jnvapiJNI.NVVIOSTATUS_vioStatus_inStatus_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NVVIOINPUTSTATUS(cPtr, false);
  }

  public void setOutStatus(NVVIOOUTPUTSTATUS value) {
    jnvapiJNI.NVVIOSTATUS_vioStatus_outStatus_set(swigCPtr, this, NVVIOOUTPUTSTATUS.getCPtr(value), value);
  }

  public NVVIOOUTPUTSTATUS getOutStatus() {
    long cPtr = jnvapiJNI.NVVIOSTATUS_vioStatus_outStatus_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NVVIOOUTPUTSTATUS(cPtr, false);
  }

  public NVVIOSTATUS_vioStatus() {
    this(jnvapiJNI.new_NVVIOSTATUS_vioStatus(), true);
  }

}