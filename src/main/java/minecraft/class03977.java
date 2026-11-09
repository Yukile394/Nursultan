package minecraft;

import Nursultan.class10288;
import java.util.Iterator;
import org.jspecify.annotations.Nullable;

public interface class03977 extends class06237, class06695 {
   default class07082 L(class08036 var1) {
      var1.method_17355(this);
      return class07082.N;
   }

   class07299 method_73183();

   class00734 method_5829();

   boolean method_31481();

   class06889 method_73189();

   default boolean i(class08036 var1) {
      return !this.method_31481() && var1.method_56092(this.method_5829(), 4.0);
   }

   void m();

   @Nullable
   class05946<class05074> U();

   default void u(@Nullable class08036 var1) {
      class02796 class02796 = this.method_73183().method_8503();
      if (this.U() != null && class02796 != null) {
         class05074 class05074 = class02796.yd().N(this.U());
         if (var1 != null) {
            class06912.F.N((class04770)var1, this.U());
         }

         this.N(null);
         class04160 class04160 = new class04160((class04782)this.method_73183()).N(class06551.B, this.method_73189());
         if (var1 != null) {
            class04160.N(var1.method_7292()).N(class06551.N, var1);
         }

         class05074.N(this, class04160.N(class06925.u), this.E());
      }
   }

   long E();

   default void N(int var1, class06584 var2) {
      this.u(null);
      this.W().set(var1, var2);
      var2.R(this.a_(var2));
   }

   default class06584 N(int var1, int var2) {
      this.u(null);
      return class06686.N(this.W(), var1, var2);
   }

   default void N(class07072 var1, class04782 var2, class07049 var3) {
      if (var2.method_64395().N(class07305.U)) {
         class06704.N(var2, var3, this);
         class07049 class07049 = var1.L();
         if (class07049 != null && class07049.method_5864() == class07078.Ly) {
            class01514.N(var2, (class08036)class07049, true);
         }
      }
   }

   void N(long var1);

   default void N(class08329 var1) {
      if (this.U() != null) {
         var1.N("LootTable", this.U().N().toString());
         if (this.E() != 0L) {
            var1.N("LootTableSeed", this.E());
         }
      } else {
         class06686.N(var1, this.W());
      }
   }

   void N(@Nullable class05946<class05074> var1);

   @Override
   default boolean method_5442() {
      return this.i_();
   }

   class00743<class06584> W();

   default void a_(class08299 var1) {
      this.m();
      class05946<class05074> class05946 = var1.<class05946<class05074>>N("LootTable", class05074.N).orElse(null);
      this.N(class05946);
      this.N(var1.N("LootTableSeed", 0L));
      if (class05946 == null) {
         class06686.N(var1, this.W());
      }
   }

   default class06584 a_(int var1) {
      this.u(null);
      class06584 class06584 = this.W().get(var1);
      if (class06584.R()) {
         return class06584.E;
      } else {
         this.W().set(var1, class06584.E);
         return class06584;
      }
   }

   default boolean i_() {
      Iterator<class06584> iterator = this.W().iterator();

      while (iterator.hasNext()) {
         if (!iterator.next().R()) {
            return false;
         }
      }

      return true;
   }

   default class06584 b_(int var1) {
      this.u(null);
      return this.W().get(var1);
   }

   @Nullable
   default class04803 c_(int var1) {
      return var1 >= 0 && var1 < this.method_5439() ? new class10288(this, var1) : null;
   }

   default void h_() {
      this.u(null);
      this.W().clear();
   }
}
