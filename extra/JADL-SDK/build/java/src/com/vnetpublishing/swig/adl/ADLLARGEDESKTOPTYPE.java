/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public final class ADLLARGEDESKTOPTYPE {
  public final static ADLLARGEDESKTOPTYPE ADL_LARGEDESKTOPTYPE_NORMALDESKTOP = new ADLLARGEDESKTOPTYPE("ADL_LARGEDESKTOPTYPE_NORMALDESKTOP", jadl_sdkJNI.ADL_LARGEDESKTOPTYPE_NORMALDESKTOP_get());
  public final static ADLLARGEDESKTOPTYPE ADL_LARGEDESKTOPTYPE_PSEUDOLARGEDESKTOP = new ADLLARGEDESKTOPTYPE("ADL_LARGEDESKTOPTYPE_PSEUDOLARGEDESKTOP", jadl_sdkJNI.ADL_LARGEDESKTOPTYPE_PSEUDOLARGEDESKTOP_get());
  public final static ADLLARGEDESKTOPTYPE ADL_LARGEDESKTOPTYPE_VERYLARGEDESKTOP = new ADLLARGEDESKTOPTYPE("ADL_LARGEDESKTOPTYPE_VERYLARGEDESKTOP", jadl_sdkJNI.ADL_LARGEDESKTOPTYPE_VERYLARGEDESKTOP_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ADLLARGEDESKTOPTYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ADLLARGEDESKTOPTYPE.class + " with value " + swigValue);
  }

  private ADLLARGEDESKTOPTYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ADLLARGEDESKTOPTYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ADLLARGEDESKTOPTYPE(String swigName, ADLLARGEDESKTOPTYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ADLLARGEDESKTOPTYPE[] swigValues = { ADL_LARGEDESKTOPTYPE_NORMALDESKTOP, ADL_LARGEDESKTOPTYPE_PSEUDOLARGEDESKTOP, ADL_LARGEDESKTOPTYPE_VERYLARGEDESKTOP };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

