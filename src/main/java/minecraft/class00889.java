package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class00889 extends class07193 {
   public static final MapCodec<class00889> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01960.N.fieldOf("block_set_type").forGetter(var0x -> var0x.u),
            Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter(var0x -> var0x.i),
            t()
         )
         .apply(var0, class00889::new)
   );
   public static final class06667 y = class06665.k;
   private final class01960 u;
   private final int i;
   private final Function<class00500, class00494> M;

   protected void L(class00500 var1, class07299 var2, class07209 var3) {
      class08007 class08007 = this.u.i() ? var2.N(class08007.class, var1.R(var2, var3).method_1107().N(var3)).stream().findFirst().orElse(null) : null;
      boolean flag = class08007 != null;
      boolean flag1 = var1.L(y);
      if (flag != flag1) {
         var2.method_8652(var3, var1.y(y, flag), 3);
         this.u(var1, var2, var3);
         this.N(null, var2, var3, flag);
         var2.N(class08007, flag ? class01194.N : class01194.i, var3);
      }

      if (flag) {
         var2.N(new class07209(var3), this, this.i);
      }
   }

   public class00889(class01960 var1, int var2, class01362 var3) {
      super(var3.N(var1.M()));
      this.u = var1;
      this.P(this.Q.y().y(R, class07211.field_11043).y(y, false).y(L, class06657.field_12471));
      this.i = var2;
      this.M = this.y();
   }

   private void u(class00500 var1, class07299 var2, class07209 var3) {
      class07211 class07211 = U(var1).b();
      class02733 class02733 = class02752.N(var2, class07211, class07211.z().L() ? class07211.field_11036 : var1.L(R));
      var2.method_8452(var3, this, class02733);
      var2.method_8452(var3.method_10093(class07211), this, class02733);
   }

   private Function<class00500, class00494> y() {
      class00494 class00494x = class00891.N(14.0);
      class00494 class00494x = class00891.N(12.0);
      Map map = class00389.i(class00891.y(6.0, 4.0, 8.0, 16.0));
      return this.N(var3x -> class00389.N((class00494)((Map)map.get(var3x.L(L))).get(var3x.L(R)), var3x.L(y) ? class00494x : class00494, class07003.i));
   }

   @Override
   protected int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(y) && U(var1) == var4 ? 15 : 0;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var1.L(y)) {
         this.L(var1, var2, var3);
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (!var2.method_8608() && this.u.i() && !var1.L(y)) {
         this.L(var1, var2, var3);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R, y, L);
   }

   public void N(class00500 var1, class07299 var2, class07209 var3, @Nullable class08036 var4) {
      var2.method_8652(var3, var1.y(y, true), 3);
      this.u(var1, var2, var3);
      var2.N(var3, this, this.i);
      this.N(var4, var2, var3, true);
      var2.N(var4, class01194.N, var3);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class07307 var4, BiConsumer<class06584, class07209> var5) {
      if (var4.M() && !var1.L(y)) {
         this.N(var1, var2, var3, null);
      }

      super.N(var1, var2, var3, var4, var5);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var1.L(y)) {
         return class07082.L;
      } else {
         this.N(var1, var2, var3, var4);
         return class07082.N;
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.M.apply(var1);
   }

   @Override
   public MapCodec<class00889> N() {
      return N;
   }

   private boolean N(class07284 var1, class07049 var2, class07209 var3, class04891 var4, class04911 var5) {
      return !DebugSettings.INSTANCE.serversidePlaceSounds.isEnabled();
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(y) ? 15 : 0;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      if (!var4 && var1.L(y)) {
         this.u(var1, var2, var3);
      }
   }

   protected class04891 N(boolean var1) {
      return var1 ? this.u.P() : this.u.m();
   }

   protected void N(@Nullable class08036 var1, class07284 var2, class07209 var3, boolean var4) {
      class08036 class08036x = var4 ? var1 : null;
      class04891 class04891x = this.N(var4);
      class04911 class04911 = class04911.field_15245;
      class04891 class04891x = class04891x;
      class08036 class08036x = class08036x;
      if (this.N(var2, class08036x, var3, class04891x, class04911)) {
         var2.N(class08036x, var3, class04891x, class04911);
      }
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }
}
