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
package org.apache.camel.kafkaconnector.aws2iam;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAws2iamSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AWS2IAM_PATH_LABEL_CONF = "camel.sink.path.label";
    public static final String CAMEL_SINK_AWS2IAM_PATH_LABEL_DOC = "Logical name";
    public static final String CAMEL_SINK_AWS2IAM_PATH_LABEL_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_IAM_CLIENT_CONF = "camel.sink.endpoint.iamClient";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_IAM_CLIENT_DOC = "To use a existing configured AWS IAM as client";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_IAM_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_OPERATION_DOC = "The operation to perform. You can configure a default operation on the component level, or the operation as part of the endpoint, or via a message header with the key CamelAwsIAMOperation. One of: [listAccessKeys] [createUser] [deleteUser] [getUser] [listUsers] [createAccessKey] [deleteAccessKey] [updateAccessKey] [createGroup] [deleteGroup] [listGroups] [addUserToGroup] [removeUserFromGroup]";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_OVERRIDE_ENDPOINT_CONF = "camel.sink.endpoint.overrideEndpoint";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_OVERRIDE_ENDPOINT_DOC = "Set the need for overidding the endpoint. This option needs to be used in combination with uriEndpointOverride option";
    public static final Boolean CAMEL_SINK_AWS2IAM_ENDPOINT_OVERRIDE_ENDPOINT_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_POJO_REQUEST_CONF = "camel.sink.endpoint.pojoRequest";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_POJO_REQUEST_DOC = "If we want to use a POJO request as body or not";
    public static final Boolean CAMEL_SINK_AWS2IAM_ENDPOINT_POJO_REQUEST_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_REGION_CONF = "camel.sink.endpoint.region";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_REGION_DOC = "The region in which IAM client needs to work. When using this parameter, the configuration will expect the lowercase name of the region (for example ap-east-1) You'll need to use the name Region.EU_WEST_1.id()";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_REGION_DEFAULT = "aws-global";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_URI_ENDPOINT_OVERRIDE_CONF = "camel.sink.endpoint.uriEndpointOverride";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_URI_ENDPOINT_OVERRIDE_DOC = "Set the overriding uri endpoint. This option needs to be used in combination with overrideEndpoint option";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_URI_ENDPOINT_OVERRIDE_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWS2IAM_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_HOST_CONF = "camel.sink.endpoint.proxyHost";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_HOST_DOC = "To define a proxy host when instantiating the IAM client";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_PORT_CONF = "camel.sink.endpoint.proxyPort";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_PORT_DOC = "To define a proxy port when instantiating the IAM client";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_PROTOCOL_CONF = "camel.sink.endpoint.proxyProtocol";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_PROTOCOL_DOC = "To define a proxy protocol when instantiating the IAM client One of: [HTTP] [HTTPS]";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_PROTOCOL_DEFAULT = "HTTPS";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_ACCESS_KEY_CONF = "camel.sink.endpoint.accessKey";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_PROFILE_CREDENTIALS_NAME_CONF = "camel.sink.endpoint.profileCredentialsName";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_PROFILE_CREDENTIALS_NAME_DOC = "If using a profile credentials provider this parameter will set the profile name";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_PROFILE_CREDENTIALS_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_SECRET_KEY_CONF = "camel.sink.endpoint.secretKey";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_TRUST_ALL_CERTIFICATES_CONF = "camel.sink.endpoint.trustAllCertificates";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_TRUST_ALL_CERTIFICATES_DOC = "If we want to trust all certificates in case of overriding the endpoint";
    public static final Boolean CAMEL_SINK_AWS2IAM_ENDPOINT_TRUST_ALL_CERTIFICATES_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_USE_DEFAULT_CREDENTIALS_PROVIDER_CONF = "camel.sink.endpoint.useDefaultCredentialsProvider";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_USE_DEFAULT_CREDENTIALS_PROVIDER_DOC = "Set whether the IAM client should expect to load credentials through a default credentials provider or to expect static credentials to be passed in.";
    public static final Boolean CAMEL_SINK_AWS2IAM_ENDPOINT_USE_DEFAULT_CREDENTIALS_PROVIDER_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_USE_PROFILE_CREDENTIALS_PROVIDER_CONF = "camel.sink.endpoint.useProfileCredentialsProvider";
    public static final String CAMEL_SINK_AWS2IAM_ENDPOINT_USE_PROFILE_CREDENTIALS_PROVIDER_DOC = "Set whether the IAM client should expect to load credentials through a profile credentials provider.";
    public static final Boolean CAMEL_SINK_AWS2IAM_ENDPOINT_USE_PROFILE_CREDENTIALS_PROVIDER_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_CONFIGURATION_CONF = "camel.component.aws2-iam.configuration";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_CONFIGURATION_DOC = "Component configuration";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_IAM_CLIENT_CONF = "camel.component.aws2-iam.iamClient";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_IAM_CLIENT_DOC = "To use a existing configured AWS IAM as client";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_IAM_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.aws2-iam.lazyStartProducer";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWS2IAM_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_OPERATION_CONF = "camel.component.aws2-iam.operation";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_OPERATION_DOC = "The operation to perform. You can configure a default operation on the component level, or the operation as part of the endpoint, or via a message header with the key CamelAwsIAMOperation. One of: [listAccessKeys] [createUser] [deleteUser] [getUser] [listUsers] [createAccessKey] [deleteAccessKey] [updateAccessKey] [createGroup] [deleteGroup] [listGroups] [addUserToGroup] [removeUserFromGroup]";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_OVERRIDE_ENDPOINT_CONF = "camel.component.aws2-iam.overrideEndpoint";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_OVERRIDE_ENDPOINT_DOC = "Set the need for overidding the endpoint. This option needs to be used in combination with uriEndpointOverride option";
    public static final Boolean CAMEL_SINK_AWS2IAM_COMPONENT_OVERRIDE_ENDPOINT_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_POJO_REQUEST_CONF = "camel.component.aws2-iam.pojoRequest";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_POJO_REQUEST_DOC = "If we want to use a POJO request as body or not";
    public static final Boolean CAMEL_SINK_AWS2IAM_COMPONENT_POJO_REQUEST_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_REGION_CONF = "camel.component.aws2-iam.region";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_REGION_DOC = "The region in which IAM client needs to work. When using this parameter, the configuration will expect the lowercase name of the region (for example ap-east-1) You'll need to use the name Region.EU_WEST_1.id()";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_REGION_DEFAULT = "aws-global";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_URI_ENDPOINT_OVERRIDE_CONF = "camel.component.aws2-iam.uriEndpointOverride";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_URI_ENDPOINT_OVERRIDE_DOC = "Set the overriding uri endpoint. This option needs to be used in combination with overrideEndpoint option";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_URI_ENDPOINT_OVERRIDE_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.aws2-iam.autowiredEnabled";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_AWS2IAM_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_CONF = "camel.component.aws2-iam.healthCheckConsumerEnabled";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_DOC = "Used for enabling or disabling all consumer based health checks from this component";
    public static final Boolean CAMEL_SINK_AWS2IAM_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_CONF = "camel.component.aws2-iam.healthCheckProducerEnabled";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_DOC = "Used for enabling or disabling all producer based health checks from this component. Notice: Camel has by default disabled all producer based health-checks. You can turn on producer checks globally by setting camel.health.producersEnabled=true.";
    public static final Boolean CAMEL_SINK_AWS2IAM_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_HOST_CONF = "camel.component.aws2-iam.proxyHost";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_HOST_DOC = "To define a proxy host when instantiating the IAM client";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_PORT_CONF = "camel.component.aws2-iam.proxyPort";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_PORT_DOC = "To define a proxy port when instantiating the IAM client";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_PROTOCOL_CONF = "camel.component.aws2-iam.proxyProtocol";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_PROTOCOL_DOC = "To define a proxy protocol when instantiating the IAM client One of: [HTTP] [HTTPS]";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_PROTOCOL_DEFAULT = "HTTPS";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_ACCESS_KEY_CONF = "camel.component.aws2-iam.accessKey";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_PROFILE_CREDENTIALS_NAME_CONF = "camel.component.aws2-iam.profileCredentialsName";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_PROFILE_CREDENTIALS_NAME_DOC = "If using a profile credentials provider this parameter will set the profile name";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_PROFILE_CREDENTIALS_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_SECRET_KEY_CONF = "camel.component.aws2-iam.secretKey";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_TRUST_ALL_CERTIFICATES_CONF = "camel.component.aws2-iam.trustAllCertificates";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_TRUST_ALL_CERTIFICATES_DOC = "If we want to trust all certificates in case of overriding the endpoint";
    public static final Boolean CAMEL_SINK_AWS2IAM_COMPONENT_TRUST_ALL_CERTIFICATES_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_USE_DEFAULT_CREDENTIALS_PROVIDER_CONF = "camel.component.aws2-iam.useDefaultCredentialsProvider";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_USE_DEFAULT_CREDENTIALS_PROVIDER_DOC = "Set whether the IAM client should expect to load credentials through a default credentials provider or to expect static credentials to be passed in.";
    public static final Boolean CAMEL_SINK_AWS2IAM_COMPONENT_USE_DEFAULT_CREDENTIALS_PROVIDER_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_USE_PROFILE_CREDENTIALS_PROVIDER_CONF = "camel.component.aws2-iam.useProfileCredentialsProvider";
    public static final String CAMEL_SINK_AWS2IAM_COMPONENT_USE_PROFILE_CREDENTIALS_PROVIDER_DOC = "Set whether the IAM client should expect to load credentials through a profile credentials provider.";
    public static final Boolean CAMEL_SINK_AWS2IAM_COMPONENT_USE_PROFILE_CREDENTIALS_PROVIDER_DEFAULT = false;

    public CamelAws2iamSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAws2iamSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AWS2IAM_PATH_LABEL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_PATH_LABEL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AWS2IAM_PATH_LABEL_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_IAM_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_ENDPOINT_IAM_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_IAM_CLIENT_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_OVERRIDE_ENDPOINT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_ENDPOINT_OVERRIDE_ENDPOINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_OVERRIDE_ENDPOINT_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_POJO_REQUEST_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_ENDPOINT_POJO_REQUEST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_POJO_REQUEST_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_ENDPOINT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_REGION_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_URI_ENDPOINT_OVERRIDE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_ENDPOINT_URI_ENDPOINT_OVERRIDE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_URI_ENDPOINT_OVERRIDE_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_PROXY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AWS2IAM_ENDPOINT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_PROFILE_CREDENTIALS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_ENDPOINT_PROFILE_CREDENTIALS_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_PROFILE_CREDENTIALS_NAME_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AWS2IAM_ENDPOINT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_TRUST_ALL_CERTIFICATES_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_ENDPOINT_TRUST_ALL_CERTIFICATES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_TRUST_ALL_CERTIFICATES_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_USE_DEFAULT_CREDENTIALS_PROVIDER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_ENDPOINT_USE_DEFAULT_CREDENTIALS_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_USE_DEFAULT_CREDENTIALS_PROVIDER_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_ENDPOINT_USE_PROFILE_CREDENTIALS_PROVIDER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_ENDPOINT_USE_PROFILE_CREDENTIALS_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_ENDPOINT_USE_PROFILE_CREDENTIALS_PROVIDER_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_IAM_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_COMPONENT_IAM_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_IAM_CLIENT_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_COMPONENT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_OPERATION_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_OVERRIDE_ENDPOINT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_COMPONENT_OVERRIDE_ENDPOINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_OVERRIDE_ENDPOINT_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_POJO_REQUEST_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_COMPONENT_POJO_REQUEST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_POJO_REQUEST_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_COMPONENT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_REGION_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_URI_ENDPOINT_OVERRIDE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_COMPONENT_URI_ENDPOINT_OVERRIDE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_URI_ENDPOINT_OVERRIDE_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_PROXY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AWS2IAM_COMPONENT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_PROFILE_CREDENTIALS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2IAM_COMPONENT_PROFILE_CREDENTIALS_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_PROFILE_CREDENTIALS_NAME_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AWS2IAM_COMPONENT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_TRUST_ALL_CERTIFICATES_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_COMPONENT_TRUST_ALL_CERTIFICATES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_TRUST_ALL_CERTIFICATES_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_USE_DEFAULT_CREDENTIALS_PROVIDER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_COMPONENT_USE_DEFAULT_CREDENTIALS_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_USE_DEFAULT_CREDENTIALS_PROVIDER_DOC);
        conf.define(CAMEL_SINK_AWS2IAM_COMPONENT_USE_PROFILE_CREDENTIALS_PROVIDER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2IAM_COMPONENT_USE_PROFILE_CREDENTIALS_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2IAM_COMPONENT_USE_PROFILE_CREDENTIALS_PROVIDER_DOC);
        return conf;
    }
}