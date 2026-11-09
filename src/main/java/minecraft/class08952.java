package minecraft;

import java.util.Map;

public record class08952(class08960 block, class07284 level, class07211 facing, class07209 center, Map<class07209, class08976> cache) {
   public class08960 L() {
      return this.block;
   }

   public Map<class07209, class08976> M() {
      return this.cache;
   }

   public class08952(class08960 block, class07284 level, class07211 facing, class07209 center, Map<class07209, class08976> cache) {
      super();
      this.block = block;
      this.level = level;
      this.facing = facing;
      this.center = center;
      this.cache = cache;
   }

   public class07211 i() {
      return this.facing;
   }

   public class07284 u() {
      return this.level;
   }

   public class08976 y() {
      return this.y(1);
   }

   public class08976 y(int var1) {
      return this.N(this.facing.M(), var1);
   }

   private boolean N(class00500 var1) {
      return this.block.B(var1) && this.block.M(var1) == this.facing;
   }

   private class08976 N(class07211 var1, Integer var2) {
      return this.cache.computeIfAbsent(this.center.method_10079(var1, var2), this::N);
   }

   public class08976 N() {
      return this.N(1);
   }

   private class08976 N(class07209 var1) {
      class00500 class00500 = this.level.method_8320(var1);
      class08972 class08972 = this.N(class00500) ? this.block.R(class00500) : null;
      return (class08976)(class08972 == null ? new class08958(var1) : new class08953(this.level, this.block, var1, class08972));
   }

   public class08976 N(int var1) {
      return this.N(this.facing.R(), var1);
   }

   public class07209 R() {
      return this.center;
   }
}
