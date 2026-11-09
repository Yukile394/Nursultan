package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum class06681 {
   field_12400(0),
   field_12398(1),
   field_12403(2),
   field_12401(3),
   field_12397(4),
   field_54090(5),
   field_54091(6),
   field_54092(7),
   field_54093(8);

   public static final Set<class06681> field_40710 = Set.of(values());
   public static final Set<class06681> field_40711 = Set.of(field_12397, field_12401);
   public static final Set<class06681> field_54094 = Set.of(field_54090, field_54091, field_54092, field_54093);
   public static final class02362<ByteBuf, Set<class06681>> field_54095 = class02389.M.N_10(class06681::N, class06681::N);
   private final int field_12399;

   private class06681(int var3) {
      this.field_12399 = var3;
   }

   private boolean y(int var1) {
      return (var1 & this.N()) == this.N();
   }

   public static Set<class06681> y(boolean var0, boolean var1, boolean var2) {
      EnumSet<class06681> enumset = EnumSet.noneOf(class06681.class);
      if (var0) {
         enumset.add(field_54090);
      }

      if (var1) {
         enumset.add(field_54091);
      }

      if (var2) {
         enumset.add(field_54092);
      }

      return enumset;
   }

   public static Set<class06681> N(int var0) {
      EnumSet<class06681> enumset = EnumSet.noneOf(class06681.class);

      for (class06681 class06681 : values()) {
         if (class06681.y(var0)) {
            enumset.add(class06681);
         }
      }

      return enumset;
   }

   public static int N(Set<class06681> var0) {
      int i = 0;

      for (class06681 class06681 : var0) {
         i |= class06681.N();
      }

      return i;
   }

   @SafeVarargs
   public static Set<class06681> N(Set<class06681>... var0) {
      HashSet hashset = new HashSet();

      for (Set set : var0) {
         hashset.addAll(set);
      }

      return hashset;
   }

   private int N() {
      return 1 << this.field_12399;
   }

   public static Set<class06681> N(boolean var0, boolean var1, boolean var2) {
      EnumSet<class06681> enumset = EnumSet.noneOf(class06681.class);
      if (var0) {
         enumset.add(field_12400);
      }

      if (var1) {
         enumset.add(field_12398);
      }

      if (var2) {
         enumset.add(field_12403);
      }

      return enumset;
   }

   public static Set<class06681> N(boolean var0, boolean var1) {
      EnumSet<class06681> enumset = EnumSet.noneOf(class06681.class);
      if (var0) {
         enumset.add(field_12401);
      }

      if (var1) {
         enumset.add(field_12397);
      }

      return enumset;
   }
}
