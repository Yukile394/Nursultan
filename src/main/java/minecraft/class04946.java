package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;

public class class04946 extends class01463<class07500> {
   private static final class01894[] G = new class01894[]{
      class01894.y("container/enchanting_table/level_1"),
      class01894.y("container/enchanting_table/level_2"),
      class01894.y("container/enchanting_table/level_3")
   };
   private static final class01894[] l = new class01894[]{
      class01894.y("container/enchanting_table/level_1_disabled"),
      class01894.y("container/enchanting_table/level_2_disabled"),
      class01894.y("container/enchanting_table/level_3_disabled")
   };
   private static final class01894 d = class01894.y("container/enchanting_table/enchantment_slot_disabled");
   private static final class01894 w = class01894.y("container/enchanting_table/enchantment_slot_highlighted");
   private static final class01894 k = class01894.y("container/enchanting_table/enchantment_slot");
   private static final class01894 Y = class01894.y("textures/gui/container/enchanting_table.png");
   private static final class01894 Q = class01894.y("textures/entity/enchanting_table_book.png");
   private final class06069 O = class06069.u();
   private class01127 g;
   public float N;
   public float y;
   public float L;
   public float u;
   public float n;
   public float t;
   private class06584 I = class06584.E;

   public class04946(class07500 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3);
   }

   private void i(class01054 var1, int var2, int var3) {
      float f = this.field_22787.NK().N(false);
      float f1 = class04995.B(f, this.t, this.n);
      float f2 = class04995.B(f, this.y, this.N);
      int i = var2 + 14;
      int j = var3 + 14;
      int kx = i + 38;
      int lx = j + 31;
      var1.N(this.g, Q, 40.0F, f1, f2, i, j, kx, lx);
   }

   @Override
   public void u() {
      super.u();
      ((class04453)this.field_22787.T_4).L_5 = ((class04453)this.field_22787.T_4).field_6012;
      this.N();
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2;
      var1.N(class08394.Na, Y, i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
      this.i(var1, i, j);
      class04975.N().N(this.m.W());
      int kx = this.m.E();

      for (int lx = 0; lx < 3; lx++) {
         int i1 = i + 60;
         int j1 = i1 + 20;
         int k1 = this.m.y[lx];
         if (k1 == 0) {
            var1.N(class08394.Na, d, i1, j + 14 + 19 * lx, 108, 19);
         } else {
            String s = k1 + "";
            int l1 = 86 - this.field_22793.y(s);
            class05936 class05936 = class04975.N().N(this.field_22793, l1);
            int i2 = -9937334;
            if ((kx < lx + 1 || ((class04453)this.field_22787.T_4).fields_37fa3311b0e9d3e9b883d09222919bf5a_0 < k1)
               && !((class04453)this.field_22787.T_4).method_56992()) {
               var1.N(class08394.Na, d, i1, j + 14 + 19 * lx, 108, 19);
               var1.N(class08394.Na, l[lx], i1 + 1, j + 15 + 19 * lx, 16, 16);
               var1.N(this.field_22793, class05936, j1, j + 16 + 19 * lx, l1, class02566.M((i2 & 16711422) >> 1), false);
               i2 = -12550384;
            } else {
               int j2 = var3 - (i + 60);
               int k2 = var4 - (j + 14 + 19 * lx);
               if (j2 >= 0 && k2 >= 0 && j2 < 108 && k2 < 19) {
                  var1.N(class08394.Na, w, i1, j + 14 + 19 * lx, 108, 19);
                  var1.N(class06608.u);
                  i2 = -128;
               } else {
                  var1.N(class08394.Na, k, i1, j + 14 + 19 * lx, 108, 19);
               }

               var1.N(class08394.Na, G[lx], i1 + 1, j + 15 + 19 * lx, 16, 16);
               var1.N(this.field_22793, class05936, j1, j + 16 + 19 * lx, l1, i2, false);
               i2 = -8323296;
            }

            var1.y(this.field_22793, s, j1 + 86 - this.field_22793.y(s), j + 16 + 19 * lx + 7, i2);
         }
      }
   }

   @Override
   public void N() {
      class06584 class06584 = this.m.L(0).i();
      if (!class06584.N(class06584, this.I)) {
         this.I = class06584;

         do {
            this.L = this.L + (this.O.y(4) - this.O.y(4));
         } while (this.N <= this.L + 1.0F && this.N >= this.L - 1.0F);
      }

      this.y = this.N;
      this.t = this.n;
      boolean flag = false;

      for (int i = 0; i < 3; i++) {
         if (this.m.y[i] != 0) {
            flag = true;
            break;
         }
      }

      if (flag) {
         this.n += 0.2F;
      } else {
         this.n -= 0.2F;
      }

      this.n = class04995.N(this.n, 0.0F, 1.0F);
      float f1 = (this.L - this.N) * 0.4F;
      float f = 0.2F;
      f1 = class04995.N(f1, -0.2F, 0.2F);
      this.u = this.u + (f1 - this.u) * 0.9F;
      this.N = this.N + this.u;
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.g = new class01127(this.field_22787.yt().N(class04802.J));
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      float f = this.field_22787.NK().N(false);
      super.method_25394(var1, var2, var3, f);
      this.a_(var1, var2, var3);
      boolean flag = ((class04453)this.field_22787.T_4).method_56992();
      int i = this.m.E();

      for (int j = 0; j < 3; j++) {
         int kx = this.m.y[j];
         Optional optional = ((class03448)this.field_22787.T_3).method_30349().L(class04227.yR).L(this.m.L[j]);
         if (!optional.isEmpty()) {
            int lx = this.m.u[j];
            int i1 = j + 1;
            if (this.N(60, 14 + 19 * j, 108, 17, var2, var3) && kx > 0 && lx >= 0) {
               ArrayList arraylist = Lists.newArrayList();
               arraylist.add(class00392.N("container.enchant.clue", class07304.N((class03556<class07304>)optional.get(), lx)).N(class06541.field_1068));
               if (!flag) {
                  arraylist.add(class05220.N);
                  if (((class04453)this.field_22787.T_4).fields_37fa3311b0e9d3e9b883d09222919bf5a_0 < kx) {
                     arraylist.add(class00392.N("container.enchant.level.requirement", this.m.y[j]).N(class06541.field_1061));
                  } else {
                     class05216 class05216x;
                     if (i1 == 1) {
                        class05216x = class00392.L("container.enchant.lapis.one");
                     } else {
                        class05216x = class00392.N("container.enchant.lapis.many", i1);
                     }

                     arraylist.add(class05216x.N(i >= i1 ? class06541.field_1080 : class06541.field_1061));
                     class05216 class05216x;
                     if (i1 == 1) {
                        class05216x = class00392.L("container.enchant.level.one");
                     } else {
                        class05216x = class00392.N("container.enchant.level.many", i1);
                     }

                     arraylist.add(class05216x.N(class06541.field_1080));
                  }
               }

               var1.N(this.field_22793, arraylist, var2, var3);
               break;
            }
         }
      }
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2;

      for (int kx = 0; kx < 3; kx++) {
         double d0 = var1.n() - (i + 60);
         double d1 = var1.t() - (j + 14 + 19 * kx);
         if (d0 >= 0.0 && d1 >= 0.0 && d0 < 108.0 && d1 < 19.0 && this.m.y((class04453)this.field_22787.T_4, kx)) {
            ((class03443)this.field_22787.T_2).N(this.m.b, kx);
            return true;
         }
      }

      return super.method_25402(var1, var2);
   }
}
