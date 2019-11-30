public class AuctionTest {
    private double initPrice = 30.0;

    public void bid(String bidPrice)
        throws AuctionException {
            double d = 0.0;
            try {
                d = Double.parseDouble(bidPrice);
            } catch (Exception e) {
                e.printStackTrace();
                throw new AuctionException("竞牌价必须是数值,不能包含其他字符");
            }
            if (initPrice > d) {
                throw new AuctionException("竞拍价格比起拍价低,不允许竞拍");
            }
            initPrice = d;
    }

    public static void main(String[] args) {
        AuctionTest at = new AuctionTest();
        try {
            at.bid("10");
        } catch (AuctionException ae) {
            System.out.println(ae.getMessage());
        }
    }
}
