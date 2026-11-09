package minecraft;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class class00083 extends class03286 implements class00061 {
   private static final int L = 212;
   private static final int u = 2;
   private static final int i = 6;
   static final class00392 N = class00392.L("mco.configure.world.settings.title");
   private static final class00392 R = class00392.L("mco.configure.world.name");
   private static final class00392 M = class00392.L("mco.configure.world.description");
   private static final class00392 B = class00392.L("mco.configure.world.region_preference");
   private static final class04141 z = class04141.N(class00392.L("mco.configure.world.name.validation.whitespace"));
   private final class05092 U;
   private final class06202 E;
   private class04981 W;
   private final Map<class00082, class00073> m;
   final class05362 y;
   private final class04927 P;
   private final class04927 s;
   private final class02071 T;
   private final class03608 b;
   private class08302 j;

   private void L() {
      this.E.N(new class00089(this.U, this::N, this.m, this.j));
   }

   @Override
   public void L(class04981 var1) {
      this.N();
   }

   class00083(class05092 var1, class06202 var2, class04981 var3, Map<class00082, class00073> var4) {
      super(N);
      this.U = var1;
      this.E = var2;
      this.W = var3;
      this.m = var4;
      class02080 class02080 = this.Z.y(6).u(1);
      class02080.N(new class02071(R, var1.method_64506()));
      this.s = new class04927((class01590)var2.i_3, 0, 0, 212, 20, class00392.L("mco.configure.world.name"));
      this.s.method_1880(32);
      this.s.method_1863(var1x -> {
         if (!this.y()) {
            this.s.method_1868(-2142128);
            this.s.method_47400(z);
         } else {
            this.s.method_47400(null);
            this.s.method_1868(-2039584);
         }
      });
      class02080.N(this.s);
      class02080.N(class02057.y(2));
      class02080.N(new class02071(M, var1.method_64506()));
      this.P = new class04927((class01590)var2.i_3, 0, 0, 212, 20, class00392.L("mco.configure.world.description"));
      this.P.method_1880(32);
      class02080.N(this.P);
      class02080.N(class02057.y(2));
      class02080.N(new class02071(B, var1.method_64506()));
      class02041 class02041 = new class02041(0, 0, 212, 9, class02062.field_40789);
      this.T = class02041.N(new class02071(192, 9, class00392.i(), var1.method_64506()));
      this.b = class02041.N(class03608.N(10, 8, class00073.field_60237.y()));
      class02080.N(class02041);
      class02080.N(class05362.method_46430(class00392.L("mco.configure.world.buttons.region_preference"), var1x -> this.L()).N(0, 0, 212, 20).N());
      class02080.N(class02057.y(2));
      this.y = class02080.N(
         class05362.method_46430(
               class00392.i(),
               var4x -> {
                  if (var3.R == class04961.field_19434) {
                     var2.N(
                        class02252.N(
                           var1,
                           class00392.L("mco.configure.world.close.question.title"),
                           class00392.L("mco.configure.world.close.question.line1"),
                           var2xx -> {
                              this.N();
                              var1.i();
                           }
                        )
                     );
                  } else {
                     this.N();
                     var1.N(false);
                  }
               }
            )
            .N(0, 0, 212, 20)
            .N()
      );
      this.y.field_22763 = false;
      this.N(var3);
   }

   private void u() {
      this.T.method_25355(N(this.j));
      this.b.N(N(this.j, this.m));
      this.b.field_22764 = this.j.N() == class00050.field_60228;
   }

   @Override
   public void y(class04981 var1) {
      this.N(var1);
   }

   private boolean y() {
      String sx = this.s.method_1882();
      String s1 = sx.trim();
      return !s1.isEmpty() && sx.length() == s1.length();
   }

   @Override
   public void N(class04981 var1) {
      this.W = var1;
      if (var1.d == null) {
         var1.d = class00081.N;
      }

      if (var1.d.y == class00050.field_60228 && var1.d.L == null) {
         Optional<class00082> optional = this.m.keySet().stream().findFirst();
         optional.ifPresent(var1x -> var1.d.L = var1x);
      }

      String sx = var1.R == class04961.field_19434 ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      this.y.method_25355(class00392.L(sx));
      this.y.field_22763 = true;
      this.j = new class08302(var1.d.y, var1.d.L);
      this.s.method_1852(Objects.requireNonNullElse(var1.y(), ""));
      this.P.method_1852(var1.N());
      this.u();
   }

   private void N(class00050 var1, class00082 var2) {
      this.j = new class08302(var1, var2);
      this.u();
   }

   private static class01894 N(class08302 var0, Map<class00082, class00073> var1) {
      return var0.y() != null && var1.containsKey(var0.y()) ? var1.getOrDefault(var0.y(), class00073.field_60237).y() : class00073.field_60237.y();
   }

   private static class05216 N(class08302 var0) {
      return (var0.N().equals(class00050.field_60228) && var0.y() != null ? class00392.L(var0.y().field_60201) : class00392.L(var0.N().field_60231))
         .N(class06541.field_1080);
   }

   public void N() {
      String sx = this.s.method_1882().trim();
      if (this.W.d == null
         || !Objects.equals(sx, this.W.u)
         || !Objects.equals(this.P.method_1882(), this.W.i)
         || this.j.N() != this.W.d.y
         || this.j.y() != this.W.d.L) {
         this.U.N(sx, this.P.method_1882(), this.j.N(), this.j.y());
      }
   }
}
