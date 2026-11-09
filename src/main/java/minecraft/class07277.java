package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class07277 extends class07236 implements class03136 {
   @Nullable
   protected class05946<class05074> i;
   protected long R = 0L;

   @Nullable
   @Override
   public class05946<class05074> M() {
      return this.i;
   }

   protected class07277(class00404<?> var1, class07209 var2, class00500 var3) {
      super(var1, var2, var3);
   }

   @Override
   public long B() {
      return this.R;
   }

   @Override
   public void y(class08329 var1) {
      super.y(var1);
      var1.L("LootTable");
      var1.L("LootTableSeed");
   }

   @Override
   public boolean N(class08036 var1) {
      return super.N(var1) && (this.i == null || !var1.method_7325());
   }

   @Override
   public void N(@Nullable class05946<class05074> var1) {
      this.i = var1;
   }

   @Override
   protected void N_9(class02666 var1) {
      super.N_9(var1);
      class02720 class02720 = var1.method_58694(class02484.Nk);
      if (class02720 != null) {
         this.i = class02720.N();
         this.R = class02720.y();
      }
   }

   @Override
   protected void N(class02676 var1) {
      super.N(var1);
      if (this.i != null) {
         var1.N(class02484.Nk, new class02720(this.i, this.R));
      }
   }

   @Override
   public void N(long var1) {
      this.R = var1;
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
      this.y(null);
      super.method_5447(var1, var2);
   }

   @Override
   public class06584 method_5434(int var1, int var2) {
      this.y(null);
      return super.method_5434(var1, var2);
   }

   @Override
   public class06584 method_5441(int var1) {
      this.y(null);
      return super.method_5441(var1);
   }

   @Override
   public boolean method_5442() {
      this.y(null);
      return super.method_5442();
   }

   @Nullable
   @Override
   public class07482 createMenu(int var1, class08044 var2, class08036 var3) {
      if (this.N(var3)) {
         this.y(var2.z);
         return this.N(var1, var2);
      } else {
         class07236.N(this.d().method_46558(), var3, this.method_5476());
         return null;
      }
   }

   @Override
   public class06584 method_5438(int var1) {
      this.y(null);
      return super.method_5438(var1);
   }
}
