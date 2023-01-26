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
package org.apache.camel.kafkaconnector.azureeventhubssource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAzureeventhubssourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_NAMESPACE_NAME_CONF = "camel.kamelet.azure-eventhubs-source.namespaceName";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_NAMESPACE_NAME_DOC = "The Event Hubs namespace.";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_NAMESPACE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_EVENTHUB_NAME_CONF = "camel.kamelet.azure-eventhubs-source.eventhubName";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_EVENTHUB_NAME_DOC = "The Event Hub name.";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_EVENTHUB_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_SHARED_ACCESS_NAME_CONF = "camel.kamelet.azure-eventhubs-source.sharedAccessName";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_SHARED_ACCESS_NAME_DOC = "The Event Hubs SAS key name.";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_SHARED_ACCESS_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_SHARED_ACCESS_KEY_CONF = "camel.kamelet.azure-eventhubs-source.sharedAccessKey";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_SHARED_ACCESS_KEY_DOC = "The key for the Event Hubs SAS key name.";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_SHARED_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCOUNT_NAME_CONF = "camel.kamelet.azure-eventhubs-source.blobAccountName";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCOUNT_NAME_DOC = "The name of the Storage Blob account.";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCOUNT_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_CONTAINER_NAME_CONF = "camel.kamelet.azure-eventhubs-source.blobContainerName";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_CONTAINER_NAME_DOC = "The name of the Storage Blob container.";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_CONTAINER_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCESS_KEY_CONF = "camel.kamelet.azure-eventhubs-source.blobAccessKey";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCESS_KEY_DOC = "The key for the Azure Storage Blob service that is associated with the Storage Blob account name.";
    public static final String CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCESS_KEY_DEFAULT = null;

    public CamelAzureeventhubssourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAzureeventhubssourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_NAMESPACE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_NAMESPACE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_NAMESPACE_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_EVENTHUB_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_EVENTHUB_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_EVENTHUB_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_SHARED_ACCESS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_SHARED_ACCESS_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_SHARED_ACCESS_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_SHARED_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_SHARED_ACCESS_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_SHARED_ACCESS_KEY_DOC);
        conf.define(CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCOUNT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCOUNT_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCOUNT_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_CONTAINER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_CONTAINER_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_CONTAINER_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCESS_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCESS_KEY_DOC);
        return conf;
    }
}