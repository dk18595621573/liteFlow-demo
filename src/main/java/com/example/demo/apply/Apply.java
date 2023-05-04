package com.example.demo.apply;

import com.yomahub.liteflow.core.NodeComponent;

/**
 * 申请处理接口
 * @author nlsm
 */
public interface Apply {

    /**
     * 申请
     * @param bindCmp 参数
     */
    void apply(NodeComponent bindCmp);

    /**
     * 审批
     * @param bindCmp 参数
     * @return 是否审批成功
     */
    void approve(NodeComponent bindCmp);
}
