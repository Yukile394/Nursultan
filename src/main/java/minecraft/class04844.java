package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public class class04844 {
   private final int N;
   private final int y;
   private final int L;
   private final int u;
   private final class05246 i;

   public int L() {
      return this.L;
   }

   public class04844(int var1, int var2, int var3, int var4, class05246 var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class04844 class04844 = (class04844)var1;
         if (this.N != class04844.N) {
            return false;
         } else if (this.L != class04844.L) {
            return false;
         } else {
            return this.u != class04844.u ? false : this.i == class04844.i;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "JigsawJunction{sourceX="
         + this.N
         + ", sourceGroundY="
         + this.y
         + ", sourceZ="
         + this.L
         + ", deltaY="
         + this.u
         + ", destProjection="
         + this.i
         + "}";
   }

   @Override
   public int hashCode() {
      int ix = this.N;
      ix = 31 * ix + this.y;
      ix = 31 * ix + this.L;
      ix = 31 * ix + this.u;
      return 31 * ix + this.i.hashCode();
   }

   public class05246 i() {
      return this.i;
   }

   public int u() {
      return this.u;
   }

   public int y() {
      return this.y;
   }

   public static <T> class04844 N(Dynamic<T> var0) {
      return new class04844(
         var0.get("source_x").asInt(0),
         var0.get("source_ground_y").asInt(0),
         var0.get("source_z").asInt(0),
         var0.get("delta_y").asInt(0),
         class05246.N(var0.get("dest_proj").asString(""))
      );
   }

   public <T> Dynamic<T> N(DynamicOps<T> var1) {
      Builder builder = ImmutableMap.builder();
      builder.put(var1.createString("source_x"), var1.createInt(this.N))
         .put(var1.createString("source_ground_y"), var1.createInt(this.y))
         .put(var1.createString("source_z"), var1.createInt(this.L))
         .put(var1.createString("delta_y"), var1.createInt(this.u))
         .put(var1.createString("dest_proj"), var1.createString(this.i.N()));
      return new Dynamic(var1, var1.createMap(builder.build()));
   }

   public int N() {
      return this.N;
   }
}
