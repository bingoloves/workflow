package cn.cqs.workflow;

public interface Node {

    /**
     * 节点id
     *
     * @return 当前节点id
     */
    int getId();

    /**
     * 任务完成时触发
     */
    void onCompleted();

}
