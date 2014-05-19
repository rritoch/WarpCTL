/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NV_MOSAIC_TOPO {
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_NONE = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_NONE");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_BEGIN_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_BEGIN_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_1x2_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_1x2_BASIC", jnvapiJNI.NV_MOSAIC_TOPO_1x2_BASIC_get());
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_2x1_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_2x1_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_1x3_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_1x3_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_3x1_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_3x1_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_1x4_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_1x4_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_4x1_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_4x1_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_2x2_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_2x2_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_2x3_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_2x3_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_2x4_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_2x4_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_3x2_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_3x2_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_4x2_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_4x2_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_1x5_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_1x5_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_1x6_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_1x6_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_7x1_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_7x1_BASIC");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_END_BASIC = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_END_BASIC", jnvapiJNI.NV_MOSAIC_TOPO_END_BASIC_get());
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_BEGIN_PASSIVE_STEREO = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_BEGIN_PASSIVE_STEREO");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_1x2_PASSIVE_STEREO = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_1x2_PASSIVE_STEREO", jnvapiJNI.NV_MOSAIC_TOPO_1x2_PASSIVE_STEREO_get());
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_2x1_PASSIVE_STEREO = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_2x1_PASSIVE_STEREO");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_1x3_PASSIVE_STEREO = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_1x3_PASSIVE_STEREO");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_3x1_PASSIVE_STEREO = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_3x1_PASSIVE_STEREO");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_1x4_PASSIVE_STEREO = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_1x4_PASSIVE_STEREO");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_4x1_PASSIVE_STEREO = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_4x1_PASSIVE_STEREO");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_2x2_PASSIVE_STEREO = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_2x2_PASSIVE_STEREO");
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_END_PASSIVE_STEREO = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_END_PASSIVE_STEREO", jnvapiJNI.NV_MOSAIC_TOPO_END_PASSIVE_STEREO_get());
  public final static NV_MOSAIC_TOPO NV_MOSAIC_TOPO_MAX = new NV_MOSAIC_TOPO("NV_MOSAIC_TOPO_MAX");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NV_MOSAIC_TOPO swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NV_MOSAIC_TOPO.class + " with value " + swigValue);
  }

  private NV_MOSAIC_TOPO(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NV_MOSAIC_TOPO(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NV_MOSAIC_TOPO(String swigName, NV_MOSAIC_TOPO swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NV_MOSAIC_TOPO[] swigValues = { NV_MOSAIC_TOPO_NONE, NV_MOSAIC_TOPO_BEGIN_BASIC, NV_MOSAIC_TOPO_1x2_BASIC, NV_MOSAIC_TOPO_2x1_BASIC, NV_MOSAIC_TOPO_1x3_BASIC, NV_MOSAIC_TOPO_3x1_BASIC, NV_MOSAIC_TOPO_1x4_BASIC, NV_MOSAIC_TOPO_4x1_BASIC, NV_MOSAIC_TOPO_2x2_BASIC, NV_MOSAIC_TOPO_2x3_BASIC, NV_MOSAIC_TOPO_2x4_BASIC, NV_MOSAIC_TOPO_3x2_BASIC, NV_MOSAIC_TOPO_4x2_BASIC, NV_MOSAIC_TOPO_1x5_BASIC, NV_MOSAIC_TOPO_1x6_BASIC, NV_MOSAIC_TOPO_7x1_BASIC, NV_MOSAIC_TOPO_END_BASIC, NV_MOSAIC_TOPO_BEGIN_PASSIVE_STEREO, NV_MOSAIC_TOPO_1x2_PASSIVE_STEREO, NV_MOSAIC_TOPO_2x1_PASSIVE_STEREO, NV_MOSAIC_TOPO_1x3_PASSIVE_STEREO, NV_MOSAIC_TOPO_3x1_PASSIVE_STEREO, NV_MOSAIC_TOPO_1x4_PASSIVE_STEREO, NV_MOSAIC_TOPO_4x1_PASSIVE_STEREO, NV_MOSAIC_TOPO_2x2_PASSIVE_STEREO, NV_MOSAIC_TOPO_END_PASSIVE_STEREO, NV_MOSAIC_TOPO_MAX };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
