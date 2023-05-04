package com.example.demo.apply.impl;

import com.example.demo.apply.Apply;
import com.example.demo.consts.ApplyConsts;
import com.yomahub.liteflow.annotation.LiteflowCmpDefine;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.annotation.LiteflowMethod;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.enums.LiteFlowMethodEnum;
import lombok.extern.slf4j.Slf4j;

/**
 * 发货异常申请
 * @author nlsm
 */
@Slf4j
@LiteflowCmpDefine
@LiteflowComponent(id = ApplyConsts.SHIPMENTS_CMP_ID, name = "发货申请")
public class ShipmentsApplyCmp implements Apply {

    @Override
    @LiteflowMethod(LiteFlowMethodEnum.PROCESS)
    public void apply(NodeComponent bindCmp) {
        log.info("[发货异常申请]申请处理==》{}", bindCmp.getNodeId());
    }

    @Override
    @LiteflowMethod(LiteFlowMethodEnum.PROCESS)
    public void approve(NodeComponent bindCmp) {
        log.info("[发货异常申请]审批处理==》{}", bindCmp.getNodeId());
    }
}
