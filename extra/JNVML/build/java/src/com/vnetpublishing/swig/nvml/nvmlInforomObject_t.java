/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvml;

public final class nvmlInforomObject_t {
  public final static nvmlInforomObject_t NVML_INFOROM_OEM = new nvmlInforomObject_t("NVML_INFOROM_OEM", jnvmlJNI.NVML_INFOROM_OEM_get());
  public final static nvmlInforomObject_t NVML_INFOROM_ECC = new nvmlInforomObject_t("NVML_INFOROM_ECC", jnvmlJNI.NVML_INFOROM_ECC_get());
  public final static nvmlInforomObject_t NVML_INFOROM_POWER = new nvmlInforomObject_t("NVML_INFOROM_POWER", jnvmlJNI.NVML_INFOROM_POWER_get());
  public final static nvmlInforomObject_t NVML_INFOROM_COUNT = new nvmlInforomObject_t("NVML_INFOROM_COUNT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static nvmlInforomObject_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + nvmlInforomObject_t.class + " with value " + swigValue);
  }

  private nvmlInforomObject_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private nvmlInforomObject_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private nvmlInforomObject_t(String swigName, nvmlInforomObject_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static nvmlInforomObject_t[] swigValues = { NVML_INFOROM_OEM, NVML_INFOROM_ECC, NVML_INFOROM_POWER, NVML_INFOROM_COUNT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

