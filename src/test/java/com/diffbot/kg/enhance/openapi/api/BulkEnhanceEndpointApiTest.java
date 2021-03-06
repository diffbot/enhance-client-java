/*
 * Diffbot Enhance Service
 * Enhance is an API to find a person or organization in the Knowledge Graph using partial data
 *
 * The version of the OpenAPI document: v1.0.0
 * Contact: support@diffbot.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.diffbot.kg.enhance.openapi.api;

import com.diffbot.kg.enhance.openapi.invoker.ApiException;
import com.diffbot.kg.enhance.openapi.model.BulkjobAccepted;
import com.diffbot.kg.enhance.openapi.model.BulkjobRecoveryStatusResponse;
import com.diffbot.kg.enhance.openapi.model.BulkjobStatusResponse;
import com.diffbot.kg.enhance.openapi.model.RequestError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BulkEnhanceEndpointApi
 */
@Ignore
public class BulkEnhanceEndpointApiTest {

    private final BulkEnhanceEndpointApi api = new BulkEnhanceEndpointApi();

    
    /**
     * Bulk Enhance Status Endpoint
     *
     * Get status of a bulk Enhance job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkjobStatusTest() throws ApiException {
        String bulkjobId = null;
        String token = null;
        BulkjobStatusResponse response = api.bulkjobStatus(bulkjobId)
                .token(token)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Bulk Enhance Endpoint
     *
     * Enhance endpoint to find person or organization using partial data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enhanceBulkjobTest() throws ApiException {
        String token = null;
        List<String> tag = null;
        String mode = null;
        String nonCanonicalFacts = null;
        String jsonmode = null;
        String rocketReachToken = null;
        String webhookurl = null;
        String xDiffbotRequestId = null;
        List<Object> requestBody = null;
        BulkjobAccepted response = api.enhanceBulkjob()
                .token(token)
                .tag(tag)
                .mode(mode)
                .nonCanonicalFacts(nonCanonicalFacts)
                .jsonmode(jsonmode)
                .rocketReachToken(rocketReachToken)
                .webhookurl(webhookurl)
                .xDiffbotRequestId(xDiffbotRequestId)
                .requestBody(requestBody)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Bulk Enhance Poll Endpoint
     *
     * Poll a bulk Enhance job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pollBulkjobTest() throws ApiException {
        String bulkjobId = null;
        String token = null;
        String csvmode = null;
        Object response = api.pollBulkjob(bulkjobId)
                .token(token)
                .csvmode(csvmode)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Bulkjob stop
     *
     * Stop an incomplete job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopBulkjobTest() throws ApiException {
        String bulkjobId = null;
        String token = null;
        BulkjobRecoveryStatusResponse response = api.stopBulkjob(bulkjobId)
                .token(token)
                .execute();

        // TODO: test validations
    }
    
}
