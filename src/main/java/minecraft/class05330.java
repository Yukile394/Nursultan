package minecraft;

import java.util.Iterator;
import java.util.List;

public class class05330 extends class04897 {
   private static final class01883 L = new class01883(class01894.y("recipe_book/tab"), class01894.y("recipe_book/tab_selected"));
   public static final int N = 35;
   public static final int y = 27;
   private final class05322 u;
   private static final float i = 15.0F;
   private float R;
   private boolean M = false;

   public void L() {
      this.M = true;
   }

   public class05330(int var1, int var2, class05322 var3, class05361 var4) {
      super(var1, var2, 35, 27, L, var4);
      this.u = var3;
   }

   public void u() {
      this.M = false;
   }

   public class00242 y() {
      return this.u.L();
   }

   public boolean N(class01756 var1) {
      List<class05287> list = var1.N(this.u.L());
      this.field_22764 = false;
      Iterator<class05287> iterator = list.iterator();

      while (iterator.hasNext()) {
         if (iterator.next().y()) {
            this.field_22764 = true;
            break;
         }
      }

      return this.field_22764;
   }

   public void N(class01756 var1, boolean var2) {
      class05317 class05317 = var2 ? class05317.field_52848 : class05317.field_52847;
      Iterator<class05287> iterator = var1.N(this.u.L()).iterator();

      while (iterator.hasNext()) {
         for (class00295 class00295 : iterator.next().N(class05317)) {
            if (var1.y(class00295.N())) {
               this.R = 15.0F;
               return;
            }
         }
      }
   }

   private void N(class01054 var1) {
      int ix = this.M ? -2 : 0;
      if (this.u.y().isPresent()) {
         var1.y(this.u.N(), this.method_46426() + 3 + ix, this.method_46427() + 5);
         var1.y(this.u.y().get(), this.method_46426() + 14 + ix, this.method_46427() + 5);
      } else {
         var1.y(this.u.N(), this.method_46426() + 9 + ix, this.method_46427() + 5);
      }
   }

   @Override
   public void method_75752(class01054 var1, int var2, int var3, float var4) {
      if (this.R > 0.0F) {
         float f = 1.0F + 0.1F * (float)Math.sin(this.R / 15.0F * (float) Math.PI);
         var1.i().pushMatrix();
         var1.i().translate(this.method_46426() + 8, this.method_46427() + 12);
         var1.i().scale(1.0F, f);
         var1.i().translate(-(this.method_46426() + 8), -(this.method_46427() + 12));
      }

      class01894 class01894 = this.field_45356.N(true, this.M);
      int ix = this.method_46426();
      if (this.M) {
         ix -= 2;
      }

      var1.N(class08394.Na, class01894, ix, this.method_46427(), this.field_22758, this.field_22759);
      this.N(var1);
      if (this.R > 0.0F) {
         var1.i().popMatrix();
         this.R -= var4;
      }
   }

   @Override
   protected void method_76256(class01054 var1) {
      if (!this.M) {
         super.method_76256(var1);
      }
   }
}
