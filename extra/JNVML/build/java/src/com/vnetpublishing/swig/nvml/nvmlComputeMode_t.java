/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvml;

public final class nvmlComputeMode_t {
  public final static nvmlComputeMode_t NVML_COMPUTEMODE_DEFAULT = new nvmlComputeMode_t("NVML_COMPUTEMODE_DEFAULT", jnvmlJNI.NVML_COMPUTEMODE_DEFAULT_get());
  public final static nvmlComputeMode_t NVML_COMPUTEMODE_EXCLUSIVE_THREAD = new nvmlComputeMode_t("NVML_COMPUTEMODE_EXCLUSIVE_THREAD", jnvmlJNI.NVML_COMPUTEMODE_EXCLUSIVE_THREAD_get());
  public final static nvmlComputeMode_t NVML_COMPUTEMODE_PROHIBITED = new nvmlComputeMode_t("NVML_COMPUTEMODE_PROHIBITED", jnvmlJNI.NVML_COMPUTEMODE_PROHIBITED_get());
  public final static nvmlComputeMode_t NVML_COMPUTEMODE_EXCLUSIVE_PROCESS = new nvmlComputeMode_t("NVML_COMPUTEMODE_EXCLUSIVE_PROCESS", jnvmlJNI.NVML_COMPUTEMODE_EXCLUSIVE_PROCESS_get());
  public final static nvmlComputeMode_t NVML_COMPUTEMODE_COUNT = new nvmlComputeMode_t("NVML_COMPUTEMODE_COUNT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static nvmlComputeMode_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + nvmlComputeMode_t.class + " with value " + swigValue);
  }

  private nvmlComputeMode_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private nvmlComputeMode_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private nvmlComputeMode_t(String swigName, nvmlComputeMode_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static nvmlComputeMode_t[] swigValues = { NVML_COMPUTEMODE_DEFAULT, NVML_COMPUTEMODE_EXCLUSIVE_THREAD, NVML_COMPUTEMODE_PROHIBITED, NVML_COMPUTEMODE_EXCLUSIVE_PROCESS, NVML_COMPUTEMODE_COUNT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

