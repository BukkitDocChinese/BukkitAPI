package org.bukkit;

import java.util.Date;

/**
 * 一个单独的ban list入口。这个可以表示玩家ban或者IP地址ban。.
 * <p>
 * Ban entries 包括以下属性:
 * <table border=1>
 * <caption>Property information</caption>
 * <tr>
 *     <th>Property</th>
 *     <th>描述</th>
 * </tr><tr>
 *     <td>Target Name / IP Address</td>
 *     <td>Ban目标名或者IP地址</td>
 * </tr><tr>
 *     <td>Creation Date</td>
 *     <td>ban创建日期</td>
 * </tr><tr>
 *     <td>Source</td>
 *     <td>Ban的来源，比如玩家，终端，插件等等</td>
 * </tr><tr>
 *     <td>Expiration Date</td>
 *     <td>Ban的过期日期</td>
 * </tr><tr>
 *     <td>Reason</td>
 *     <td>Ban的原因</td>
 * </tr>
 * </table>
 * <p>
 * 未保存的信息是不会自动写入到实施者的
 * 中，然而， {@link #save()} method must be called to write the
 * changes to the ban list. 如果这个ban entry已过期(比如来自
 * unban) 并且无法在列表中找到, the {@link #save()} call will
 * re-add it to the list, therefore banning the victim specified.
 * <p>
 * 同样的，更改与 {@link BanList} 或其他entries可能影响或不影响这一entry.
 */
public interface BanEntry {

    /**
     * 获取参与的目标，这可以是用户名或者IP地址的形式
     *
     * @return 目标名或者IP地址
     */
    public String getTarget();

    /**
     * 获取这个ban entry创建的日期
     *
     * @return 创建的日期
     */
    public Date getCreated();

    /**
     * 设置ban entry创建的日期
     *
     * @param created 新的创建日期，不能为空
     * @see #save() saving changes
     */
    public void setCreated(Date created);

    /**
     * 获取ban的来源
     * <p>
     * 备注：来源可以是任意字符串，即使这一般都是个玩家名。
     *
     * @return ban的来源
     */
    public String getSource();

    /**
     * 设置ban的来源
     * <p>
     * 备注：来源可以为任意字符串，即使这一般都是个玩家名。
     *
     * @param source the new source where null values become empty strings
     * @see #save() saving changes
     */
    public void setSource(String source);

    /**
     * 获取ban的过期日期，没有表示永久ban
     *
     * @return 过期日期
     */
    public Date getExpiration();

    /**
     * 设置ban的过期时间，null表示永久ban
     *
     * @param expiration the new expiration date, or null to indicate an
     *     eternity
     * @see #save() saving changes
     */
    public void setExpiration(Date expiration);

    /**
     * 获取ban的原因
     *
     * @return ban的原因，null表示未设置
     */
    public String getReason();

    /**
     * 这是这个ban的原因. 原因必须不为null.
     *
     * @param reason 新原因, null values assume the implementation
     *     default
     * @see #save() saving changes
     */
    public void setReason(String reason);

    /**
     * 保存ban entry, 覆盖ban列表中所有原有数据
     * <p>
     * 保存一个未被ban的玩家的ban entry将会导致这个玩家被ban。
     */
    public void save();
}
