/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NVVIOSTATUS {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NVVIOSTATUS(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVVIOSTATUS obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NVVIOSTATUS(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NVVIOSTATUS_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NVVIOSTATUS_version_get(swigCPtr, this);
  }

  public void setNvvioStatusType(NVVIOSTATUSTYPE value) {
    jnvapiJNI.NVVIOSTATUS_nvvioStatusType_set(swigCPtr, this, value.swigValue());
  }

  public NVVIOSTATUSTYPE getNvvioStatusType() {
    return NVVIOSTATUSTYPE.swigToEnum(jnvapiJNI.NVVIOSTATUS_nvvioStatusType_get(swigCPtr, this));
  }

  public NVVIOSTATUS_vioStatus getVioStatus() {
    long cPtr = jnvapiJNI.NVVIOSTATUS_vioStatus_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NVVIOSTATUS_vioStatus(cPtr, false);
  }

  public NVVIOSTATUS() {
    this(jnvapiJNI.new_NVVIOSTATUS(), true);
  }

}