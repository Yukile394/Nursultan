package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class01454 extends class01463<class07501> {
   private static final class01894 d = class01894.y("textures/gui/container/beacon.png");
   static final class01894 N = class01894.y("container/beacon/button_disabled");
   static final class01894 y = class01894.y("container/beacon/button_selected");
   static final class01894 L = class01894.y("container/beacon/button_highlighted");
   static final class01894 u = class01894.y("container/beacon/button");
   static final class01894 n = class01894.y("container/beacon/confirm");
   static final class01894 t = class01894.y("container/beacon/cancel");
   private static final class00392 w = class00392.L("block.minecraft.beacon.primary");
   private static final class00392 k = class00392.L("block.minecraft.beacon.secondary");
   private final List<class01450> Y = Lists.newArrayList();
   @Nullable
   class03556<class07084> G;
   @Nullable
   class03556<class07084> l;

   public class01454(class07501 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3);
      this.B = 230;
      this.Z = 219;
      var1.N(new class01457(this, var1));
   }

   @Override
   protected void u(class01054 var1, int var2, int var3) {
      var1.N(this.field_22793, w, 62, 10, -2039584);
      var1.N(this.field_22793, k, 169, 10, -2039584);
   }

   @Override
   public void u() {
      super.u();
      this.N();
   }

   private <T extends class06478 & class01450> void N(T var1) {
      this.method_37063(var1);
      this.Y.add((class01450)var1);
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2;
      var1.N(class08394.Na, d, i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
      var1.N(new class06584(class06570.TE), i + 20, j + 109);
      var1.N(new class06584(class06570.Ty), i + 41, j + 109);
      var1.N(new class06584(class06570.TN), i + 41 + 22, j + 109);
      var1.N(new class06584(class06570.TU), i + 42 + 44, j + 109);
      var1.N(new class06584(class06570.TM), i + 42 + 66, j + 109);
   }

   @Override
   void N() {
      int i = this.m.E();
      this.Y.forEach(var1x -> var1x.N(i));
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.Y.clear();

      for (int i = 0; i <= 2; i++) {
         int j = class00419.N.get(i).size();
         int kx = j * 22 + (j - 1) * 2;

         for (int var4 = 0; var4 < j; var4++) {
            class03556<class07084> class03556 = class00419.N.get(i).get(var4);
            class01462 class01462x = new class01462((int)this, this.T + 76 + var4 * 24 - kx / 2, this.b + 22 + i * 25, (boolean)class03556, true, i);
            class01462x.field_22763 = false;
            this.N(class01462x);
         }
      }

      byte b0 = 3;
      int i1 = class00419.N.get(3).size() + 1;
      int j1 = i1 * 22 + (i1 - 1) * 2;

      for (int k1 = 0; k1 < i1 - 1; k1++) {
         class03556 class03556 = class00419.N.get(3).get(k1);
         class01462 class01462 = new class01462((int)this, this.T + 167 + k1 * 24 - j1 / 2, this.b + 47, (boolean)class03556, false, 3);
         class01462.field_22763 = false;
         this.N(class01462);
      }

      class03556<class07084> class03556 = class00419.N.get(0).get(0);
      class01480 class01480 = new class01480((int)this, this.T + 167 + (i1 - 1) * 24 - j1 / 2, this.b + 47, class03556);
      class01480.field_22764 = false;
      this.N(class01480);
      this.N(new class01433(this, this.T + 164, this.b + 107));
      this.N(new class01438(this, this.T + 190, this.b + 107));
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.a_(var1, var2, var3);
   }
}
