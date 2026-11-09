package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class05313 {
   public static final int N = 20;
   private static final class01883 y = new class01883(class01894.y("recipe_book/page_forward"), class01894.y("recipe_book/page_forward_highlighted"));
   private static final class01883 L = new class01883(class01894.y("recipe_book/page_backward"), class01894.y("recipe_book/page_backward_highlighted"));
   private static final class00392 u = class00392.L("gui.recipebook.next_page");
   private static final class00392 i = class00392.L("gui.recipebook.previous_page");
   private static final int R = 12;
   private static final int M = 17;
   private final List<class05294> B = Lists.newArrayListWithCapacity(20);
   @Nullable
   private class05294 Z;
   private final class05299 z;
   private class06202 U;
   private final class05306<?> E;
   private List<class05287> W = ImmutableList.of();
   @Nullable
   private class04897 m;
   @Nullable
   private class04897 P;
   private int s;
   private int T;
   private class01756 b;
   @Nullable
   private class00329 j;
   @Nullable
   private class05287 v;
   private boolean n;

   public void L() {
      this.z.N(false);
   }

   public class05313(class05306<?> var1, class02422 var2, boolean var3) {
      super();
      this.E = var1;
      this.z = new class05299(var2, var3);

      for (int ix = 0; ix < 20; ix++) {
         this.B.add(new class05294(var2));
      }
   }

   private void i() {
      int ix = 20 * this.T;
      class00311 class00311 = class00282.N((class03448)this.U.T_3);

      for (int jx = 0; jx < this.B.size(); jx++) {
         class05294 class05294 = this.B.get(jx);
         if (ix + jx < this.W.size()) {
            class05287 class05287 = this.W.get(ix + jx);
            class05294.N(class05287, this.n, this, class00311);
            class05294.field_22764 = true;
         } else {
            class05294.field_22764 = false;
         }
      }

      this.R();
   }

   public class01756 u() {
      return this.b;
   }

   @Nullable
   public class05287 y() {
      return this.v;
   }

   public void N(class00329 var1) {
      this.E.N(var1);
   }

   public void N(class01054 var1, int var2, int var3, int var4, int var5, float var6) {
      if (this.s > 1) {
         class05216 var7 = class00392.N("gui.recipebook.page", this.T + 1, this.s);
         int ix = ((class01590)this.U.i_3).N(var7);
         var1.y((class01590)this.U.i_3, var7, var2 - ix / 2 + 73, var3 + 141, -1);
      }

      this.Z = null;

      for (class05294 class05294 : this.B) {
         class05294.method_25394(var1, var4, var5, var6);
         if (class05294.field_22764 && class05294.method_25367()) {
            this.Z = class05294;
         }
      }

      if (this.m != null) {
         this.m.method_25394(var1, var4, var5, var6);
      }

      if (this.P != null) {
         this.P.method_25394(var1, var4, var5, var6);
      }

      var1.L();
      this.z.method_25394(var1, var4, var5, var6);
   }

   protected void N(Consumer<class06478> var1) {
      this.B.forEach(var1);
   }

   public boolean N(class06613 var1, int var2, int var3, int var4, int var5, boolean var6) {
      this.j = null;
      this.v = null;
      if (this.z.L()) {
         if (this.z.method_25402(var1, var6)) {
            this.j = this.z.y();
            this.v = this.z.N();
         } else {
            this.z.N(false);
         }

         return true;
      } else if (this.m.method_25402(var1, var6)) {
         this.T++;
         this.i();
         return true;
      } else if (this.P.method_25402(var1, var6)) {
         this.T--;
         this.i();
         return true;
      } else {
         class00311 class00311 = class00282.N((class03448)this.U.T_3);

         for (class05294 class05294 : this.B) {
            if (class05294.method_25402(var1, var6)) {
               if (var1.v() == 0) {
                  this.j = class05294.u();
                  this.v = class05294.y();
               } else if (var1.v() == 1 && !this.z.L() && !class05294.L()) {
                  this.z
                     .N(
                        class05294.y(),
                        class00311,
                        this.n,
                        class05294.method_46426(),
                        class05294.method_46427(),
                        var2 + var4 / 2,
                        var3 + 13 + var5 / 2,
                        class05294.method_25368()
                     );
               }

               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   public class00329 N() {
      return this.j;
   }

   public void N(List<class05287> var1, boolean var2, boolean var3) {
      this.W = var1;
      this.n = var3;
      this.s = (int)Math.ceil(var1.size() / 20.0);
      if (this.s <= this.T || var2) {
         this.T = 0;
      }

      this.i();
   }

   public void N(class06202 var1, int var2, int var3) {
      this.U = var1;
      this.b = ((class04453)var1.T_4).q();

      for (int ix = 0; ix < this.B.size(); ix++) {
         this.B.get(ix).y(var2 + 11 + 25 * (ix % 5), var3 + 31 + 25 * (ix / 5));
      }

      this.m = new class04897(var2 + 93, var3 + 137, 12, 17, y, var1x -> this.R(), u);
      this.m.method_47400(class04141.N(u));
      this.P = new class04897(var2 + 38, var3 + 137, 12, 17, L, var1x -> this.R(), i);
      this.P.method_47400(class04141.N(i));
   }

   public void N(class01054 var1, int var2, int var3) {
      if ((class05096)this.U.v_3 != null && this.Z != null && !this.z.L()) {
         class06584 class06584 = this.Z.i();
         class01894 class01894 = class06584.method_58694(class02484.V);
         var1.N((class01590)this.U.i_3, this.Z.N(class06584), var2, var3, class01894);
      }
   }

   private void R() {
      if (this.m != null) {
         this.m.field_22764 = this.s > 1 && this.T < this.s - 1;
      }

      if (this.P != null) {
         this.P.field_22764 = this.s > 1 && this.T > 0;
      }
   }
}
