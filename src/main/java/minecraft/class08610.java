package minecraft;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class class08610 extends class00394 implements class08597, class08618 {
   private static final class00392 N = class00392.L("test_instance_block.invalid_test");
   private static final List<class08633> y = List.of();
   private static final List<class08633> L = List.of(new class08633(class02566.N(128, 128, 128)));
   private static final List<class08633> u = List.of(new class08633(class02566.N(0, 255, 0)));
   private static final List<class08633> i = List.of(new class08633(class02566.N(255, 0, 0)));
   private static final List<class08633> R = List.of(new class08633(class02566.N(255, 128, 0)));
   private static final class00753 M = new class00753(0, 1, 1);
   private class08595 B;
   private final List<class08635> Z = new ArrayList<>();

   @Override
   public class08623 L() {
      return new class08623(new class07209(M), this.q());
   }

   public boolean L(Consumer<class00392> var1) {
      Optional<class01894> optional = this.y(var1);
      return !optional.isEmpty() && this.z instanceof class04782 class04782 ? N(class04782, optional.get(), var1) : false;
   }

   public Optional<class05946<class00201>> M() {
      return this.B.N();
   }

   public class07269 i() {
      return class07269.N(this);
   }

   private void K() {
      this.z.N_70(null, this.R()).stream().filter(var0 -> !(var0 instanceof class08036)).forEach(class07049::method_31472);
   }

   public boolean T() {
      if (this.z instanceof class04782 class04782) {
         Optional optional = this.B.N().flatMap(var1x -> y(class04782, (class05946<class00201>)var1x));
         if (optional.isPresent()) {
            this.N(class04782, (class01207)optional.get());
            return true;
         }
      }

      return false;
   }

   public class08610(class07209 var1, class00500 var2) {
      super(class00404.field_55993, var1, var2);
      this.B = new class08595(Optional.empty(), class00753.field_11176, class06993.field_11467, false, class08625.field_56014, Optional.empty());
   }

   public class00392 B() {
      return this.M().map(var0 -> class00392.y(var0.N().toString())).orElse(N);
   }

   public boolean Z() {
      return this.B.u();
   }

   private void V() {
      if (this.z instanceof class04782 class04782) {
         this.u().y().forEach(var1x -> class04782.method_17988(var1x.B, var1x.Z, true));
      }
   }

   public void i(Consumer<class07209> var1) {
      class00734 class00734 = this.R();
      boolean flag = !this.o().map(var0 -> var0.N().E()).orElse(false);
      class07209 class07209x = class07209.method_49637(class00734.N, class00734.y, class00734.L).method_10069(-1, -1, -1);
      class07209 class07209x = class07209.method_49637(class00734.u, class00734.i, class00734.R);
      class07209.method_20437(class07209x, class07209x)
         .forEach(
            var4x -> {
               boolean flag1 = var4x.method_10263() == class07209x.method_10263()
                  || var4x.method_10263() == class07209.method_10263()
                  || var4x.method_10260() == class07209x.method_10260()
                  || var4x.method_10260() == class07209.method_10260()
                  || var4x.method_10264() == class07209x.method_10264();
               boolean flag2 = var4x.method_10264() == class07209.method_10264();
               if (flag1 || flag2 && flag) {
                  var1.accept(var4x);
               }
            }
         );
   }

   public class07209 b() {
      class00753 class00753 = this.z();
      class06993 class06993 = this.U();
      class07209 class07209 = this.s();

      return switch (class06993) {
         case field_11467 -> class07209;
         case field_11463 -> class07209.method_10069(class00753.method_10260() - 1, 0, 0);
         case field_11464 -> class07209.method_10069(class00753.method_10263() - 1, 0, class00753.method_10260() - 1);
         case field_11465 -> class07209.method_10069(0, 0, class00753.method_10263() - 1);
      };
   }

   public class07209 s() {
      return N(this.d());
   }

   public void n() {
      if (!this.Z.isEmpty()) {
         this.Z.clear();
         this.method_5431();
      }
   }

   public void m() {
      this.N(this.B.N(class08625.field_56015));
   }

   private Optional<class03529<class00201>> o() {
      return this.M().flatMap(this.z.method_30349()::u);
   }

   public List<class08635> t() {
      return this.Z;
   }

   public void v() {
      this.i(var1 -> {
         if (this.z.method_8320(var1).N(class00869.ZX)) {
            this.z.method_8501(var1, class00869.N.W());
         }
      });
   }

   public void j() {
      this.i(var1 -> {
         if (!this.z.method_8320(var1).N(class00869.Ty)) {
            this.z.method_8501(var1, class00869.ZX.W());
         }
      });
   }

   private class00753 q() {
      class00753 class00753 = this.z();
      class06993 class06993 = this.U();
      boolean flag = class06993 == class06993.field_11463 || class06993 == class06993.field_11465;
      int ix = flag ? class00753.method_10260() : class00753.method_10263();
      int j = flag ? class00753.method_10263() : class00753.method_10260();
      return new class00753(ix, class00753.method_10264(), j);
   }

   public class06993 U() {
      return this.o().map(class03556::N).map(class00201::W).orElse(class06993.field_11467).N(this.B.L());
   }

   public class00753 z() {
      return this.B.y();
   }

   public void u(Consumer<class00392> var1) {
      if (this.z instanceof class04782 class04782) {
         Optional optional = this.o();
         class07209 class07209 = this.d();
         if (optional.isEmpty()) {
            var1.accept(
               class00392.N("test_instance_block.error.no_test", class07209.method_10263(), class07209.method_10264(), class07209.method_10260())
                  .N(class06541.field_1061)
            );
         } else if (!this.T()) {
            var1.accept(
               class00392.N("test_instance_block.error.no_test_structure", class07209.method_10263(), class07209.method_10264(), class07209.method_10260())
                  .N(class06541.field_1061)
            );
         } else {
            this.n();
            class05492.N.N();
            class00204.y();
            var1.accept(class00392.N("test_instance_block.starting", ((class03529)optional.get()).M()));
            class05513 class05513 = new class05513((class03529<class00201>)optional.get(), this.B.L(), class04782, class04272.N());
            class05513.N(class07209);
            class05520 class05520 = class05500.y(List.of(class05513), class04782).L();
            class05512.N(class04782.method_8503().yu(), class05520);
         }
      }
   }

   public class05163 u() {
      class07209 class07209x = this.s();
      class07209 class07209x = class07209x.method_10081(this.q()).method_10069(-1, -1, -1);
      return class05163.N(class07209x, class07209x);
   }

   @Override
   public class08592 y() {
      return class08592.field_55995;
   }

   public Optional<class01894> y(Consumer<class00392> var1) {
      Optional<class03529<class00201>> optional = this.o();
      Optional optional1;
      if (optional.isPresent()) {
         optional1 = Optional.of(optional.get().N().i());
      } else {
         optional1 = this.M().map(class05946::N);
      }

      if (optional1.isEmpty()) {
         class07209 class07209 = this.d();
         var1.accept(
            class00392.N("test_instance_block.error.unable_to_save", class07209.method_10263(), class07209.method_10264(), class07209.method_10260())
               .N(class06541.field_1061)
         );
         return optional1;
      } else {
         if (this.z instanceof class04782 class04782) {
            class07253.N(class04782, (class01894)optional1.get(), this.s(), this.z(), this.Z(), "", true, List.of(class00869.N));
         }

         return optional1;
      }
   }

   private static Optional<class01207> y(class04782 var0, class05946<class00201> var1) {
      return var0.method_30349().u(var1).map(var0x -> ((class00201)var0x.N()).i()).flatMap(var1x -> var0.method_14183().y(var1x));
   }

   public Optional<class00392> E() {
      return this.B.R();
   }

   public static Optional<class00753> N(class04782 var0, class05946<class00201> var1) {
      return y(var0, var1).map(class01207::N);
   }

   public void N(class08595 var1) {
      this.B = var1;
      this.method_5431();
   }

   public static class07209 N(class07209 var0) {
      return var0.method_10081(M);
   }

   @Override
   protected void N(class08329 var1) {
      var1.N("data", class08595.N, this.B);
      if (!this.Z.isEmpty()) {
         var1.N("errors", class08635.y, this.Z);
      }
   }

   @Override
   protected void N(class08299 var1) {
      var1.<class08595>N("data", class08595.N).ifPresent(this::N);
      this.Z.clear();
      this.Z.addAll(var1.<List<? extends class08635>>N("errors", class08635.y).orElse(List.of()));
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.u(var1);
   }

   public void N(class00392 var1) {
      this.N(this.B.N(var1));
   }

   public void N(class07209 var1, class00392 var2) {
      this.Z.add(new class08635(var1, var2));
      this.method_5431();
   }

   private void N(class04782 var1, class01207 var2) {
      class01233 class01233 = new class01233().N(this.U()).N(this.B.u()).y(true);
      class07209 class07209 = this.b();
      this.V();
      class05514.N(this.u(), var1);
      this.K();
      var2.N(var1, class07209, class07209, class01233, var1.method_8409(), 818);
   }

   public void N(Consumer<class00392> var1) {
      this.v();
      this.n();
      if (this.T()) {
         var1.accept(class00392.N("test_instance_block.reset_success", this.B()).N(class06541.field_1060));
      }

      this.N(this.B.N(class08625.field_56014));
   }

   public static boolean N(class04782 var0, class01894 var1, Consumer<class00392> var2) {
      Path path = class05514.L;
      Path path1 = var0.method_14183().N(var1, ".nbt");
      Path path2 = class06887.N(class04476.N, path1, var1.N(), path.resolve(var1.y()).resolve("structure"));
      if (path2 == null) {
         var2.accept(class00392.y("Failed to export " + path1).N(class06541.field_1061));
         return true;
      } else {
         try {
            class06290.L(path2.getParent());
         } catch (IOException ioexception) {
            var2.accept(class00392.y("Could not create folder " + path2.getParent()).N(class06541.field_1061));
            return true;
         }

         var2.accept(class00392.y("Exported " + var1 + " to " + path2.toAbsolutePath()));
         return false;
      }
   }

   @Override
   public List<class08633> N() {
      return switch (this.B.i()) {
         case field_56014 -> y;
         case field_56015 -> L;
         case field_56016 -> this.E().isEmpty() ? u : (this.o().map(class03556::N).map(class00201::B).orElse(true) ? i : R);
      };
   }

   @Override
   public void method_5431() {
      super.method_5431();
      if (this.z instanceof class04782) {
         this.z.method_8413(this.d(), class00869.N.W(), this.w(), 3);
      }
   }

   public void W() {
      this.N(this.B.N(class08625.field_56016));
   }

   public class00734 R() {
      return class00734.N(this.u());
   }
}
