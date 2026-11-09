package minecraft;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import java.util.List;

class class04577 extends ChannelInitializer<Channel> {
   class04577(class04584 var1, class03420 var2, class04568 var3) {
      super();
      this.N = var2;
      this.y = var3;
   }

   protected void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException channelexception) {
      }

      var1.pipeline().addLast(new ChannelHandler[]{new class01849(this.N, (var1x, var2, var3x, var4, var5) -> {
         var0.N(class04579.field_47883);
         var0.B = class00392.y(var2);
         var0.u = class00392.y(var3x);
         var0.L = class04584.N(var4, var5);
         var0.i = new class07837(var5, var4, List.of());
      })});
   }
}
