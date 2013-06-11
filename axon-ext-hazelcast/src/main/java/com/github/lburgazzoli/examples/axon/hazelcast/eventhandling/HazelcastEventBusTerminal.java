/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.lburgazzoli.examples.axon.hazelcast.eventhandling;

import org.axonframework.domain.EventMessage;
import org.axonframework.eventhandling.Cluster;
import org.axonframework.eventhandling.EventBusTerminal;

/**
 *
 */
public class HazelcastEventBusTerminal implements EventBusTerminal {

    private final HazelcastEventBusManager m_manager;

    /**
     *
     * @param manager
     */
    public HazelcastEventBusTerminal(HazelcastEventBusManager manager) {
        m_manager = manager;
    }

    @Override
    public void publish(EventMessage... events) {
    }

    @Override
    public void onClusterCreated(Cluster cluster) {
    }
}
