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
package org.apache.camel.kafkaconnector.azureeventhubssink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAzureeventhubssinkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_NAMESPACE_NAME_CONF = "camel.kamelet.azure-eventhubs-sink.namespaceName";
    public static final String CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_NAMESPACE_NAME_DOC = "The Event Hubs namespace.";
    public static final String CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_NAMESPACE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_EVENTHUB_NAME_CONF = "camel.kamelet.azure-eventhubs-sink.eventhubName";
    public static final String CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_EVENTHUB_NAME_DOC = "The Event Hub name.";
    public static final String CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_EVENTHUB_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_SHARED_ACCESS_NAME_CONF = "camel.kamelet.azure-eventhubs-sink.sharedAccessName";
    public static final String CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_SHARED_ACCESS_NAME_DOC = "The Event Hubs SAS key name.";
    public static final String CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_SHARED_ACCESS_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_SHARED_ACCESS_KEY_CONF = "camel.kamelet.azure-eventhubs-sink.sharedAccessKey";
    public static final String CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_SHARED_ACCESS_KEY_DOC = "The key for the Event Hubs SAS key name.";
    public static final String CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_SHARED_ACCESS_KEY_DEFAULT = null;

    public CamelAzureeventhubssinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAzureeventhubssinkSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_NAMESPACE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_NAMESPACE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_NAMESPACE_NAME_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_EVENTHUB_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_EVENTHUB_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_EVENTHUB_NAME_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_SHARED_ACCESS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_SHARED_ACCESS_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_SHARED_ACCESS_NAME_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_SHARED_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_SHARED_ACCESS_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AZUREEVENTHUBSSINK_KAMELET_SHARED_ACCESS_KEY_DOC);
        return conf;
    }
}