package minecraft;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class class05420 {
   private final class05388 y;
   private final Map<class05403, class01894> L;
   @Nullable
   private class05547 u;
   @Nullable
   private class03674 i;
   private final Set<class00891> R;

   public class05420 L(class00891 var1) {
      class05388 class05388 = class05388.j(var1);
      class03264 class03264xxxx = class05404.y(class05433.O.N(var1, class05388, this.N.L));
      class03264 class03264x = class05404.y(class05433.g.N(var1, class05388, this.N.L));
      class03264 class03264xx = class05404.y(class05433.I.N(var1, class05388, this.N.L));
      class03264 class03264xxx = class05404.y(class05433.J.N(var1, class05388, this.N.L));
      class03264 class03264xxxx = class05404.y(class05433.o.N(var1, class05388, this.N.L));
      this.N.N.accept(class05404.N(var1, class03264xxxx, class03264x, class03264xx, class03264xxx, class03264xxxx));
      class01894 class01894 = class05433.q.N(var1, class05388, this.N.L);
      this.N.N(var1, class01894);
      return this;
   }

   public class05420 M(class00891 var1) {
      class03264 class03264x = class05404.y(class05433.h.N(var1, this.y, this.N.L));
      class03264 class03264x = class05404.y(class05433.r.N(var1, this.y, this.N.L));
      this.N.N.accept(class05404.u(var1, class03264x, class03264x));
      return this;
   }

   public class05420(class05404 var1, class05388 var2) {
      super();
      this.N = var1;
      this.L = new HashMap<>();
      this.R = new HashSet<>();
      this.y = var2;
   }

   public class05420 B(class00891 var1) {
      if (this.u == null) {
         throw new IllegalStateException("Family not defined");
      } else {
         class00891 class00891 = this.u.y().get(class05565.field_28545);
         class03264 class03264 = class05404.y(class05433.NN.N(var1, this.y, this.N.L));
         this.N.N.accept(class05404.N(var1, class03264));
         this.N.N.accept(class05404.N(class00891, class03264));
         this.N.y(var1.B());
         return this;
      }
   }

   public class05420 Z(class00891 var1) {
      if (this.i == null) {
         throw new IllegalStateException("Full block not generated yet");
      } else {
         class01894 class01894 = this.N(class05433.Ny, var1);
         class03264 class03264 = class05404.y(this.N(class05433.NL, var1));
         this.N.N.accept(class05404.i(var1, class05404.y(class01894), class03264, class05404.N(this.i)));
         this.N.N(var1, class01894);
         return this;
      }
   }

   public class05420 i(class00891 var1) {
      class05388 class05388 = class05388.j(var1);
      class03264 class03264xxx = class05404.y(class05433.F.N(var1, class05388, this.N.L));
      class03264 class03264x = class05404.y(class05433.p.N(var1, class05388, this.N.L));
      class03264 class03264xx = class05404.y(class05433.f.N(var1, class05388, this.N.L));
      class03264 class03264xxx = class05404.y(class05433.A.N(var1, class05388, this.N.L));
      this.N.N.accept(class05404.N(var1, class03264xxx, class03264x, class03264xx, class03264xxx, false));
      return this;
   }

   public class05420 U(class00891 var1) {
      class03264 class03264 = class05404.y(class05404.m.getOrDefault(var1, class05428.N.get(var1)).N(var1, this.N.L));
      this.N.N.accept(class05404.N(var1, class03264));
      return this;
   }

   public class05420 z(class00891 var1) {
      class03264 class03264x = class05404.y(this.N(class05433.NR, var1));
      class01894 class01894 = this.N(class05433.Ni, var1);
      class03264 class03264x = class05404.y(this.N(class05433.NM, var1));
      this.N.N.accept(class05404.y(var1, class03264x, class05404.y(class01894), class03264x));
      this.N.N(var1, class01894);
      return this;
   }

   public class05420 u(class00891 var1) {
      class03264 class03264x = class05404.y(class05433.K.N(var1, this.y, this.N.L));
      class03264 class03264x = class05404.y(class05433.V.N(var1, this.y, this.N.L));
      this.N.N.accept(class05404.y(var1, class03264x, class03264x));
      class01894 class01894 = class05433.e.N(var1, this.y, this.N.L);
      this.N.N(var1, class01894);
      return this;
   }

   public class05420 y(class00891 var1) {
      class03264 class03264xx = class05404.y(class05433.H.N(var1, this.y, this.N.L));
      class03264 class03264x = class05404.y(class05433.c.N(var1, this.y, this.N.L));
      class03264 class03264xx = class05404.y(class05433.X.N(var1, this.y, this.N.L));
      this.N.N.accept(class05404.N(var1, class03264xx, class03264x, class03264xx));
      class01894 class01894 = class05433.a.N(var1, this.y, this.N.L);
      this.N.N(var1, class01894);
      return this;
   }

   public class05420 E(class00891 var1) {
      this.N.Z(var1);
      return this;
   }

   public class05420 N(class00891 var1) {
      class03264 class03264x = class05404.y(class05433.j.N(var1, this.y, this.N.L));
      class03264 class03264x = class05404.y(class05433.v.N(var1, this.y, this.N.L));
      this.N.N.accept(class05404.N(var1, class03264x, class03264x));
      class01894 class01894 = class05433.n.N(var1, this.y, this.N.L);
      this.N.N(var1, class01894);
      return this;
   }

   private class01894 N(class05403 var1, class00891 var2) {
      return this.L.computeIfAbsent(var1, var2x -> var2x.N(var2, this.y, this.N.L));
   }

   public class05420 N(class05547 var1) {
      this.u = var1;
      var1.y().forEach((var1x, var2) -> {
         if (!this.R.contains(var2)) {
            BiConsumer<class05420, class00891> biconsumer = class05404.P.get(var1x);
            if (biconsumer != null) {
               biconsumer.accept(this, var2);
            }
         }
      });
      return this;
   }

   public class05420 N(class00891 var1, class05403 var2) {
      this.i = class05404.N(var2.N(var1, this.y, this.N.L));
      if (class05404.W.containsKey(var1)) {
         this.N.N.accept(class05404.W.get(var1).create(var1, this.i, this.y, this.N.L));
      } else {
         this.N.N.accept(class05404.N(var1, class05404.N(this.i)));
      }

      return this;
   }

   public class05420 N(class00891 var1, class00891 var2) {
      class01894 class01894 = class05387.N(var1);
      this.N.N.accept(class05404.N(var2, class05404.y(class01894)));
      this.N.y.N(var1.B(), var2.B());
      this.R.add(var2);
      return this;
   }

   public void W(class00891 var1) {
      if (class05404.u.contains(var1)) {
         this.N.U(var1);
      } else {
         this.N.z(var1);
      }
   }

   public class05420 R(class00891 var1) {
      class03264 class03264xxx = class05404.y(class05433.S.N(var1, this.y, this.N.L));
      class03264 class03264x = class05404.y(class05433.C.N(var1, this.y, this.N.L));
      class03264 class03264xx = class05404.y(class05433.D.N(var1, this.y, this.N.L));
      class03264 class03264xxx = class05404.y(class05433.x.N(var1, this.y, this.N.L));
      this.N.N.accept(class05404.N(var1, class03264xxx, class03264x, class03264xx, class03264xxx, true));
      return this;
   }
}
