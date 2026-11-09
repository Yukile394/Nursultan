package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00860 extends class05982<class00379> implements class06084 {
   public static final MapCodec<class00860> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04206.y.T().fieldOf("open_sound").forGetter(class00860::j), class04206.y.T().fieldOf("close_sound").forGetter(class00860::v), t())
         .apply(var0, (var0x, var1, var2) -> new class00860(() -> class00404.field_11914, var0x, var1, var2))
   );
   public static final class08064<class07211> u = class07101.R;
   public static final class08064<class06638> i = class06665.yB;
   public static final class06667 R = class06665.q;
   public static final int M = 1;
   private static final class00494 N = class00891.y(14.0, 0.0, 14.0);
   private static final Map<class07211, class00494> y = class00389.L(class00891.N(14.0, 0.0, 14.0, 0.0, 15.0));
   private final class04891 Z;
   private final class04891 O;
   private static final class06029<class00379, Optional<class06695>> F = new class00888();
   private static final class06029<class00379, Optional<class06237>> A = new class00861();
   private static final class00494 f;
   private static final Map C;

   public boolean L(class00500 var1) {
      return var1.N(this);
   }

   protected class04907<class01894> T() {
      return class01235.Z.y(class01235.NT);
   }

   public class00860(Supplier<class00404<? extends class00379>> var1, class04891 var2, class04891 var3, class01362 var4) {
      super(var4, var1);
      this.Z = var2;
      this.O = var3;
      this.P(this.Q.y().y(u, class07211.field_11043).y(i, class06638.field_12569).y(R, false));
   }

   public class00404<? extends class00379> b() {
      return this.B.get();
   }

   public class04891 v() {
      return this.O;
   }

   public class04891 j() {
      return this.Z;
   }

   public static class05992 U(class00500 var0) {
      class06638 class06638 = var0.L(i);
      if (class06638 == class06638.field_12569) {
         return class05992.field_21783;
      } else {
         return class06638 == class06638.field_12571 ? class05992.field_21784 : class05992.field_21785;
      }
   }

   @Override
   public class00494 z(class00500 var1) {
      if (!ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_2)
         && !ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         return super.z(var1);
      } else {
         return var1.L(i) == class06638.field_12569 ? N : y.get(E(var1));
      }
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(R) ? class04684.L.N(false) : super.u(var1);
   }

   public static class07209 y(class07209 var0, class00500 var1) {
      class07211 class07211 = E(var1);
      return var0.method_10093(class07211);
   }

   private static boolean y(class07284 var0, class07209 var1) {
      List list = var0.N(
         class07617.class,
         new class00734(
            var1.method_10263(), var1.method_10264() + 1, var1.method_10260(), var1.method_10263() + 1, var1.method_10264() + 2, var1.method_10260() + 1
         )
      );
      if (!list.isEmpty()) {
         Iterator iterator = list.iterator();

         while (iterator.hasNext()) {
            if (((class07617)iterator.next()).Ng()) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   private class07211 y(class07299 var1, class07209 var2, class07211 var3) {
      class00500 class00500 = var1.method_8320(var2.method_10093(var3));
      return this.L(class00500) && class00500.L(i) == class06638.field_12569 ? class00500.L(u) : null;
   }

   public static class07211 E(class00500 var0) {
      class07211 class07211 = var0.L(u);
      return var0.L(i) == class06638.field_12574 ? class07211.R() : class07211.M();
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(u, i, R);
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return class07482.L(N(this, var1, var2, var3, false));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(u, var2.N(var1.L(u)));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(u)));
   }

   @Override
   public MapCodec<? extends class00860> N() {
      return L;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_2)) {
         var5.setReturnValue(class00389.y());
      } else if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var5.setReturnValue(switch ((class06638)var1.L(i)) {
            case field_12569 -> f;
            case field_12574, field_12571 -> (class00494)C.get(E(var1));
         });
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      class00394 class00394 = var2.method_8321(var3);
      if (class00394 instanceof class00379) {
         ((class00379)class00394).u();
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class06704.N(var1, var2, var3);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var2 instanceof class04782 class04782) {
         class06237 class06237 = this.N(var1, var2, var3);
         if (class06237 != null) {
            var4.method_17355(class06237);
            var4.method_7259(this.T());
            class01514.N(class04782, var4, true);
         }
      }

      return class07082.N;
   }

   @Nullable
   public static class06695 N(class00860 var0, class00500 var1, class07299 var2, class07209 var3, boolean var4) {
      return var0.N(var1, var2, var3, var4).apply(F).orElse(null);
   }

   @Override
   public class06025<? extends class00379> N(class00500 var1, class07299 var2, class07209 var3, boolean var4) {
      BiPredicate bipredicate;
      if (var4) {
         bipredicate = (var0, var1x) -> false;
      } else {
         bipredicate = class00860::N;
      }

      return class05994.N(this.B.get(), class00860::U, class00860::E, u, var1, var2, var3, bipredicate);
   }

   @Override
   public class00500 N(class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8) {
      if (var1.L(R)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      if (this.L(var7) && var5.z().L()) {
         class06638 class06638 = var7.L(i);
         if (var1.L(i) == class06638.field_12569 && class06638 != class06638.field_12569 && var1.L(u) == var7.L(u) && E(var7) == var5.b()) {
            return var1.y(i, class06638.N());
         }
      } else if (E(var1) == var5) {
         return var1.y(i, class06638.field_12569);
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class00494)callbackinforeturnable.getReturnValue();
      } else {
         return switch ((class06638)var1.L(i)) {
            case field_12569 -> N;
            case field_12574, field_12571 -> (class00494)y.get(E(var1));
         };
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      class06638 class06638 = class06638.field_12569;
      class07211 class07211xx = var1.method_8042().b();
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      boolean flag = var1.method_8046();
      class07211 class07211x = var1.method_8038();
      if (class07211x.z().L() && flag) {
         class07211 class07211xx = this.y(var1.method_8045(), var1.method_8037(), class07211x.b());
         if (class07211xx != null && class07211xx.z() != class07211x.z()) {
            class07211xx = class07211xx;
            class06638 = class07211xx.M() == class07211x.b() ? class06638.field_12571 : class06638.field_12574;
         }
      }

      if (class06638 == class06638.field_12569 && !flag) {
         class06638 = this.N(var1.method_8045(), var1.method_8037(), class07211xx);
      }

      return this.W().y(u, class07211xx).y(i, class06638).y(R, class04688.N() == class04684.L);
   }

   protected class06638 N(class07299 var1, class07209 var2, class07211 var3) {
      if (var3 == this.y(var1, var2, var3.R())) {
         return class06638.field_12574;
      } else {
         return var3 == this.y(var1, var2, var3.M()) ? class06638.field_12571 : class06638.field_12569;
      }
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return var1.method_8608() ? N(var3, this.b(), class00379::N) : null;
   }

   public static boolean N(class07284 var0, class07209 var1) {
      return N((class07290)var0, var1) || y(var0, var1);
   }

   private static boolean N(class07290 var0, class07209 var1) {
      class07209 class07209 = var1.method_10084();
      return var0.method_8320(class07209).u(var0, class07209);
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class00379(var1, var2);
   }

   public static class06029<class00379, Float2FloatFunction> N(class07274 var0) {
      return new class00906(var0);
   }

   @Nullable
   @Override
   protected class06237 N(class00500 var1, class07299 var2, class07209 var3) {
      return this.N(var1, var2, var3, false).apply(A).orElse(null);
   }
}
