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

public record class00489(class01659 payload) implements class00381<class01662>, GenericPayloadAccessor, SplittablePacket {
   public static final int N = 1048576;
   public static final class02362<class04247, class00489> y;
   public static final class02362<class00667, class00489> L;

   public class00489(class01659 payload) {
      super();
      this.payload = payload;
   }

   static {
      class01637 class01637x = var0x -> class01638.N(var0x, 1048576);
      List list = class07536.N(Lists.newArrayList(new class01668[]{new class01668<>(class01644.y, class01644.N)}), var0x -> {});
      class01637 class01637x = class01637x;
      y = N(class01637x, list, var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 2, "[net.minecraft.class_8710$class_9153, java.util.List]");
         return class01659.N((class01637)var0x[0], (List)var0x[1]);
      }).N_10(class00489::new, class00489::N);
      class01637x = var0x -> class01638.N(var0x, 1048576);
      list = List.of(new class01668<>(class01644.y, class01644.N));
      class01637x = class01637x;
      L = y(class01637x, list, var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 2, "[net.minecraft.class_8710$class_9153, java.util.List]");
         return class01659.N((class01637)var0x[0], (List)var0x[1]);
      }).N_10(class00489::new, class00489::N);
   }

   private static class02362 y(class01637 var0, List var1, Operation var2) {
      class02362 class02362 = (class02362)var2.call(new Object[]{var0, var1});
      ((FabricCustomPayloadPacketCodec)class02362).fabric_setPacketCodecProvider((var0x, var1x) -> PayloadTypeRegistryImpl.CONFIGURATION_S2C.get(var1x));
      return class02362;
   }

   private static class02362 N(class01637 var0, List var1, Operation var2) {
      class02362 class02362 = (class02362)var2.call(new Object[]{var0, var1});
      ((FabricCustomPayloadPacketCodec)class02362).fabric_setPacketCodecProvider((var0x, var1x) -> PayloadTypeRegistryImpl.PLAY_S2C.get(var1x));
      return class02362;
   }

   public void method_65081(class01662 var1) {
      var1.N(this);
   }

   public class01659 N() {
      return this.payload;
   }

   @Override
   public class02897<class00489> method_65080() {
      return class02885.y;
   }

   public void fabric_split(PayloadTypeRegistryImpl var1, ChannelHandlerContext var2, class00657 var3, class00381 var4, Consumer var5) throws Exception {
      int i = var1.getMaxPacketSize(this.payload.method_56479().N());
      if (i == -1) {
         var5.accept(this);
      } else {
         FabricPacketSplitter.genericPacketSplitter(this.payload.method_56479().N(), var2, var3, var4, class00489::new, var5, 1048576, i);
      }
   }

   public class01659 fabric_payload() {
      return this.payload;
   }
}
