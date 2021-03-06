// Generated by delombok at Sun Sep 22 21:37:45 CST 2019
package com.zts.xtp.quote.model.response;

/**
 * 逐笔成交
 *
 * @author roger on 2018/5/22
 */
public class TickByTickTradeResponse {
    /**
     * 频道代码
     */
    private int channelNo;
    /**
     * 委托序号(在同一个channel_no内唯一，从1开始连续)
     */
    private long seq;
    /**
     * 成交价格
     */
    private double price;
    /**
     * 成交量
     */
    private long qty;
    /**
     * 成交金额(仅适用上交所)
     */
    private double money;
    /**
     * 买方订单号
     */
    private long bidNo;
    /**
     * 卖方订单号
     */
    private long askNo;
    /**
     * SH: 内外盘标识('B':主动买; 'S':主动卖; 'N':未知) SZ: 成交标识('4':撤; 'F':成交)
     */
    private char tradeFlag;


    @SuppressWarnings("all")
    public static class TickByTickTradeResponseBuilder {
        @SuppressWarnings("all")
        private int channelNo;
        @SuppressWarnings("all")
        private long seq;
        @SuppressWarnings("all")
        private double price;
        @SuppressWarnings("all")
        private long qty;
        @SuppressWarnings("all")
        private double money;
        @SuppressWarnings("all")
        private long bidNo;
        @SuppressWarnings("all")
        private long askNo;
        @SuppressWarnings("all")
        private char tradeFlag;

        @SuppressWarnings("all")
        TickByTickTradeResponseBuilder() {
        }

        @SuppressWarnings("all")
        public TickByTickTradeResponseBuilder channelNo(final int channelNo) {
            this.channelNo = channelNo;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickTradeResponseBuilder seq(final long seq) {
            this.seq = seq;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickTradeResponseBuilder price(final double price) {
            this.price = price;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickTradeResponseBuilder qty(final long qty) {
            this.qty = qty;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickTradeResponseBuilder money(final double money) {
            this.money = money;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickTradeResponseBuilder bidNo(final long bidNo) {
            this.bidNo = bidNo;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickTradeResponseBuilder askNo(final long askNo) {
            this.askNo = askNo;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickTradeResponseBuilder tradeFlag(final char tradeFlag) {
            this.tradeFlag = tradeFlag;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickTradeResponse build() {
            return new TickByTickTradeResponse(channelNo, seq, price, qty, money, bidNo, askNo, tradeFlag);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "TickByTickTradeResponse.TickByTickTradeResponseBuilder(channelNo=" + this.channelNo + ", seq=" + this.seq + ", price=" + this.price + ", qty=" + this.qty + ", money=" + this.money + ", bidNo=" + this.bidNo + ", askNo=" + this.askNo + ", tradeFlag=" + this.tradeFlag + ")";
        }
    }

    @SuppressWarnings("all")
    public static TickByTickTradeResponseBuilder builder() {
        return new TickByTickTradeResponseBuilder();
    }

    /**
     * 频道代码
     */
    @SuppressWarnings("all")
    public int getChannelNo() {
        return this.channelNo;
    }

    /**
     * 委托序号(在同一个channel_no内唯一，从1开始连续)
     */
    @SuppressWarnings("all")
    public long getSeq() {
        return this.seq;
    }

    /**
     * 成交价格
     */
    @SuppressWarnings("all")
    public double getPrice() {
        return this.price;
    }

    /**
     * 成交量
     */
    @SuppressWarnings("all")
    public long getQty() {
        return this.qty;
    }

    /**
     * 成交金额(仅适用上交所)
     */
    @SuppressWarnings("all")
    public double getMoney() {
        return this.money;
    }

    /**
     * 买方订单号
     */
    @SuppressWarnings("all")
    public long getBidNo() {
        return this.bidNo;
    }

    /**
     * 卖方订单号
     */
    @SuppressWarnings("all")
    public long getAskNo() {
        return this.askNo;
    }

    /**
     * SH: 内外盘标识('B':主动买; 'S':主动卖; 'N':未知) SZ: 成交标识('4':撤; 'F':成交)
     */
    @SuppressWarnings("all")
    public char getTradeFlag() {
        return this.tradeFlag;
    }

    /**
     * 频道代码
     */
    @SuppressWarnings("all")
    public void setChannelNo(final int channelNo) {
        this.channelNo = channelNo;
    }

    /**
     * 委托序号(在同一个channel_no内唯一，从1开始连续)
     */
    @SuppressWarnings("all")
    public void setSeq(final long seq) {
        this.seq = seq;
    }

    /**
     * 成交价格
     */
    @SuppressWarnings("all")
    public void setPrice(final double price) {
        this.price = price;
    }

    /**
     * 成交量
     */
    @SuppressWarnings("all")
    public void setQty(final long qty) {
        this.qty = qty;
    }

    /**
     * 成交金额(仅适用上交所)
     */
    @SuppressWarnings("all")
    public void setMoney(final double money) {
        this.money = money;
    }

    /**
     * 买方订单号
     */
    @SuppressWarnings("all")
    public void setBidNo(final long bidNo) {
        this.bidNo = bidNo;
    }

    /**
     * 卖方订单号
     */
    @SuppressWarnings("all")
    public void setAskNo(final long askNo) {
        this.askNo = askNo;
    }

    /**
     * SH: 内外盘标识('B':主动买; 'S':主动卖; 'N':未知) SZ: 成交标识('4':撤; 'F':成交)
     */
    @SuppressWarnings("all")
    public void setTradeFlag(final char tradeFlag) {
        this.tradeFlag = tradeFlag;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "TickByTickTradeResponse(channelNo=" + this.getChannelNo() + ", seq=" + this.getSeq() + ", price=" + this.getPrice() + ", qty=" + this.getQty() + ", money=" + this.getMoney() + ", bidNo=" + this.getBidNo() + ", askNo=" + this.getAskNo() + ", tradeFlag=" + this.getTradeFlag() + ")";
    }

    @SuppressWarnings("all")
    public TickByTickTradeResponse() {
    }

    @SuppressWarnings("all")
    public TickByTickTradeResponse(final int channelNo, final long seq, final double price, final long qty, final double money, final long bidNo, final long askNo, final char tradeFlag) {
        this.channelNo = channelNo;
        this.seq = seq;
        this.price = price;
        this.qty = qty;
        this.money = money;
        this.bidNo = bidNo;
        this.askNo = askNo;
        this.tradeFlag = tradeFlag;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TickByTickTradeResponse)) return false;
        final TickByTickTradeResponse other = (TickByTickTradeResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getChannelNo() != other.getChannelNo()) return false;
        if (this.getSeq() != other.getSeq()) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof TickByTickTradeResponse;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getChannelNo();
        final long $seq = this.getSeq();
        result = result * PRIME + (int) ($seq >>> 32 ^ $seq);
        return result;
    }
}
