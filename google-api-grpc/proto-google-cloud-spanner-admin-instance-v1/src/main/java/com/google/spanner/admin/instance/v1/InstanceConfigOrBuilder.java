// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

package com.google.spanner.admin.instance.v1;

public interface InstanceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.instance.v1.InstanceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A unique identifier for the instance configuration.  Values
   * are of the form
   * `projects/&lt;project&gt;/instanceConfigs/[a-z][-a-z0-9]*`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * A unique identifier for the instance configuration.  Values
   * are of the form
   * `projects/&lt;project&gt;/instanceConfigs/[a-z][-a-z0-9]*`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The name of this instance configuration as it appears in UIs.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The name of this instance configuration as it appears in UIs.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The geographic placement of nodes in this instance configuration and their
   * replication properties.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.ReplicaInfo replicas = 3;</code>
   */
  java.util.List<com.google.spanner.admin.instance.v1.ReplicaInfo> getReplicasList();
  /**
   *
   *
   * <pre>
   * The geographic placement of nodes in this instance configuration and their
   * replication properties.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.ReplicaInfo replicas = 3;</code>
   */
  com.google.spanner.admin.instance.v1.ReplicaInfo getReplicas(int index);
  /**
   *
   *
   * <pre>
   * The geographic placement of nodes in this instance configuration and their
   * replication properties.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.ReplicaInfo replicas = 3;</code>
   */
  int getReplicasCount();
  /**
   *
   *
   * <pre>
   * The geographic placement of nodes in this instance configuration and their
   * replication properties.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.ReplicaInfo replicas = 3;</code>
   */
  java.util.List<? extends com.google.spanner.admin.instance.v1.ReplicaInfoOrBuilder>
      getReplicasOrBuilderList();
  /**
   *
   *
   * <pre>
   * The geographic placement of nodes in this instance configuration and their
   * replication properties.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.ReplicaInfo replicas = 3;</code>
   */
  com.google.spanner.admin.instance.v1.ReplicaInfoOrBuilder getReplicasOrBuilder(int index);
}
