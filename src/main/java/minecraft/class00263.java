package minecraft;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class class00263 {
   public static final class05946<? extends class00751<class00263>> N = class05946.N(class01894.y("recipe_property_set"));
   public static final class05946<class00263> y = N("smithing_base");
   public static final class05946<class00263> L = N("smithing_template");
   public static final class05946<class00263> u = N("smithing_addition");
   public static final class05946<class00263> i = N("furnace_input");
   public static final class05946<class00263> R = N("blast_furnace_input");
   public static final class05946<class00263> M = N("smoker_input");
   public static final class05946<class00263> B = N("campfire_input");
   public static final class02362<class04247, class00263> Z = class06581.i
      .N_33(class02389.N())
      .N_10(var0 -> new class00263(Set.copyOf(var0)), var0 -> List.copyOf(var0.U));
   public static final class00263 z = new class00263(Set.of());
   private final Set<class03556<class06581>> U;

   private class00263(Set<class03556<class06581>> var1) {
      super();
      this.U = var1;
   }

   static class00263 N(Collection<class06510> var0) {
      Set set = var0.stream().flatMap(class06510::method_8105).collect(Collectors.toUnmodifiableSet());
      return new class00263(set);
   }

   private static class05946<class00263> N(String var0) {
      return class05946.N(N, class01894.y(var0));
   }

   public boolean N(class06584 var1) {
      return this.U.contains(var1.Z());
   }
}
