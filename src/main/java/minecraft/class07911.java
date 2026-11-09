package minecraft;

import Nursultan.class10859;
import com.google.common.collect.Sets;
import com.google.common.net.HostAndPort;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.ssl.SslContext;
import java.net.InetSocketAddress;
import java.util.Set;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07911 {
   private static final Logger y = LogUtils.getLogger();
   private final HostAndPort L;
   public final class00448 N;
   @Nullable
   private Channel u;
   private final NioEventLoopGroup i;
   private final Set<class07934> R = Sets.newIdentityHashSet();

   public class07911(HostAndPort var1, class00448 var2) {
      super();
      this.L = var1;
      this.N = var2;
      this.i = new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Management server IO #%d").setDaemon(true).build());
   }

   public class07911(HostAndPort var1, class00448 var2, NioEventLoopGroup var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.i = var3;
   }

   public int y() {
      return this.u != null ? ((InetSocketAddress)this.u.localAddress()).getPort() : this.L.getPort();
   }

   private void y(class07393 var1, @Nullable SslContext var2) {
      class07932 class07932 = new class07932();
      ChannelFuture channelfuture = ((ServerBootstrap)((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().handler(new LoggingHandler(LogLevel.DEBUG)))
               .channel(NioServerSocketChannel.class))
            .childHandler(new class10859(this, var2, var1, class07932))
            .group(this.i)
            .localAddress(this.L.getHost(), this.L.getPort()))
         .bind();
      this.u = channelfuture.channel();
      channelfuture.syncUninterruptibly();
      y.info("Json-RPC Management connection listening on {}:{}", this.L.getHost(), this.y());
   }

   public void y(class07934 var1) {
      synchronized (this.R) {
         this.R.remove(var1);
      }
   }

   public void N() {
      this.N(class07934::N);
   }

   public void N(boolean var1) throws InterruptedException {
      if (this.u != null) {
         this.u.close().sync();
         this.u = null;
      }

      this.R.clear();
      if (var1) {
         this.i.shutdownGracefully().sync();
      }
   }

   void N(Consumer<class07934> var1) {
      synchronized (this.R) {
         this.R.forEach(var1);
      }
   }

   public void N(class07393 var1) {
      this.y(var1, null);
   }

   public void N(class07934 var1) {
      synchronized (this.R) {
         this.R.add(var1);
      }
   }

   public void N(class07393 var1, SslContext var2) {
      this.y(var1, var2);
   }
}
