package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import net.fabricmc.fabric.impl.object.builder.FabricTrackedDataRegistryImpl;
import net.fabricmc.fabric.mixin.object.builder.EntityDataSerializersAccessor;
import net.fabricmc.loader.api.FabricLoader;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02154 implements EntityDataSerializersAccessor {
   private static final class01199<class04383<?>> c = class01199.L(16);
   public static final class04383<Byte> N = class04383.N(class02389.L);
   public static final class04383<Integer> y = class04383.N(class02389.B);
   public static final class04383<Long> L = class04383.N(class02389.U);
   public static final class04383<Float> u = class04383.N(class02389.E);
   public static final class04383<String> i = class04383.N(class02389.s);
   public static final class04383<class00392> R = class04383.N(class03748.u);
   public static final class04383<Optional<class00392>> M = class04383.N(class03748.i);
   public static final class04383<class06584> B = new class01678();
   public static final class04383<class00500> Z = class04383.N(class02389.N(class00891.U));
   private static final class02362<ByteBuf, Optional<class00500>> X = new class03419();
   public static final class04383<Optional<class00500>> z = class04383.N(X);
   public static final class04383<Boolean> U = class04383.N(class02389.y);
   public static final class04383<class07126> E = class04383.N(class07107.yW);
   public static final class04383<List<class07126>> W = class04383.N(class07107.yW.N_33(class02389.N()));
   public static final class04383<class00744> m = class04383.N(class00744.i);
   public static final class04383<class07209> P = class04383.N(class07209.field_48404);
   public static final class04383<Optional<class07209>> s = class04383.N(class07209.field_48404.N_33(class02389::N));
   public static final class04383<class07211> T = class04383.N(class07211.field_48450);
   public static final class04383<Optional<class08372<class07438>>> b = class04383.N(class08372.y().N_33(class02389::N));
   public static final class04383<Optional<class06289>> j = class04383.N(class06289.L.N_33(class02389::N));
   public static final class04383<class05666> v = class04383.N(class05666.u);
   private static final class02362<ByteBuf, OptionalInt> a = new class04543();
   public static final class04383<OptionalInt> n = class04383.N(a);
   public static final class04383<class01312> t = class04383.N(class01312.field_48323);
   public static final class04383<class03556<class03648>> G = class04383.N(class03648.u);
   public static final class04383<class03556<class08423>> l = class04383.N(class08423.u);
   public static final class04383<class03556<class08403>> d = class04383.N(class08403.u);
   public static final class04383<class03556<class02505>> w = class04383.N(class02505.u);
   public static final class04383<class03556<class08519>> k = class04383.N(class08519.u);
   public static final class04383<class03556<class04068>> Y = class04383.N(class04068.u);
   public static final class04383<class03556<class08642>> Q = class04383.N(class08642.u);
   public static final class04383<class03556<class07589>> O = class04383.N(class07589.u);
   public static final class04383<class03556<class00693>> g = class04383.N(class00693.u);
   public static final class04383<class03829> I = class04383.N(class03829.field_48335);
   public static final class04383<class01972> J = class04383.N(class01972.field_48341);
   public static final class04383<class02774> o = class04383.N(class02774.field_61432);
   public static final class04383<class08979> q = class04383.N(class08979.field_61298);
   public static final class04383<Vector3fc> K = class04383.N(class02389.t);
   public static final class04383<Quaternionfc> V = class04383.N(class02389.G);
   public static final class04383<class02689> e = class04383.N(class02689.y);
   public static final class04383<class07070> H = class04383.N(class07070.field_64359);

   private class02154() {
      super();
   }

   public static int y(class04383<?> var0) {
      return c.N(var0);
   }

   private static void N(CallbackInfo var0) {
      FabricTrackedDataRegistryImpl.storeVanillaHandlers();
   }

   private static void N(class04383 var0, CallbackInfo var1) {
      if (FabricTrackedDataRegistryImpl.hasStoredVanillaHandlers() && FabricLoader.getInstance().isDevelopmentEnvironment()) {
         throw new IllegalStateException(
            "Tried to register tracked data handler "
               + var0
               + " using TrackedDataHandlerRegistry.register. This is not allowed as it can lead to desynchronization issues; use FabricTrackedDataRegistry.register instead."
         );
      }
   }

   public static void N(class04383<?> var0) {
      N(var0, null);
      c.u(var0);
   }

   @Nullable
   public static class04383<?> N(int var0) {
      return c.N(var0);
   }

   static {
      N(N);
      N(y);
      N(L);
      N(u);
      N(i);
      N(R);
      N(M);
      N(B);
      N(U);
      N(m);
      N(P);
      N(s);
      N(T);
      N(b);
      N(Z);
      N(z);
      N(E);
      N(W);
      N(v);
      N(n);
      N(t);
      N(G);
      N(d);
      N(w);
      N(k);
      N(Y);
      N(Q);
      N(l);
      N(O);
      N(j);
      N(g);
      N(J);
      N(I);
      N(q);
      N(o);
      N(K);
      N(V);
      N(e);
      N(H);
   }
}
