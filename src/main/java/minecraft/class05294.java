package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class05294 extends class06478 {
   private static final class01894 N = class01894.y("recipe_book/slot_many_craftable");
   private static final class01894 y = class01894.y("recipe_book/slot_craftable");
   private static final class01894 L = class01894.y("recipe_book/slot_many_uncraftable");
   private static final class01894 u = class01894.y("recipe_book/slot_uncraftable");
   private static final float i = 15.0F;
   private static final int R = 25;
   private static final class00392 M = class00392.L("gui.recipebook.moreRecipes");
   private class05287 B = class05287.N;
   private List<class05305> Z = List.of();
   private boolean z;
   private final class02422 U;
   private float E;

   public boolean L() {
      return this.Z.size() == 1;
   }

   public class05294(class02422 var1) {
      super(0, 0, 25, 25, class05220.N);
      this.U = var1;
   }

   public class06584 i() {
      int ix = this.U.currentIndex();
      int j = this.Z.size();
      int k = ix / j;
      int l = ix - j * k;
      return this.Z.get(l).N(k);
   }

   public class00329 u() {
      int ix = this.U.currentIndex() % this.Z.size();
      return this.Z.get(ix).N();
   }

   public class05287 y() {
      return this.B;
   }

   public List<class00392> N(class06584 var1) {
      ArrayList arraylist = new ArrayList<>(class05096.method_25408(class06202.Nq(), var1));
      if (this.R()) {
         arraylist.add(M);
      }

      return arraylist;
   }

   public void N(class05287 var1, boolean var2, class05313 var3, class00311 var4) {
      this.B = var1;
      List<class00295> list = var1.N(var2 ? class05317.field_52848 : class05317.field_52847);
      this.Z = list.stream().map(var1x -> new class05305(var1x.N(), var1x.N(var4))).toList();
      this.z = N(this.Z);
      List list1 = list.stream().map(class00295::N).filter(var3.u()::y).toList();
      if (!list1.isEmpty()) {
         list1.forEach(var3::N);
         this.E = 15.0F;
      }
   }

   private static boolean N(List<class05305> var0) {
      Iterator iterator = var0.stream().flatMap(var0x -> var0x.y().stream()).iterator();
      if (!iterator.hasNext()) {
         return true;
      } else {
         class06584 class06584x = (class06584)iterator.next();

         while (iterator.hasNext()) {
            class06584 class06584x = (class06584)iterator.next();
            if (!class06584.L(class06584x, class06584x)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean R() {
      return this.Z.size() > 1;
   }

   @Override
   public int method_25368() {
      return 25;
   }

   @Override
   public boolean method_25351(class06595 var1) {
      return var1.v() == 0 || var1.v() == 1;
   }

   @Override
   public void method_47399(class03428 var1) {
      var1.N(class03457.field_33788, class00392.N("narration.recipe", this.i().d()));
      if (this.R()) {
         var1.N(class03457.field_33791, class00392.L("narration.button.usage.hovered"), class00392.L("narration.recipe.usage.more"));
      } else {
         var1.N(class03457.field_33791, class00392.L("narration.button.usage.hovered"));
      }
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      class01894 class01894;
      if (this.B.N()) {
         if (this.R()) {
            class01894 = N;
         } else {
            class01894 = y;
         }
      } else if (this.R()) {
         class01894 = L;
      } else {
         class01894 = u;
      }

      boolean flag = this.E > 0.0F;
      if (flag) {
         float f = 1.0F + 0.1F * (float)Math.sin(this.E / 15.0F * (float) Math.PI);
         var1.i().pushMatrix();
         var1.i().translate(this.method_46426() + 8, this.method_46427() + 12);
         var1.i().scale(f, f);
         var1.i().translate(-(this.method_46426() + 8), -(this.method_46427() + 12));
         this.E -= var4;
      }

      var1.N(class08394.Na, class01894, this.method_46426(), this.method_46427(), this.field_22758, this.field_22759);
      class06584 class06584 = this.i();
      int ix = 4;
      if (this.R() && this.z) {
         var1.N(class06584, this.method_46426() + ix + 1, this.method_46427() + ix + 1, 0);
         ix--;
      }

      var1.y(class06584, this.method_46426() + ix, this.method_46427() + ix);
      if (flag) {
         var1.i().popMatrix();
      }
   }
}
