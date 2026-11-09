package minecraft;

import Nursultan.class10297;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public final class class04034 implements class04017 {
   static final class03979<class04034> N = class03979.N(class05946.N(class04227.NA).listOf().fieldOf("biome_is").xmap(class04020::N, var0 -> var0.u));
   private final List<class05946<class00780>> u;
   public final Predicate<class05946<class00780>> y;

   class04034(List<class05946<class00780>> var1) {
      super();
      this.u = var1;
      this.y = Set.copyOf(var1)::contains;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof class04034 class04034 ? this.u.equals(class04034.u) : false;
      }
   }

   @Override
   public String toString() {
      return "BiomeConditionSource[biomes=" + this.u + "]";
   }

   @Override
   public int hashCode() {
      return this.u.hashCode();
   }

   public class04018 apply(class04039 var1) {
      return new class10297(this, var1);
   }

   @Override
   public class03979<? extends class04017> N() {
      return N;
   }
}
