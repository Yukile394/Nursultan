package minecraft;

import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import net.fabricmc.fabric.impl.networking.splitter.PassthroughPacket;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientSync;
import net.fabricmc.fabric.impl.recipe.ingredient.SupportedIngredientsClientConnection;
import net.fabricmc.fabric.mixin.networking.accessor.PacketEncoderAccessor;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00657<T extends class00638> extends MessageToByteEncoder<class00381<T>> implements PacketEncoderAccessor {
   private static final Logger N = LogUtils.getLogger();
   private final class04275<T> y;

   private void L(ChannelHandlerContext var1, class00381 var2, ByteBuf var3, CallbackInfo var4) {
      CustomIngredientSync.CURRENT_SUPPORTED_INGREDIENTS.set(null);
   }

   public class00657(class04275<T> var1) {
      super();
      this.y = var1;
   }

   private void y(ChannelHandlerContext var1, class00381 var2, ByteBuf var3, CallbackInfo var4) {
      ChannelHandler channelhandler = var1.pipeline().get("packet_handler");
      if (channelhandler instanceof SupportedIngredientsClientConnection) {
         CustomIngredientSync.CURRENT_SUPPORTED_INGREDIENTS.set(((SupportedIngredientsClientConnection)channelhandler).fabric_getSupportedCustomIngredients());
      }
   }

   private void N(ChannelHandlerContext var1, class00381 var2, ByteBuf var3, CallbackInfo var4) {
      if (var2 instanceof PassthroughPacket passthroughpacket) {
         var3.writeBytes(passthroughpacket.buf());
         var4.cancel();
      }
   }

   protected void encode(ChannelHandlerContext var1, class00381<T> var2, ByteBuf var3) throws Exception {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class02897 class02897 = var2.method_65080();

         try {
            class02362 class02362 = this.y.L();
            this.y(var1, var2, var3, null);
            class02362.encode(var3, var2);
            this.L(var1, var2, var3, null);
            int i = var3.readableBytes();
            if (N.isDebugEnabled()) {
               N.debug(class00642.field_36380, "OUT: [{}:{}] {} -> {} bytes", new Object[]{this.y.N().N(), class02897, var2.getClass().getName(), i});
            }

            class01834.M.y(this.y.N(), class02897, var1.channel().remoteAddress(), i);
         } catch (Throwable throwable) {
            N.error("Error sending packet {}", class02897, throwable);
            this.L(var1, var2, var3, null);
            if (var2.i()) {
               throw new class00636(throwable);
            }

            throw throwable;
         } finally {
            class01671.y(var1, var2);
         }
      }
   }
}
