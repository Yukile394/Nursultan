package minecraft;

import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import io.netty.channel.ChannelHandlerContext;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import net.fabricmc.fabric.impl.networking.FabricCustomPayloadPacketCodec;
import net.fabricmc.fabric.impl.networking.GenericPayloadAccessor;
import net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl;
import net.fabricmc.fabric.impl.networking.splitter.FabricPacketSplitter;
import net.fabricmc.fabric.impl.networking.splitter.SplittablePacket;
import net.fabricmc.fabric.mixin.attachment.ServerboundCustomPayloadPacketAccessor;

public record class00559(class01659 payload) implements class00381<class01652>, GenericPayloadAccessor, SplittablePacket, ServerboundCustomPayloadPacketAccessor {
   public static final int N = 32767;
   public static final class02362<class00667, class00559> y;

   public class00559(class01659 payload) {
      this.payload = payload;
   }

   static {
      class01637 class01637x = var0x -> class01638.N(var0x, 32767);
      List list = class07536.N(Lists.newArrayList(new class01668[]{new class01668<>(class01644.y, class01644.N)}), var0x -> {});
      class01637 class01637x = class01637x;
      y = N(class01637x, list, var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 2, "[net.minecraft.class_8710$class_9153, java.util.List]");
         return class01659.N((class01637)var0x[0], (List)var0x[1]);
      }).N_10(class00559::new, class00559::N);
   }

   private static class02362 N(class01637 var0, List var1, Operation var2) {
      class02362 class02362 = (class02362)var2.call(new Object[]{var0, var1});
      ((FabricCustomPayloadPacketCodec)class02362)
         .fabric_setPacketCodecProvider(
            (var0x, var1x) -> var0x instanceof class04247 ? PayloadTypeRegistryImpl.PLAY_C2S.get(var1x) : PayloadTypeRegistryImpl.CONFIGURATION_C2S.get(var1x)
         );
      return class02362;
   }

   public class01659 N() {
      return this.payload;
   }

   public void method_65081(class01652 var1) {
      var1.method_52392(this);
   }

   @Override
   public class02897<class00559> method_65080() {
      return class02885.P;
   }

   public void fabric_split(PayloadTypeRegistryImpl var1, ChannelHandlerContext var2, class00657 var3, class00381 var4, Consumer var5) throws Exception {
      int i = var1.getMaxPacketSize(this.payload.method_56479().N());
      if (i == -1) {
         var5.accept(this);
      } else {
         FabricPacketSplitter.genericPacketSplitter(this.payload.method_56479().N(), var2, var3, var4, class00559::new, var5, 32767, i);
      }
   }

   public class01659 fabric_payload() {
      return this.payload;
   }
}
