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
package org.apache.camel.kafkaconnector.fhir;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelFhirSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_FHIR_PATH_API_NAME_CONF = "camel.sink.path.apiName";
    public static final String CAMEL_SINK_FHIR_PATH_API_NAME_DOC = "What kind of operation to perform One of: [capabilities] [create] [delete] [history] [load-page] [meta] [patch] [read] [search] [transaction] [update] [validate]";
    public static final String CAMEL_SINK_FHIR_PATH_API_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_PATH_METHOD_NAME_CONF = "camel.sink.path.methodName";
    public static final String CAMEL_SINK_FHIR_PATH_METHOD_NAME_DOC = "What sub operation to use for the selected operation";
    public static final String CAMEL_SINK_FHIR_PATH_METHOD_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_ENCODING_CONF = "camel.sink.endpoint.encoding";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_ENCODING_DOC = "Encoding to use for all request One of: [JSON] [XML]";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_ENCODING_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_FHIR_VERSION_CONF = "camel.sink.endpoint.fhirVersion";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_FHIR_VERSION_DOC = "The FHIR Version to use One of: [DSTU2] [DSTU2_HL7ORG] [DSTU2_1] [DSTU3] [R4] [R5]";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_FHIR_VERSION_DEFAULT = "R4";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_IN_BODY_CONF = "camel.sink.endpoint.inBody";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_IN_BODY_DOC = "Sets the name of a parameter to be passed in the exchange In Body";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_IN_BODY_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_LOG_CONF = "camel.sink.endpoint.log";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_LOG_DOC = "Will log every requests and responses";
    public static final Boolean CAMEL_SINK_FHIR_ENDPOINT_LOG_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PRETTY_PRINT_CONF = "camel.sink.endpoint.prettyPrint";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PRETTY_PRINT_DOC = "Pretty print all request";
    public static final Boolean CAMEL_SINK_FHIR_ENDPOINT_PRETTY_PRINT_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SERVER_URL_CONF = "camel.sink.endpoint.serverUrl";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SERVER_URL_DOC = "The FHIR server base URL";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SERVER_URL_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_FHIR_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_FHIR_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_CLIENT_CONF = "camel.sink.endpoint.client";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_CLIENT_DOC = "To use the custom client";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_CLIENT_FACTORY_CONF = "camel.sink.endpoint.clientFactory";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_CLIENT_FACTORY_DOC = "To use the custom client factory";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_CLIENT_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_COMPRESS_CONF = "camel.sink.endpoint.compress";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_COMPRESS_DOC = "Compresses outgoing (POST/PUT) contents to the GZIP format";
    public static final Boolean CAMEL_SINK_FHIR_ENDPOINT_COMPRESS_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_CONNECTION_TIMEOUT_CONF = "camel.sink.endpoint.connectionTimeout";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_CONNECTION_TIMEOUT_DOC = "How long to try and establish the initial TCP connection (in ms)";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT = "10000";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_DEFER_MODEL_SCANNING_CONF = "camel.sink.endpoint.deferModelScanning";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_DEFER_MODEL_SCANNING_DOC = "When this option is set, model classes will not be scanned for children until the child list for the given type is actually accessed.";
    public static final Boolean CAMEL_SINK_FHIR_ENDPOINT_DEFER_MODEL_SCANNING_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_FHIR_CONTEXT_CONF = "camel.sink.endpoint.fhirContext";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_FHIR_CONTEXT_DOC = "FhirContext is an expensive object to create. To avoid creating multiple instances, it can be set directly.";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_FHIR_CONTEXT_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_FORCE_CONFORMANCE_CHECK_CONF = "camel.sink.endpoint.forceConformanceCheck";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_FORCE_CONFORMANCE_CHECK_DOC = "Force conformance check";
    public static final Boolean CAMEL_SINK_FHIR_ENDPOINT_FORCE_CONFORMANCE_CHECK_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SESSION_COOKIE_CONF = "camel.sink.endpoint.sessionCookie";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SESSION_COOKIE_DOC = "HTTP session cookie to add to every request";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SESSION_COOKIE_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SOCKET_TIMEOUT_CONF = "camel.sink.endpoint.socketTimeout";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SOCKET_TIMEOUT_DOC = "How long to block for individual read/write operations (in ms)";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SOCKET_TIMEOUT_DEFAULT = "10000";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SUMMARY_CONF = "camel.sink.endpoint.summary";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SUMMARY_DOC = "Request that the server modify the response using the _summary param One of: [COUNT] [TEXT] [DATA] [TRUE] [FALSE]";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SUMMARY_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_FHIR_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_VALIDATION_MODE_CONF = "camel.sink.endpoint.validationMode";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_VALIDATION_MODE_DOC = "When should Camel validate the FHIR Server's conformance statement One of: [NEVER] [ONCE]";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_VALIDATION_MODE_DEFAULT = "ONCE";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PROXY_HOST_CONF = "camel.sink.endpoint.proxyHost";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PROXY_HOST_DOC = "The proxy host";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PROXY_PASSWORD_CONF = "camel.sink.endpoint.proxyPassword";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PROXY_PASSWORD_DOC = "The proxy password";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PROXY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PROXY_PORT_CONF = "camel.sink.endpoint.proxyPort";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PROXY_PORT_DOC = "The proxy port";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PROXY_USER_CONF = "camel.sink.endpoint.proxyUser";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PROXY_USER_DOC = "The proxy username";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PROXY_USER_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_ACCESS_TOKEN_CONF = "camel.sink.endpoint.accessToken";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_ACCESS_TOKEN_DOC = "OAuth access token";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PASSWORD_DOC = "Username to use for basic authentication";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_ENDPOINT_USERNAME_CONF = "camel.sink.endpoint.username";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_USERNAME_DOC = "Username to use for basic authentication";
    public static final String CAMEL_SINK_FHIR_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_ENCODING_CONF = "camel.component.fhir.encoding";
    public static final String CAMEL_SINK_FHIR_COMPONENT_ENCODING_DOC = "Encoding to use for all request One of: [JSON] [XML]";
    public static final String CAMEL_SINK_FHIR_COMPONENT_ENCODING_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_FHIR_VERSION_CONF = "camel.component.fhir.fhirVersion";
    public static final String CAMEL_SINK_FHIR_COMPONENT_FHIR_VERSION_DOC = "The FHIR Version to use One of: [DSTU2] [DSTU2_HL7ORG] [DSTU2_1] [DSTU3] [R4] [R5]";
    public static final String CAMEL_SINK_FHIR_COMPONENT_FHIR_VERSION_DEFAULT = "R4";
    public static final String CAMEL_SINK_FHIR_COMPONENT_LOG_CONF = "camel.component.fhir.log";
    public static final String CAMEL_SINK_FHIR_COMPONENT_LOG_DOC = "Will log every requests and responses";
    public static final Boolean CAMEL_SINK_FHIR_COMPONENT_LOG_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_COMPONENT_PRETTY_PRINT_CONF = "camel.component.fhir.prettyPrint";
    public static final String CAMEL_SINK_FHIR_COMPONENT_PRETTY_PRINT_DOC = "Pretty print all request";
    public static final Boolean CAMEL_SINK_FHIR_COMPONENT_PRETTY_PRINT_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_COMPONENT_SERVER_URL_CONF = "camel.component.fhir.serverUrl";
    public static final String CAMEL_SINK_FHIR_COMPONENT_SERVER_URL_DOC = "The FHIR server base URL";
    public static final String CAMEL_SINK_FHIR_COMPONENT_SERVER_URL_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.fhir.lazyStartProducer";
    public static final String CAMEL_SINK_FHIR_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_FHIR_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.fhir.basicPropertyBinding";
    public static final String CAMEL_SINK_FHIR_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_FHIR_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_COMPONENT_CLIENT_CONF = "camel.component.fhir.client";
    public static final String CAMEL_SINK_FHIR_COMPONENT_CLIENT_DOC = "To use the custom client";
    public static final String CAMEL_SINK_FHIR_COMPONENT_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_CLIENT_FACTORY_CONF = "camel.component.fhir.clientFactory";
    public static final String CAMEL_SINK_FHIR_COMPONENT_CLIENT_FACTORY_DOC = "To use the custom client factory";
    public static final String CAMEL_SINK_FHIR_COMPONENT_CLIENT_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_COMPRESS_CONF = "camel.component.fhir.compress";
    public static final String CAMEL_SINK_FHIR_COMPONENT_COMPRESS_DOC = "Compresses outgoing (POST/PUT) contents to the GZIP format";
    public static final Boolean CAMEL_SINK_FHIR_COMPONENT_COMPRESS_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_COMPONENT_CONFIGURATION_CONF = "camel.component.fhir.configuration";
    public static final String CAMEL_SINK_FHIR_COMPONENT_CONFIGURATION_DOC = "To use the shared configuration";
    public static final String CAMEL_SINK_FHIR_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_CONNECTION_TIMEOUT_CONF = "camel.component.fhir.connectionTimeout";
    public static final String CAMEL_SINK_FHIR_COMPONENT_CONNECTION_TIMEOUT_DOC = "How long to try and establish the initial TCP connection (in ms)";
    public static final String CAMEL_SINK_FHIR_COMPONENT_CONNECTION_TIMEOUT_DEFAULT = "10000";
    public static final String CAMEL_SINK_FHIR_COMPONENT_DEFER_MODEL_SCANNING_CONF = "camel.component.fhir.deferModelScanning";
    public static final String CAMEL_SINK_FHIR_COMPONENT_DEFER_MODEL_SCANNING_DOC = "When this option is set, model classes will not be scanned for children until the child list for the given type is actually accessed.";
    public static final Boolean CAMEL_SINK_FHIR_COMPONENT_DEFER_MODEL_SCANNING_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_COMPONENT_FHIR_CONTEXT_CONF = "camel.component.fhir.fhirContext";
    public static final String CAMEL_SINK_FHIR_COMPONENT_FHIR_CONTEXT_DOC = "FhirContext is an expensive object to create. To avoid creating multiple instances, it can be set directly.";
    public static final String CAMEL_SINK_FHIR_COMPONENT_FHIR_CONTEXT_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_FORCE_CONFORMANCE_CHECK_CONF = "camel.component.fhir.forceConformanceCheck";
    public static final String CAMEL_SINK_FHIR_COMPONENT_FORCE_CONFORMANCE_CHECK_DOC = "Force conformance check";
    public static final Boolean CAMEL_SINK_FHIR_COMPONENT_FORCE_CONFORMANCE_CHECK_DEFAULT = false;
    public static final String CAMEL_SINK_FHIR_COMPONENT_SESSION_COOKIE_CONF = "camel.component.fhir.sessionCookie";
    public static final String CAMEL_SINK_FHIR_COMPONENT_SESSION_COOKIE_DOC = "HTTP session cookie to add to every request";
    public static final String CAMEL_SINK_FHIR_COMPONENT_SESSION_COOKIE_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_SOCKET_TIMEOUT_CONF = "camel.component.fhir.socketTimeout";
    public static final String CAMEL_SINK_FHIR_COMPONENT_SOCKET_TIMEOUT_DOC = "How long to block for individual read/write operations (in ms)";
    public static final String CAMEL_SINK_FHIR_COMPONENT_SOCKET_TIMEOUT_DEFAULT = "10000";
    public static final String CAMEL_SINK_FHIR_COMPONENT_SUMMARY_CONF = "camel.component.fhir.summary";
    public static final String CAMEL_SINK_FHIR_COMPONENT_SUMMARY_DOC = "Request that the server modify the response using the _summary param One of: [COUNT] [TEXT] [DATA] [TRUE] [FALSE]";
    public static final String CAMEL_SINK_FHIR_COMPONENT_SUMMARY_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_VALIDATION_MODE_CONF = "camel.component.fhir.validationMode";
    public static final String CAMEL_SINK_FHIR_COMPONENT_VALIDATION_MODE_DOC = "When should Camel validate the FHIR Server's conformance statement One of: [NEVER] [ONCE]";
    public static final String CAMEL_SINK_FHIR_COMPONENT_VALIDATION_MODE_DEFAULT = "ONCE";
    public static final String CAMEL_SINK_FHIR_COMPONENT_PROXY_HOST_CONF = "camel.component.fhir.proxyHost";
    public static final String CAMEL_SINK_FHIR_COMPONENT_PROXY_HOST_DOC = "The proxy host";
    public static final String CAMEL_SINK_FHIR_COMPONENT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_PROXY_PASSWORD_CONF = "camel.component.fhir.proxyPassword";
    public static final String CAMEL_SINK_FHIR_COMPONENT_PROXY_PASSWORD_DOC = "The proxy password";
    public static final String CAMEL_SINK_FHIR_COMPONENT_PROXY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_PROXY_PORT_CONF = "camel.component.fhir.proxyPort";
    public static final String CAMEL_SINK_FHIR_COMPONENT_PROXY_PORT_DOC = "The proxy port";
    public static final String CAMEL_SINK_FHIR_COMPONENT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_PROXY_USER_CONF = "camel.component.fhir.proxyUser";
    public static final String CAMEL_SINK_FHIR_COMPONENT_PROXY_USER_DOC = "The proxy username";
    public static final String CAMEL_SINK_FHIR_COMPONENT_PROXY_USER_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_ACCESS_TOKEN_CONF = "camel.component.fhir.accessToken";
    public static final String CAMEL_SINK_FHIR_COMPONENT_ACCESS_TOKEN_DOC = "OAuth access token";
    public static final String CAMEL_SINK_FHIR_COMPONENT_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_PASSWORD_CONF = "camel.component.fhir.password";
    public static final String CAMEL_SINK_FHIR_COMPONENT_PASSWORD_DOC = "Username to use for basic authentication";
    public static final String CAMEL_SINK_FHIR_COMPONENT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_FHIR_COMPONENT_USERNAME_CONF = "camel.component.fhir.username";
    public static final String CAMEL_SINK_FHIR_COMPONENT_USERNAME_DOC = "Username to use for basic authentication";
    public static final String CAMEL_SINK_FHIR_COMPONENT_USERNAME_DEFAULT = null;

    public CamelFhirSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelFhirSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_FHIR_PATH_API_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_PATH_API_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_FHIR_PATH_API_NAME_DOC);
        conf.define(CAMEL_SINK_FHIR_PATH_METHOD_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_PATH_METHOD_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_FHIR_PATH_METHOD_NAME_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_ENCODING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_ENCODING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_ENCODING_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_FHIR_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_FHIR_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_FHIR_VERSION_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_IN_BODY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_IN_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_IN_BODY_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_LOG_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_ENDPOINT_LOG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_LOG_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_PRETTY_PRINT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_ENDPOINT_PRETTY_PRINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_PRETTY_PRINT_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_SERVER_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_SERVER_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_SERVER_URL_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_CLIENT_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_CLIENT_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_CLIENT_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_CLIENT_FACTORY_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_COMPRESS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_ENDPOINT_COMPRESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_COMPRESS_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_CONNECTION_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_CONNECTION_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_DEFER_MODEL_SCANNING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_ENDPOINT_DEFER_MODEL_SCANNING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_DEFER_MODEL_SCANNING_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_FHIR_CONTEXT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_FHIR_CONTEXT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_FHIR_CONTEXT_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_FORCE_CONFORMANCE_CHECK_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_ENDPOINT_FORCE_CONFORMANCE_CHECK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_FORCE_CONFORMANCE_CHECK_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_SESSION_COOKIE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_SESSION_COOKIE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_SESSION_COOKIE_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_SOCKET_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_SOCKET_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_SOCKET_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_SUMMARY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_SUMMARY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_SUMMARY_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_VALIDATION_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_VALIDATION_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_VALIDATION_MODE_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_PROXY_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_PROXY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_PROXY_PASSWORD_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_PROXY_USER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_PROXY_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_PROXY_USER_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_ACCESS_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_FHIR_ENDPOINT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_ENCODING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_ENCODING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_ENCODING_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_FHIR_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_FHIR_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_FHIR_VERSION_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_LOG_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_COMPONENT_LOG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_LOG_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_PRETTY_PRINT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_COMPONENT_PRETTY_PRINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_PRETTY_PRINT_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_SERVER_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_SERVER_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_SERVER_URL_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_CLIENT_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_CLIENT_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_CLIENT_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_CLIENT_FACTORY_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_COMPRESS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_COMPONENT_COMPRESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_COMPRESS_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_CONNECTION_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_CONNECTION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_CONNECTION_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_DEFER_MODEL_SCANNING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_COMPONENT_DEFER_MODEL_SCANNING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_DEFER_MODEL_SCANNING_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_FHIR_CONTEXT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_FHIR_CONTEXT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_FHIR_CONTEXT_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_FORCE_CONFORMANCE_CHECK_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FHIR_COMPONENT_FORCE_CONFORMANCE_CHECK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_FORCE_CONFORMANCE_CHECK_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_SESSION_COOKIE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_SESSION_COOKIE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_SESSION_COOKIE_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_SOCKET_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_SOCKET_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_SOCKET_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_SUMMARY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_SUMMARY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_SUMMARY_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_VALIDATION_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_VALIDATION_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_VALIDATION_MODE_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_PROXY_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_PROXY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_PROXY_PASSWORD_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_PROXY_USER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_PROXY_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_PROXY_USER_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_ACCESS_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_FHIR_COMPONENT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FHIR_COMPONENT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FHIR_COMPONENT_USERNAME_DOC);
        return conf;
    }
}