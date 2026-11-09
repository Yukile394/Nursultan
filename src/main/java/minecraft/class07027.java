package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class07027 extends class07796 {
   public static final MapCodec<class07027> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06563.field_41600.optionalFieldOf("color").forGetter(var0x -> Optional.ofNullable(var0x.i)), t())
         .apply(var0, (var0x, var1) -> new class07027((class06563)var0x.orElse(null), var1))
   );
   public static final Map<class07211, class00494> y = class00389.u(class00891.L(16.0, 0.0, 1.0));
   public static final class08064<class07211> L = class06760.y;
   public static final class01894 u = class01894.y("contents");
   @Nullable
   private final class06563 i;

   public class07027(@Nullable class06563 var1, class01362 var2) {
      super(var2);
      this.i = var1;
      this.P(this.Q.y().y(L, class07211.field_11036));
   }

   @Override
   protected class00494 u(class00500 var1, class07290 var2, class07209 var3) {
      class00394 class00394 = var2.method_8321(var3);
      return class00394 instanceof class07278 && !((class07278)class00394).U() ? y.get(var1.L(L).b()) : class00389.y();
   }

   public static class06584 y(@Nullable class06563 var0) {
      return new class06584(N(var0));
   }

   @Override
   protected boolean y(class00500 var1) {
      return false;
   }

   @Nullable
   public class06563 y() {
      return this.i;
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(L)));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(L, var2.N(var1.L(L)));
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class07278(this.i, var1, var2);
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return N(var3, class00404.field_11896, class07278::N);
   }

   public static class00891 N(@Nullable class06563 var0) {
      if (var0 == null) {
         return class00869.Ee;
      } else {
         return switch (var0) {
            case field_7952 -> class00869.EH;
            case field_7946 -> class00869.Ec;
            case field_7958 -> class00869.EX;
            case field_7951 -> class00869.Ea;
            case field_7947 -> class00869.Ep;
            case field_7961 -> class00869.EF;
            case field_7954 -> class00869.EA;
            case field_7944 -> class00869.Ef;
            case field_7967 -> class00869.EC;
            case field_7955 -> class00869.ES;
            case field_7966 -> class00869.ED;
            case field_7957 -> class00869.Eh;
            case field_7942 -> class00869.Er;
            case field_7964 -> class00869.WN;
            case field_7963 -> class00869.Wy;
            case field_7945 -> class00869.Ex;
         };
      }
   }

   @Override
   public MapCodec<class07027> N() {
      return N;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class06704.N(var1, var2, var3);
   }

   @Override
   protected List<class06584> N(class00500 var1, class04160 var2) {
      class00394 class00394 = var2.y(class06551.z);
      if (class00394 instanceof class07278 class07278) {
         var2 = var2.N(u, var1x -> {
            for (int ix = 0; ix < class07278.method_5439(); ix++) {
               var1x.accept(class07278.method_5438(ix));
            }
         });
      }

      return super.N(var1, var2);
   }

   @Override
   public class00500 N(class07299 var1, class07209 var2, class00500 var3, class08036 var4) {
      class00394 class00394 = var1.method_8321(var2);
      if (class00394 instanceof class07278 class07278) {
         if (!var1.method_8608() && var4.method_66324() && !class07278.method_5442()) {
            class06584 class06584 = y(this.y());
            class06584.y(class00394.g());
            class00717 class00717 = new class00717(var1, var2.method_10263() + 0.5, var2.method_10264() + 0.5, var2.method_10260() + 0.5, class06584);
            class00717.L();
            var1.method_8649(class00717);
         } else {
            class07278.y(var4);
         }
      }

      return super.N(var1, var2, var3, var4);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(L, var1.method_8038());
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return class07482.N(var2.method_8321(var3));
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var2 instanceof class04782 class04782 && var2.method_8321(var3) instanceof class07278 class07278 && N(var1, var2, var3, class07278)) {
         var4.method_17355(class07278);
         var4.method_7281(class01235.Nj);
         class01514.N(class04782, var4, true);
      }

      return class07082.N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      class00394 class00394 = var2.method_8321(var3);
      return class00394 instanceof class07278 ? class00389.N(((class07278)class00394).N(var1)) : class00389.y();
   }

   private static boolean N(class00500 var0, class07299 var1, class07209 var2, class07278 var3) {
      if (var3.u() != class07266.field_12065) {
         return true;
      } else {
         class00734 class00734 = class07144.N(1.0F, var0.L(L), 0.0F, 0.5F, var2.method_61082()).B(1.0E-6);
         return var1.y(class00734);
      }
   }
}
