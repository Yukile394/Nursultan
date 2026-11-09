package minecraft;

import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class class03041 {
   private static final Logger N = LogUtils.getLogger();

   public class03041() {
      super();
   }

   public static ChannelFutureListener N(Runnable var0) {
      return var1 -> {
         var0.run();
         if (!var1.isSuccess()) {
            var1.channel().pipeline().fireExceptionCaught(var1.cause());
         }
      };
   }

   public static ChannelFutureListener N(Supplier<class00381<?>> var0) {
      return var1 -> {
         if (!var1.isSuccess()) {
            class00381 class00381 = (class00381)var0.get();
            if (class00381 != null) {
               N.warn("Failed to deliver packet, sending fallback {}", class00381.method_65080(), var1.cause());
               var1.channel().writeAndFlush(class00381, var1.channel().voidPromise());
            } else {
               var1.channel().pipeline().fireExceptionCaught(var1.cause());
            }
         }
      };
   }
}
