package minecraft;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import jerozgen.languagereload.mixin.BookScreenAccessor;
import org.jspecify.annotations.Nullable;

public class class05671 extends class05096 implements BookScreenAccessor {
   public static final int N = 16;
   public static final int y = 36;
   public static final int L = 30;
   private static final int z = 256;
   private static final int U = 256;
   private static final class00392 E = class00392.L("book.view.title");
   private static final class00405 W = class00405.N.W().N(-16777216);
   public static final class06241 u = new class06241(List.of());
   public static final class01894 i = class01894.y("textures/gui/book.png");
   protected static final int R = 114;
   protected static final int M = 128;
   protected static final int B = 192;
   private static final int m = 148;
   protected static final int Z = 192;
   private static final int P = 157;
   private static final int s = 43;
   private static final int T = 116;
   private class06241 b;
   private int j;
   private List<class01028> v = Collections.emptyList();
   private int n = -1;
   private class00392 t = class05220.N;
   private class06005 G;
   private class06005 l;
   private final boolean d;

   protected void L() {
      if (this.j > 0) {
         this.j--;
      }

      this.U();
   }

   public class05671(class06241 var1) {
      this(var1, true);
   }

   private class05671(class06241 var1, boolean var2) {
      super(E);
      this.b = var1;
      this.d = var2;
   }

   public class05671() {
      this(u, false);
   }

   private class00392 Z() {
      return class00392.N("book.pageIndicator", this.j + 1, Math.max(this.z(), 1)).L(W);
   }

   protected int i() {
      return this.W() + 192 + 2;
   }

   private void U() {
      this.G.field_22764 = this.j < this.z() - 1;
      this.l.field_22764 = this.j > 0;
   }

   private int z() {
      return this.b.N();
   }

   protected void u() {
      if (this.j < this.z() - 1) {
         this.j++;
      }

      this.U();
   }

   protected void y() {
      int ix = this.E();
      int jx = this.W();
      this.G = this.method_37063(new class06005(ix + 116, jx + 157, true, var1x -> this.u(), this.d));
      this.l = this.method_37063(new class06005(ix + 43, jx + 157, false, var1x -> this.L(), this.d));
      this.U();
   }

   protected boolean y(int var1) {
      return this.N(var1);
   }

   private int E() {
      return (this.field_22789 - 192) / 2;
   }

   private void N(class00580 var1, boolean var2) {
      if (this.n != this.j) {
         class00392 class00392 = class00390.N(this.b.N(this.j), W);
         this.v = this.field_22793.L(class00392, 114);
         this.t = this.Z();
         this.n = this.j;
      }

      int lx = this.E();
      int ix = this.W();
      if (!var2) {
         var1.N(class00937.field_62011, lx + 148, ix + 16, this.t);
      }

      int jx = Math.min(128 / 9, this.v.size());

      for (int k = 0; k < jx; k++) {
         class01028 class01028 = this.v.get(k);
         var1.N(lx + 36, ix + 30 + k * 9, class01028);
      }
   }

   protected boolean N(@Nullable class00647 var1) {
      if (var1 == null) {
         return false;
      } else {
         class04453 class04453 = Objects.requireNonNull((class04453)this.field_22787.T_4, "Player not available");
         switch (var1) {
            case class00661 class00661:
               int jx;
               try {
                  jx = class00661.y();
               } catch (Throwable throwable1) {
                  throw new MatchException(throwable1.toString(), throwable1);
               }

               int ix = jx;
               this.y(ix - 1);
               break;
            case class00625 class00625x:
               class00625 class00625x = class00625x;

               try {
                  s1 = class00625x.y();
               } catch (Throwable throwable) {
                  throw new MatchException(throwable.toString(), throwable);
               }

               String sx = s1;
               this.R();
               method_71844(class04453, sx, null);
               break;
            default:
               method_71999((class00647)var1, this.field_22787, this);
         }

         return true;
      }
   }

   protected void N() {
      this.method_37063(class05362.method_46430(class05220.u, var1 -> this.method_25419()).N((this.field_22789 - 200) / 2, this.i()).N(200).N());
   }

   public boolean N(int var1) {
      int ix = class04995.N(var1, 0, this.b.N() - 1);
      if (ix != this.j) {
         this.j = ix;
         this.U();
         this.n = -1;
         return true;
      } else {
         return false;
      }
   }

   public void N(class06241 var1) {
      this.b = var1;
      this.j = class04995.N(this.j, 0, var1.N());
      this.U();
      this.n = -1;
   }

   @Override
   public void method_25426() {
      this.N();
      this.y();
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (super.method_25404(var1)) {
         return true;
      } else {
         return switch (var1.v()) {
            case 266 -> {
               this.l.method_25306(var1);
               yield true;
            }
            case 267 -> {
               this.G.method_25306(var1);
               yield true;
            }
            default -> false;
         };
      }
   }

   @Override
   public boolean method_73150() {
      return true;
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      super.method_25420(var1, var2, var3, var4);
      var1.N(class08394.Na, i, this.E(), this.W(), 0.0F, 0.0F, 192, 192, 256, 256);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.N(var1.N(class01065.field_63852), false);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (var1.v() == 0) {
         class00604 class00604 = new class00604(this.field_22793, (int)var1.n(), (int)var1.t());
         this.N(class00604, true);
         class00405 class00405 = class00604.y();
         if (class00405 != null && this.N(class00405.Z())) {
            return true;
         }
      }

      return super.method_25402(var1, var2);
   }

   private int W() {
      return 2;
   }

   protected void R() {
   }

   @Override
   public class00392 method_25435() {
      return class05220.y(super.method_25435(), this.Z(), this.b.N(this.j));
   }
}
