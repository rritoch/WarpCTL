/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_INFOFRAME_AUDIO {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_INFOFRAME_AUDIO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_INFOFRAME_AUDIO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_INFOFRAME_AUDIO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCodingType(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_codingType_set(swigCPtr, this, value);
  }

  public long getCodingType() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_codingType_get(swigCPtr, this);
  }

  public void setCodingExtensionType(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_codingExtensionType_set(swigCPtr, this, value);
  }

  public long getCodingExtensionType() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_codingExtensionType_get(swigCPtr, this);
  }

  public void setSampleSize(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_sampleSize_set(swigCPtr, this, value);
  }

  public long getSampleSize() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_sampleSize_get(swigCPtr, this);
  }

  public void setSampleRate(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_sampleRate_set(swigCPtr, this, value);
  }

  public long getSampleRate() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_sampleRate_get(swigCPtr, this);
  }

  public void setChannelCount(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_channelCount_set(swigCPtr, this, value);
  }

  public long getChannelCount() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_channelCount_get(swigCPtr, this);
  }

  public void setSpeakerPlacement(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_speakerPlacement_set(swigCPtr, this, value);
  }

  public long getSpeakerPlacement() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_speakerPlacement_get(swigCPtr, this);
  }

  public void setDownmixInhibit(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_downmixInhibit_set(swigCPtr, this, value);
  }

  public long getDownmixInhibit() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_downmixInhibit_get(swigCPtr, this);
  }

  public void setLfePlaybackLevel(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_lfePlaybackLevel_set(swigCPtr, this, value);
  }

  public long getLfePlaybackLevel() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_lfePlaybackLevel_get(swigCPtr, this);
  }

  public void setLevelShift(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_levelShift_set(swigCPtr, this, value);
  }

  public long getLevelShift() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_levelShift_get(swigCPtr, this);
  }

  public void setFuture12(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_Future12_set(swigCPtr, this, value);
  }

  public long getFuture12() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_Future12_get(swigCPtr, this);
  }

  public void setFuture2x(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_Future2x_set(swigCPtr, this, value);
  }

  public long getFuture2x() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_Future2x_get(swigCPtr, this);
  }

  public void setFuture3x(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_Future3x_set(swigCPtr, this, value);
  }

  public long getFuture3x() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_Future3x_get(swigCPtr, this);
  }

  public void setFuture52(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_Future52_set(swigCPtr, this, value);
  }

  public long getFuture52() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_Future52_get(swigCPtr, this);
  }

  public void setFuture6(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_Future6_set(swigCPtr, this, value);
  }

  public long getFuture6() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_Future6_get(swigCPtr, this);
  }

  public void setFuture7(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_Future7_set(swigCPtr, this, value);
  }

  public long getFuture7() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_Future7_get(swigCPtr, this);
  }

  public void setFuture8(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_Future8_set(swigCPtr, this, value);
  }

  public long getFuture8() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_Future8_get(swigCPtr, this);
  }

  public void setFuture9(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_Future9_set(swigCPtr, this, value);
  }

  public long getFuture9() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_Future9_get(swigCPtr, this);
  }

  public void setFuture10(long value) {
    jnvapiJNI.NV_INFOFRAME_AUDIO_Future10_set(swigCPtr, this, value);
  }

  public long getFuture10() {
    return jnvapiJNI.NV_INFOFRAME_AUDIO_Future10_get(swigCPtr, this);
  }

  public NV_INFOFRAME_AUDIO() {
    this(jnvapiJNI.new_NV_INFOFRAME_AUDIO(), true);
  }

}