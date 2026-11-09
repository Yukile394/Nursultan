package minecraft;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.viaversion.viafabricplus.injection.access.base.bedrock.IEventLoopGroupHolder;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.IoHandlerFactory;
import io.netty.channel.MultiThreadIoEventLoopGroup;
import io.netty.channel.ServerChannel;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.kqueue.KQueue;
import io.netty.channel.kqueue.KQueueServerSocketChannel;
import io.netty.channel.kqueue.KQueueSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.util.concurrent.ThreadFactory;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class00606 implements IEventLoopGroupHolder {
   private static final class00606 N = new class00615("NIO", NioSocketChannel.class, NioServerSocketChannel.class);
   private static final class00606 y = new class06821("Epoll", EpollSocketChannel.class, EpollServerSocketChannel.class);
   private static final class00606 L = new class06855("Kqueue", KQueueSocketChannel.class, KQueueServerSocketChannel.class);
   private static final class00606 u = new class06819("Local", LocalChannel.class, LocalServerChannel.class);
   private final String i;
   private final Class<? extends Channel> R;
   private final Class<? extends ServerChannel> M;
   @Nullable
   private volatile EventLoopGroup B;
   private boolean Z = false;

   public EventLoopGroup L() {
      EventLoopGroup eventloopgroup = this.B;
      if (eventloopgroup == null) {
         synchronized (this) {
            eventloopgroup = this.B;
            if (eventloopgroup == null) {
               eventloopgroup = this.M();
               this.B = eventloopgroup;
            }
         }
      }

      return eventloopgroup;
   }

   private EventLoopGroup M() {
      return new MultiThreadIoEventLoopGroup(this.R(), this.y());
   }

   class00606(String var1, Class<? extends Channel> var2, Class<? extends ServerChannel> var3) {
      super();
      this.i = var1;
      this.R = var2;
      this.M = var3;
   }

   public Class<? extends ServerChannel> i() {
      return this.M;
   }

   public Class<? extends Channel> u() {
      return this.R;
   }

   protected abstract IoHandlerFactory y();

   private static void N(CallbackInfoReturnable var0) {
      ((IEventLoopGroupHolder)var0.getReturnValue()).viaFabricPlus$setConnecting(false);
   }

   public static class00606 N() {
      return u;
   }

   public static class00606 N(boolean var0) {
      if (var0) {
         if (KQueue.isAvailable()) {
            class00606 class00606xxxxx;
            class00606 class00606x = class00606xxxxx = L;
            CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, class00606xxxxx);
            N(callbackinforeturnable);
            return class00606x;
         }

         if (Epoll.isAvailable()) {
            class00606 class00606xxxx;
            class00606 class00606x = class00606xxxx = y;
            CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", false, class00606xxxx);
            N(callbackinforeturnable1);
            return class00606x;
         }
      }

      class00606 class00606xxx;
      class00606 class00606x = class00606xxx = N;
      CallbackInfoReturnable callbackinforeturnable2 = new CallbackInfoReturnable("", false, class00606xxx);
      N(callbackinforeturnable2);
      return class00606x;
   }

   private ThreadFactory R() {
      return new ThreadFactoryBuilder().setNameFormat("Netty " + this.i + " IO #%d").setDaemon(true).build();
   }

   public void viaFabricPlus$setConnecting(boolean var1) {
      this.Z = var1;
   }

   public boolean viaFabricPlus$isConnecting() {
      return this.Z;
   }
}
