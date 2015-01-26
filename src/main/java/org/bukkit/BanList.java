package org.bukkit;

import java.util.Date;
import java.util.Set;

/**
 * 一个ban列表，包含一些 {@link Type} 类型的ban。
 */
public interface BanList {

    /**
     * 表示一个ban-type 使得 {@link BanList} 可追踪.
     */
    public enum Type {
        /**
         * 被ban玩家名字
         */
        NAME,
        /**
         * 被ban的IP地址
         */
        IP,
        ;
    }

    /**
     * 通过目标获取一个 {@link BanEntry}
     *
     * @param target 搜索的参数
     * @return 返回有关结果，null表示无结果
     */
    public BanEntry getBanEntry(String target);

    /**
     * 添加一个ban到ban列表。如果有一个过去的ban存在，这会更新过去添加的ban。
     *
     * @param target ban的目标
     * @param reason ban的原因， null表示implementation default
     * @param expires ban或unban的日期，null表示永久
     * @param source ban的来源，null表示implementation default
     * @return 最新创建的ban的entry，或者过去/更新的ban
     */
    public BanEntry addBan(String target, String reason, Date expires, String source);

    /**
     * 获得一个包含所有 {@link BanEntry} 在这列表中。
     *
     * @return an immutable set containing every entry tracked by this list
     */
    public Set<BanEntry> getBanEntries();

    /**
     * 获取目标的 {@link BanEntry} 是否存在，表示一个活动的ban状态。
     *
     * @param target 所要寻找的目标
     * @return 如果 {@link BanEntry} 有这名字存在返回true,表示一个活动的
     * ban状态，否则为null。
     */
    public boolean isBanned(String target);

    /**
     * 从列表上删除一个指定目标，因此也会有"not banned"状态.
     *
     * @param target 要从列表上删除的目标
     */
    public void pardon(String target);
}
