package minecraft;

import Nursultan.class09481;
import com.google.common.collect.Lists;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.Timer;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class class01601 extends ChannelInboundHandlerAdapter {
   private static final Timer N = new HashedWheelTimer();
   private final int y;
   private final int L;
   private final List<class09481> u = Lists.newArrayList();

   public class01601(int var1, int var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   private void N(Timeout var1) {
      class09481 class09481 = this.u.remove(0);
      class09481.N.fireChannelRead(class09481.y);
   }

   private void N(ChannelHandlerContext var1, Object var2) {
      int i = this.y + (int)(Math.random() * this.L);
      this.u.add(new class09481(var1, var2));
      N.newTimeout(this::N, i, TimeUnit.MILLISECONDS);
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      this.N(var1, var2);
   }
}
