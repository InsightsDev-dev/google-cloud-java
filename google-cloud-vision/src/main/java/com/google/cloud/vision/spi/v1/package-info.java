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

/**
 * A client to Google Cloud Vision API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>================= ImageAnnotatorApi =================
 *
 * <p>Service Description: Service that performs Google Cloud Vision API detection tasks, such as
 * face, landmark, logo, label, and text detection, over client images, and returns detected
 * entities from the images.
 *
 * <p>Sample for ImageAnnotatorApi:
 *
 * <pre>
 * <code>
 * try (ImageAnnotatorApi imageAnnotatorApi = ImageAnnotatorApi.create()) {
 *   List&lt;AnnotateImageRequest&gt; requests = new ArrayList&lt;&gt;();
 *   BatchAnnotateImagesResponse response = imageAnnotatorApi.batchAnnotateImages(requests);
 * }
 * </code>
 * </pre>
 */
package com.google.cloud.vision.spi.v1;
