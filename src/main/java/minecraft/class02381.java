package minecraft;

import Nursultan.class09702;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.List;
import java.util.function.Function;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02381<B extends ByteBuf, V, T> implements class02362<B, V> {
   private static final int N = -1;
   private final Function<V, ? extends T> y;
   private final List<class02365<B, V, T>> L;
   private final Object2IntMap<T> u;

   class02381(Function<V, ? extends T> var1, List<class02365<B, V, T>> var2, Object2IntMap<T> var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   public void N(ByteBuf var1, Object var2, CallbackInfo var3, Object var4, Exception var5) {
      class01659 class01659 = null;
      if (var2 instanceof class00559) {
         class01659 = ((class00559)var2).N();
      } else if (var2 instanceof class00489) {
         class01659 = ((class00489)var2).N();
      }

      if (class01659 != null && class01659.method_56479() != null) {
         throw new EncoderException("Failed to encode packet '%s' (%s)".formatted(var4, class01659.method_56479().N().toString()), var5);
      }
   }

   public static <B extends ByteBuf, V, T> class02396<B, V, T> N(Function<V, ? extends T> var0) {
      return new class02396<>(var0);
   }

   public void encode(B var1, V var2) {
      Object object = this.y.apply((V)var2);
      int i = this.u.getOrDefault(object, -1);
      if (i == -1) {
         throw new EncoderException("Sending unknown packet '" + object + "'");
      } else {
         class01657.N(var1, i);
         class02365 class02365 = this.L.get(i);

         try {
            class02362 class02362 = class02365.N();
            class02362.encode((B)var1, (V)var2);
         } catch (Exception exception) {
            if (exception instanceof class09702) {
               throw exception;
            } else {
               this.N(var1, var2, null, object, exception);
               throw new EncoderException("Failed to encode packet '" + object + "'", exception);
            }
         }
      }
   }

   public V decode(B var1) {
      int i = class01657.N(var1);
      if (i >= 0 && i < this.L.size()) {
         class02365 class02365 = this.L.get(i);

         try {
            return class02365.N().decode((B)var1);
         } catch (Exception exception) {
            if (exception instanceof class09702) {
               throw exception;
            } else {
               throw new DecoderException("Failed to decode packet '" + class02365.y() + "'", exception);
            }
         }
      } else {
         throw new DecoderException("Received unknown packet id " + i);
      }
   }
}
