/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvml;

public class nvmlBridgeChipHierarchy_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected nvmlBridgeChipHierarchy_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(nvmlBridgeChipHierarchy_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvmlJNI.delete_nvmlBridgeChipHierarchy_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBridgeCount(short value) {
    jnvmlJNI.nvmlBridgeChipHierarchy_t_bridgeCount_set(swigCPtr, this, value);
  }

  public short getBridgeCount() {
    return jnvmlJNI.nvmlBridgeChipHierarchy_t_bridgeCount_get(swigCPtr, this);
  }

  public void setBridgeChipInfo(nvmlBridgeChipInfo_t value) {
    jnvmlJNI.nvmlBridgeChipHierarchy_t_bridgeChipInfo_set(swigCPtr, this, nvmlBridgeChipInfo_t.getCPtr(value), value);
  }

  public nvmlBridgeChipInfo_t getBridgeChipInfo() {
    long cPtr = jnvmlJNI.nvmlBridgeChipHierarchy_t_bridgeChipInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new nvmlBridgeChipInfo_t(cPtr, false);
  }

  public nvmlBridgeChipHierarchy_t() {
    this(jnvmlJNI.new_nvmlBridgeChipHierarchy_t(), true);
  }

}