package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelOutboundHandler;

public class class04285 {
   public class04285() {
      super();
   }

   public static <T extends class00638> class02400 y(class04275<T> var0) {
      return N(new class00657(var0));
   }

   private static ChannelConfig N(ChannelConfig var0, boolean var1, Operation var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3) ? null : (ChannelConfig)var2.call(new Object[]{var0, var1});
   }

   private static class02400 N(ChannelOutboundHandler var0) {
      return var1 -> var1.pipeline().replace(var1.name(), "encoder", var0);
   }

   private static class02403 N(ChannelInboundHandler var0) {
      return var1 -> {
         var1.pipeline().replace(var1.name(), "decoder", var0);
         N(var1.channel().config(), true, var0xx -> {
            WrapOperationRuntime.checkArgumentCount(var0xx, 2, "[io.netty.channel.ChannelConfig, boolean]");
            return ((ChannelConfig)var0xx[0]).setAutoRead((Boolean)var0xx[1]);
         });
      };
   }

   public static <T extends class00638> class02403 N(class04275<T> var0) {
      return N(new class00658(var0));
   }
}
