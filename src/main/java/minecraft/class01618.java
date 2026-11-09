package minecraft;

import Nursultan.class09480;
import Nursultan.class09483;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.local.LocalAddress;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01618 {
   private static final Logger u = LogUtils.getLogger();
   public final class02796 N;
   public volatile boolean y;
   private final List<ChannelFuture> i = Collections.synchronizedList(Lists.newArrayList());
   public final List<class00642> L = Collections.synchronizedList(Lists.newArrayList());

   public void L() {
      synchronized (this.L) {
         Iterator<class00642> iterator = this.L.iterator();

         while (iterator.hasNext()) {
            class00642 class00642 = iterator.next();
            if (!class00642.method_10772()) {
               if (class00642.method_10758()) {
                  try {
                     class00642.method_10754();
                  } catch (Exception exception) {
                     if (class00642.method_10756()) {
                        throw new class07878(class07080.N(exception, "Ticking memory connection"));
                     }

                     u.warn("Failed to handle packet for {}", class00642.method_52909(this.N.NN()), exception);
                     class05216 class05216 = class00392.y("Internal server error");
                     class00642.method_10752(new class00501(class05216), class03041.N(() -> class00642.method_10747(class05216)));
                     class00642.method_10757();
                  }
               } else {
                  iterator.remove();
                  class00642.method_10768();
               }
            }
         }
      }
   }

   public class01618(class02796 var1) {
      super();
      this.N = var1;
      this.y = true;
   }

   public List<class00642> i() {
      return this.L;
   }

   public class02796 u() {
      return this.N;
   }

   public void y() {
      this.y = false;

      for (ChannelFuture channelfuture : this.i) {
         try {
            channelfuture.channel().close().sync();
         } catch (InterruptedException interruptedexception) {
            u.error("Interrupted whilst closing channel");
         }
      }
   }

   public SocketAddress N() {
      ChannelFuture channelfuture;
      synchronized (this.i) {
         channelfuture = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(class00606.N().i()))
               .childHandler(new class09483(this))
               .group(class00606.N().L())
               .localAddress(LocalAddress.ANY))
            .bind()
            .syncUninterruptibly();
         this.i.add(channelfuture);
      }

      return channelfuture.channel().localAddress();
   }

   public void N(@Nullable InetAddress var1, int var2) throws IOException {
      synchronized (this.i) {
         class00606 class00606 = class00606.N(this.N.E());
         this.i
            .add(
               ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(class00606.i()))
                     .childHandler(new class09480(this))
                     .group(class00606.L())
                     .localAddress(var1, var2))
                  .bind()
                  .syncUninterruptibly()
            );
      }
   }
}
