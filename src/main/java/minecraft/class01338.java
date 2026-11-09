package minecraft;

import Nursultan.class09468;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01338 extends class00891 {
   public static final MapCodec<class01338> N = y(class01338::new);
   public static final int y = 0;
   public static final int L = 4;
   public static final class08071 u = class06665.yu;
   private static final ImmutableList<class00753> i = ImmutableList.of(
      new class00753(0, 0, -1),
      new class00753(-1, 0, 0),
      new class00753(0, 0, 1),
      new class00753(1, 0, 0),
      new class00753(-1, 0, -1),
      new class00753(1, 0, -1),
      new class00753(-1, 0, 1),
      new class00753(1, 0, 1)
   );
   private static final ImmutableList<class00753> R = new Builder()
      .addAll(i)
      .addAll(i.stream().map(class00753::method_23228).iterator())
      .addAll(i.stream().map(class00753::method_30931).iterator())
      .add(new class00753(0, 1, 0))
      .build();

   public class01338(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(u, 0));
   }

   private static boolean U(class00500 var0) {
      return var0.L(u) < 4;
   }

   public static int N(class00500 var0, int var1) {
      return class04995.y((var0.L(u) - 0) / 4.0F * var1);
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return N(var1, 15);
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(u);
   }

   private void N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5, CallbackInfoReturnable var6) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_9)
         && var6.getReturnValue() == class07082.L
         && !var2.method_75728().N(class00608.O, var3)) {
         var6.setReturnValue(class07082.N);
      }
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   private static Optional<class06889> N(class07078<?> var0, class07322 var1, class07209 var2, boolean var3) {
      class07218 class07218 = new class07218();
      UnmodifiableIterator<class00753> unmodifiableiterator = R.iterator();

      while (unmodifiableiterator.hasNext()) {
         class00753 class00753 = (class00753)unmodifiableiterator.next();
         class07218.N(var2).y(class00753);
         class06889 class06889 = class05188.N(var0, var1, class07218, var3);
         if (class06889 != null) {
            return Optional.of(class06889);
         }
      }

      return Optional.empty();
   }

   public static Optional<class06889> N(class07078<?> var0, class07322 var1, class07209 var2) {
      Optional<class06889> optional = N(var0, var1, var2, true);
      return optional.isPresent() ? optional : N(var0, var1, var2, false);
   }

   private static boolean N(class07209 var0, class07299 var1) {
      class04688 class04688 = var1.method_8316(var0);
      if (!class04688.N(class01231.N)) {
         return false;
      } else if (class04688.u()) {
         return true;
      } else {
         return class04688.R() < 2.0F ? false : !var1.method_8316(var0.method_10074()).N(class01231.N);
      }
   }

   private static boolean N(class06584 var0) {
      return var0.N(class06570.Mu);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var1.L(u) == 0) {
         class07051 class07051x;
         class07051 class07051x = class07051x = class07082.i;
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class07051x);
         this.N(var1, var2, var3, var4, var5, callbackinforeturnable);
         return (class07082)(callbackinforeturnable.isCancelled() ? (class07082)callbackinforeturnable.getReturnValue() : class07051x);
      } else if (var2 instanceof class04782 class04782) {
         if (!N(class04782, var3)) {
            this.N(var1, class04782, var3);
            class07041 class07041xxxxx;
            class07041 class07041x = class07041xxxxx = class07082.y;
            CallbackInfoReturnable callbackinforeturnable4 = new CallbackInfoReturnable("", true, class07041xxxxx);
            this.N(var1, var2, var3, var4, var5, callbackinforeturnable4);
            return (class07082)(callbackinforeturnable4.isCancelled() ? (class07082)callbackinforeturnable4.getReturnValue() : class07041x);
         } else {
            if (var4 instanceof class04770 class04770) {
               class04744 class04744x = class04770.method_67564();
               class04744 class04744x = new class04744(class05042.N(class04782.method_27983(), var3, 0.0F, 0.0F), false);
               if (class04744x == null || !class04744x.y(class04744x)) {
                  class04770.method_26284(class04744x, true);
                  class04782.method_43128(
                     null, var3.method_10263() + 0.5, var3.method_10264() + 0.5, var3.method_10260() + 0.5, class04909.dv, class04911.field_15245, 1.0F, 1.0F
                  );
                  class07041 class07041xxxxxx;
                  class07041 class07041x = class07041xxxxxx = class07082.y;
                  CallbackInfoReturnable callbackinforeturnable2 = new CallbackInfoReturnable("", true, class07041xxxxxx);
                  this.N(var1, var2, var3, var4, var5, callbackinforeturnable2);
                  return (class07082)(callbackinforeturnable2.isCancelled() ? (class07082)callbackinforeturnable2.getReturnValue() : class07041x);
               }
            }

            class07041 class07041x;
            class07041 class07041x = class07041x = class07082.L;
            CallbackInfoReturnable callbackinforeturnable3 = new CallbackInfoReturnable("", true, class07041x);
            this.N(var1, var2, var3, var4, var5, callbackinforeturnable3);
            return (class07082)(callbackinforeturnable3.isCancelled() ? (class07082)callbackinforeturnable3.getReturnValue() : class07041x);
         }
      } else {
         class07041 class07041xx;
         class07041 class07041x = class07041xx = class07082.L;
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true, class07041xx);
         this.N(var1, var2, var3, var4, var5, callbackinforeturnable1);
         return (class07082)(callbackinforeturnable1.isCancelled() ? (class07082)callbackinforeturnable1.getReturnValue() : class07041x);
      }
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (N(var1) && U(var2)) {
         N(var5, var3, var4, var2);
         var1.N(1, var5);
         return class07082.N;
      } else {
         return (class07082)(var6 == class07050.field_5808 && N(var5.method_5998(class07050.field_5810)) && U(var2) ? class07082.i : class07082.R);
      }
   }

   @Override
   public MapCodec<class01338> N() {
      return N;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var1.L(u) != 0) {
         if (var4.y(100) == 0) {
            var2.method_45446(var3, class04909.dT, class04911.field_15245, 1.0F, 1.0F, false);
         }

         double d0 = var3.method_10263() + 0.5 + (0.5 - var4.U());
         double d1 = var3.method_10264() + 1.0;
         double d2 = var3.method_10260() + 0.5 + (0.5 - var4.U());
         double d3 = var4.z() * 0.04;
         var2.method_8406(class07107.Ne, d0, d1, d2, 0.0, d3, 0.0);
      }
   }

   public static void N(@Nullable class07049 var0, class07299 var1, class07209 var2, class00500 var3) {
      class00500 class00500 = var3.y(u, var3.L(u) + 1);
      var1.method_8652(var2, class00500, 3);
      var1.N(class01194.L, var2, class01164.N(var0, class00500));
      var1.method_43128(
         null, var2.method_10263() + 0.5, var2.method_10264() + 0.5, var2.method_10260() + 0.5, class04909.db, class04911.field_15245, 1.0F, 1.0F
      );
   }

   public static boolean N(class04782 var0, class07209 var1) {
      return var0.method_75728().N(class00608.O, var1);
   }

   private void N(class00500 var1, class04782 var2, class07209 var3) {
      var2.method_8650(var3, false);
      boolean flag = class07221.field_11062.N().map(var3::method_10093).anyMatch(var1x -> N(var1x, var2))
         || var2.method_8316(var3.method_10084()).N(class01231.N);
      class09468 class09468 = new class09468(this, var3, flag);
      class06889 class06889 = var3.method_46558();
      var2.method_46407(null, var2.method_48963().N(class06889), class09468, class06889, 5.0F, true, class07328.field_40889);
   }
}
