/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE {
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_IN_HEADER = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_IN_HEADER", jnvapiJNI.NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_IN_HEADER_get());
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_PCM = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_PCM");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_AC3 = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_AC3");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_MPEG1 = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_MPEG1");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_MP3 = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_MP3");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_MPEG2 = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_MPEG2");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_AACLC = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_AACLC");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_DTS = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_DTS");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_ATRAC = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_ATRAC");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_DSD = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_DSD");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_EAC3 = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_EAC3");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_DTSHD = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_DTSHD");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_MLP = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_MLP");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_DST = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_DST");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_WMAPRO = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_WMAPRO");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_USE_CODING_EXTENSION_TYPE = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_USE_CODING_EXTENSION_TYPE");
  public final static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_AUTO = new NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE("NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_AUTO", jnvapiJNI.NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_AUTO_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE.class + " with value " + swigValue);
  }

  private NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE(String swigName, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE[] swigValues = { NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_IN_HEADER, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_PCM, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_AC3, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_MPEG1, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_MP3, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_MPEG2, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_AACLC, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_DTS, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_ATRAC, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_DSD, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_EAC3, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_DTSHD, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_MLP, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_DST, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_WMAPRO, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_USE_CODING_EXTENSION_TYPE, NV_INFOFRAME_FIELD_VALUE_AUDIO_CODINGTYPE_AUTO };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
