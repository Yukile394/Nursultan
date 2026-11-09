package minecraft;

import Nursultan.class09700;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelHandlerContext;

public interface class01671 {
   static void y(ChannelHandlerContext var0, class00381<?> var1) {
      if (var1.R()) {
         var0.pipeline().addAfter(var0.name(), "outbound_config", new class09700());
         var0.pipeline().remove(var0.name());
      }
   }

   private static ChannelConfig N(ChannelConfig var0, boolean var1, Operation var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3) ? null : (ChannelConfig)var2.call(new Object[]{var0, var1});
   }

   static void N(ChannelHandlerContext var0, class00381<?> var1) {
      if (var1.R()) {
         N(var0.channel().config(), false, var0x -> {
            WrapOperationRuntime.checkArgumentCount(var0x, 2, "[io.netty.channel.ChannelConfig, boolean]");
            return ((ChannelConfig)var0x[0]).setAutoRead((Boolean)var0x[1]);
         });
         var0.pipeline().addBefore(var0.name(), "inbound_config", new class02372());
         var0.pipeline().remove(var0.name());
      }
   }
}
