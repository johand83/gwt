/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.validation.client.impl;

import com.google.gwt.validation.client.spi.GwtValidationProvider;
import com.google.gwt.validation.client.impl.GwtClockProvider;

import java.io.InputStream;

import jakarta.validation.spi.BootstrapState;
import jakarta.validation.BootstrapConfiguration;
import jakarta.validation.ClockProvider;
import jakarta.validation.ParameterNameProvider;
import jakarta.validation.valueextraction.ValueExtractor;
import jakarta.validation.valueextraction.ValueExtractorDeclarationException;

/**
 * Extends {@link BaseGwtConfiguration} with just the parts that are not GWT
 * compatible.
 */
public final class GwtConfiguration extends BaseGwtConfiguration {

  public GwtConfiguration(GwtValidationProvider gwtValidationProvider,
      BootstrapState state) {
    super(gwtValidationProvider, state);
  }

  /**
   * Unsupported. Always throws an {@link UnsupportedOperationException}.
   */
  @Override
  public GwtConfiguration addMapping(InputStream stream) {
    throw new UnsupportedOperationException("GWT does not support InputStreams");
  }

  @Override
  public BootstrapConfiguration getBootstrapConfiguration() {
    return null;
  }

  @Override
  public ClockProvider getDefaultClockProvider() {
    return GwtClockProvider.INSTANCE;
  }

  @Override
  public ParameterNameProvider getDefaultParameterNameProvider() {
    return null;
  }

  @Override
  public GwtConfiguration addValueExtractor(ValueExtractor<?> extractor) {
    return null;
  }

  @Override
  public GwtConfiguration clockProvider(ClockProvider clockProvider) {
    return null;
  }

  @Override
  public GwtConfiguration parameterNameProvider(ParameterNameProvider parameterNameProvider) {
    return null;
  }
}
