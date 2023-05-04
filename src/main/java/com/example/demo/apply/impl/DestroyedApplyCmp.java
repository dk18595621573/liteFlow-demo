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
 * 毁单申请
 * @author nlsm
 */
@Slf4j
@LiteflowCmpDefine
@LiteflowComponent(id = ApplyConsts.DESTROYED_CMP_ID, name = "毁单申请")
public class DestroyedApplyCmp implements Apply {

    @Override
    @LiteflowMethod(LiteFlowMethodEnum.PROCESS)
    public void apply(NodeComponent bindCmp) {
        log.info("[毁单申请]申请处理==》{}", bindCmp.getNodeId());
    }

    @Override
    @LiteflowMethod(LiteFlowMethodEnum.PROCESS)
    public void approve(NodeComponent bindCmp) {
        log.info("[毁单申请]审批处理==》{}", bindCmp.getNodeId());
    }
}
