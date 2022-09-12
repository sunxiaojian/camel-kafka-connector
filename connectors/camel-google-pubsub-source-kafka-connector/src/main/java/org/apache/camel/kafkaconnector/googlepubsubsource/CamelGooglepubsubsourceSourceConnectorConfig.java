/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.googlepubsubsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelGooglepubsubsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_PROJECT_ID_CONF = "camel.kamelet.google-pubsub-source.projectId";
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_PROJECT_ID_DOC = "The Google Cloud Pub/Sub Project ID.";
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_PROJECT_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SUBSCRIPTION_NAME_CONF = "camel.kamelet.google-pubsub-source.subscriptionName";
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SUBSCRIPTION_NAME_DOC = "The subscription name.";
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SUBSCRIPTION_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SERVICE_ACCOUNT_KEY_CONF = "camel.kamelet.google-pubsub-source.serviceAccountKey";
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SERVICE_ACCOUNT_KEY_DOC = "The service account key to use as credentials for the Pub/Sub publisher/subscriber. You must encode this value in base64.";
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SERVICE_ACCOUNT_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SYNCHRONOUS_PULL_CONF = "camel.kamelet.google-pubsub-source.synchronousPull";
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SYNCHRONOUS_PULL_DOC = "Specifies to synchronously pull batches of messages.";
    public static final Boolean CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SYNCHRONOUS_PULL_DEFAULT = false;
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_MAX_MESSAGES_PER_POLL_CONF = "camel.kamelet.google-pubsub-source.maxMessagesPerPoll";
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_MAX_MESSAGES_PER_POLL_DOC = "The maximum number of messages to receive from the server in a single API call.";
    public static final Integer CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_MAX_MESSAGES_PER_POLL_DEFAULT = 1;
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_CONCURRENT_CONSUMERS_CONF = "camel.kamelet.google-pubsub-source.concurrentConsumers";
    public static final String CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_CONCURRENT_CONSUMERS_DOC = "The number of parallel streams to consume from the subscription.";
    public static final Integer CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_CONCURRENT_CONSUMERS_DEFAULT = 1;

    public CamelGooglepubsubsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelGooglepubsubsourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_PROJECT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_PROJECT_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_PROJECT_ID_DOC);
        conf.define(CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SUBSCRIPTION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SUBSCRIPTION_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SUBSCRIPTION_NAME_DOC);
        conf.define(CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SERVICE_ACCOUNT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SERVICE_ACCOUNT_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SERVICE_ACCOUNT_KEY_DOC);
        conf.define(CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SYNCHRONOUS_PULL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SYNCHRONOUS_PULL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_SYNCHRONOUS_PULL_DOC);
        conf.define(CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_MAX_MESSAGES_PER_POLL_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_MAX_MESSAGES_PER_POLL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_MAX_MESSAGES_PER_POLL_DOC);
        conf.define(CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_CONCURRENT_CONSUMERS_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_CONCURRENT_CONSUMERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLEPUBSUBSOURCE_KAMELET_CONCURRENT_CONSUMERS_DOC);
        return conf;
    }
}