package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public final class class02837 {
   public static final class02837 N = new class02837(new class07001());
   public static final Codec<class07001> y = Codec.withAlternative(class07001.N, class07755.i);
   public static final Codec<class02837> L = y.xmap(class02837::new, var0 -> var0.i);
   @Deprecated
   public static final class02362<ByteBuf, class02837> u = class02389.j.N_10(class02837::new, var0 -> var0.i);
   private final class07001 i;

   private class02837(class07001 var1) {
      super();
      this.i = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return var1 instanceof class02837 class02837 ? this.i.equals(class02837.i) : false;
      }
   }

   @Override
   public String toString() {
      return this.i.toString();
   }

   @Override
   public int hashCode() {
      return this.i.hashCode();
   }

   public boolean y(class07001 var1) {
      return class07717.N(var1, this.i, true);
   }

   public class07001 y() {
      return this.i.N();
   }

   public static void N(class02477<class02837> var0, class06584 var1, Consumer<class07001> var2) {
      class02837 class02837 = var1.a_(var0, N).N(var2);
      if (class02837.i.z()) {
         var1.y(var0);
      } else {
         var1.N(var0, class02837);
      }
   }

   public static void N(class02477<class02837> var0, class06584 var1, class07001 var2) {
      if (!var2.z()) {
         var1.N(var0, N(var2));
      } else {
         var1.y(var0);
      }
   }

   public class02837 N(Consumer<class07001> var1) {
      class07001 class07001 = this.i.N();
      var1.accept(class07001);
      return new class02837(class07001);
   }

   public boolean N() {
      return this.i.z();
   }

   public static class02837 N(class07001 var0) {
      return new class02837(var0.N());
   }
}
