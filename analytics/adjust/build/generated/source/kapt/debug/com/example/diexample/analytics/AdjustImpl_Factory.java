// Generated by Dagger (https://dagger.dev).
package com.example.diexample.analytics;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AdjustImpl_Factory implements Factory<AdjustImpl> {
  @Override
  public AdjustImpl get() {
    return newInstance();
  }

  public static AdjustImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AdjustImpl newInstance() {
    return new AdjustImpl();
  }

  private static final class InstanceHolder {
    private static final AdjustImpl_Factory INSTANCE = new AdjustImpl_Factory();
  }
}
