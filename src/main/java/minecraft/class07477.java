package minecraft;

import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import org.jspecify.annotations.Nullable;

public abstract class class07477 extends class07504 implements class03977, LithiumInventory {
   private class00743<class06584> y = class00743.method_10213(36, class06584.E);
   @Nullable
   private class05946<class05074> u;
   private long B;

   @Override
   public class04803 method_32318(int var1) {
      return this.c_(var1);
   }

   @Override
   public void method_5650(class07062 var1) {
      if (!this.method_73183().method_8608() && var1.N()) {
         class06704.N(this.method_73183(), this, this);
      }

      super.method_5650(var1);
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      this.N(var1);
   }

   @Override
   public class07082 method_5688(class08036 var1, class07050 var2) {
      return this.L(var1);
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.a_(var1);
   }

   protected class07477(class07078<?> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   public void m() {
      this.y = class00743.method_10213(this.method_5439(), class06584.E);
   }

   @Nullable
   @Override
   public class05946<class05074> U() {
      return this.u;
   }

   @Override
   public long E() {
      return this.B;
   }

   @Override
   protected class06889 N(class06889 var1) {
      float f = 0.98F;
      if (this.u == null) {
         int i = 15 - class07482.L(this);
         f += i * 0.001F;
      }

      if (this.method_5799()) {
         f *= 0.95F;
      }

      return var1.u(f, 0.0, f);
   }

   @Override
   public void N(long var1) {
      this.B = var1;
   }

   @Override
   public void N(@Nullable class05946<class05074> var1) {
      this.u = var1;
   }

   protected abstract class07482 N(int var1, class08044 var2);

   public void N(class05946<class05074> var1, long var2) {
      this.u = var1;
      this.B = var2;
   }

   @Override
   public void N(class04782 var1, class07072 var2) {
      super.N(var1, var2);
      this.N(var2, var1, this);
   }

   @Override
   public boolean method_5443(class08036 var1) {
      return this.i(var1);
   }

   @Override
   public void method_5448() {
      this.h_();
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
      this.N(var1, var2);
   }

   @Override
   public void method_5431() {
   }

   @Override
   public class06584 method_5434(int var1, int var2) {
      return this.N(var1, var2);
   }

   @Override
   public class06584 method_5441(int var1) {
      return this.a_(var1);
   }

   @Override
   public class00743<class06584> W() {
      return this.y;
   }

   @Nullable
   @Override
   public class07482 createMenu(int var1, class08044 var2, class08036 var3) {
      if (this.u != null && var3.method_7325()) {
         return null;
      } else {
         this.u(var2.z);
         return this.N(var1, var2);
      }
   }

   @Override
   public class06584 method_5438(int var1) {
      return this.b_(var1);
   }
}
