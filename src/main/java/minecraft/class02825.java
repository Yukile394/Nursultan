package minecraft;

import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.OptionalDynamic;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;

class class02825 {
   private final String y;
   private final int L;
   private Dynamic<?> u;
   private final Dynamic<?> i;
   Dynamic<?> N;

   public boolean L(String var1) {
      return this.u.get(var1).result().isPresent();
   }

   private class02825(String var1, int var2, Dynamic<?> var3) {
      super();
      this.y = class00622.N(var1);
      this.L = var2;
      this.u = var3.emptyMap();
      this.N = var3.get("tag").orElseEmptyMap();
      this.i = var3.remove("tag");
   }

   public boolean y(String var1) {
      return this.y.equals(var1);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0, Dynamic<?> var1) {
      DynamicOps dynamicops = var0.getOps();
      return dynamicops.getMap(var0.getValue())
         .flatMap(var2x -> dynamicops.mergeToMap(var1.convert(dynamicops).getValue(), var2x))
         .map(var1x -> new Dynamic(dynamicops, var1x))
         .result()
         .orElse(var0);
   }

   public boolean N(Set<String> var1) {
      return var1.contains(this.y);
   }

   public Dynamic<?> N(String var1, Dynamic<?> var2, String var3) {
      Optional<Dynamic<?>> optional = this.N(var1).result();
      return optional.isPresent() ? var2.set(var3, optional.get()) : var2;
   }

   public void N(String var1, OptionalDynamic<?> var2) {
      var2.result().ifPresent(var2x -> this.u = this.u.set(var1, var2x));
   }

   public void N(String var1, Dynamic<?> var2) {
      this.u = this.u.set(var1, var2);
   }

   public OptionalDynamic<?> N(String var1) {
      OptionalDynamic<?> optionaldynamic = this.N.get(var1);
      this.N = this.N.remove(var1);
      return optionaldynamic;
   }

   public static Optional<class02825> N(Dynamic<?> var0) {
      return var0.get("id")
         .asString()
         .apply2stable((var1, var2) -> new class02825(var1, var2.intValue(), var0.remove("id").remove("Count")), var0.get("Count").asNumber())
         .result();
   }

   public Dynamic<?> N() {
      Dynamic<?> dynamic = this.N.emptyMap().set("id", this.N.createString(this.y)).set("count", this.N.createInt(this.L));
      if (!this.N.equals(this.N.emptyMap())) {
         this.u = this.u.set("minecraft:custom_data", this.N);
      }

      if (!this.u.equals(this.N.emptyMap())) {
         dynamic = dynamic.set("components", this.u);
      }

      return N(dynamic, this.i);
   }

   public void N(String var1, boolean var2, UnaryOperator<Dynamic<?>> var3) {
      OptionalDynamic<?> optionaldynamic = this.N.get(var1);
      if (!var2 || !optionaldynamic.result().isEmpty()) {
         Dynamic<?> dynamic = optionaldynamic.orElseEmptyMap();
         dynamic = var3.apply(dynamic);
         if (dynamic.equals(dynamic.emptyMap())) {
            this.N = this.N.remove(var1);
         } else {
            this.N = this.N.set(var1, dynamic);
         }
      }
   }

   public void N(String var1, String var2) {
      this.N(var1).result().ifPresent(var2x -> this.N(var2, (Dynamic<?>)var2x));
   }

   public void N(String var1, String var2, Dynamic<?> var3) {
      Optional<Dynamic<?>> optional = this.N(var1).result();
      if (optional.isPresent() && !optional.get().equals(var3)) {
         this.N(var2, optional.get());
      }
   }
}
