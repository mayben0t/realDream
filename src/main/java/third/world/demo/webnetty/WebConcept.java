package third.world.demo.webnetty;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/10/31
 **/
public class WebConcept {

    /**
     *
     *
     *
     *
     *                   ________________________                                 __________________________
     *                  |                        |                               |                          |
     *                  |   <-----Inbound-----   |                               |   ---inbound------- >    |   ________
     *                  |   _____        ______  |                               |    _______      ____     |  |        |
     *      _______     |  |     |       |    |  |                               |    |     |     |    |    |  |        |
     *     |       |    |  |  ②  |       |  ③ |  |      ___________________      |    |  ⑤  |     |  ⑥ |    |  |        |
     *     |       |    |  |_____|       |____|  |     |                   |     |    |_____|     |____|    |  |        |
     *     |client |----|-------______-----------|-----|      network      |-----|--------------------------|--| server |
     *     |       |    |       |     |          |     |___________________|     |          ______          |  |        |
     *     |       |    |       |  ①  |          |                               |          |     |         |  |        |
     *     |       |    |       |_____|          |                               |          |  ④  |         |  |________|
     *     |       |    |                        |                               |          |_____|         |
     *     |_______|    |   -----Outbound--->    |                               |    <-----outbound----    |
     *                  |___ChannelPipeline______|                               |______ChannelPipeline_____|
     *
     *  ①：StringEncoder继承于MessageToMessageEncoder，而MessageToMessageEncoder又继承于ChannelOutboundHandlerAdapter
     *  ②：HelloWorldClientHandler.java
     *  ③：StringDecoder继承于MessageToMessageDecoder，而MessageToMessageDecoder又继承于ChannelInboundHandlerAdapter
     *  ④：StringEncoder 编码器
     *  ⑤：StringDecoder 解码器
     *  ⑥：HelloWorldServerHandler.java
     *
     *
     *
     */
}
