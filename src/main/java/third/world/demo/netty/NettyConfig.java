package third.world.demo.netty;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @program: realDream
 * @description: 存储整个工程的全局配置
 * @author: WangX
 * @create: 2018-10-29 23:18
 **/
public class NettyConfig {

    /**
     * 存储每一个客户端接入进来时的channel对象
     */
    public static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
