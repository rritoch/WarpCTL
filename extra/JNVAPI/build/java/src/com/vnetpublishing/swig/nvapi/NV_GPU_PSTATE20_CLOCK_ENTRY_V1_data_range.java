/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMinFreq_kHz(long value) {
    jnvapiJNI.NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range_minFreq_kHz_set(swigCPtr, this, value);
  }

  public long getMinFreq_kHz() {
    return jnvapiJNI.NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range_minFreq_kHz_get(swigCPtr, this);
  }

  public void setMaxFreq_kHz(long value) {
    jnvapiJNI.NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range_maxFreq_kHz_set(swigCPtr, this, value);
  }

  public long getMaxFreq_kHz() {
    return jnvapiJNI.NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range_maxFreq_kHz_get(swigCPtr, this);
  }

  public void setDomainId(NV_GPU_PERF_VOLTAGE_INFO_DOMAIN_ID value) {
    jnvapiJNI.NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range_domainId_set(swigCPtr, this, value.swigValue());
  }

  public NV_GPU_PERF_VOLTAGE_INFO_DOMAIN_ID getDomainId() {
    return NV_GPU_PERF_VOLTAGE_INFO_DOMAIN_ID.swigToEnum(jnvapiJNI.NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range_domainId_get(swigCPtr, this));
  }

  public void setMinVoltage_uV(long value) {
    jnvapiJNI.NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range_minVoltage_uV_set(swigCPtr, this, value);
  }

  public long getMinVoltage_uV() {
    return jnvapiJNI.NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range_minVoltage_uV_get(swigCPtr, this);
  }

  public void setMaxVoltage_uV(long value) {
    jnvapiJNI.NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range_maxVoltage_uV_set(swigCPtr, this, value);
  }

  public long getMaxVoltage_uV() {
    return jnvapiJNI.NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range_maxVoltage_uV_get(swigCPtr, this);
  }

  public NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range() {
    this(jnvapiJNI.new_NV_GPU_PSTATE20_CLOCK_ENTRY_V1_data_range(), true);
  }

}