/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.connector.amazons3.util;

/**
 * Class AmazonS3Constants defines all constants used for AmazonS3 Connector.
 */
public final class AmazonS3Constants {
    
    /**
     * constructor for class AmazonS3 Constants.
     */
    private AmazonS3Constants() {
    
    }
    
    // Common Constants.
    
    /**
     * Constant for Date format pattern.
     */
    public static final String CURR_DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss z ";
    
    /**
     * Constant for empty string.
     */
    public static final String EMPTY_STR = "";
    
    /**
     * Constant for colon.
     */
    public static final String COLON = ":";
    
    /**
     * Constant for forward slash.
     */
    public static final String FORWARD_SLASH = "/";
    
    /**
     * Constant for new line character.
     */
    public static final char NEW_LINE = '\n';
    
    /**
     * Constant for regular expression (space).
     */
    public static final String REGEX = "\\s+";
    
    /**
     * Constant for bucketName.
     */
    public static final String BUCKET_NAME = "uri.var.bucketName";
    
    /**
     * Constant for time zone (GMT).
     */
    public static final String TIME_ZONE = "GMT";
    
    // AmazonS3Authentication Class Constants.
    
    /**
     * Constant for standard mac algorithm name.
     */
    public static final String HMAC_SHA1 = "HmacSHA1";
    
    /**
     * Constant for standard md5 algorithm name.
     */
    public static final String MD5 = "MD5";
    
    /**
     * Constant for shorten Amazon Web Services prefix.
     */
    public static final String AWS = "AWS ";
    
    // Request Header Constants.
    
    /**
     * Constant for accessKeyId.
     */
    public static final String ACCESS_KEY_ID = "uri.var.accessKeyId";
    
    /**
     * Constant for secretAccessKey.
     */
    public static final String SECRET_ACCESS_KEY = "uri.var.secretAccessKey";
    
    /**
     * Constant for methodType.
     */
    public static final String METHOD_TYPE = "uri.var.methodType";
    
    /**
     * Constant for contentMD5.
     */
    public static final String CONTENT_MD5 = "uri.var.contentMD5";
    
    /**
     * Constant for contentType.
     */
    public static final String CONTENT_TYPE = "uri.var.contentType";
    
    /**
     * Constant for uriRemainder.
     */
    public static final String URI_REMAINDER = "uri.var.uriRemainder";
    
    /**
     * Constant for deleteConfig.
     */
    public static final String DELETE_CONFIG = "uri.var.deleteConfig";
    
    /**
     * Constant for xAmzDate.
     */
    public static final String IS_XAMZ_DATE = "uri.var.isXAmzDate";
    
    /**
     * Constant for xAmzSecurityToken.
     */
    public static final String XAMZ_SECURITY_TOKEN = "uri.var.xAmzSecurityToken";
    
    /**
     * Constant for xAmzAcl.
     */
    public static final String XAMZ_ACL = "uri.var.xAmzAcl";
    
    /**
     * Constant for xAmzGrantRead.
     */
    public static final String XAMZ_GRANT_READ = "uri.var.xAmzGrantRead";
    
    /**
     * Constant for xAmzGrantWrite.
     */
    public static final String XAMZ_GRANT_WRITE = "uri.var.xAmzGrantWrite";
    
    /**
     * Constant for xAmzGrantReadAcp.
     */
    public static final String XAMZ_GRANT_READ_ACP = "uri.var.xAmzGrantReadAcp";
    
    /**
     * Constant for xAmzGrantWriteAcp.
     */
    public static final String XAMZ_GRANT_WRITE_ACP = "uri.var.xAmzGrantWriteAcp";
    
    /**
     * Constant for xAmzGrantFullControl.
     */
    public static final String XAMZ_GRANT_FULL_CONTROL = "uri.var.xAmzGrantFullControl";
    
    // CreateObject method related Amz header Constants.
    
    /**
     * Constant for xAmzMeta.
     */
    public static final String XAMZ_META = "uri.var.xAmzMeta";
    
    /**
     * Constant for xAmzServeEncryption.
     */
    public static final String XAMZ_SERVE_ENCRYPTION = "uri.var.xAmzServeEncryption";
    
    /**
     * Constant for xAmzStorageClass.
     */
    public static final String XAMZ_STORAGE_CLASS = "uri.var.xAmzStorageClass";
    
    /**
     * Constant for xAmzWebsiteLocation.
     */
    public static final String XAMZ_WEBSITE_LOCATION = "uri.var.xAmzWebsiteLocation";
    
    /**
     * Constant for xAmzMfa.
     */
    public static final String XAMZ_MFA = "uri.var.xAmzMfa";
    
    // createObjectCopy method related Amz header Constants.
    
    /**
     * Constant for xAmzCopySource.
     */
    public static final String XAMZ_COPY_SOURCE = "uri.var.xAmzCopySource";

    /**
     * Constant for xAmzCopySourceRange.
     */
    public static final String XAMZ_COPY_SOURCE_RANGE = "uri.var.xAmzCopySourceRange";
    
    /**
     * Constant for xAmzMetadataDirective.
     */
    public static final String XAMZ_METADATA_DIRECTIVE = "uri.var.xAmzMetadataDirective";
    
    /**
     * Constant for xAmzCopySourceIfMatch.
     */
    public static final String XAMZ_COPY_SOURCE_IF_MATCH = "uri.var.xAmzCopySourceIfMatch";
    
    /**
     * Constant for xAmzCopySourceIfNoneMatch.
     */
    public static final String XAMZ_COPY_SOURCE_IF_NONE_MATCH = "uri.var.xAmzCopySourceIfNoneMatch";
    
    /**
     * Constant for xAmzCopySourceIfModifiedSince.
     */
    public static final String XAMZ_COPY_SOURCE_IF_MODIFIED_SINCE = "uri.var.xAmzCopySourceIfModifiedSince";
    
    /**
     * Constant for xAmzCopySourceIfUnmodifiedSince.
     */
    public static final String XAMZ_COPY_SOURCE_IF_UNMODIFIED_SINCE = "uri.var.xAmzCopySourceIfUnmodifiedSince";

    //headObject method constants
    /**
     * Constant for xAmzServerSide​Encryption​CustomerAlgorithm.
     */
    public static final String XMAZ_SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM = "uri.var.xAmzServerSide​Encryption​CustomerAlgorithm";

    /**
     * Constant for x-amz-server-side​-encryption​-customer-algorithm.
     */
    public static final String HD_XMAZ_SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM = "x-amz-server-side​-encryption​-customer-algorithm";

    /**
     * Constant for xAmzServerSide​Encryption​CustomerKey.
     */
    public static final String XMAZ_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY = "uri.var.xAmzServerSide​Encryption​CustomerKey";

    /**
     * Constant for x-amz-server-side​-encryption​-customer-algorithm.
     */
    public static final String HD_XMAZ_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY = "x-amz-server-side​-encryption​-customer-key";

    /**
     * Constant for xAmzServerSide​Encryption​CustomerKey.
     */
    public static final String XMAZ_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5 = "uri.var.xAmzServerSide​Encryption​CustomerKeyMD5";

    /**
     * Constant for x-amz-server-side​-encryption​-customer-algorithm.
     */
    public static final String HD_XMAZ_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5 = "x-amz-server-side​-encryption​-customer-key-MD5";


    // Common Amz header Constants.
    
    /**
     * Constant for x-amz-date.
     */
    public static final String HD_XAMZ_DATE = "x-amz-date";
    
    /**
     * Constant for x-amz-security-token.
     */
    public static final String HD_XAMZ_SECURITY_TOKEN = "x-amz-security-token";
    
    // ACL related Amz real header name Constants.
    
    /**
     * Constant for x-amz-acl.
     */
    public static final String HD_XAMZ_ACL = "x-amz-acl";
    
    /**
     * Constant for x-amz-grant-read.
     */
    public static final String HD_XAMZ_GRANT_READ = "x-amz-grant-read";
    
    /**
     * Constant for x-amz-grant-write.
     */
    public static final String HD_XAMZ_GRANT_WRITE = "x-amz-grant-write";
    
    /**
     * Constant for x-amz-grant-read-acp.
     */
    public static final String HD_XAMZ_GRANT_READ_ACP = "x-amz-grant-read-acp";
    
    /**
     * Constant for x-amz-grant-write-acp.
     */
    public static final String HD_XAMZ_GRANT_WRITE_ACP = "x-amz-grant-write-acp";
    
    /**
     * Constant for x-amz-grant-full-control.
     */
    public static final String HD_XAMZ_GRANT_FULL_CONTROL = "x-amz-grant-full-control";
    
    // PutObject method related Amz real header name Constants.
    
    /**
     * Constant for x-amz-meta-.
     */
    public static final String HD_XAMZ_META = "x-amz-meta-";
    
    /**
     * Constant for x-amz-server-side-encryption.
     */
    public static final String HD_XAMZ_SERVE_ENCRYPTION = "x-amz-server-side-encryption";
    
    /**
     * Constant for x-amz-storage-class.
     */
    public static final String HD_XAMZ_STORAGE_CLASS = "x-amz-storage-class";
    
    /**
     * Constant for x-amz-website-redirect-location.
     */
    public static final String HD_XAMZ_WEBSITE_LOCATION = "x-amz-website-redirect-location";
    
    /**
     * Constant for x-amz-mfa.
     */
    public static final String HD_XAMZ_MFA = "x-amz-mfa";
    
    // Real header names that are requested for createObjectCopy.
    
    /**
     * Constant for x-amz-copy-source.
     */
    public static final String HD_XAMZ_COPY_SOURCE = "x-amz-copy-source";

    /**
     * Constant for x-amz-copy-source-range.
     */
    public static final String HD_XAMZ_COPY_SOURCE_RANGE = "x-amz-copy-source-range";

    /**
     * Constant for x-amz-metadata-directive.
     */
    public static final String HD_XAMZ_METADATA_DIRECTIVE = "x-amz-metadata-directive";
    
    /**
     * Constant for x-amz-copy-source-if-match.
     */
    public static final String HD_XAMZ_COPY_SOURCE_IF_MATCH = "x-amz-copy-source-if-match";
    
    /**
     * Constant for x-amz-copy-source-if-none-match.
     */
    public static final String HD_XAMZ_COPY_SOURCE_IF_NONE_MATCH = "x-amz-copy-source-if-none-match";
    
    /**
     * Constant for x-amz-copy-source-if-modified-since.
     */
    public static final String HD_XAMZ_COPY_SOURCE_IF_MODIFIED_SINCE = "x-amz-copy-source-if-modified-since";
    
    /**
     * Constant for x-amz-copy-source-if-unmodified-since.
     */
    public static final String HD_XAMZ_COPY_SOURCE_IF_UNMODIFIED_SINCE = "x-amz-copy-source-if-unmodified-since";
    
    // Other Constants.
    
    /**
     * Constant for authenticationCode.
     */
    public static final String AUTH_CODE = "authenticationCode";
    
    /**
     * Constant for contentMD5Value.
     */
    public static final String CONTENT_MD5_VAL = "contentMD5Value";
    
    /**
     * Constant for contentTypeValue.
     */
    public static final String CONTENT_TYPE_VAL = "contentTypeValue";
    
    /**
     * Constant for date.
     */
    public static final String DATE = "date";
    
    /**
     * Constant for xAmzDateValue.
     */
    public static final String IS_XAMZ_DATE_VAL = "isXAmzDateValue";
    
    /**
     * Constant for xAmzAclValue.
     */
    public static final String XAMZ_ACL_VAL = "xAmzAclValue";
    
    /**
     * Constant for xAmzGrantReadValue.
     */
    public static final String XAMZ_GRANT_READ_VAL = "xAmzGrantReadValue";
    
    /**
     * Constant for xAmzGrantWriteValue.
     */
    public static final String XAMZ_GRANT_WRITE_VAL = "xAmzGrantWriteValue";
    
    /**
     * Constant for xAmzGrantReadAcpValue.
     */
    public static final String XAMZ_GRANT_READ_ACP_VAL = "xAmzGrantReadAcpValue";
    
    /**
     * Constant for xAmzGrantWriteAcpValue.
     */
    public static final String XAMZ_GRANT_WRITE_ACP_VAL = "xAmzGrantWriteAcpValue";
    
    /**
     * Constant for xAmzGrantFullControlValue.
     */
    public static final String XAMZ_GRANT_FULL_CONTROL_VAL = "xAmzGrantFullControlValue";
    
    // Header names to set of createObject method.
    /**
     * Constant for xAmzMetaValue.
     */
    public static final String XAMZ_META_VAL = "xAmzMetaValue";
    
    /**
     * Constant for xAmzServeEncryptionValue.
     */
    public static final String XAMZ_SERVE_ENCRYPTION_VAL = "xAmzServeEncryptionValue";
    
    /**
     * Constant for xAmzStorageClassValue.
     */
    public static final String XAMZ_STORAGE_CLASS_VAL = "xAmzStorageClassValue";
    
    /**
     * Constant for xAmzWebsiteLocationValue.
     */
    public static final String XAMZ_WEBSITE_LOCATION_VAL = "xAmzWebsiteLocationValue";
    
    /**
     * Constant for xAmzMfaValue.
     */
    public static final String XAMZ_MFA_VAL = "xAmzMfaValue";
    
    // Header names to set of createObjectCopy method.
    
    /**
     * Constant for xAmzCopySourceValue.
     */
    public static final String XAMZ_COPY_SOURCE_VAL = "xAmzCopySourceValue";
    
    /**
     * Constant for xAmzMetadataDirectiveValue.
     */
    public static final String XAMZ_METADATA_DIRECTIVE_VAL = "xAmzMetadataDirectiveValue";
    
    /**
     * Constant for xAmzCopySourceIfMatchValue.
     */
    public static final String XAMZ_COPY_SOURCE_IF_MATCH_VAL = "xAmzCopySourceIfMatchValue";
    
    /**
     * Constant for xAmzCopySourceIfNoneMatchValue.
     */
    public static final String XAMZ_COPY_SOURCE_IF_NONE_MATCH_VAL = "xAmzCopySourceIfNoneMatchValue";
    
    /**
     * Constant for xAmzCopySourceIfModifiedSinceValue.
     */
    public static final String XAMZ_COPY_SOURCE_IF_MODIFIED_SINCE_VAL = "xAmzCopySourceIfModifiedSinceValue";
    
    /**
     * Constant for xAmzCopySourceIfUnmodifiedSinceValue.
     */
    public static final String XAMZ_COPY_SOURCE_IF_UNMODIFIED_SINCE_VAL = "xAmzCopySourceIfUnmodifiedSinceValue";
    
    /**
     * Constant for getObjectResponse.
     */
    public static final String GET_OBJECT_RESPONSE = "getObjectResponse";
    
    /**
     * Constant for buffer size during MD5 conversion.
     */
    public static final int BUFFER_SIZE = 8192;
    
    // Error Constants
    /**
     * Constant errorCode for IOException.
     */
    public static final int IO_EXCEPTION_ERROR_CODE = 700001;
    
    /**
     * Constant errorCode for InvalidKeyException.
     */
    public static final int INVALID_KEY_ERROR_CODE = 700007;
    
    /**
     * Constant errorCode for NoSuchAlgorithmException.
     */
    public static final int NOSUCH_ALGORITHM_ERROR_CODE = 700008;
    
    /**
     * Constant errorCode for UnsupportedEncodingException.
     */
    public static final int UNSUPPORTED_ENCORDING_ERROR_CODE = 700009;
    
    /**
     * Error code constant for generic exception.
     */
    public static final int ERROR_CODE_EXCEPTION = 900001;
}
