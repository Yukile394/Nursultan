package minecraft;

import Nursultan.class10419;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.DataResult.Success;
import net.fabricmc.fabric.api.serialization.v1.view.FabricWriteView;
import org.jspecify.annotations.Nullable;

public class class08303 implements class08329, FabricWriteView {
   private final class04490 N;
   private final DynamicOps<class07709> y;
   private final class07001 L;

   @Override
   public void L(String var1) {
      this.L.b(var1);
   }

   public void putByteArray(String var1, byte[] var2) {
      this.L.N(var1, var2);
   }

   class08303(class04490 var1, DynamicOps<class07709> var2, class07001 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   private class04490 u(String var1) {
      return this.N.N_46(new class10419(var1));
   }

   @Override
   public class08289 y(String var1) {
      class07741 class07741 = new class07741();
      this.L.N(var1, class07741);
      return new class08328(var1, this.N, this.y, class07741);
   }

   public class07001 y() {
      return this.L;
   }

   @Override
   public <T> void y(String var1, Codec<T> var2, @Nullable T var3) {
      if (var3 != null) {
         this.N(var1, var2, var3);
      }
   }

   @Override
   public class08329 N(String var1) {
      class07001 class07001 = new class07001();
      this.L.N(var1, class07001);
      return new class08303(this.u(var1), this.y, class07001);
   }

   @Override
   public void N(String var1, String var2) {
      this.L.N_67(var1, var2);
   }

   @Override
   public void N(String var1, int[] var2) {
      this.L.N(var1, var2);
   }

   @Override
   public boolean N() {
      return this.L.z();
   }

   @Override
   public <T> class08294<T> N(String var1, Codec<T> var2) {
      class07741 class07741 = new class07741();
      this.L.N(var1, class07741);
      return new class08330<>(this.N, var1, this.y, var2, class07741);
   }

   @Override
   public void N(String var1, byte var2) {
      this.L.N(var1, var2);
   }

   @Override
   public void N(String var1, boolean var2) {
      this.L.N(var1, var2);
   }

   @Override
   public <T> void N(MapCodec<T> var1, T var2) {
      switch (var1.encoder().encodeStart(this.y, var2)) {
         case Success success:
            this.L.N((class07001)success.value());
            break;
         case Error error:
            this.N.N_47(new class08298(var2, error));
            error.partialValue().ifPresent(var1x -> this.L.N((class07001)var1x));
            break;
         default:
            throw new MatchException(null, null);
      }
   }

   @Override
   public <T> void N(String var1, Codec<T> var2, T var3) {
      switch (var2.encodeStart(this.y, var3)) {
         case Success success:
            this.L.N(var1, (class07709)success.value());
            break;
         case Error error:
            this.N.N_47(new class08321(var1, var3, error));
            error.partialValue().ifPresent(var2x -> this.L.N(var1, var2x));
            break;
         default:
            throw new MatchException(null, null);
      }
   }

   public static class08303 N(class04490 var0) {
      return new class08303(var0, class07713.N, new class07001());
   }

   public static class08303 N(class04490 var0, class01929 var1) {
      return new class08303(var0, var1.N(class07713.N), new class07001());
   }

   @Override
   public void N(String var1, double var2) {
      this.L.N(var1, var2);
   }

   @Override
   public void N(String var1, float var2) {
      this.L.N(var1, var2);
   }

   @Override
   public void N(String var1, long var2) {
      this.L.N(var1, var2);
   }

   @Override
   public void N(String var1, int var2) {
      this.L.N(var1, var2);
   }

   @Override
   public void N(String var1, short var2) {
      this.L.N(var1, var2);
   }

   public void putLongArray(String var1, long[] var2) {
      this.L.N(var1, var2);
   }
}
