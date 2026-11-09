package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07267 extends class00394 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 90;
   private static final int L = 10;
   private static final boolean u = false;
   @Nullable
   private UUID i;
   private class03610 R;
   private class03610 M;
   private boolean B = false;

   public class03610 L() {
      return this.R;
   }

   private boolean L(class03610 var1) {
      if (var1 != this.R) {
         this.R = var1;
         this.E();
         return true;
      } else {
         return false;
      }
   }

   public int M() {
      return 90;
   }

   public class07267(class07209 var1, class00500 var2) {
      this(class00404.field_11911, var1, var2);
   }

   public class07267(class00404 var1, class07209 var2, class00500 var3) {
      super(var1, var2, var3);
      this.R = this.N();
      this.M = this.N();
   }

   public class07269 i() {
      return class07269.N(this);
   }

   @Nullable
   public UUID Z() {
      return this.i;
   }

   public class04891 U() {
      return class04909.In;
   }

   public boolean z() {
      return this.B;
   }

   public class03610 u() {
      return this.M;
   }

   private boolean y(class03610 var1) {
      if (var1 != this.M) {
         this.M = var1;
         this.E();
         return true;
      } else {
         return false;
      }
   }

   public boolean y(boolean var1) {
      if (this.B != var1) {
         this.B = var1;
         this.E();
         return true;
      } else {
         return false;
      }
   }

   public boolean y(UUID var1) {
      class08036 class08036 = this.z.N(var1);
      return class08036 == null || !class08036.method_56093(this.d(), 4.0);
   }

   private void E() {
      this.method_5431();
      this.z.method_8413(this.d(), this.w(), this.w(), 3);
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.u(var1);
   }

   public void N(@Nullable UUID var1) {
      this.i = var1;
   }

   private void N(class07267 var1, class07299 var2, UUID var3) {
      if (var1.y(var3)) {
         var1.N(null);
      }
   }

   public class03610 N(boolean var1) {
      return var1 ? this.R : this.M;
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class07267 var3) {
      UUID uuid = var3.Z();
      if (uuid != null) {
         var3.N(var3, var0, uuid);
      }
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.R = var1.<class03610>N("front_text", class03610.N).map(this::N).orElseGet(class03610::new);
      this.M = var1.<class03610>N("back_text", class03610.N).map(this::N).orElseGet(class03610::new);
      this.B = var1.N("is_waxed", false);
   }

   private class03610 N(class03610 var1) {
      for (int ix = 0; ix < 4; ix++) {
         class00392 class00392x = this.N(var1.N(ix, false));
         class00392 class00392x = this.N(var1.N(ix, true));
         var1 = var1.N(ix, class00392x, class00392x);
      }

      return (class03610)var1;
   }

   private class00392 N(class00392 var1) {
      if (this.z instanceof class04782 class04782) {
         try {
            return class00390.N(N(null, class04782, this.U), var1, null, 0);
         } catch (CommandSyntaxException commandsyntaxexception) {
         }
      }

      return var1;
   }

   public void N(class08036 var1, boolean var2, List<class06068> var3) {
      if (!this.z() && var1.method_5667().equals(this.Z()) && this.z != null) {
         this.N(var3x -> this.N(var1, var3, var3x), var2);
         this.N(null);
         this.z.method_8413(this.d(), this.w(), this.w(), 3);
      } else {
         N.warn("Player {} just tried to change non-editable sign", var1.method_74861());
      }
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.N("front_text", class03610.N, this.R);
      var1.N("back_text", class03610.N, this.M);
      var1.N("is_waxed", this.B);
   }

   protected class03610 N() {
      return new class03610();
   }

   public boolean N(class08036 var1) {
      if (this.w().i() instanceof class07036 class07036) {
         class06889 class06889 = class07036.T(this.w());
         double d0 = var1.method_23317() - (this.d().method_10263() + class06889.M);
         double d1 = var1.method_23321() - (this.d().method_10260() + class06889.Z);
         float f = class07036.U(this.w());
         float f1 = (float)(class04995.u(d1, d0) * 180.0F / (float)Math.PI) - 90.0F;
         return class04995.i(f, f1) <= 90.0F;
      } else {
         return false;
      }
   }

   private static class07701 N(@Nullable class08036 var0, class04782 var1, class07209 var2) {
      String s = var0 == null ? "Sign" : var0.method_74861();
      Object object = var0 == null ? class00392.y("Sign") : var0.method_5476();
      return new class07701(class07703.j_, class06889.y(var2), class07109.N, var1, class06984.L, s, (class00392)object, var1.method_8503(), var0);
   }

   public boolean N(class04782 var1, class08036 var2, class07209 var3, boolean var4) {
      boolean flag = false;
      class00392[] aclass00392 = this.N(var4).y(var2.method_33793());
      int ix = aclass00392.length;

      for (int j = 0; j < ix; j++) {
         switch (aclass00392[j].method_10866().Z()) {
            case class00625 class00625:
               var1.method_8503().yL().N(N(var2, var1, var3), class00625.y());
               flag = true;
               break;
            case class00626 class00626:
               var2.method_71753(class00626.y());
               flag = true;
               break;
            case class00669 class00669:
               var1.method_8503().N(class00669.y(), class00669.L());
               flag = true;
               break;
            case null:
            default:
         }
      }

      return flag;
   }

   public boolean N(boolean var1, class08036 var2) {
      return this.z() && this.N(var1).y(var2);
   }

   public boolean N(UnaryOperator<class03610> var1, boolean var2) {
      class03610 class03610 = this.N(var2);
      return this.N(var1.apply(class03610), var2);
   }

   private class03610 N(class08036 var1, List<class06068> var2, class03610 var3) {
      for (int ix = 0; ix < var2.size(); ix++) {
         class06068 class06068 = (class06068)var2.get(ix);
         class00405 class00405 = var3.N(ix, var1.method_33793()).method_10866();
         if (var1.method_33793()) {
            var3 = var3.N(ix, class00392.y(class06068.y()).y(class00405));
         } else {
            var3 = var3.N(ix, class00392.y(class06068.u()).y(class00405), class00392.y(class06068.y()).y(class00405));
         }
      }

      return var3;
   }

   public boolean N(class03610 var1, boolean var2) {
      return var2 ? this.L(var1) : this.y(var1);
   }

   public int R() {
      return 10;
   }
}
