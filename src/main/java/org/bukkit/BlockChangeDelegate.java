package org.bukkit;

/**
 * 一个处理方块更变的代表. 服务器作为一个计算服务器内生物生成和使用代码的
 * 直接的接口.
 */
public interface BlockChangeDelegate {

    /**
     * 指定特定坐标方块的类型而不需要进行全世界更新并通知
     * <p>
     * 通过调用World.setTypeId比较安全,但比可能使用World.setRawTypeId
     * 慢一些.
     *
     * @param x X 坐标
     * @param y Y 坐标
     * @param z Z 坐标
     * @param typeId 新方块ID
     * @return true 如果方块成功设置
     * @deprecated Magic value
     */
    @Deprecated
    public boolean setRawTypeId(int x, int y, int z, int typeId);

    /**
     * 指定特定坐标方块的数据而不需要进行全世界更新并通知
     * <p>
     * 通过调用World.setTypeId比较安全,但比可能使用World.setRawTypeId
     * 慢一些.
     *
     * @param x X 坐标
     * @param y Y 坐标
     * @param z Z 坐标
     * @param typeId 新方块ID
     * @param data 方块数据
     * @return true 如果方块成功设置
     * @deprecated Magic value
     */
    @Deprecated
    public boolean setRawTypeIdAndData(int x, int y, int z, int typeId, int data);

    /**
     * 设置指定坐标的方块类型.
     * <p>
     * 这方式不需要调用World.setRawTypeId,但需要全局更新.
     *
     * @param x X 坐标
     * @param y Y 坐标
     * @param z Z 坐标
     * @param typeId 新方块ID
     * @return true 如果方块成功设置
     * @deprecated Magic value
     */
    @Deprecated
    public boolean setTypeId(int x, int y, int z, int typeId);

    /**
     * 设置指定坐标的方块类型和数据.
     * <p>
     * 这方式不需要调用World.setRawTypeId,但需要全局更新.
     *
     * @param x X 坐标
     * @param y Y 坐标
     * @param z Z 坐标
     * @param typeId 新方块ID
     * @param data 方块数据
     * @return true 如果方块成功设置
     * @deprecated Magic value
     */
    @Deprecated
    public boolean setTypeIdAndData(int x, int y, int z, int typeId, int data);

    /**
     * 获取某一位置的方块类型.
     *
     * @param x X 坐标
     * @param y Y 坐标
     * @param z Z 坐标
     * @param typeId 新方块ID
     * @deprecated Magic value
     */
    @Deprecated
    public int getTypeId(int x, int y, int z);

    /**
     * 获取世界的高度.
     *
     * @return 世界的高度
     */
    public int getHeight();

    /**
     * 检查指定的方块是否为空（空气）.
     *
     * @param x X 坐标
     * @param y Y 坐标
     * @param z Z 坐标
     * @return true 如果方块成功设置
     */
    public boolean isEmpty(int x, int y, int z);
}
