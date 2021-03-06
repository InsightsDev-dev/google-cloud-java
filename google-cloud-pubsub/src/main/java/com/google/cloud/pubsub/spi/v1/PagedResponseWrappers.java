/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.cloud.pubsub.spi.v1;

import com.google.api.gax.grpc.CallContext;
import com.google.api.gax.grpc.PagedListDescriptor;
import com.google.api.gax.grpc.PagedListResponseImpl;
import com.google.api.gax.grpc.UnaryCallable;
import com.google.pubsub.v1.ListSubscriptionsRequest;
import com.google.pubsub.v1.ListSubscriptionsResponse;
import com.google.pubsub.v1.ListTopicSubscriptionsRequest;
import com.google.pubsub.v1.ListTopicSubscriptionsResponse;
import com.google.pubsub.v1.ListTopicsRequest;
import com.google.pubsub.v1.ListTopicsResponse;
import com.google.pubsub.v1.Subscription;
import com.google.pubsub.v1.Topic;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Wrapper class to contain paged response types for page streaming methods. Each static class
 * inside this wrapper class is used as the return type of one of an API method that implements the
 * page streaming pattern.
 */
@javax.annotation.Generated("by GAPIC")
public class PagedResponseWrappers {

  public static class ListTopicsPagedResponse
      extends PagedListResponseImpl<ListTopicsRequest, ListTopicsResponse, Topic> {

    public ListTopicsPagedResponse(
        UnaryCallable<ListTopicsRequest, ListTopicsResponse> callable,
        PagedListDescriptor<ListTopicsRequest, ListTopicsResponse, Topic> pageDescriptor,
        ListTopicsRequest request,
        CallContext context) {
      super(callable, pageDescriptor, request, context);
    }
  }

  public static class ListTopicSubscriptionsPagedResponse
      extends PagedListResponseImpl<
          ListTopicSubscriptionsRequest, ListTopicSubscriptionsResponse, String> {

    public ListTopicSubscriptionsPagedResponse(
        UnaryCallable<ListTopicSubscriptionsRequest, ListTopicSubscriptionsResponse> callable,
        PagedListDescriptor<ListTopicSubscriptionsRequest, ListTopicSubscriptionsResponse, String>
            pageDescriptor,
        ListTopicSubscriptionsRequest request,
        CallContext context) {
      super(callable, pageDescriptor, request, context);
    }
  }

  public static class ListSubscriptionsPagedResponse
      extends PagedListResponseImpl<
          ListSubscriptionsRequest, ListSubscriptionsResponse, Subscription> {

    public ListSubscriptionsPagedResponse(
        UnaryCallable<ListSubscriptionsRequest, ListSubscriptionsResponse> callable,
        PagedListDescriptor<ListSubscriptionsRequest, ListSubscriptionsResponse, Subscription>
            pageDescriptor,
        ListSubscriptionsRequest request,
        CallContext context) {
      super(callable, pageDescriptor, request, context);
    }
  }
}
