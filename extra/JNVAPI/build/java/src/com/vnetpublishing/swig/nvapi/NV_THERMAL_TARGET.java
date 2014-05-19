/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NV_THERMAL_TARGET {
  public final static NV_THERMAL_TARGET NVAPI_THERMAL_TARGET_NONE = new NV_THERMAL_TARGET("NVAPI_THERMAL_TARGET_NONE", jnvapiJNI.NVAPI_THERMAL_TARGET_NONE_get());
  public final static NV_THERMAL_TARGET NVAPI_THERMAL_TARGET_GPU = new NV_THERMAL_TARGET("NVAPI_THERMAL_TARGET_GPU", jnvapiJNI.NVAPI_THERMAL_TARGET_GPU_get());
  public final static NV_THERMAL_TARGET NVAPI_THERMAL_TARGET_MEMORY = new NV_THERMAL_TARGET("NVAPI_THERMAL_TARGET_MEMORY", jnvapiJNI.NVAPI_THERMAL_TARGET_MEMORY_get());
  public final static NV_THERMAL_TARGET NVAPI_THERMAL_TARGET_POWER_SUPPLY = new NV_THERMAL_TARGET("NVAPI_THERMAL_TARGET_POWER_SUPPLY", jnvapiJNI.NVAPI_THERMAL_TARGET_POWER_SUPPLY_get());
  public final static NV_THERMAL_TARGET NVAPI_THERMAL_TARGET_BOARD = new NV_THERMAL_TARGET("NVAPI_THERMAL_TARGET_BOARD", jnvapiJNI.NVAPI_THERMAL_TARGET_BOARD_get());
  public final static NV_THERMAL_TARGET NVAPI_THERMAL_TARGET_VCD_BOARD = new NV_THERMAL_TARGET("NVAPI_THERMAL_TARGET_VCD_BOARD", jnvapiJNI.NVAPI_THERMAL_TARGET_VCD_BOARD_get());
  public final static NV_THERMAL_TARGET NVAPI_THERMAL_TARGET_VCD_INLET = new NV_THERMAL_TARGET("NVAPI_THERMAL_TARGET_VCD_INLET", jnvapiJNI.NVAPI_THERMAL_TARGET_VCD_INLET_get());
  public final static NV_THERMAL_TARGET NVAPI_THERMAL_TARGET_VCD_OUTLET = new NV_THERMAL_TARGET("NVAPI_THERMAL_TARGET_VCD_OUTLET", jnvapiJNI.NVAPI_THERMAL_TARGET_VCD_OUTLET_get());
  public final static NV_THERMAL_TARGET NVAPI_THERMAL_TARGET_ALL = new NV_THERMAL_TARGET("NVAPI_THERMAL_TARGET_ALL", jnvapiJNI.NVAPI_THERMAL_TARGET_ALL_get());
  public final static NV_THERMAL_TARGET NVAPI_THERMAL_TARGET_UNKNOWN = new NV_THERMAL_TARGET("NVAPI_THERMAL_TARGET_UNKNOWN", jnvapiJNI.NVAPI_THERMAL_TARGET_UNKNOWN_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NV_THERMAL_TARGET swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NV_THERMAL_TARGET.class + " with value " + swigValue);
  }

  private NV_THERMAL_TARGET(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NV_THERMAL_TARGET(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NV_THERMAL_TARGET(String swigName, NV_THERMAL_TARGET swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NV_THERMAL_TARGET[] swigValues = { NVAPI_THERMAL_TARGET_NONE, NVAPI_THERMAL_TARGET_GPU, NVAPI_THERMAL_TARGET_MEMORY, NVAPI_THERMAL_TARGET_POWER_SUPPLY, NVAPI_THERMAL_TARGET_BOARD, NVAPI_THERMAL_TARGET_VCD_BOARD, NVAPI_THERMAL_TARGET_VCD_INLET, NVAPI_THERMAL_TARGET_VCD_OUTLET, NVAPI_THERMAL_TARGET_ALL, NVAPI_THERMAL_TARGET_UNKNOWN };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
