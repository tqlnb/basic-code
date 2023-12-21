package ins.daemon.node;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *定义服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: INodeRunnerRemote.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class INodeRunnerRemoteGrpc {

  private INodeRunnerRemoteGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ins.daemon.node.INodeRunnerRemote";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ins.daemon.node.HelloRequest,
      ins.daemon.node.HelloResponse> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello",
      requestType = ins.daemon.node.HelloRequest.class,
      responseType = ins.daemon.node.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ins.daemon.node.HelloRequest,
      ins.daemon.node.HelloResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<ins.daemon.node.HelloRequest, ins.daemon.node.HelloResponse> getSayHelloMethod;
    if ((getSayHelloMethod = INodeRunnerRemoteGrpc.getSayHelloMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getSayHelloMethod = INodeRunnerRemoteGrpc.getSayHelloMethod) == null) {
          INodeRunnerRemoteGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<ins.daemon.node.HelloRequest, ins.daemon.node.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("sayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ins.daemon.node.HellosRequest,
      ins.daemon.node.HellosResponse> getHelloWorldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "helloWorld",
      requestType = ins.daemon.node.HellosRequest.class,
      responseType = ins.daemon.node.HellosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ins.daemon.node.HellosRequest,
      ins.daemon.node.HellosResponse> getHelloWorldMethod() {
    io.grpc.MethodDescriptor<ins.daemon.node.HellosRequest, ins.daemon.node.HellosResponse> getHelloWorldMethod;
    if ((getHelloWorldMethod = INodeRunnerRemoteGrpc.getHelloWorldMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getHelloWorldMethod = INodeRunnerRemoteGrpc.getHelloWorldMethod) == null) {
          INodeRunnerRemoteGrpc.getHelloWorldMethod = getHelloWorldMethod =
              io.grpc.MethodDescriptor.<ins.daemon.node.HellosRequest, ins.daemon.node.HellosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "helloWorld"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.HellosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.HellosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("helloWorld"))
              .build();
        }
      }
    }
    return getHelloWorldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ins.daemon.node.PrintLogRequest,
      com.google.protobuf.Empty> getRunAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "runApp",
      requestType = ins.daemon.node.PrintLogRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ins.daemon.node.PrintLogRequest,
      com.google.protobuf.Empty> getRunAppMethod() {
    io.grpc.MethodDescriptor<ins.daemon.node.PrintLogRequest, com.google.protobuf.Empty> getRunAppMethod;
    if ((getRunAppMethod = INodeRunnerRemoteGrpc.getRunAppMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getRunAppMethod = INodeRunnerRemoteGrpc.getRunAppMethod) == null) {
          INodeRunnerRemoteGrpc.getRunAppMethod = getRunAppMethod =
              io.grpc.MethodDescriptor.<ins.daemon.node.PrintLogRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "runApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.PrintLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("runApp"))
              .build();
        }
      }
    }
    return getRunAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getKillAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "killApp",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getKillAppMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getKillAppMethod;
    if ((getKillAppMethod = INodeRunnerRemoteGrpc.getKillAppMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getKillAppMethod = INodeRunnerRemoteGrpc.getKillAppMethod) == null) {
          INodeRunnerRemoteGrpc.getKillAppMethod = getKillAppMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "killApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("killApp"))
              .build();
        }
      }
    }
    return getKillAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ins.daemon.node.StatusResponse> getCheckAppStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkAppStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = ins.daemon.node.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ins.daemon.node.StatusResponse> getCheckAppStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ins.daemon.node.StatusResponse> getCheckAppStatusMethod;
    if ((getCheckAppStatusMethod = INodeRunnerRemoteGrpc.getCheckAppStatusMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getCheckAppStatusMethod = INodeRunnerRemoteGrpc.getCheckAppStatusMethod) == null) {
          INodeRunnerRemoteGrpc.getCheckAppStatusMethod = getCheckAppStatusMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ins.daemon.node.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkAppStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("checkAppStatus"))
              .build();
        }
      }
    }
    return getCheckAppStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ins.daemon.node.checkDeamonStatusResponse> getCheckDeamonStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkDeamonStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = ins.daemon.node.checkDeamonStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ins.daemon.node.checkDeamonStatusResponse> getCheckDeamonStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ins.daemon.node.checkDeamonStatusResponse> getCheckDeamonStatusMethod;
    if ((getCheckDeamonStatusMethod = INodeRunnerRemoteGrpc.getCheckDeamonStatusMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getCheckDeamonStatusMethod = INodeRunnerRemoteGrpc.getCheckDeamonStatusMethod) == null) {
          INodeRunnerRemoteGrpc.getCheckDeamonStatusMethod = getCheckDeamonStatusMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ins.daemon.node.checkDeamonStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkDeamonStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.checkDeamonStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("checkDeamonStatus"))
              .build();
        }
      }
    }
    return getCheckDeamonStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ins.daemon.node.updateAppRequest,
      ins.daemon.node.updateAppResponse> getUpdateAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateApp",
      requestType = ins.daemon.node.updateAppRequest.class,
      responseType = ins.daemon.node.updateAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ins.daemon.node.updateAppRequest,
      ins.daemon.node.updateAppResponse> getUpdateAppMethod() {
    io.grpc.MethodDescriptor<ins.daemon.node.updateAppRequest, ins.daemon.node.updateAppResponse> getUpdateAppMethod;
    if ((getUpdateAppMethod = INodeRunnerRemoteGrpc.getUpdateAppMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getUpdateAppMethod = INodeRunnerRemoteGrpc.getUpdateAppMethod) == null) {
          INodeRunnerRemoteGrpc.getUpdateAppMethod = getUpdateAppMethod =
              io.grpc.MethodDescriptor.<ins.daemon.node.updateAppRequest, ins.daemon.node.updateAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.updateAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.updateAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("updateApp"))
              .build();
        }
      }
    }
    return getUpdateAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ins.daemon.node.updateDSPRequest,
      com.google.protobuf.Empty> getUpdateDSPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateDSP",
      requestType = ins.daemon.node.updateDSPRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ins.daemon.node.updateDSPRequest,
      com.google.protobuf.Empty> getUpdateDSPMethod() {
    io.grpc.MethodDescriptor<ins.daemon.node.updateDSPRequest, com.google.protobuf.Empty> getUpdateDSPMethod;
    if ((getUpdateDSPMethod = INodeRunnerRemoteGrpc.getUpdateDSPMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getUpdateDSPMethod = INodeRunnerRemoteGrpc.getUpdateDSPMethod) == null) {
          INodeRunnerRemoteGrpc.getUpdateDSPMethod = getUpdateDSPMethod =
              io.grpc.MethodDescriptor.<ins.daemon.node.updateDSPRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateDSP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.updateDSPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("updateDSP"))
              .build();
        }
      }
    }
    return getUpdateDSPMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ins.daemon.node.lsEndModuleResponse> getLsEndModuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lsEndModule",
      requestType = com.google.protobuf.Empty.class,
      responseType = ins.daemon.node.lsEndModuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ins.daemon.node.lsEndModuleResponse> getLsEndModuleMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ins.daemon.node.lsEndModuleResponse> getLsEndModuleMethod;
    if ((getLsEndModuleMethod = INodeRunnerRemoteGrpc.getLsEndModuleMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getLsEndModuleMethod = INodeRunnerRemoteGrpc.getLsEndModuleMethod) == null) {
          INodeRunnerRemoteGrpc.getLsEndModuleMethod = getLsEndModuleMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ins.daemon.node.lsEndModuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "lsEndModule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.lsEndModuleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("lsEndModule"))
              .build();
        }
      }
    }
    return getLsEndModuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ins.daemon.node.SysInfoRequest,
      ins.daemon.node.SysInfoResponse> getGetSysInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSysInfo",
      requestType = ins.daemon.node.SysInfoRequest.class,
      responseType = ins.daemon.node.SysInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ins.daemon.node.SysInfoRequest,
      ins.daemon.node.SysInfoResponse> getGetSysInfoMethod() {
    io.grpc.MethodDescriptor<ins.daemon.node.SysInfoRequest, ins.daemon.node.SysInfoResponse> getGetSysInfoMethod;
    if ((getGetSysInfoMethod = INodeRunnerRemoteGrpc.getGetSysInfoMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getGetSysInfoMethod = INodeRunnerRemoteGrpc.getGetSysInfoMethod) == null) {
          INodeRunnerRemoteGrpc.getGetSysInfoMethod = getGetSysInfoMethod =
              io.grpc.MethodDescriptor.<ins.daemon.node.SysInfoRequest, ins.daemon.node.SysInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSysInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.SysInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.SysInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("getSysInfo"))
              .build();
        }
      }
    }
    return getGetSysInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getFakeSendMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fakeSendMsg",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getFakeSendMsgMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getFakeSendMsgMethod;
    if ((getFakeSendMsgMethod = INodeRunnerRemoteGrpc.getFakeSendMsgMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getFakeSendMsgMethod = INodeRunnerRemoteGrpc.getFakeSendMsgMethod) == null) {
          INodeRunnerRemoteGrpc.getFakeSendMsgMethod = getFakeSendMsgMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fakeSendMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("fakeSendMsg"))
              .build();
        }
      }
    }
    return getFakeSendMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ins.daemon.node.resetDeviceResponse> getResetDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "resetDevice",
      requestType = com.google.protobuf.Empty.class,
      responseType = ins.daemon.node.resetDeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ins.daemon.node.resetDeviceResponse> getResetDeviceMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ins.daemon.node.resetDeviceResponse> getResetDeviceMethod;
    if ((getResetDeviceMethod = INodeRunnerRemoteGrpc.getResetDeviceMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getResetDeviceMethod = INodeRunnerRemoteGrpc.getResetDeviceMethod) == null) {
          INodeRunnerRemoteGrpc.getResetDeviceMethod = getResetDeviceMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ins.daemon.node.resetDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "resetDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.resetDeviceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("resetDevice"))
              .build();
        }
      }
    }
    return getResetDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ins.daemon.node.ResEntity,
      com.google.protobuf.Empty> getSetParamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setParam",
      requestType = ins.daemon.node.ResEntity.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ins.daemon.node.ResEntity,
      com.google.protobuf.Empty> getSetParamMethod() {
    io.grpc.MethodDescriptor<ins.daemon.node.ResEntity, com.google.protobuf.Empty> getSetParamMethod;
    if ((getSetParamMethod = INodeRunnerRemoteGrpc.getSetParamMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getSetParamMethod = INodeRunnerRemoteGrpc.getSetParamMethod) == null) {
          INodeRunnerRemoteGrpc.getSetParamMethod = getSetParamMethod =
              io.grpc.MethodDescriptor.<ins.daemon.node.ResEntity, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setParam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.ResEntity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("setParam"))
              .build();
        }
      }
    }
    return getSetParamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ins.daemon.node.firmwareRequest,
      ins.daemon.node.firmwareResponse> getUpdateFirmwareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateFirmware",
      requestType = ins.daemon.node.firmwareRequest.class,
      responseType = ins.daemon.node.firmwareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ins.daemon.node.firmwareRequest,
      ins.daemon.node.firmwareResponse> getUpdateFirmwareMethod() {
    io.grpc.MethodDescriptor<ins.daemon.node.firmwareRequest, ins.daemon.node.firmwareResponse> getUpdateFirmwareMethod;
    if ((getUpdateFirmwareMethod = INodeRunnerRemoteGrpc.getUpdateFirmwareMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getUpdateFirmwareMethod = INodeRunnerRemoteGrpc.getUpdateFirmwareMethod) == null) {
          INodeRunnerRemoteGrpc.getUpdateFirmwareMethod = getUpdateFirmwareMethod =
              io.grpc.MethodDescriptor.<ins.daemon.node.firmwareRequest, ins.daemon.node.firmwareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateFirmware"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.firmwareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.firmwareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("updateFirmware"))
              .build();
        }
      }
    }
    return getUpdateFirmwareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ins.daemon.node.restartRequest,
      ins.daemon.node.restartResponse> getRestartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "restart",
      requestType = ins.daemon.node.restartRequest.class,
      responseType = ins.daemon.node.restartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ins.daemon.node.restartRequest,
      ins.daemon.node.restartResponse> getRestartMethod() {
    io.grpc.MethodDescriptor<ins.daemon.node.restartRequest, ins.daemon.node.restartResponse> getRestartMethod;
    if ((getRestartMethod = INodeRunnerRemoteGrpc.getRestartMethod) == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        if ((getRestartMethod = INodeRunnerRemoteGrpc.getRestartMethod) == null) {
          INodeRunnerRemoteGrpc.getRestartMethod = getRestartMethod =
              io.grpc.MethodDescriptor.<ins.daemon.node.restartRequest, ins.daemon.node.restartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "restart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.restartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ins.daemon.node.restartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new INodeRunnerRemoteMethodDescriptorSupplier("restart"))
              .build();
        }
      }
    }
    return getRestartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static INodeRunnerRemoteStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<INodeRunnerRemoteStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<INodeRunnerRemoteStub>() {
        @java.lang.Override
        public INodeRunnerRemoteStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new INodeRunnerRemoteStub(channel, callOptions);
        }
      };
    return INodeRunnerRemoteStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static INodeRunnerRemoteBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<INodeRunnerRemoteBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<INodeRunnerRemoteBlockingStub>() {
        @java.lang.Override
        public INodeRunnerRemoteBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new INodeRunnerRemoteBlockingStub(channel, callOptions);
        }
      };
    return INodeRunnerRemoteBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static INodeRunnerRemoteFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<INodeRunnerRemoteFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<INodeRunnerRemoteFutureStub>() {
        @java.lang.Override
        public INodeRunnerRemoteFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new INodeRunnerRemoteFutureStub(channel, callOptions);
        }
      };
    return INodeRunnerRemoteFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *定义服务
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     *注意：这里是returns 不是return
     * </pre>
     */
    default void sayHello(ins.daemon.node.HelloRequest request,
        io.grpc.stub.StreamObserver<ins.daemon.node.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     *测试
     * </pre>
     */
    default void helloWorld(ins.daemon.node.HellosRequest request,
        io.grpc.stub.StreamObserver<ins.daemon.node.HellosResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloWorldMethod(), responseObserver);
    }

    /**
     * <pre>
     *启动app
     * </pre>
     */
    default void runApp(ins.daemon.node.PrintLogRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRunAppMethod(), responseObserver);
    }

    /**
     * <pre>
     *关闭app
     * </pre>
     */
    default void killApp(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKillAppMethod(), responseObserver);
    }

    /**
     * <pre>
     *自身运行状态
     * </pre>
     */
    default void checkAppStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ins.daemon.node.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckAppStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     *自身运行状态
     * </pre>
     */
    default void checkDeamonStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ins.daemon.node.checkDeamonStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckDeamonStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     *文件操作相关
     * </pre>
     */
    default io.grpc.stub.StreamObserver<ins.daemon.node.updateAppRequest> updateApp(
        io.grpc.stub.StreamObserver<ins.daemon.node.updateAppResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUpdateAppMethod(), responseObserver);
    }

    /**
     * <pre>
     *与JVISA相关 更新固件
     * </pre>
     */
    default void updateDSP(ins.daemon.node.updateDSPRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDSPMethod(), responseObserver);
    }

    /**
     */
    default void lsEndModule(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ins.daemon.node.lsEndModuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLsEndModuleMethod(), responseObserver);
    }

    /**
     */
    default void getSysInfo(ins.daemon.node.SysInfoRequest request,
        io.grpc.stub.StreamObserver<ins.daemon.node.SysInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSysInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取系统信息
     * </pre>
     */
    default void fakeSendMsg(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFakeSendMsgMethod(), responseObserver);
    }

    /**
     * <pre>
     *重新获取设备信息
     * </pre>
     */
    default void resetDevice(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ins.daemon.node.resetDeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     *配置前端参数
     * </pre>
     */
    default void setParam(ins.daemon.node.ResEntity request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetParamMethod(), responseObserver);
    }

    /**
     * <pre>
     *更新前端固件
     * </pre>
     */
    default io.grpc.stub.StreamObserver<ins.daemon.node.firmwareRequest> updateFirmware(
        io.grpc.stub.StreamObserver<ins.daemon.node.firmwareResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUpdateFirmwareMethod(), responseObserver);
    }

    /**
     * <pre>
     *重启前端
     * </pre>
     */
    default void restart(ins.daemon.node.restartRequest request,
        io.grpc.stub.StreamObserver<ins.daemon.node.restartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestartMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service INodeRunnerRemote.
   * <pre>
   *定义服务
   * </pre>
   */
  public static abstract class INodeRunnerRemoteImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return INodeRunnerRemoteGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service INodeRunnerRemote.
   * <pre>
   *定义服务
   * </pre>
   */
  public static final class INodeRunnerRemoteStub
      extends io.grpc.stub.AbstractAsyncStub<INodeRunnerRemoteStub> {
    private INodeRunnerRemoteStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected INodeRunnerRemoteStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new INodeRunnerRemoteStub(channel, callOptions);
    }

    /**
     * <pre>
     *注意：这里是returns 不是return
     * </pre>
     */
    public void sayHello(ins.daemon.node.HelloRequest request,
        io.grpc.stub.StreamObserver<ins.daemon.node.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *测试
     * </pre>
     */
    public void helloWorld(ins.daemon.node.HellosRequest request,
        io.grpc.stub.StreamObserver<ins.daemon.node.HellosResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloWorldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *启动app
     * </pre>
     */
    public void runApp(ins.daemon.node.PrintLogRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRunAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *关闭app
     * </pre>
     */
    public void killApp(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKillAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *自身运行状态
     * </pre>
     */
    public void checkAppStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ins.daemon.node.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckAppStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *自身运行状态
     * </pre>
     */
    public void checkDeamonStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ins.daemon.node.checkDeamonStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckDeamonStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *文件操作相关
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ins.daemon.node.updateAppRequest> updateApp(
        io.grpc.stub.StreamObserver<ins.daemon.node.updateAppResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUpdateAppMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *与JVISA相关 更新固件
     * </pre>
     */
    public void updateDSP(ins.daemon.node.updateDSPRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDSPMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lsEndModule(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ins.daemon.node.lsEndModuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLsEndModuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSysInfo(ins.daemon.node.SysInfoRequest request,
        io.grpc.stub.StreamObserver<ins.daemon.node.SysInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSysInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取系统信息
     * </pre>
     */
    public void fakeSendMsg(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFakeSendMsgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *重新获取设备信息
     * </pre>
     */
    public void resetDevice(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ins.daemon.node.resetDeviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *配置前端参数
     * </pre>
     */
    public void setParam(ins.daemon.node.ResEntity request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetParamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *更新前端固件
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ins.daemon.node.firmwareRequest> updateFirmware(
        io.grpc.stub.StreamObserver<ins.daemon.node.firmwareResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUpdateFirmwareMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *重启前端
     * </pre>
     */
    public void restart(ins.daemon.node.restartRequest request,
        io.grpc.stub.StreamObserver<ins.daemon.node.restartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service INodeRunnerRemote.
   * <pre>
   *定义服务
   * </pre>
   */
  public static final class INodeRunnerRemoteBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<INodeRunnerRemoteBlockingStub> {
    private INodeRunnerRemoteBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected INodeRunnerRemoteBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new INodeRunnerRemoteBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *注意：这里是returns 不是return
     * </pre>
     */
    public ins.daemon.node.HelloResponse sayHello(ins.daemon.node.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *测试
     * </pre>
     */
    public ins.daemon.node.HellosResponse helloWorld(ins.daemon.node.HellosRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloWorldMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *启动app
     * </pre>
     */
    public com.google.protobuf.Empty runApp(ins.daemon.node.PrintLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRunAppMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *关闭app
     * </pre>
     */
    public com.google.protobuf.Empty killApp(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKillAppMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *自身运行状态
     * </pre>
     */
    public ins.daemon.node.StatusResponse checkAppStatus(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckAppStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *自身运行状态
     * </pre>
     */
    public ins.daemon.node.checkDeamonStatusResponse checkDeamonStatus(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckDeamonStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *与JVISA相关 更新固件
     * </pre>
     */
    public com.google.protobuf.Empty updateDSP(ins.daemon.node.updateDSPRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDSPMethod(), getCallOptions(), request);
    }

    /**
     */
    public ins.daemon.node.lsEndModuleResponse lsEndModule(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLsEndModuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public ins.daemon.node.SysInfoResponse getSysInfo(ins.daemon.node.SysInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSysInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取系统信息
     * </pre>
     */
    public com.google.protobuf.Empty fakeSendMsg(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFakeSendMsgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *重新获取设备信息
     * </pre>
     */
    public ins.daemon.node.resetDeviceResponse resetDevice(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *配置前端参数
     * </pre>
     */
    public com.google.protobuf.Empty setParam(ins.daemon.node.ResEntity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetParamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *重启前端
     * </pre>
     */
    public ins.daemon.node.restartResponse restart(ins.daemon.node.restartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestartMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service INodeRunnerRemote.
   * <pre>
   *定义服务
   * </pre>
   */
  public static final class INodeRunnerRemoteFutureStub
      extends io.grpc.stub.AbstractFutureStub<INodeRunnerRemoteFutureStub> {
    private INodeRunnerRemoteFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected INodeRunnerRemoteFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new INodeRunnerRemoteFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *注意：这里是returns 不是return
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ins.daemon.node.HelloResponse> sayHello(
        ins.daemon.node.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *测试
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ins.daemon.node.HellosResponse> helloWorld(
        ins.daemon.node.HellosRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloWorldMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *启动app
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> runApp(
        ins.daemon.node.PrintLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRunAppMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *关闭app
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> killApp(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKillAppMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *自身运行状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ins.daemon.node.StatusResponse> checkAppStatus(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckAppStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *自身运行状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ins.daemon.node.checkDeamonStatusResponse> checkDeamonStatus(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckDeamonStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *与JVISA相关 更新固件
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateDSP(
        ins.daemon.node.updateDSPRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDSPMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ins.daemon.node.lsEndModuleResponse> lsEndModule(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLsEndModuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ins.daemon.node.SysInfoResponse> getSysInfo(
        ins.daemon.node.SysInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSysInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取系统信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> fakeSendMsg(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFakeSendMsgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *重新获取设备信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ins.daemon.node.resetDeviceResponse> resetDevice(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *配置前端参数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setParam(
        ins.daemon.node.ResEntity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetParamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *重启前端
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ins.daemon.node.restartResponse> restart(
        ins.daemon.node.restartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_HELLO_WORLD = 1;
  private static final int METHODID_RUN_APP = 2;
  private static final int METHODID_KILL_APP = 3;
  private static final int METHODID_CHECK_APP_STATUS = 4;
  private static final int METHODID_CHECK_DEAMON_STATUS = 5;
  private static final int METHODID_UPDATE_DSP = 6;
  private static final int METHODID_LS_END_MODULE = 7;
  private static final int METHODID_GET_SYS_INFO = 8;
  private static final int METHODID_FAKE_SEND_MSG = 9;
  private static final int METHODID_RESET_DEVICE = 10;
  private static final int METHODID_SET_PARAM = 11;
  private static final int METHODID_RESTART = 12;
  private static final int METHODID_UPDATE_APP = 13;
  private static final int METHODID_UPDATE_FIRMWARE = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((ins.daemon.node.HelloRequest) request,
              (io.grpc.stub.StreamObserver<ins.daemon.node.HelloResponse>) responseObserver);
          break;
        case METHODID_HELLO_WORLD:
          serviceImpl.helloWorld((ins.daemon.node.HellosRequest) request,
              (io.grpc.stub.StreamObserver<ins.daemon.node.HellosResponse>) responseObserver);
          break;
        case METHODID_RUN_APP:
          serviceImpl.runApp((ins.daemon.node.PrintLogRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_KILL_APP:
          serviceImpl.killApp((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CHECK_APP_STATUS:
          serviceImpl.checkAppStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ins.daemon.node.StatusResponse>) responseObserver);
          break;
        case METHODID_CHECK_DEAMON_STATUS:
          serviceImpl.checkDeamonStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ins.daemon.node.checkDeamonStatusResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DSP:
          serviceImpl.updateDSP((ins.daemon.node.updateDSPRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LS_END_MODULE:
          serviceImpl.lsEndModule((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ins.daemon.node.lsEndModuleResponse>) responseObserver);
          break;
        case METHODID_GET_SYS_INFO:
          serviceImpl.getSysInfo((ins.daemon.node.SysInfoRequest) request,
              (io.grpc.stub.StreamObserver<ins.daemon.node.SysInfoResponse>) responseObserver);
          break;
        case METHODID_FAKE_SEND_MSG:
          serviceImpl.fakeSendMsg((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RESET_DEVICE:
          serviceImpl.resetDevice((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ins.daemon.node.resetDeviceResponse>) responseObserver);
          break;
        case METHODID_SET_PARAM:
          serviceImpl.setParam((ins.daemon.node.ResEntity) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RESTART:
          serviceImpl.restart((ins.daemon.node.restartRequest) request,
              (io.grpc.stub.StreamObserver<ins.daemon.node.restartResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_APP:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.updateApp(
              (io.grpc.stub.StreamObserver<ins.daemon.node.updateAppResponse>) responseObserver);
        case METHODID_UPDATE_FIRMWARE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.updateFirmware(
              (io.grpc.stub.StreamObserver<ins.daemon.node.firmwareResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ins.daemon.node.HelloRequest,
              ins.daemon.node.HelloResponse>(
                service, METHODID_SAY_HELLO)))
        .addMethod(
          getHelloWorldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ins.daemon.node.HellosRequest,
              ins.daemon.node.HellosResponse>(
                service, METHODID_HELLO_WORLD)))
        .addMethod(
          getRunAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ins.daemon.node.PrintLogRequest,
              com.google.protobuf.Empty>(
                service, METHODID_RUN_APP)))
        .addMethod(
          getKillAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_KILL_APP)))
        .addMethod(
          getCheckAppStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ins.daemon.node.StatusResponse>(
                service, METHODID_CHECK_APP_STATUS)))
        .addMethod(
          getCheckDeamonStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ins.daemon.node.checkDeamonStatusResponse>(
                service, METHODID_CHECK_DEAMON_STATUS)))
        .addMethod(
          getUpdateAppMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              ins.daemon.node.updateAppRequest,
              ins.daemon.node.updateAppResponse>(
                service, METHODID_UPDATE_APP)))
        .addMethod(
          getUpdateDSPMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ins.daemon.node.updateDSPRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_DSP)))
        .addMethod(
          getLsEndModuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ins.daemon.node.lsEndModuleResponse>(
                service, METHODID_LS_END_MODULE)))
        .addMethod(
          getGetSysInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ins.daemon.node.SysInfoRequest,
              ins.daemon.node.SysInfoResponse>(
                service, METHODID_GET_SYS_INFO)))
        .addMethod(
          getFakeSendMsgMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_FAKE_SEND_MSG)))
        .addMethod(
          getResetDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ins.daemon.node.resetDeviceResponse>(
                service, METHODID_RESET_DEVICE)))
        .addMethod(
          getSetParamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ins.daemon.node.ResEntity,
              com.google.protobuf.Empty>(
                service, METHODID_SET_PARAM)))
        .addMethod(
          getUpdateFirmwareMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              ins.daemon.node.firmwareRequest,
              ins.daemon.node.firmwareResponse>(
                service, METHODID_UPDATE_FIRMWARE)))
        .addMethod(
          getRestartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ins.daemon.node.restartRequest,
              ins.daemon.node.restartResponse>(
                service, METHODID_RESTART)))
        .build();
  }

  private static abstract class INodeRunnerRemoteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    INodeRunnerRemoteBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ins.daemon.node.INodeRunnerRt.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("INodeRunnerRemote");
    }
  }

  private static final class INodeRunnerRemoteFileDescriptorSupplier
      extends INodeRunnerRemoteBaseDescriptorSupplier {
    INodeRunnerRemoteFileDescriptorSupplier() {}
  }

  private static final class INodeRunnerRemoteMethodDescriptorSupplier
      extends INodeRunnerRemoteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    INodeRunnerRemoteMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (INodeRunnerRemoteGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new INodeRunnerRemoteFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getHelloWorldMethod())
              .addMethod(getRunAppMethod())
              .addMethod(getKillAppMethod())
              .addMethod(getCheckAppStatusMethod())
              .addMethod(getCheckDeamonStatusMethod())
              .addMethod(getUpdateAppMethod())
              .addMethod(getUpdateDSPMethod())
              .addMethod(getLsEndModuleMethod())
              .addMethod(getGetSysInfoMethod())
              .addMethod(getFakeSendMsgMethod())
              .addMethod(getResetDeviceMethod())
              .addMethod(getSetParamMethod())
              .addMethod(getUpdateFirmwareMethod())
              .addMethod(getRestartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
