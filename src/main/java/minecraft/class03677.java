package minecraft;

import Nursultan.class10226;
import Nursultan.class10227;
import Nursultan.class10229;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.List;
import java.util.Optional;
import jerozgen.languagereload.mixin.TextDisplayEntityAccessor;
import org.jspecify.annotations.Nullable;

public class class03677 extends class03688 implements TextDisplayEntityAccessor {
   public static final String s = "text";
   private static final String G = "line_width";
   private static final String l = "text_opacity";
   private static final String d = "background";
   private static final String w = "shadow";
   private static final String k = "see_through";
   private static final String Y = "default_background";
   private static final String Q = "alignment";
   public static final byte T = 1;
   public static final byte b = 2;
   public static final byte j = 4;
   public static final byte v = 8;
   public static final byte n = 16;
   private static final byte O = -1;
   public static final int t = 1073741824;
   private static final int g = 200;
   private static final class02131<class00392> I = class03289.N(class03677.class, class02154.R);
   private static final class02131<Integer> J = class03289.N(class03677.class, class02154.y);
   private static final class02131<Integer> o = class03289.N(class03677.class, class02154.y);
   private static final class02131<Byte> q = class03289.N(class03677.class, class02154.N);
   private static final class02131<Byte> K = class03289.N(class03677.class, class02154.N);
   private static final IntSet V = IntSet.of(new int[]{I.N(), J.N(), o.N(), q.N(), K.N()});
   @Nullable
   private class03663 e;
   @Nullable
   private class03681 H;

   public static class03684 L(byte var0) {
      if ((var0 & 8) != 0) {
         return class03684.field_42451;
      } else {
         return (var0 & 16) != 0 ? class03684.field_42452 : class03684.field_42450;
      }
   }

   public final int T() {
      return this.field_6011.N(J);
   }

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (V.contains(var1.N())) {
         this.P = true;
      }
   }

   @Override
   protected void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(I, class00392.i());
      var1.N(J, 200);
      var1.N(o, 1073741824);
      var1.N(q, (byte)-1);
      var1.N(K, (byte)0);
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("text", class03748.N, this.s());
      var1.N("line_width", this.T());
      var1.N("background", this.j());
      var1.N("text_opacity", this.b());
      byte b0 = this.v();
      N(b0, var1, "shadow", (byte)1);
      N(b0, var1, "see_through", (byte)2);
      N(b0, var1, "default_background", (byte)4);
      var1.N("alignment", class03684.field_42453, L(b0));
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.i(var1.N("line_width", 200));
      this.N(var1.N("text_opacity", (byte)-1));
      this.R(var1.N("background", 1073741824));
      byte b0 = N((byte)0, var1, "shadow", (byte)1);
      b0 = N(b0, var1, "see_through", (byte)2);
      b0 = N(b0, var1, "default_background", (byte)4);
      Optional<class03684> optional = var1.N("alignment", class03684.field_42453);
      if (optional.isPresent()) {
         b0 = switch ((class03684)optional.get()) {
            case field_42450 -> b0;
            case field_42451 -> (byte)(b0 | 8);
            case field_42452 -> (byte)(b0 | 16);
         };
      }

      this.y(b0);
      Optional<class00392> optional1 = var1.N("text", class03748.N);
      if (optional1.isPresent()) {
         try {
            if (this.method_73183() instanceof class04782 class04782) {
               class07701 class07701 = this.method_5671(class04782).N(class06984.L);
               class05216 class05216 = class00390.N(class07701, optional1.get(), this, 0);
               this.N(class05216);
            } else {
               this.N(class00392.i());
            }
         } catch (Exception exception) {
            class03688.N.warn("Failed to parse display entity text {}", optional1, exception);
         }
      }
   }

   public class03677(class07078<?> var1, class07299 var2) {
      super(var1, var2);
   }

   public final void i(int var1) {
      this.field_6011.N(J, var1);
   }

   public final byte b() {
      return this.field_6011.N(q);
   }

   public final class00392 s() {
      return this.field_6011.N(I);
   }

   @Nullable
   public class03681 n() {
      return this.H;
   }

   private class03681 t() {
      return new class03681(this.s(), this.T(), class03692.N(this.b()), class03692.N(this.j()), this.v());
   }

   public final byte v() {
      return this.field_6011.N(K);
   }

   public final int j() {
      return this.field_6011.N(o);
   }

   public final void y(byte var1) {
      this.field_6011.N(K, var1);
   }

   private class03681 N(class03681 var1, float var2) {
      int i = var1.u().method_48889(var2);
      int jx = var1.L().method_48889(var2);
      return new class03681(this.s(), this.T(), new class10226(jx, this.b()), new class10229(i, this.j()), this.v());
   }

   public class03663 N(class10227 var1) {
      if (this.e == null) {
         if (this.H != null) {
            this.e = var1.split(this.H.N(), this.H.y());
         } else {
            this.e = new class03663(List.of(), 0);
         }
      }

      return this.e;
   }

   public final void N(byte var1) {
      this.field_6011.N(q, var1);
   }

   public final void N(class00392 var1) {
      this.field_6011.N(I, var1);
   }

   private static byte N(byte var0, class08299 var1, String var2, byte var3) {
      return var1.N(var2, false) ? (byte)(var0 | var3) : var0;
   }

   @Override
   protected void N(boolean var1, float var2) {
      if (var1 && this.H != null) {
         this.H = this.N(this.H, var2);
      } else {
         this.H = this.t();
      }

      this.e = null;
   }

   private static void N(byte var0, class08329 var1, String var2, byte var3) {
      var1.N(var2, (var0 & var3) != 0);
   }

   public final void R(int var1) {
      this.field_6011.N(o, var1);
   }
}
