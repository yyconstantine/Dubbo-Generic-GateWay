package me.sxl.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yyconstantine
 * @date 2020/5/15 上午 11:52
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Properties {

    private GatewayProperties gatewayProperties;

    private RpcProperties rpcProperties;

}
