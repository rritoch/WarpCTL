/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NV_MOSAIC_TOPO_TYPE {
  public final static NV_MOSAIC_TOPO_TYPE NV_MOSAIC_TOPO_TYPE_ALL = new NV_MOSAIC_TOPO_TYPE("NV_MOSAIC_TOPO_TYPE_ALL");
  public final static NV_MOSAIC_TOPO_TYPE NV_MOSAIC_TOPO_TYPE_BASIC = new NV_MOSAIC_TOPO_TYPE("NV_MOSAIC_TOPO_TYPE_BASIC");
  public final static NV_MOSAIC_TOPO_TYPE NV_MOSAIC_TOPO_TYPE_PASSIVE_STEREO = new NV_MOSAIC_TOPO_TYPE("NV_MOSAIC_TOPO_TYPE_PASSIVE_STEREO");
  public final static NV_MOSAIC_TOPO_TYPE NV_MOSAIC_TOPO_TYPE_SCALED_CLONE = new NV_MOSAIC_TOPO_TYPE("NV_MOSAIC_TOPO_TYPE_SCALED_CLONE");
  public final static NV_MOSAIC_TOPO_TYPE NV_MOSAIC_TOPO_TYPE_PASSIVE_STEREO_SCALED_CLONE = new NV_MOSAIC_TOPO_TYPE("NV_MOSAIC_TOPO_TYPE_PASSIVE_STEREO_SCALED_CLONE");
  public final static NV_MOSAIC_TOPO_TYPE NV_MOSAIC_TOPO_TYPE_MAX = new NV_MOSAIC_TOPO_TYPE("NV_MOSAIC_TOPO_TYPE_MAX");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NV_MOSAIC_TOPO_TYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NV_MOSAIC_TOPO_TYPE.class + " with value " + swigValue);
  }

  private NV_MOSAIC_TOPO_TYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NV_MOSAIC_TOPO_TYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NV_MOSAIC_TOPO_TYPE(String swigName, NV_MOSAIC_TOPO_TYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NV_MOSAIC_TOPO_TYPE[] swigValues = { NV_MOSAIC_TOPO_TYPE_ALL, NV_MOSAIC_TOPO_TYPE_BASIC, NV_MOSAIC_TOPO_TYPE_PASSIVE_STEREO, NV_MOSAIC_TOPO_TYPE_SCALED_CLONE, NV_MOSAIC_TOPO_TYPE_PASSIVE_STEREO_SCALED_CLONE, NV_MOSAIC_TOPO_TYPE_MAX };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
