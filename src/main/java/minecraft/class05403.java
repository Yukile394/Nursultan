package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Streams;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class class05403 {
   private final Optional<class01894> N;
   private final Set<class05418> y;
   private final Optional<String> L;

   public class05403(Optional<class01894> var1, Optional<String> var2, class05418... var3) {
      super();
      this.N = var1;
      this.L = var2;
      this.y = ImmutableSet.copyOf(var3);
   }

   public class01894 y(class00891 var1, String var2, class05388 var3, BiConsumer<class01894, class08819> var4) {
      return this.N(class05387.N(var1, var2), var3, var4);
   }

   public class01894 N(class01894 var1, class05388 var2, BiConsumer<class01894, class08819> var3) {
      Map<class05418, class01894> map = this.N(var2);
      var3.accept(var1, () -> {
         JsonObject jsonobject = new JsonObject();
         this.N.ifPresent(var1xx -> jsonobject.addProperty("parent", var1xx.toString()));
         if (!map.isEmpty()) {
            JsonObject jsonobject1 = new JsonObject();
            map.forEach((var1xx, var2x) -> jsonobject1.addProperty(var1xx.N(), var2x.toString()));
            jsonobject.add("textures", jsonobject1);
         }

         return jsonobject;
      });
      return var1;
   }

   private Map<class05418, class01894> N(class05388 var1) {
      return Streams.concat(new Stream[]{this.y.stream(), var1.N()}).collect(ImmutableMap.toImmutableMap(Function.identity(), var1::N));
   }

   public class01894 N(class00891 var1) {
      return class05387.N(var1, this.L.orElse(""));
   }

   public class01894 N(class00891 var1, class05388 var2, BiConsumer<class01894, class08819> var3) {
      return this.N(class05387.N(var1, this.L.orElse("")), var2, var3);
   }

   public class01894 N(class00891 var1, String var2, class05388 var3, BiConsumer<class01894, class08819> var4) {
      return this.N(class05387.N(var1, var2 + this.L.orElse("")), var3, var4);
   }

   public class01894 N(class06581 var1, class05388 var2, BiConsumer<class01894, class08819> var3) {
      return this.N(class05387.N(var1, this.L.orElse("")), var2, var3);
   }
}
