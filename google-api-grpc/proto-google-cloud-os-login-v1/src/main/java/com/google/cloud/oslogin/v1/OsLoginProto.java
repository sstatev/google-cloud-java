// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

public final class OsLoginProto {
  private OsLoginProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_LoginProfile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_LoginProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/oslogin/v1/oslogin.proto\022"
          + "\027google.cloud.oslogin.v1\032\034google/api/ann"
          + "otations.proto\032\027google/api/client.proto\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032(google/cloud/oslogi"
          + "n/common/common.proto\032\033google/protobuf/e"
          + "mpty.proto\032 google/protobuf/field_mask.p"
          + "roto\"\230\002\n\014LoginProfile\022\021\n\004name\030\001 \001(\tB\003\340A\002"
          + "\022A\n\016posix_accounts\030\002 \003(\0132).google.cloud."
          + "oslogin.common.PosixAccount\022Q\n\017ssh_publi"
          + "c_keys\030\003 \003(\01328.google.cloud.oslogin.v1.L"
          + "oginProfile.SshPublicKeysEntry\032_\n\022SshPub"
          + "licKeysEntry\022\013\n\003key\030\001 \001(\t\0228\n\005value\030\002 \001(\013"
          + "2).google.cloud.oslogin.common.SshPublic"
          + "Key:\0028\001\"V\n\031DeletePosixAccountRequest\0229\n\004"
          + "name\030\001 \001(\tB+\340A\002\372A%\n#oslogin.googleapis.c"
          + "om/PosixAccount\"V\n\031DeleteSshPublicKeyReq"
          + "uest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#oslogin.goog"
          + "leapis.com/SshPublicKey\"z\n\026GetLoginProfi"
          + "leRequest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\022#oslogin"
          + ".googleapis.com/PosixAccount\022\022\n\nproject_"
          + "id\030\002 \001(\t\022\021\n\tsystem_id\030\003 \001(\t\"S\n\026GetSshPub"
          + "licKeyRequest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#osl"
          + "ogin.googleapis.com/SshPublicKey\"\264\001\n\031Imp"
          + "ortSshPublicKeyRequest\022;\n\006parent\030\001 \001(\tB+"
          + "\340A\002\372A%\022#oslogin.googleapis.com/SshPublic"
          + "Key\022F\n\016ssh_public_key\030\002 \001(\0132).google.clo"
          + "ud.oslogin.common.SshPublicKeyB\003\340A\001\022\022\n\np"
          + "roject_id\030\003 \001(\t\"Z\n\032ImportSshPublicKeyRes"
          + "ponse\022<\n\rlogin_profile\030\001 \001(\0132%.google.cl"
          + "oud.oslogin.v1.LoginProfile\"\317\001\n\031UpdateSs"
          + "hPublicKeyRequest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n"
          + "#oslogin.googleapis.com/SshPublicKey\022F\n\016"
          + "ssh_public_key\030\002 \001(\0132).google.cloud.oslo"
          + "gin.common.SshPublicKeyB\003\340A\002\022/\n\013update_m"
          + "ask\030\003 \001(\0132\032.google.protobuf.FieldMask2\320\t"
          + "\n\016OsLoginService\022\216\001\n\022DeletePosixAccount\022"
          + "2.google.cloud.oslogin.v1.DeletePosixAcc"
          + "ountRequest\032\026.google.protobuf.Empty\",\202\323\344"
          + "\223\002\037*\035/v1/{name=users/*/projects/*}\332A\004nam"
          + "e\022\223\001\n\022DeleteSshPublicKey\0222.google.cloud."
          + "oslogin.v1.DeleteSshPublicKeyRequest\032\026.g"
          + "oogle.protobuf.Empty\"1\202\323\344\223\002$*\"/v1/{name="
          + "users/*/sshPublicKeys/*}\332A\004name\022\231\001\n\017GetL"
          + "oginProfile\022/.google.cloud.oslogin.v1.Ge"
          + "tLoginProfileRequest\032%.google.cloud.oslo"
          + "gin.v1.LoginProfile\".\202\323\344\223\002!\022\037/v1/{name=u"
          + "sers/*}/loginProfile\332A\004name\022\240\001\n\017GetSshPu"
          + "blicKey\022/.google.cloud.oslogin.v1.GetSsh"
          + "PublicKeyRequest\032).google.cloud.oslogin."
          + "common.SshPublicKey\"1\202\323\344\223\002$\022\"/v1/{name=u"
          + "sers/*/sshPublicKeys/*}\332A\004name\022\371\001\n\022Impor"
          + "tSshPublicKey\0222.google.cloud.oslogin.v1."
          + "ImportSshPublicKeyRequest\0323.google.cloud"
          + ".oslogin.v1.ImportSshPublicKeyResponse\"z"
          + "\202\323\344\223\0029\"\'/v1/{parent=users/*}:importSshPu"
          + "blicKey:\016ssh_public_key\332A\025parent,ssh_pub"
          + "lic_key\332A parent,ssh_public_key,project_"
          + "id\022\347\001\n\022UpdateSshPublicKey\0222.google.cloud"
          + ".oslogin.v1.UpdateSshPublicKeyRequest\032)."
          + "google.cloud.oslogin.common.SshPublicKey"
          + "\"r\202\323\344\223\00242\"/v1/{name=users/*/sshPublicKey"
          + "s/*}:\016ssh_public_key\332A\023name,ssh_public_k"
          + "ey\332A\037name,ssh_public_key,update_mask\032r\312A"
          + "\026oslogin.googleapis.com\322AVhttps://www.go"
          + "ogleapis.com/auth/cloud-platform,https:/"
          + "/www.googleapis.com/auth/computeB\241\001\n\033com"
          + ".google.cloud.oslogin.v1B\014OsLoginProtoP\001"
          + "Z>google.golang.org/genproto/googleapis/"
          + "cloud/oslogin/v1;oslogin\252\002\027Google.Cloud."
          + "OsLogin.V1\312\002\027Google\\Cloud\\OsLogin\\V1b\006pr"
          + "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.oslogin.common.OsLoginProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_oslogin_v1_LoginProfile_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_oslogin_v1_LoginProfile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_LoginProfile_descriptor,
            new java.lang.String[] {
              "Name", "PosixAccounts", "SshPublicKeys",
            });
    internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_descriptor =
        internal_static_google_cloud_oslogin_v1_LoginProfile_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_descriptor,
            new java.lang.String[] {
              "Name", "ProjectId", "SystemId",
            });
    internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SshPublicKey", "ProjectId",
            });
    internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_descriptor,
            new java.lang.String[] {
              "LoginProfile",
            });
    internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Name", "SshPublicKey", "UpdateMask",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.oslogin.common.OsLoginProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
