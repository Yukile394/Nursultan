package minecraft;

import org.jspecify.annotations.Nullable;

public interface class03136 extends class06695 {
   String r_ = "LootTable";
   String s_ = "LootTableSeed";

   @Nullable
   class05946<class05074> M();

   long B();

   class07209 d();

   default void y(@Nullable class08036 var1) {
      class07299 class07299 = this.G();
      class07209 class07209 = this.d();
      class05946<class05074> class05946 = this.M();
      if (class05946 != null && class07299 != null && class07299.method_8503() != null) {
         class05074 class05074 = class07299.method_8503().yd().N(class05946);
         if (var1 instanceof class04770) {
            class06912.F.N((class04770)var1, class05946);
         }

         this.N(null);
         class04160 class04160 = new class04160((class04782)class07299).N(class06551.B, class06889.y(class07209));
         if (var1 != null) {
            class04160.N(var1.method_7292()).N(class06551.N, var1);
         }

         class05074.N(this, class04160.N(class06925.u), this.B());
      }
   }

   default void N(class05946<class05074> var1, long var2) {
      this.N(var1);
      this.N(var2);
   }

   static void N(class07290 var0, class06069 var1, class07209 var2, class05946<class05074> var3) {
      class00394 class00394 = var0.method_8321(var2);
      if (class00394 instanceof class03136) {
         ((class03136)class00394).N(var3, var1.B());
      }
   }

   void N(long var1);

   void N(@Nullable class05946<class05074> var1);

   default boolean a_(class08329 var1) {
      class05946<class05074> class05946 = this.M();
      if (class05946 == null) {
         return false;
      } else {
         var1.N("LootTable", class05074.N, class05946);
         long i = this.B();
         if (i != 0L) {
            var1.N("LootTableSeed", i);
         }

         return true;
      }
   }

   @Nullable
   class07299 G();

   default boolean c_(class08299 var1) {
      class05946<class05074> class05946 = var1.<class05946<class05074>>N("LootTable", class05074.N).orElse(null);
      this.N(class05946);
      this.N(var1.N("LootTableSeed", 0L));
      return class05946 != null;
   }
}
