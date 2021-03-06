// Generated by delombok at Sun Sep 22 21:37:45 CST 2019
package com.zts.xtp.trade.model.request;

public class OrderQueryRequest {
    /**
     * 证券代码，可以为空，如果为空，则默认查询时间段内的所有成交回报
     */
    private String ticker;
    /**
     * 格式为YYYYMMDDHHMMSSsss，为0则默认当前交易日0点
     */
    private long beginTime;
    /**
     * 格式为YYYYMMDDHHMMSSsss，为0则默认当前时间
     */
    private long endTime;


    @SuppressWarnings("all")
    public static class OrderQueryRequestBuilder {
        @SuppressWarnings("all")
        private String ticker;
        @SuppressWarnings("all")
        private long beginTime;
        @SuppressWarnings("all")
        private long endTime;

        @SuppressWarnings("all")
        OrderQueryRequestBuilder() {
        }

        @SuppressWarnings("all")
        public OrderQueryRequestBuilder ticker(final String ticker) {
            this.ticker = ticker;
            return this;
        }

        @SuppressWarnings("all")
        public OrderQueryRequestBuilder beginTime(final long beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        @SuppressWarnings("all")
        public OrderQueryRequestBuilder endTime(final long endTime) {
            this.endTime = endTime;
            return this;
        }

        @SuppressWarnings("all")
        public OrderQueryRequest build() {
            return new OrderQueryRequest(ticker, beginTime, endTime);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "OrderQueryRequest.OrderQueryRequestBuilder(ticker=" + this.ticker + ", beginTime=" + this.beginTime + ", endTime=" + this.endTime + ")";
        }
    }

    @SuppressWarnings("all")
    public static OrderQueryRequestBuilder builder() {
        return new OrderQueryRequestBuilder();
    }

    /**
     * 证券代码，可以为空，如果为空，则默认查询时间段内的所有成交回报
     */
    @SuppressWarnings("all")
    public void setTicker(final String ticker) {
        this.ticker = ticker;
    }

    /**
     * 格式为YYYYMMDDHHMMSSsss，为0则默认当前交易日0点
     */
    @SuppressWarnings("all")
    public void setBeginTime(final long beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 格式为YYYYMMDDHHMMSSsss，为0则默认当前时间
     */
    @SuppressWarnings("all")
    public void setEndTime(final long endTime) {
        this.endTime = endTime;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "OrderQueryRequest(ticker=" + this.getTicker() + ", beginTime=" + this.getBeginTime() + ", endTime=" + this.getEndTime() + ")";
    }

    @SuppressWarnings("all")
    public OrderQueryRequest() {
    }

    @SuppressWarnings("all")
    public OrderQueryRequest(final String ticker, final long beginTime, final long endTime) {
        this.ticker = ticker;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderQueryRequest)) return false;
        final OrderQueryRequest other = (OrderQueryRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$ticker = this.getTicker();
        final Object other$ticker = other.getTicker();
        if (this$ticker == null ? other$ticker != null : !this$ticker.equals(other$ticker)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof OrderQueryRequest;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $ticker = this.getTicker();
        result = result * PRIME + ($ticker == null ? 43 : $ticker.hashCode());
        return result;
    }

    /**
     * 证券代码，可以为空，如果为空，则默认查询时间段内的所有成交回报
     */
    @SuppressWarnings("all")
    public String getTicker() {
        return this.ticker;
    }

    /**
     * 格式为YYYYMMDDHHMMSSsss，为0则默认当前交易日0点
     */
    @SuppressWarnings("all")
    public long getBeginTime() {
        return this.beginTime;
    }

    /**
     * 格式为YYYYMMDDHHMMSSsss，为0则默认当前时间
     */
    @SuppressWarnings("all")
    public long getEndTime() {
        return this.endTime;
    }
}
