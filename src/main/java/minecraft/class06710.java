package minecraft;

import net.caffeinemc.mods.lithium.mixin.block.hopper.CompoundContainerAccessor;

public class class06710 implements class06695, CompoundContainerAccessor, net.fabricmc.fabric.mixin.transfer.CompoundContainerAccessor {
   private final class06695 field_5769;
   private final class06695 field_5771;

   public class06710(class06695 var1, class06695 var2) {
      super();
      this.field_5769 = var1;
      this.field_5771 = var2;
   }

   @Override
   public boolean method_5443(class08036 var1) {
      return this.field_5769.method_5443(var1) && this.field_5771.method_5443(var1);
   }

   @Override
   public void method_5432(class08978 var1) {
      this.field_5769.method_5432(var1);
      this.field_5771.method_5432(var1);
   }

   @Override
   public void method_5448() {
      this.field_5769.method_5448();
      this.field_5771.method_5448();
   }

   @Override
   public void method_5435(class08978 var1) {
      this.field_5769.method_5435(var1);
      this.field_5771.method_5435(var1);
   }

   @Override
   public boolean method_5437(int var1, class06584 var2) {
      return var1 >= this.field_5769.method_5439()
         ? this.field_5771.method_5437(var1 - this.field_5769.method_5439(), var2)
         : this.field_5769.method_5437(var1, var2);
   }

   @Override
   public int method_5444() {
      return this.field_5769.method_5444();
   }

   public boolean method_5405(class06695 var1) {
      return this.field_5769 == var1 || this.field_5771 == var1;
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
      if (var1 >= this.field_5769.method_5439()) {
         this.field_5771.method_5447(var1 - this.field_5769.method_5439(), var2);
      } else {
         this.field_5769.method_5447(var1, var2);
      }
   }

   @Override
   public void method_5431() {
      this.field_5769.method_5431();
      this.field_5771.method_5431();
   }

   @Override
   public class06584 method_5434(int var1, int var2) {
      return var1 >= this.field_5769.method_5439()
         ? this.field_5771.method_5434(var1 - this.field_5769.method_5439(), var2)
         : this.field_5769.method_5434(var1, var2);
   }

   @Override
   public class06584 method_5441(int var1) {
      return var1 >= this.field_5769.method_5439() ? this.field_5771.method_5441(var1 - this.field_5769.method_5439()) : this.field_5769.method_5441(var1);
   }

   @Override
   public boolean method_5442() {
      return this.field_5769.method_5442() && this.field_5771.method_5442();
   }

   @Override
   public class06584 method_5438(int var1) {
      return var1 >= this.field_5769.method_5439() ? this.field_5771.method_5438(var1 - this.field_5769.method_5439()) : this.field_5769.method_5438(var1);
   }

   @Override
   public int method_5439() {
      return this.field_5769.method_5439() + this.field_5771.method_5439();
   }
}
