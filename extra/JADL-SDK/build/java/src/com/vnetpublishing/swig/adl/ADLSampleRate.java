/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public final class ADLSampleRate {
  public final static ADLSampleRate ADLSampleRate_32KHz = new ADLSampleRate("ADLSampleRate_32KHz", jadl_sdkJNI.ADLSampleRate_32KHz_get());
  public final static ADLSampleRate ADLSampleRate_44P1KHz = new ADLSampleRate("ADLSampleRate_44P1KHz");
  public final static ADLSampleRate ADLSampleRate_48KHz = new ADLSampleRate("ADLSampleRate_48KHz");
  public final static ADLSampleRate ADLSampleRate_88P2KHz = new ADLSampleRate("ADLSampleRate_88P2KHz");
  public final static ADLSampleRate ADLSampleRate_96KHz = new ADLSampleRate("ADLSampleRate_96KHz");
  public final static ADLSampleRate ADLSampleRate_176P4KHz = new ADLSampleRate("ADLSampleRate_176P4KHz");
  public final static ADLSampleRate ADLSampleRate_192KHz = new ADLSampleRate("ADLSampleRate_192KHz");
  public final static ADLSampleRate ADLSampleRate_384KHz = new ADLSampleRate("ADLSampleRate_384KHz");
  public final static ADLSampleRate ADLSampleRate_768KHz = new ADLSampleRate("ADLSampleRate_768KHz");
  public final static ADLSampleRate ADLSampleRate_Undefined = new ADLSampleRate("ADLSampleRate_Undefined");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ADLSampleRate swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ADLSampleRate.class + " with value " + swigValue);
  }

  private ADLSampleRate(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ADLSampleRate(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ADLSampleRate(String swigName, ADLSampleRate swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ADLSampleRate[] swigValues = { ADLSampleRate_32KHz, ADLSampleRate_44P1KHz, ADLSampleRate_48KHz, ADLSampleRate_88P2KHz, ADLSampleRate_96KHz, ADLSampleRate_176P4KHz, ADLSampleRate_192KHz, ADLSampleRate_384KHz, ADLSampleRate_768KHz, ADLSampleRate_Undefined };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

