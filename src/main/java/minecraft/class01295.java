package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.joml.Vector2i;
import org.jspecify.annotations.Nullable;

public interface class01295 extends class04654 {
   @Nullable
   @Override
   default class02106 B() {
      class04654 class04654 = this.method_25399();
      return class04654 != null ? class02106.N(this, class04654.B()) : null;
   }

   @Nullable
   private class02106 y(class03255 var1, class03249 var2, @Nullable class04654 var3, class02089 var4) {
      class03287 class03287x = var2.N();
      class03287 class03287x = class03287x.N();
      ArrayList arraylist = new ArrayList();
      class03283 class03283x = class03283.N(class03287x, var1.y(var2), var1.y(class03287x));
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(var2);
      List list = this.N(this, localrefimpl);
      var2 = (class03249)localrefimpl.dispose();

      for (class04654 class04654 : list) {
         if (class04654 != var3) {
            class03255 class03255 = class04654.method_48202();
            class03283 class03283x = class03283.N(class03287x, class03255.y(var2.y()), class03255.y(class03287x));
            if (var2.N(class03283x.N(class03287x), class03283x.N(class03287x))) {
               long i = Vector2i.distanceSquared(class03283x.N(), class03283x.y(), class03283x.N(), class03283x.y());
               arraylist.add(Pair.of(class04654, i));
            }
         }
      }

      arraylist.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair pair : arraylist) {
         class02106 class02106 = ((class04654)pair.getFirst()).method_48205(var4);
         if (class02106 != null) {
            return class02106;
         }
      }

      return null;
   }

   @Nullable
   private class02106 N(class02116 var1) {
      class04654 class04654 = this.method_25399();
      if (class04654 == null) {
         class03249 class03249 = var1.y();
         class03255 class03255 = this.N_49(class03249.y());
         return class02106.N(this, this.N(class03255, class03249, null, var1));
      } else {
         class03255 class03255x = class04654.method_48202();
         return class02106.N(this, this.N(class03255x, var1.y(), class04654, var1));
      }
   }

   @Nullable
   private class02106 N(class03251 var1) {
      boolean flag = var1.y();
      class04654 class04654 = this.method_25399();
      ArrayList arraylist = new ArrayList<>(this.method_25396());
      Collections.sort(arraylist, Comparator.comparingInt(var0 -> var0.method_48590()));
      int j = arraylist.indexOf(class04654);
      int i;
      if (class04654 != null && j >= 0) {
         i = j + (flag ? 1 : 0);
      } else if (flag) {
         i = 0;
      } else {
         i = arraylist.size();
      }

      ListIterator listiterator = arraylist.listIterator(i);
      BooleanSupplier booleansupplier = flag ? listiterator::hasNext : listiterator::hasPrevious;
      Supplier supplier = flag ? listiterator::next : listiterator::previous;

      while (booleansupplier.getAsBoolean()) {
         class02106 class02106 = ((class04654)supplier.get()).method_48205(var1);
         if (class02106 != null) {
            return class02106.N(this, class02106);
         }
      }

      return null;
   }

   @Nullable
   private class02106 N(class03255 var1, class03249 var2, @Nullable class04654 var3, class02089 var4) {
      class03287 class03287 = var2.N().N();
      class03249 class03249 = class03287.y();
      int i = var1.y(var2.y());
      ArrayList arraylist = new ArrayList();
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(var2);
      List list = this.N(this, localrefimpl);
      var2 = (class03249)localrefimpl.dispose();

      for (class04654 class04654x : list) {
         if (class04654x != var3) {
            class03255 class03255 = class04654x.method_48202();
            if (class03255.N(var1, class03287)) {
               int j = class03255.y(var2.y());
               if (var2.N(j, i)) {
                  arraylist.add(class04654x);
               } else if (j == i && var2.N(class03255.y(var2), var1.y(var2))) {
                  arraylist.add(class04654x);
               }
            }
         }
      }

      Comparator comparator = Comparator.comparing(var1x -> var1x.method_48202().y(var2.y()), var2.u());
      Comparator comparator1 = Comparator.comparing(var1x -> var1x.method_48202().y(class03249.y()), class03249.u());
      arraylist.sort(comparator.thenComparing(comparator1));

      for (class04654 class04654x : arraylist) {
         class02106 class02106 = class04654x.method_48205(var4);
         if (class02106 != null) {
            return class02106;
         }
      }

      return this.y(var1, var2, var3, var4);
   }

   default List N(class01295 var1, LocalRef var2) {
      return this.N(var1, (class03249)var2.get());
   }

   default List N(class01295 var1, class03249 var2) {
      return var2.N() == class03287.field_41822 ? var1.method_25396().stream().filter(var0 -> !(var0 instanceof class03281)).toList() : var1.method_25396();
   }

   List<? extends class04654> method_25396();

   @Override
   default boolean method_25404(class06601 var1) {
      return this.method_25399() != null && this.method_25399().method_25404(var1);
   }

   @Nullable
   class04654 method_25399();

   @Nullable
   @Override
   default class02106 method_48205(class02089 var1) {
      class04654 class04654 = this.method_25399();
      if (class04654 != null) {
         class02106 class02106 = class04654.method_48205(var1);
         if (class02106 != null) {
            return class02106.N(this, class02106);
         }
      }

      if (var1 instanceof class03251 class03251) {
         return this.N(class03251);
      } else {
         return var1 instanceof class02116 class02116 ? this.N(class02116) : null;
      }
   }

   @Override
   default boolean method_25403(class06613 var1, double var2, double var4) {
      return this.method_25399() != null && this.method_25397() && var1.v() == 0 ? this.method_25399().method_25403(var1, var2, var4) : false;
   }

   @Override
   default boolean method_25401(double var1, double var3, double var5, double var7) {
      return this.method_19355(var1, var3).filter(var8 -> var8.method_25401(var1, var3, var5, var7)).isPresent();
   }

   @Override
   default boolean method_25400(class06626 var1) {
      return this.method_25399() != null && this.method_25399().method_25400(var1);
   }

   @Override
   default void method_25365(boolean var1) {
   }

   void method_25395(@Nullable class04654 var1);

   void method_25398(boolean var1);

   @Override
   default boolean method_25370() {
      return this.method_25399() != null;
   }

   @Override
   default boolean method_25406(class06613 var1) {
      if (var1.v() == 0 && this.method_25397()) {
         this.method_25398(false);
         if (this.method_25399() != null) {
            return this.method_25399().method_25406(var1);
         }
      }

      return false;
   }

   default Optional<class04654> method_19355(double var1, double var3) {
      for (class04654 class04654 : this.method_25396()) {
         if (class04654.method_25405(var1, var3)) {
            return Optional.of(class04654);
         }
      }

      return Optional.empty();
   }

   boolean method_25397();

   @Override
   default boolean method_25402(class06613 var1, boolean var2) {
      Optional<class04654> optional = this.method_19355(var1.n(), var1.t());
      if (optional.isEmpty()) {
         return false;
      } else {
         class04654 class04654 = optional.get();
         if (class04654.method_25402(var1, var2) && class04654.M()) {
            this.method_25395(class04654);
            if (var1.v() == 0) {
               this.method_25398(true);
            }
         }

         return true;
      }
   }

   @Override
   default boolean method_16803(class06601 var1) {
      return this.method_25399() != null && this.method_25399().method_16803(var1);
   }
}
