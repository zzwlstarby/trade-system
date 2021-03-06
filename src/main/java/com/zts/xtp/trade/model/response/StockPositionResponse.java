// Generated by delombok at Sun Sep 22 21:37:45 CST 2019
package com.zts.xtp.trade.model.response;

import com.zts.xtp.common.enums.MarketType;
import com.zts.xtp.common.enums.PositionDirectionType;

public class StockPositionResponse {
    /**
     * 证券代码
     */
    private String ticker;
    /**
     * 证券名称
     */
    private String tickerName;
    /**
     * 交易市场
     */
    private MarketType marketType;
    /**
     * 总持仓
     */
    private long totalQty;
    /**
     * 可卖持仓
     */
    private long sellableQty;
    /**
     * 持仓成本
     */
    private double avgPrice;
    /**
     * 浮动盈亏
     */
    private double unrealizedPnl;
    /**
     * 昨日持仓
     */
    private long yesterdayPosition;
    /**
     * 今日申购赎回数量
     */
    private long purchaseRedeemableQty;
    /**
     * 持仓方向
     */
    private PositionDirectionType positionDirectionType;
    /**
     * 保留字段1
     */
    private int reserved1;
    /**
     * 可行权合约
     */
    private long executableOption;
    /**
     * 可锁定标的
     */
    private long lockablePosition;
    /**
     * 可行权标的
     */
    private long executableUnderlying;
    /**
     * 已锁定标的
     */
    private long lockedPosition;
    /**
     * 可用已锁定标的
     */
    private long usableLockedPosition;
    /**
     * 保留字段
     */
    private long unknown;
    /**
     * 此消息响应函数对应的请求ID
     */
    private int requestId;
    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    private boolean lastResp;

    public void setMarketType(int type) {
        marketType = MarketType.values()[type];
    }

    public void setPositionDirectionType(int type) {
        positionDirectionType = PositionDirectionType.values()[type];
    }


    @SuppressWarnings("all")
    public static class StockPositionResponseBuilder {
        @SuppressWarnings("all")
        private String ticker;
        @SuppressWarnings("all")
        private String tickerName;
        @SuppressWarnings("all")
        private MarketType marketType;
        @SuppressWarnings("all")
        private long totalQty;
        @SuppressWarnings("all")
        private long sellableQty;
        @SuppressWarnings("all")
        private double avgPrice;
        @SuppressWarnings("all")
        private double unrealizedPnl;
        @SuppressWarnings("all")
        private long yesterdayPosition;
        @SuppressWarnings("all")
        private long purchaseRedeemableQty;
        @SuppressWarnings("all")
        private PositionDirectionType positionDirectionType;
        @SuppressWarnings("all")
        private int reserved1;
        @SuppressWarnings("all")
        private long executableOption;
        @SuppressWarnings("all")
        private long lockablePosition;
        @SuppressWarnings("all")
        private long executableUnderlying;
        @SuppressWarnings("all")
        private long lockedPosition;
        @SuppressWarnings("all")
        private long usableLockedPosition;
        @SuppressWarnings("all")
        private long unknown;
        @SuppressWarnings("all")
        private int requestId;
        @SuppressWarnings("all")
        private boolean lastResp;

        @SuppressWarnings("all")
        StockPositionResponseBuilder() {
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder ticker(final String ticker) {
            this.ticker = ticker;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder tickerName(final String tickerName) {
            this.tickerName = tickerName;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder marketType(final MarketType marketType) {
            this.marketType = marketType;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder totalQty(final long totalQty) {
            this.totalQty = totalQty;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder sellableQty(final long sellableQty) {
            this.sellableQty = sellableQty;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder avgPrice(final double avgPrice) {
            this.avgPrice = avgPrice;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder unrealizedPnl(final double unrealizedPnl) {
            this.unrealizedPnl = unrealizedPnl;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder yesterdayPosition(final long yesterdayPosition) {
            this.yesterdayPosition = yesterdayPosition;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder purchaseRedeemableQty(final long purchaseRedeemableQty) {
            this.purchaseRedeemableQty = purchaseRedeemableQty;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder positionDirectionType(final PositionDirectionType positionDirectionType) {
            this.positionDirectionType = positionDirectionType;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder reserved1(final int reserved1) {
            this.reserved1 = reserved1;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder executableOption(final long executableOption) {
            this.executableOption = executableOption;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder lockablePosition(final long lockablePosition) {
            this.lockablePosition = lockablePosition;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder executableUnderlying(final long executableUnderlying) {
            this.executableUnderlying = executableUnderlying;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder lockedPosition(final long lockedPosition) {
            this.lockedPosition = lockedPosition;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder usableLockedPosition(final long usableLockedPosition) {
            this.usableLockedPosition = usableLockedPosition;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder unknown(final long unknown) {
            this.unknown = unknown;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder requestId(final int requestId) {
            this.requestId = requestId;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponseBuilder lastResp(final boolean lastResp) {
            this.lastResp = lastResp;
            return this;
        }

        @SuppressWarnings("all")
        public StockPositionResponse build() {
            return new StockPositionResponse(ticker, tickerName, marketType, totalQty, sellableQty, avgPrice, unrealizedPnl, yesterdayPosition, purchaseRedeemableQty, positionDirectionType, reserved1, executableOption, lockablePosition, executableUnderlying, lockedPosition, usableLockedPosition, unknown, requestId, lastResp);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "StockPositionResponse.StockPositionResponseBuilder(ticker=" + this.ticker + ", tickerName=" + this.tickerName + ", marketType=" + this.marketType + ", totalQty=" + this.totalQty + ", sellableQty=" + this.sellableQty + ", avgPrice=" + this.avgPrice + ", unrealizedPnl=" + this.unrealizedPnl + ", yesterdayPosition=" + this.yesterdayPosition + ", purchaseRedeemableQty=" + this.purchaseRedeemableQty + ", positionDirectionType=" + this.positionDirectionType + ", reserved1=" + this.reserved1 + ", executableOption=" + this.executableOption + ", lockablePosition=" + this.lockablePosition + ", executableUnderlying=" + this.executableUnderlying + ", lockedPosition=" + this.lockedPosition + ", usableLockedPosition=" + this.usableLockedPosition + ", unknown=" + this.unknown + ", requestId=" + this.requestId + ", lastResp=" + this.lastResp + ")";
        }
    }

    @SuppressWarnings("all")
    public static StockPositionResponseBuilder builder() {
        return new StockPositionResponseBuilder();
    }

    /**
     * 证券代码
     */
    @SuppressWarnings("all")
    public String getTicker() {
        return this.ticker;
    }

    /**
     * 证券名称
     */
    @SuppressWarnings("all")
    public String getTickerName() {
        return this.tickerName;
    }

    /**
     * 交易市场
     */
    @SuppressWarnings("all")
    public MarketType getMarketType() {
        return this.marketType;
    }

    /**
     * 总持仓
     */
    @SuppressWarnings("all")
    public long getTotalQty() {
        return this.totalQty;
    }

    /**
     * 可卖持仓
     */
    @SuppressWarnings("all")
    public long getSellableQty() {
        return this.sellableQty;
    }

    /**
     * 持仓成本
     */
    @SuppressWarnings("all")
    public double getAvgPrice() {
        return this.avgPrice;
    }

    /**
     * 浮动盈亏
     */
    @SuppressWarnings("all")
    public double getUnrealizedPnl() {
        return this.unrealizedPnl;
    }

    /**
     * 昨日持仓
     */
    @SuppressWarnings("all")
    public long getYesterdayPosition() {
        return this.yesterdayPosition;
    }

    /**
     * 今日申购赎回数量
     */
    @SuppressWarnings("all")
    public long getPurchaseRedeemableQty() {
        return this.purchaseRedeemableQty;
    }

    /**
     * 持仓方向
     */
    @SuppressWarnings("all")
    public PositionDirectionType getPositionDirectionType() {
        return this.positionDirectionType;
    }

    /**
     * 保留字段1
     */
    @SuppressWarnings("all")
    public int getReserved1() {
        return this.reserved1;
    }

    /**
     * 可行权合约
     */
    @SuppressWarnings("all")
    public long getExecutableOption() {
        return this.executableOption;
    }

    /**
     * 可锁定标的
     */
    @SuppressWarnings("all")
    public long getLockablePosition() {
        return this.lockablePosition;
    }

    /**
     * 可行权标的
     */
    @SuppressWarnings("all")
    public long getExecutableUnderlying() {
        return this.executableUnderlying;
    }

    /**
     * 已锁定标的
     */
    @SuppressWarnings("all")
    public long getLockedPosition() {
        return this.lockedPosition;
    }

    /**
     * 可用已锁定标的
     */
    @SuppressWarnings("all")
    public long getUsableLockedPosition() {
        return this.usableLockedPosition;
    }

    /**
     * 保留字段
     */
    @SuppressWarnings("all")
    public long getUnknown() {
        return this.unknown;
    }

    /**
     * 此消息响应函数对应的请求ID
     */
    @SuppressWarnings("all")
    public int getRequestId() {
        return this.requestId;
    }

    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    @SuppressWarnings("all")
    public boolean isLastResp() {
        return this.lastResp;
    }

    /**
     * 证券代码
     */
    @SuppressWarnings("all")
    public void setTicker(final String ticker) {
        this.ticker = ticker;
    }

    /**
     * 证券名称
     */
    @SuppressWarnings("all")
    public void setTickerName(final String tickerName) {
        this.tickerName = tickerName;
    }

    /**
     * 总持仓
     */
    @SuppressWarnings("all")
    public void setTotalQty(final long totalQty) {
        this.totalQty = totalQty;
    }

    /**
     * 可卖持仓
     */
    @SuppressWarnings("all")
    public void setSellableQty(final long sellableQty) {
        this.sellableQty = sellableQty;
    }

    /**
     * 持仓成本
     */
    @SuppressWarnings("all")
    public void setAvgPrice(final double avgPrice) {
        this.avgPrice = avgPrice;
    }

    /**
     * 浮动盈亏
     */
    @SuppressWarnings("all")
    public void setUnrealizedPnl(final double unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    /**
     * 昨日持仓
     */
    @SuppressWarnings("all")
    public void setYesterdayPosition(final long yesterdayPosition) {
        this.yesterdayPosition = yesterdayPosition;
    }

    /**
     * 今日申购赎回数量
     */
    @SuppressWarnings("all")
    public void setPurchaseRedeemableQty(final long purchaseRedeemableQty) {
        this.purchaseRedeemableQty = purchaseRedeemableQty;
    }

    /**
     * 保留字段1
     */
    @SuppressWarnings("all")
    public void setReserved1(final int reserved1) {
        this.reserved1 = reserved1;
    }

    /**
     * 可行权合约
     */
    @SuppressWarnings("all")
    public void setExecutableOption(final long executableOption) {
        this.executableOption = executableOption;
    }

    /**
     * 可锁定标的
     */
    @SuppressWarnings("all")
    public void setLockablePosition(final long lockablePosition) {
        this.lockablePosition = lockablePosition;
    }

    /**
     * 可行权标的
     */
    @SuppressWarnings("all")
    public void setExecutableUnderlying(final long executableUnderlying) {
        this.executableUnderlying = executableUnderlying;
    }

    /**
     * 已锁定标的
     */
    @SuppressWarnings("all")
    public void setLockedPosition(final long lockedPosition) {
        this.lockedPosition = lockedPosition;
    }

    /**
     * 可用已锁定标的
     */
    @SuppressWarnings("all")
    public void setUsableLockedPosition(final long usableLockedPosition) {
        this.usableLockedPosition = usableLockedPosition;
    }

    /**
     * 保留字段
     */
    @SuppressWarnings("all")
    public void setUnknown(final long unknown) {
        this.unknown = unknown;
    }

    /**
     * 此消息响应函数对应的请求ID
     */
    @SuppressWarnings("all")
    public void setRequestId(final int requestId) {
        this.requestId = requestId;
    }

    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    @SuppressWarnings("all")
    public void setLastResp(final boolean lastResp) {
        this.lastResp = lastResp;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "StockPositionResponse(ticker=" + this.getTicker() + ", tickerName=" + this.getTickerName() + ", marketType=" + this.getMarketType() + ", totalQty=" + this.getTotalQty() + ", sellableQty=" + this.getSellableQty() + ", avgPrice=" + this.getAvgPrice() + ", unrealizedPnl=" + this.getUnrealizedPnl() + ", yesterdayPosition=" + this.getYesterdayPosition() + ", purchaseRedeemableQty=" + this.getPurchaseRedeemableQty() + ", positionDirectionType=" + this.getPositionDirectionType() + ", reserved1=" + this.getReserved1() + ", executableOption=" + this.getExecutableOption() + ", lockablePosition=" + this.getLockablePosition() + ", executableUnderlying=" + this.getExecutableUnderlying() + ", lockedPosition=" + this.getLockedPosition() + ", usableLockedPosition=" + this.getUsableLockedPosition() + ", unknown=" + this.getUnknown() + ", requestId=" + this.getRequestId() + ", lastResp=" + this.isLastResp() + ")";
    }

    @SuppressWarnings("all")
    public StockPositionResponse() {
    }

    @SuppressWarnings("all")
    public StockPositionResponse(final String ticker, final String tickerName, final MarketType marketType, final long totalQty, final long sellableQty, final double avgPrice, final double unrealizedPnl, final long yesterdayPosition, final long purchaseRedeemableQty, final PositionDirectionType positionDirectionType, final int reserved1, final long executableOption, final long lockablePosition, final long executableUnderlying, final long lockedPosition, final long usableLockedPosition, final long unknown, final int requestId, final boolean lastResp) {
        this.ticker = ticker;
        this.tickerName = tickerName;
        this.marketType = marketType;
        this.totalQty = totalQty;
        this.sellableQty = sellableQty;
        this.avgPrice = avgPrice;
        this.unrealizedPnl = unrealizedPnl;
        this.yesterdayPosition = yesterdayPosition;
        this.purchaseRedeemableQty = purchaseRedeemableQty;
        this.positionDirectionType = positionDirectionType;
        this.reserved1 = reserved1;
        this.executableOption = executableOption;
        this.lockablePosition = lockablePosition;
        this.executableUnderlying = executableUnderlying;
        this.lockedPosition = lockedPosition;
        this.usableLockedPosition = usableLockedPosition;
        this.unknown = unknown;
        this.requestId = requestId;
        this.lastResp = lastResp;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StockPositionResponse)) return false;
        final StockPositionResponse other = (StockPositionResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$ticker = this.getTicker();
        final Object other$ticker = other.getTicker();
        if (this$ticker == null ? other$ticker != null : !this$ticker.equals(other$ticker)) return false;
        final Object this$marketType = this.getMarketType();
        final Object other$marketType = other.getMarketType();
        if (this$marketType == null ? other$marketType != null : !this$marketType.equals(other$marketType)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof StockPositionResponse;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $ticker = this.getTicker();
        result = result * PRIME + ($ticker == null ? 43 : $ticker.hashCode());
        final Object $marketType = this.getMarketType();
        result = result * PRIME + ($marketType == null ? 43 : $marketType.hashCode());
        return result;
    }
}
