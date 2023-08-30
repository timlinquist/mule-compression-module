/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.compression.internal.error.providers;

import org.mule.runtime.extension.api.annotation.error.ErrorTypeProvider;
import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

import java.util.HashSet;
import java.util.Set;

import static org.mule.extension.compression.internal.error.CompressionError.COULD_NOT_COMPRESS;
import static org.mule.extension.compression.internal.error.CompressionError.COULD_NOT_DECOMPRESS;
import static org.mule.extension.compression.internal.error.CompressionError.INVALID_ARCHIVE;

/**
 * Defines the possible errors for the extract operation
 *
 * @since 1.0
 */
public class ExtractErrorProvider implements ErrorTypeProvider {

  @Override
  public Set<ErrorTypeDefinition> getErrorTypes() {
    Set<ErrorTypeDefinition> errors = new HashSet<>();
    errors.add(COULD_NOT_DECOMPRESS);
    errors.add(INVALID_ARCHIVE);
    return errors;
  }
}
