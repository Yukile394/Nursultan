package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.jspecify.annotations.Nullable;

public abstract class class07760 extends class00891 implements class06084 {
   public static final class06667 N = class06665.q;
   private static final class00494 y = class00891.y(16.0, 0.0, 2.0);
   private static final class00494 L = class00891.y(16.0, 0.0, 8.0);
   private final boolean u;
   private static final class00494 i;
   private static final class00494 R;
   private static final class00494 M;

   public abstract class08092<class08080> L();

   public class07760(boolean var1, class01362 var2) {
      super(var2);
      this.u = var1;
   }

   public static boolean U(class00500 var0) {
      return var0.N(class01210.e) && var0.i() instanceof class07760;
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(N) ? class04684.L.N(false) : super.u(var1);
   }

   private class00494 u() {
      if (ProtocolTranslator.getTargetVersion().equalTo(ProtocolVersion.v1_10)) {
         return i;
      } else if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_9, ProtocolVersion.v1_9_3)) {
         return R;
      } else {
         return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) ? M : L;
      }
   }

   public boolean y() {
      return this.u;
   }

   protected class08080 N(class08080 var1, class06993 var2) {
      return switch (var2) {
         case field_11464 -> {
            switch (var1) {
               case field_12667:
                  yield class08080.field_12666;
               case field_12666:
                  yield class08080.field_12667;
               case field_12670:
                  yield class08080.field_12668;
               case field_12668:
                  yield class08080.field_12670;
               case field_12665:
                  yield class08080.field_12665;
               case field_12674:
                  yield class08080.field_12674;
               case field_12664:
                  yield class08080.field_12672;
               case field_12671:
                  yield class08080.field_12663;
               case field_12672:
                  yield class08080.field_12664;
               case field_12663:
                  yield class08080.field_12671;
               default:
                  throw new MatchException(null, null);
            }
         }
         case field_11465 -> {
            switch (var1) {
               case field_12667:
                  yield class08080.field_12670;
               case field_12666:
                  yield class08080.field_12668;
               case field_12670:
                  yield class08080.field_12666;
               case field_12668:
                  yield class08080.field_12667;
               case field_12665:
                  yield class08080.field_12674;
               case field_12674:
                  yield class08080.field_12665;
               case field_12664:
                  yield class08080.field_12663;
               case field_12671:
                  yield class08080.field_12664;
               case field_12672:
                  yield class08080.field_12671;
               case field_12663:
                  yield class08080.field_12672;
               default:
                  throw new MatchException(null, null);
            }
         }
         case field_11463 -> {
            switch (var1) {
               case field_12667:
                  yield class08080.field_12668;
               case field_12666:
                  yield class08080.field_12670;
               case field_12670:
                  yield class08080.field_12667;
               case field_12668:
                  yield class08080.field_12666;
               case field_12665:
                  yield class08080.field_12674;
               case field_12674:
                  yield class08080.field_12665;
               case field_12664:
                  yield class08080.field_12671;
               case field_12671:
                  yield class08080.field_12672;
               case field_12672:
                  yield class08080.field_12663;
               case field_12663:
                  yield class08080.field_12664;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> var1;
      };
   }

   @Override
   public class00500 N(class06942 var1) {
      boolean flag = var1.method_8045().method_8316(var1.method_8037()).N() == class04684.L;
      class00500 class00500 = super.W();
      class07211 class07211 = var1.method_8042();
      boolean flag1 = class07211 == class07211.field_11034 || class07211 == class07211.field_11039;
      return class00500.y(this.L(), flag1 ? class08080.field_12674 : class08080.field_12665).y(N, flag);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      if (!var4) {
         if (var1.L(this.L()).y()) {
            var2.method_8408(var3.method_10084(), this);
         }

         if (this.u) {
            var2.method_8408(var3, this);
            var2.method_8408(var3.method_10074(), this);
         }
      }
   }

   protected class08080 N(class08080 var1, class07111 var2) {
      return switch (var2) {
         case field_11300 -> {
            switch (var1) {
               case field_12670:
                  yield class08080.field_12668;
               case field_12668:
                  yield class08080.field_12670;
               case field_12665:
               case field_12674:
               default:
                  yield var1;
               case field_12664:
                  yield class08080.field_12663;
               case field_12671:
                  yield class08080.field_12672;
               case field_12672:
                  yield class08080.field_12671;
               case field_12663:
                  yield class08080.field_12664;
            }
         }
         case field_11301 -> {
            switch (var1) {
               case field_12667:
                  yield class08080.field_12666;
               case field_12666:
                  yield class08080.field_12667;
               case field_12670:
               case field_12668:
               case field_12665:
               case field_12674:
               default:
                  yield var1;
               case field_12664:
                  yield class08080.field_12671;
               case field_12671:
                  yield class08080.field_12664;
               case field_12672:
                  yield class08080.field_12663;
               case field_12663:
                  yield class08080.field_12672;
            }
         }
         default -> var1;
      };
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(N)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static boolean N(class07299 var0, class07209 var1) {
      return U(var0.method_8320(var1));
   }

   protected class00500 N(class00500 var1, class07299 var2, class07209 var3, boolean var4) {
      var1 = this.N(var2, var3, var1, true);
      if (this.u) {
         var2.method_41410(var1, var3, this, null, var4);
      }

      return var1;
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var4.N(var1.i())) {
         this.N(var1, var2, var3, var5);
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return var1.L(this.L()).y() ? this.u() : y;
   }

   @Override
   protected abstract MapCodec<? extends class07760> N();

   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4) {
   }

   protected class00500 N(class07299 var1, class07209 var2, class00500 var3, boolean var4) {
      if (var1.method_8608()) {
         return var3;
      } else {
         class08080 class08080 = var3.L(this.L());
         return new class06897(var1, var2, var3).N(var1.W(var2), var4, class08080).L();
      }
   }

   private static boolean N(class07209 var0, class07299 var1, class08080 var2) {
      if (!L(var1, var0.method_10074())) {
         return true;
      } else {
         switch (var2) {
            case field_12667:
               return !L(var1, var0.method_10078());
            case field_12666:
               return !L(var1, var0.method_10067());
            case field_12670:
               return !L(var1, var0.method_10095());
            case field_12668:
               return !L(var1, var0.method_10072());
            default:
               return false;
         }
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (!var2.method_8608() && var2.method_8320(var3).N(this)) {
         class08080 class08080 = var1.L(this.L());
         if (N(var3, var2, class08080)) {
            y(var1, var2, var3);
            var2.method_8650(var3, var6);
         } else {
            this.N(var1, var2, var3, var4);
         }
      }
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return L(var2, var3.method_10074());
   }
}
