package minecraft;

import java.util.Set;
import org.jspecify.annotations.Nullable;

public class class02437 implements class08053 {
   public static final class01894 N = class08086.N;
   public static final class01894 y = class01894.y("translucent");
   public static final class01894 L = class01894.y("item_entity");
   public static final class01894 u = class01894.y("particles");
   public static final class01894 i = class01894.y("weather");
   public static final class01894 R = class01894.y("clouds");
   public static final class01894 M = class01894.y("entity_outline");
   public static final Set<class01894> B = Set.of(N);
   public static final Set<class01894> Z = Set.of(N, M);
   public static final Set<class01894> z = Set.of(N, y, L, u, i, R);
   public class02452<class08066> U = class02452.N();
   @Nullable
   public class02452<class08066> E;
   @Nullable
   public class02452<class08066> W;
   @Nullable
   public class02452<class08066> m;
   @Nullable
   public class02452<class08066> P;
   @Nullable
   public class02452<class08066> s;
   @Nullable
   public class02452<class08066> T;

   public class02437() {
      super();
   }

   @Override
   public void y(class01894 var1, class02452<class08066> var2) {
      if (var1.equals(N)) {
         this.U = var2;
      } else if (var1.equals(y)) {
         this.E = var2;
      } else if (var1.equals(L)) {
         this.W = var2;
      } else if (var1.equals(u)) {
         this.m = var2;
      } else if (var1.equals(i)) {
         this.P = var2;
      } else if (var1.equals(R)) {
         this.s = var2;
      } else {
         if (!var1.equals(M)) {
            throw new IllegalArgumentException("No target with id " + var1);
         }

         this.T = var2;
      }
   }

   public void N() {
      this.U = class02452.N();
      this.E = null;
      this.W = null;
      this.m = null;
      this.P = null;
      this.s = null;
      this.T = null;
   }

   @Nullable
   @Override
   public class02452<class08066> N(class01894 var1) {
      if (var1.equals(N)) {
         return this.U;
      } else if (var1.equals(y)) {
         return this.E;
      } else if (var1.equals(L)) {
         return this.W;
      } else if (var1.equals(u)) {
         return this.m;
      } else if (var1.equals(i)) {
         return this.P;
      } else if (var1.equals(R)) {
         return this.s;
      } else {
         return var1.equals(M) ? this.T : null;
      }
   }
}
