/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvml;

public class nvmlUnitFanInfo_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected nvmlUnitFanInfo_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(nvmlUnitFanInfo_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvmlJNI.delete_nvmlUnitFanInfo_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSpeed(long value) {
    jnvmlJNI.nvmlUnitFanInfo_t_speed_set(swigCPtr, this, value);
  }

  public long getSpeed() {
    return jnvmlJNI.nvmlUnitFanInfo_t_speed_get(swigCPtr, this);
  }

  public void setState(nvmlFanState_t value) {
    jnvmlJNI.nvmlUnitFanInfo_t_state_set(swigCPtr, this, value.swigValue());
  }

  public nvmlFanState_t getState() {
    return nvmlFanState_t.swigToEnum(jnvmlJNI.nvmlUnitFanInfo_t_state_get(swigCPtr, this));
  }

  public nvmlUnitFanInfo_t() {
    this(jnvmlJNI.new_nvmlUnitFanInfo_t(), true);
  }

}