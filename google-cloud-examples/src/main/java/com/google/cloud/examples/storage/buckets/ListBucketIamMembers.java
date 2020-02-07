/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.examples.storage.buckets;

// [START storage_view_bucket_iam_members]
import com.google.cloud.Binding;
import com.google.cloud.Policy;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.util.List;

public class ListBucketIamMembers {
  public static void listBucketIamMembers(String projectId, String bucketName) {
    // The ID of your GCP project
    // String projectId = "your-project-id";

    // The ID of your GCS bucket
    // String bucketName = "your-unique-bucket-name";

    Storage storage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();
    Policy policy = storage.getIamPolicy(bucketName);
    List<Binding> policyBindings = policy.getBindingsList();

    for (Binding binding : policy.getBindingsList()) {
      System.out.printf("Role: %s Identities: %s\n", binding.getRole(), binding.getMembers());
      if (null != binding.getCondition()) {
        System.out.printf("Condition Title: %s\n", binding.getCondition().getTitle());
        System.out.printf("Condition Description: %s\n", binding.getCondition().getDescription());
        System.out.printf("Condition Expression: %s\n", binding.getCondition().getExpression());
      }
    }
  }
}
// [END storage_view_bucket_iam_members]
