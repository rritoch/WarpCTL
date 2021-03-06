/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public final class ADLPurposeCode {
  public final static ADLPurposeCode ADL_PURPOSECODE_NORMAL = new ADLPurposeCode("ADL_PURPOSECODE_NORMAL", jadl_sdkJNI.ADL_PURPOSECODE_NORMAL_get());
  public final static ADLPurposeCode ADL_PURPOSECODE_HIDE_MODE_SWITCH = new ADLPurposeCode("ADL_PURPOSECODE_HIDE_MODE_SWITCH");
  public final static ADLPurposeCode ADL_PURPOSECODE_MODE_SWITCH = new ADLPurposeCode("ADL_PURPOSECODE_MODE_SWITCH");
  public final static ADLPurposeCode ADL_PURPOSECODE_ATTATCH_DEVICE = new ADLPurposeCode("ADL_PURPOSECODE_ATTATCH_DEVICE");
  public final static ADLPurposeCode ADL_PURPOSECODE_DETACH_DEVICE = new ADLPurposeCode("ADL_PURPOSECODE_DETACH_DEVICE");
  public final static ADLPurposeCode ADL_PURPOSECODE_SETPRIMARY_DEVICE = new ADLPurposeCode("ADL_PURPOSECODE_SETPRIMARY_DEVICE");
  public final static ADLPurposeCode ADL_PURPOSECODE_GDI_ROTATION = new ADLPurposeCode("ADL_PURPOSECODE_GDI_ROTATION");
  public final static ADLPurposeCode ADL_PURPOSECODE_ATI_ROTATION = new ADLPurposeCode("ADL_PURPOSECODE_ATI_ROTATION");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ADLPurposeCode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ADLPurposeCode.class + " with value " + swigValue);
  }

  private ADLPurposeCode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ADLPurposeCode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ADLPurposeCode(String swigName, ADLPurposeCode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ADLPurposeCode[] swigValues = { ADL_PURPOSECODE_NORMAL, ADL_PURPOSECODE_HIDE_MODE_SWITCH, ADL_PURPOSECODE_MODE_SWITCH, ADL_PURPOSECODE_ATTATCH_DEVICE, ADL_PURPOSECODE_DETACH_DEVICE, ADL_PURPOSECODE_SETPRIMARY_DEVICE, ADL_PURPOSECODE_GDI_ROTATION, ADL_PURPOSECODE_ATI_ROTATION };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

