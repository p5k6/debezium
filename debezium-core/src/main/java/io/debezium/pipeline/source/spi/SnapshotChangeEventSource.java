/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.pipeline.source.spi;

import io.debezium.pipeline.spi.SnapshotResult;

public interface SnapshotChangeEventSource extends ChangeEventSource {

    SnapshotResult execute(SnapshotContext context);

    public interface SnapshotContext {

        // TODO can we get rid of this in the favor of Thread.isInterrupted()?
        boolean isAborted();
    }
}